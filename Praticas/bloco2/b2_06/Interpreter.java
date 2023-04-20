import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Object> {

   HashMap<String, Integer> variables = new HashMap<>();

   @Override public Object visitProgram(CalculatorParser.ProgramContext ctx) {
      Object res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Object visitStatExpr(CalculatorParser.StatExprContext ctx) {
      Integer res = (Integer)visit(ctx.expr());
      if(res != null)
         System.out.println("RESULT: " + res);
      return res;
   }

   @Override public Object visitStatAssign(CalculatorParser.StatAssignContext ctx) {
      String var = (String)visit(ctx.assignment());
      return var;
   }

   @Override public Object visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String var = ctx.ID().getText();
      Integer value = (Integer)visit(ctx.expr());
      if(var != null && value != null){
         variables.put(var, value);
         System.out.println("Variable '" + var + "' stored with the value of " + value);
      }
      return var;
   }

   @Override public Object visitExprMinus(CalculatorParser.ExprMinusContext ctx) {
      int number = (Integer)visit(ctx.expr());
      return (-1)*number;      
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

   @Override public Object visitExprPlus(CalculatorParser.ExprPlusContext ctx) {
      int number = (Integer)visit(ctx.expr());
      return number;
   }

   @Override public Object visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Object visitExprID(CalculatorParser.ExprIDContext ctx) {
      String id = ctx.ID().getText();
      int value = 0;

      if(variables.containsKey(id)){
         value = variables.get(id);
      } else {
         System.err.println("Variable does not exist");
      }
      return value;
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
                  System.err.println("ERROR: Module by zero");
               else
                  res = first % second;
               break;
         }
      }
      return res;
   }
}
