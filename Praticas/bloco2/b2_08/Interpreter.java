import java.util.Iterator;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Object> {

   @Override public Object visitProgram(CalculatorParser.ProgramContext ctx) {
      String res = "";
      Iterator<CalculatorParser.StatContext> iter = ctx.stat().iterator();
      while(iter.hasNext())
      res += visit(iter.next()) + "\n";
      return res;
   }

   @Override public Object visitStatExpr(CalculatorParser.StatExprContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Object visitStatAssign(CalculatorParser.StatAssignContext ctx) {
      return visit(ctx.assignment());
   }

   @Override public Object visitAssignment(CalculatorParser.AssignmentContext ctx) {
      return ctx.ID().getText() + " = " + visit(ctx.expr()); 
   }

   @Override public Object visitExprMinus(CalculatorParser.ExprMinusContext ctx) {
      return visit(ctx.expr()) + " !- ";
   }

   @Override public Object visitExprSumDiv(CalculatorParser.ExprSumDivContext ctx) {
      return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
   }

   @Override public Object visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Object visitExprPlus(CalculatorParser.ExprPlusContext ctx) {
      return visit(ctx.expr()) + " !+ ";
   }

   @Override public Object visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return ctx.Integer().getText();
   }

   @Override public Object visitExprID(CalculatorParser.ExprIDContext ctx) {
      return ctx.ID().getText();
   }

   @Override public Object visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
   }
}
