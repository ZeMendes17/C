import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class Compiler extends FractionCalcBaseVisitor<ST> {

   @Override public ST visitProgram(FractionCalcParser.ProgramContext ctx) {
      ST res = templates.getInstanceOf("module");
      res.add("stat", visit(ctx.statList()));
      return res;
   }

   @Override public ST visitStatList(FractionCalcParser.StatListContext ctx) {
      ST res = templates.getInstanceOf("stats");
      for(FractionCalcParser.StatContext sc: ctx.stat())
         res.add("stat", visit(sc));
      return res;
   }

   @Override public ST visitWrite(FractionCalcParser.WriteContext ctx) {
      ST res = templates.getInstanceOf("print");
      res.add("stat", visit(ctx.expr()));
      res.add("value", ctx.expr().varName);
      return res;
   }

   @Override public ST visitAssignment(FractionCalcParser.AssignmentContext ctx) {
      ST res = templates.getInstanceOf("assign");
      String var = ctx.Var().getText();
      res.add("stat", visit(ctx.expr()));
      res.add("type", "Fraction");
      res.add("var", var);
      res.add("value", ctx.expr().varName);

      return res;
   }

   @Override public ST visitExprVar(FractionCalcParser.ExprVarContext ctx) {
      ST res = templates.getInstanceOf("decl");;
      ctx.varName = newVar();
      res.add("type", "Fraction");
      res.add("var", ctx.varName);
      res.add("value", ctx.Var().getText());
      return res;
   }

   @Override public ST visitExprPow(FractionCalcParser.ExprPowContext ctx) {
      ST res = templates.getInstanceOf("assign");
      res.add("stat", visit(ctx.expr()));
      res.add("type", "Fraction");
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      if(ctx.minus == null)
         res.add("value", ctx.expr().varName+".pow(" + ctx.Integer().getText() + ")");
      else
      res.add("value", ctx.expr().varName+".pow(-" + ctx.Integer().getText() + ")");
      return res;
   }

   @Override public ST visitExprRead(FractionCalcParser.ExprReadContext ctx) {
      ST res = templates.getInstanceOf("input");
      res.add("name", ctx.String().getText());
      res.add("var1", newVar());
      res.add("var2", newVar());
      ctx.varName = newVar();
      res.add("var3", ctx.varName);
      return res;
   }

   @Override public ST visitExprSumSub(FractionCalcParser.ExprSumSubContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());
      ST bop = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();
      bop.add("type", "Fraction");
      bop.add("var", ctx.varName);
      bop.add("e1", ctx.expr(0).varName);
      if(ctx.op.getText().equals("+"))
         bop.add("op", "add");
      else
         bop.add("op", "sub");
      bop.add("e2", ctx.expr(1).varName);
      res.add("stat", bop.render());
      return res;
   }

   @Override public ST visitExprParent(FractionCalcParser.ExprParentContext ctx) {
      ST res = visit(ctx.expr());
      ctx.varName = ctx.expr().varName;
      return res;
   }

   @Override public ST visitExprMultDiv(FractionCalcParser.ExprMultDivContext ctx) {
      ST res = templates.getInstanceOf("stats");
      res.add("stat", visit(ctx.expr(0)).render());
      res.add("stat", visit(ctx.expr(1)).render());
      ST bop = templates.getInstanceOf("binaryOperation");
      ctx.varName = newVar();
      bop.add("type", "Fraction");
      bop.add("var", ctx.varName);
      bop.add("e1", ctx.expr(0).varName);
      if(ctx.op.getText().equals("*"))
         bop.add("op", "multiply");
      else
         bop.add("op", "divide");
      bop.add("e2", ctx.expr(1).varName);
      res.add("stat", bop.render());
      return res;
   }

   @Override public ST visitExprNegative(FractionCalcParser.ExprNegativeContext ctx) {
      ST res = templates.getInstanceOf("assign");
      res.add("stat", visit(ctx.expr()));
      res.add("type", "Fraction");
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      res.add("value", ctx.expr().varName+".toNegative()");
      return res;
   }

   @Override public ST visitExprInteger(FractionCalcParser.ExprIntegerContext ctx) {
      ST res = templates.getInstanceOf("frac");
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      res.add("numerator", ctx.Integer().getText());
      res.add("denominator", "1");
      return res;
   }

   @Override public ST visitExprReduce(FractionCalcParser.ExprReduceContext ctx) {
      ST res = templates.getInstanceOf("reduce");

      res.add("stat", visit(ctx.expr()));
      res.add("type", "Fraction");
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      res.add("value", ctx.expr().varName);
      return res;
   }

   @Override public ST visitExprFraction(FractionCalcParser.ExprFractionContext ctx) {
      ST res = templates.getInstanceOf("frac");
      ctx.varName = newVar();
      res.add("var", ctx.varName);
      res.add("numerator", ctx.Integer(0).getText());
      res.add("denominator", ctx.Integer(1).getText());
      return res;
   }

   private String newVar() {
      numVars++;
      return "v" + numVars;
   }

   private int numVars=0;

   private STGroup templates = new STGroupFile("java.stg");
}
