@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Object> {
   
      @Override public Object visitProgram(CalculatorParser.ProgramContext ctx) {
         Object res = null;
         return visitChildren(ctx);
         //return res;
      }
   
      @Override public Object visitStat(CalculatorParser.StatContext ctx) {
         Integer res = (Integer)visit(ctx.expr());
         if(res != null)
            System.out.println("RESULT: " + res);
         return res;
      }
   
      @Override public Object visitExprSumDiv(CalculatorParser.ExprSumDivContext ctx) {
         Integer res = null;
         Integer first = (Integer)visit(ctx.expr(0));
         Integer second = (Integer)visit(ctx.expr(1));
         
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
   
      @Override public Object visitExprParent(CalculatorParser.ExprParentContext ctx) {
         return visit(ctx.expr());
      }
   
      @Override public Object visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
         return Integer.parseInt(ctx.Integer().getText());
      }
   
      @Override public Object visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
         Integer res = null;
         Integer first = (Integer)visit(ctx.expr(0));
         Integer second = (Integer)visit(ctx.expr(1));
   
         if(first != null && second != null){
            switch(ctx.op.getText()){
               case "*":
                  res = first * second;
                  break;
   
               case "/":
                  if(second == 0)
                     System.err.println("ERROR: Division by zero");
                  else
                     res = first / second;
                  break;
               
               case "%":
                  if(second == 0)
                     System.err.println("ERROR: Moule by zero");
                  else
                     res = first % second;
                  break;
            }
         }
         return res;
      }
   

   @Override public Object visitExprMinus(CalculatorParser.ExprMinusContext ctx) {
      Integer res = null;
      int number = (Integer)visit(ctx.expr());
      return number*(-1);
   }

   @Override public Object visitExprPlus(CalculatorParser.ExprPlusContext ctx) {
      int number = (Integer)visit(ctx.expr());
      return number;
   }
}
