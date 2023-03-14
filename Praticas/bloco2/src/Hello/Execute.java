import java.util.Iterator;

import org.antlr.v4.runtime.tree.TerminalNode;
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitTop(HelloParser.TopContext ctx){
      return visitChildren(ctx);
   }

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      // return visitChildren(ctx);
         System.out.println("Olá " + visit(ctx.name()));
      return res;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      String res = null;
      // return visitChildren(ctx);
         System.out.println("Adeus " + visit(ctx.name()));
      return res;
   }

   @Override public String visitName(HelloParser.NameContext ctx) {
      Iterator<TerminalNode> iter = ctx.ID().iterator();
      String res = "";
      while(iter.hasNext()){
         res += iter.next() + " ";
      }
      // return visitChildren(ctx);
      return res.trim();
   }
}
