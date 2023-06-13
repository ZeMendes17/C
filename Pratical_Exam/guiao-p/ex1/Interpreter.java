@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {

   @Override public String visitDisplay(StrLangParser.DisplayContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
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
