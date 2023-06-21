import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Execute extends FracLangBaseVisitor<Fraction> {

   @Override public Fraction visitPrint(FracLangParser.PrintContext ctx) {
      Fraction res = visit(ctx.expression());
      if (res != null)
         System.out.println(res);
      return res;
   }

   @Override public Fraction visitAssignment(FracLangParser.AssignmentContext ctx) {
      Fraction res = visit(ctx.expression());
      String id = ctx.ID().getText();
      if (res != null)
         variables.put(id, res);
      return res;
   }

   @Override public Fraction visitFractionExpr(FracLangParser.FractionExprContext ctx) {
      String s = ctx.FRACTION().getText();
      Fraction res = new Fraction(s);

      return res;
   }

   @Override public Fraction visitIdExpr(FracLangParser.IdExprContext ctx) {
      String id = ctx.ID().getText();
      if (!variables.containsKey(id)) {
         System.err.println("ERROR: variable \"" + id + "\" not found!");
         return null;
      }
      return variables.get(id);
   }

   @Override public Fraction visitUnaryExpr(FracLangParser.UnaryExprContext ctx) {
      String op = ctx.op.getText();
      Fraction frac = visit(ctx.expression());
      Fraction res = null;

      if (op.equals("-")) {
         res = new Fraction(-1 * frac.getNumerator(), frac.getDenominator());
      }
      else
         res = frac;


      return res;
   }

   @Override public Fraction visitMultDivExpr(FracLangParser.MultDivExprContext ctx) {
      String op = ctx.op.getText();
      Fraction frac1 = visit(ctx.expression(0));
      Fraction frac2 = visit(ctx.expression(1));
      if (op.equals("*"))
         return frac1.multiply(frac2);
      return frac1.divide(frac2);
   }

   @Override public Fraction visitSumSubExpr(FracLangParser.SumSubExprContext ctx) {
      String op = ctx.op.getText();
      Fraction frac1 = visit(ctx.expression(0));
      Fraction frac2 = visit(ctx.expression(1));

      if (op.equals("+"))
         return frac1.add(frac2);
      return frac1.subtract(frac2);
   }

   @Override public Fraction visitParentExpr(FracLangParser.ParentExprContext ctx) {
      return visit(ctx.expression());
   }

   @Override public Fraction visitReadExpr(FracLangParser.ReadExprContext ctx) {
      String s = ctx.STRING().getText();
      String prompt = s.substring(1, s.length() - 1);
      System.out.print(prompt + ": ");
      return new Fraction(in.nextLine());
   }

   @Override public Fraction visitReduceExpr(FracLangParser.ReduceExprContext ctx) {
      Fraction res = visit(ctx.expression());

      return res.reduce();
   }

   private Map<String, Fraction> variables = new HashMap<>();
   private static Scanner in = new Scanner(System.in);
}
