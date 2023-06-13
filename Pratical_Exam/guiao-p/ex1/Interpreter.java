@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {

   // ora criar aqui um hashmap com varriaveis e ques

   @Override public String visitDisplay(StrLangParser.DisplayContext ctx) {
      String res = visit(ctx.expression()); 

      if (res != null) {
         System.out.println(res.toString());
      }
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExpression(StrLangParser.ExpressionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
