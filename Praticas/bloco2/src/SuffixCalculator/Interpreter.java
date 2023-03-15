@SuppressWarnings("CheckReturnValue")
public class Interpreter extends SuffixCalculatorBaseVisitor<Object> {

   @Override public Object visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = (Double)visit(ctx.expr());
      if(res != null)
         System.out.println("Result: " + res);
      return res;
   }

   @Override public Object visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Object visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
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
            case "*":
               res = first * second;
               break;
            case "/":
               if(second == 0){
                  System.err.println("ERROR, division by zero");
               } else {
                  res = first / second;
               }
         }
      }
      return res;
   }
}
