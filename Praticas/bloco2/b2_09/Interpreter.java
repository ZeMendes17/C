import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends FractionCalcBaseVisitor<Fraction> {

   private HashMap<String, Fraction> variables = new HashMap<>();

   @Override public Fraction visitWrite(FractionCalcParser.WriteContext ctx) {
      Fraction res = visit(ctx.expr());

      if(res != null)
         System.out.println(res.toString());
      return res;
   }

   @Override public Fraction visitAssignment(FractionCalcParser.AssignmentContext ctx) {
      Fraction res = visit(ctx.expr());
      String var = ctx.Var().getText();
      variables.put(var, res);
      // for(String s : variables.keySet()){
      //    System.out.println(s + " ----> " + variables.get(s));
      // }
      return null;
   }

   @Override public Fraction visitExprPow(FractionCalcParser.ExprPowContext ctx) {
      Fraction res = visit(ctx.expr());
      int pow = Integer.parseInt(ctx.Integer().getText());
      // System.out.println(pow);
      if(ctx.minus != null){
         res = new Fraction(res.denominator, res.numerator);
      }
      return res.pow(pow);
   }

   @Override public Fraction visitExprRead(FractionCalcParser.ExprReadContext ctx) {
      Scanner sc = null;
      
      try {
         sc = new Scanner(new File("/dev/tty"));
      } catch (FileNotFoundException e) {
         System.err.println("Cannot read from terminal");
         System.exit(1);
      }
      System.out.print(ctx.String().getText() + " = ");
      String str = sc.nextLine();
      sc.close(); 
      String temp[] = str.split("/");
      if(temp.length == 1)
         return new Fraction(Integer.parseInt(temp[0]), 1);
      return new Fraction(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
   }

   @Override public Fraction visitExprSumSub(FractionCalcParser.ExprSumSubContext ctx) {
      Fraction f1 = visit(ctx.expr(0));
      Fraction f2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      switch(op){
         case "+":
            return f1.add(f2);
         case "-":
            return f1.sub(f2);
      }
      return null;
   }

   @Override public Fraction visitExprParent(FractionCalcParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprMultDiv(FractionCalcParser.ExprMultDivContext ctx) {
      Fraction f1 = visit(ctx.expr(0));
      Fraction f2 = visit(ctx.expr(1));
      String op = ctx.op.getText();

      switch(op){
         case "*":
            return f1.multiply(f2);
         case ":":
            if(f2.numerator == 0){
               System.err.println("Impossible to divide by zero");
               return null;
            }
            return f1.divide(f2);
      }
      return null;
   }

   @Override public Fraction visitExprNegative(FractionCalcParser.ExprNegativeContext ctx) {
      return visit(ctx.expr()).multiply(new Fraction(-1, 1));
   }

   @Override public Fraction visitExprInteger(FractionCalcParser.ExprIntegerContext ctx) {
      return new Fraction(Integer.parseInt(ctx.Integer().getText()), 1);
   }

   @Override public Fraction visitExprReduce(FractionCalcParser.ExprReduceContext ctx) {
      Fraction res = visit(ctx.expr());
      res.reduce();
      return res;
   }

   @Override public Fraction visitExprFraction(FractionCalcParser.ExprFractionContext ctx) {
      int numerador = Integer.parseInt(ctx.Integer(0).getText());
      int denominador = Integer.parseInt(ctx.Integer(1).getText());
      return new Fraction(numerador, denominador);
   }

   @Override public Fraction visitExprVar(FractionCalcParser.ExprVarContext ctx) {
      String variable = ctx.Var().getText();
      return variables.get(variable);
   }
}
