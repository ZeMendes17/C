import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Execute extends StrLangBaseVisitor<String> {

   @Override public String visitDisplay(StrLangParser.DisplayContext ctx) {
      String res = visit(ctx.expression());

      if (res != null)
         System.out.println(res);
      return res;
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String id = ctx.ID().getText();
      String res = visit(ctx.expression());

      if (res != null)
         vars.put(id, res);

      return res;
   }

   @Override public String visitStringExpr(StrLangParser.StringExprContext ctx) {
      String res = null;
      String s = ctx.STRING().getText();

      res = s.substring(1, s.length() - 1);
      return res;
   }

   @Override public String visitIdExpr(StrLangParser.IdExprContext ctx) {
      String res = null;
      String id = ctx.ID().getText();

      if (vars.containsKey(id))
         res = vars.get(id);
      else
         System.out.println("ERROR: variable \"" + id + "\" does not exist!");

      return res;
   }

   @Override public String visitInputExpr(StrLangParser.InputExprContext ctx) {
      String res = null;
      String s = ctx.STRING().getText();

      res = s.substring(1, s.length() - 1);

      if (res != null) {
         System.out.print(res);
         return in.nextLine();
      }
      return null;
   }

   @Override public String visitOpExpr(StrLangParser.OpExprContext ctx) {
      String string1 = visit(ctx.expression(0));
      String string2 = visit(ctx.expression(1));
      String operand = ctx.op.getText();

      if (operand.equals("+")) {
         return string1 + string2;
      }      
      if (operand.equals("-")) {
         return string1.replace(string2, "");
      }
      return null;
   }

   @Override public String visitTrimExpr(StrLangParser.TrimExprContext ctx) {
      String res = visit(ctx.expression());
      return res.replace(" ", "");
   }

   @Override public String visitParentExpr(StrLangParser.ParentExprContext ctx) {
      return visit(ctx.expression());
   }

   @Override public String visitSubExpr(StrLangParser.SubExprContext ctx) {
      String original = visit(ctx.expression(0));
      String before = visit(ctx.expression(1));
      String after = visit(ctx.expression(2));

      return original.replace(before, after);
   }

   private Map<String, String> vars = new HashMap<>();
   private static Scanner in = new Scanner(System.in);
}
