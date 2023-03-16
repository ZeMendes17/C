@SuppressWarnings("CheckReturnValue")
public class Interpreter extends PrefixCalculatorBaseVisitor<Object> {

   @Override public Object visitProgram(PrefixCalculatorParser.ProgramContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitStat(PrefixCalculatorParser.StatContext ctx) {
      Double res = (Double)visit(ctx.expr());
      if(res != null)
         System.out.println("Rsult: " + res);
      return res;
   }

   @Override public Object visitExprSuffix(PrefixCalculatorParser.ExprSuffixContext ctx) {
      Double res = null;
      Double first = (Double)visit(ctx.expr(0));
      Double second = (Double)visit(ctx.expr(1));
      String op = ctx.op.getText();

      if(first != null && second != null){
         switch(op){
            case "*":
               res = first * second;
               break;
            case "/":
               if(second == 0)
                  System.out.println("ERROR, division by zero");
               else
                  res = first / second;
               break;
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

   @Override public Object visitExprNumber(PrefixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }
}
