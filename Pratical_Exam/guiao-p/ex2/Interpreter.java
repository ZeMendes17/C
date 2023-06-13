import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FracLangBaseVisitor<Fraction> {

   private Map<String, Fraction> memory = new HashMap<>();

   @Override public Fraction visitShow(FracLangParser.ShowContext ctx) {
      Fraction res = visit(ctx.expr());

      if (res != null) {
         System.out.println(res);
      }
      return res;
   }

   @Override public Fraction visitAssign(FracLangParser.AssignContext ctx) {
      String id = ctx.ID().getText();
      Fraction value = visit(ctx.expr());
      memory.put(id, value);
      return value;
   }

   @Override public Fraction visitFractionExpr(FracLangParser.FractionExprContext ctx) {
      Fraction res = new Fraction(Integer.parseInt(ctx.INT(0).getText()), Integer.parseInt(ctx.INT(1).getText()));
      return res;
   }

   @Override public Fraction visitIdExpr(FracLangParser.IdExprContext ctx) {
      if (memory.containsKey(ctx.ID().getText())) {
         return memory.get(ctx.ID().getText());
      }
      System.out.println("Error: variable " + ctx.ID().getText() + " not defined!");
      return null;
   }

   @Override public Fraction visitIntExpr(FracLangParser.IntExprContext ctx) {
      return new Fraction(Integer.parseInt(ctx.INT().getText()));
   }

   @Override public Fraction visitUnaryExpr(FracLangParser.UnaryExprContext ctx) {
      Fraction res = visit(ctx.expr());
      if (ctx.unop.getText().equals("-")) {
         res = res.multiply(new Fraction(-1));
      }
      return res;
   }

   @Override public Fraction visitMulDivExpr(FracLangParser.MulDivExprContext ctx) {
      Fraction left = visit(ctx.expr(0));
      Fraction right = visit(ctx.expr(1));
      Fraction res = null;
      if (ctx.op.getText().equals("*")) {
         res = left.multiply(right);
      } else if (ctx.op.getText().equals(":")) {
         res = left.divide(right);
      }
      return res;
   }

   @Override public Fraction visitAddSubExpr(FracLangParser.AddSubExprContext ctx) {
      Fraction left = visit(ctx.expr(0));
      Fraction right = visit(ctx.expr(1));
      Fraction res = null;
      if (ctx.op.getText().equals("+")) {
         res = left.add(right);
      } else if (ctx.op.getText().equals("-")) {
         res = left.subtract(right);
      }
      return res;
   }

   @Override public Fraction visitParensExpr(FracLangParser.ParensExprContext ctx) {
      return visit(ctx.expr());
   }
}
