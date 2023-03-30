import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("CheckReturnValue")

public class Interpreter extends TranslatorBaseListener {

   static Map<String, Integer> translator;

   public Interpreter(){
      translator = new HashMap<>();
   }

   @Override public void exitStat(TranslatorParser.StatContext ctx) {
      translator.put(ctx.Word().getText(), Integer.parseInt(ctx.Num().getText()));
      // System.out.println(ctx.Word().getText() + "->" +  Integer.parseInt(ctx.Num().getText()));
   }

   public static Map<String, Integer> getTranslator(){
      return translator;
   }

}
