@SuppressWarnings("CheckReturnValue")
public class ExecuteV extends DistanceBaseVisitor<Object> {

   @Override public Object visitMain(DistanceParser.MainContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitStatExpr(DistanceParser.StatExprContext ctx) {
      Double res = (Double)visit(ctx.expr());
      if(res != null)
         System.out.println(res);
      return res;
   }

   @Override public Object visitExprAddSub(DistanceParser.ExprAddSubContext ctx) {
      Double res = null;
      Double first = (Double)visit(ctx.expr(0));
      Double second = (Double)visit(ctx.expr(1));

      if(first != null && second != null){
         switch(ctx.op.getText()){
            case "+":
               res = first + second;
               break;
            case "-":
               res = first - second;
               break;
         }
      }
      return res;
   }

   @Override public Object visitExprParents(DistanceParser.ExprParentsContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Object visitExprDistance(DistanceParser.ExprDistanceContext ctx) {
      return visit(ctx.distance());
   }

   @Override public Object visitExprNumber(DistanceParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Object visitExprMultDiv(DistanceParser.ExprMultDivContext ctx) {
      Double res = null;
      Double first = (Double)visit(ctx.expr(0));
      Double second = (Double)visit(ctx.expr(1));

      if(first != null && second != null){
         switch(ctx.op.getText()){
            case "*":
               res = first * second;
               break;
            case "/":
               if(second == 0)
                  System.err.println("ERROR: Impossible to divide by zero");
               else
                  res = first/second;
               break;
         }
      }
      return res;
   }

   @Override public Object visitDistance(DistanceParser.DistanceContext ctx) {
      Object res = null;
      Double[] p1 = (Double[])visit(ctx.point(0));
      Double[] p2 = (Double[])visit(ctx.point(1));
      if(p1 != null && p2 != null){
         res = Math.sqrt(Math.pow(p1[0]-p2[0], 2) + Math.pow(p1[1]-p2[1], 2));
      }
      return res;
   }

   @Override public Object visitPoint(DistanceParser.PointContext ctx) {
      Double[] res = null;
      Double e1 = (Double)visit(ctx.expr(0));
      Double e2 = (Double)visit(ctx.expr(1));
      if(e1 != null && e2 != null){
         res = new Double[2];
         res[0] = e1;
         res[1] = e2;
      }
      return res;
   }
}
