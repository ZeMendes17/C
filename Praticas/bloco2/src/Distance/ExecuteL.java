import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
@SuppressWarnings("CheckReturnValue")

public class ExecuteL extends DistanceBaseListener {

   @Override public void exitStatExpr(DistanceParser.StatExprContext ctx) {
      Double res = ctx.expr().res;
      if(res != null)
         System.out.println("Result (L): " + res);
   }

   @Override public void exitExprAddSub(DistanceParser.ExprAddSubContext ctx) {
      Double first = (Double)ctx.expr(0).res;
      Double second = (Double)ctx.expr(1).res;

      if(first != null && second != null){
         switch(ctx.op.getText()){
            case "+":
               ctx.res = first + second;
               break;
            case "-":
               ctx.res = first - second;
               break;
         }
      }
   }

   @Override public void exitExprParents(DistanceParser.ExprParentsContext ctx) {
      ctx.res = ctx.expr().res;
   }

   @Override public void exitExprDistance(DistanceParser.ExprDistanceContext ctx) {
      ctx.res = ctx.distance().res;
   }

   @Override public void exitExprNumber(DistanceParser.ExprNumberContext ctx) {
      ctx.res = Double.parseDouble(ctx.Number().getText());
   }

   @Override public void exitExprMultDiv(DistanceParser.ExprMultDivContext ctx) {
      Double first = (Double)ctx.expr(0).res;
      Double second = (Double)ctx.expr(1).res;

      if(first != null && second != null){
         switch(ctx.op.getText()){
            case "*":
               ctx.res = first * second;
               break;
            case "/":
               if(second == 0)
                  System.err.println("ERROR: Impossible to divide by zero");
               else
                  ctx.res = first/second;
               break;
         }
      }
   }

   @Override public void exitDistance(DistanceParser.DistanceContext ctx) {
      Double p1x = ctx.point(0).x;
      Double p2x = ctx.point(1).x;
      Double p1y = ctx.point(0).y;
      Double p2y = ctx.point(1).y;
      if(p1x != null && p2x != null && p1y != null && p2y != null){
         ctx.res = Math.sqrt(Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y, 2));
      }
   }

   @Override public void exitPoint(DistanceParser.PointContext ctx) {
      ctx.x = ctx.expr(0).res;
      ctx.y = ctx.expr(1).res;

   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
