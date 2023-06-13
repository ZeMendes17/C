import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {

   // ora criar aqui um hashmap com varriaveis e ques
   Map<String, String> vars = new HashMap<>();

   @Override public String visitDisplay(StrLangParser.DisplayContext ctx) {
      String res = visit(ctx.expression()); 

      if (res != null) {
         System.out.println(res.toString());
      }
      return null;
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String res = visit(ctx.expression());
      vars.put(ctx.ID().getText(), res);
      return res;
   }

   @Override public String visitStringExpr(StrLangParser.StringExprContext ctx) {
      return ctx.STRING().getText().replace("\"", "");
   }

   @Override public String visitIdExpr(StrLangParser.IdExprContext ctx) {
      String id = ctx.ID().getText();
      if (vars.containsKey(id)) {
         return vars.get(id);
      } else {
         System.err.println("Error: variable " + id + " does not exist!");
         return null;
      }
   }

   @Override public String visitInputExpr(StrLangParser.InputExprContext ctx) {
      System.out.print(ctx.STRING().getText().replace("\"", "") + " ");
      try {
         Scanner sc = new Scanner(new File("/dev/tty"));
         return sc.nextLine();
      } catch (Exception e) {
         return null;
      }
   }

   @Override public String visitTrimExpr(StrLangParser.TrimExprContext ctx) {
      return ctx.STRING().getText().replace(" ", "").replace("\"", "");
   }

   @Override public String visitReplaceExpr(StrLangParser.ReplaceExprContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));
      String e3 = visit(ctx.expression(2));

      return e1.replace(e2, e3);
   }

   @Override public String visitConcatRemvExpr(StrLangParser.ConcatRemvExprContext ctx) {
      String op = ctx.op.getText();
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));

      if (op.equals("+")) {
         return e1 + e2;
      } else {
         return e1.replace(e2, "");
      }
   }

   @Override public String visitParenExpr(StrLangParser.ParenExprContext ctx) {
      return visit(ctx.expression());
   }
}
