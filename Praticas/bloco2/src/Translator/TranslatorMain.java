import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;

public class TranslatorMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:

         // our code
         File file = new File("numbers.txt");
         InputStream targetStream = new FileInputStream(file);

         CharStream input = CharStreams.fromStream(targetStream);
         // create a lexer that feeds off of input CharStream:
         TranslatorLexer lexer = new TranslatorLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         TranslatorParser parser = new TranslatorParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            ParseTreeWalker walker = new ParseTreeWalker();
            Interpreter listener0 = new Interpreter();
            walker.walk(listener0, tree);
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }

      // our code to translate
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter phrase to translate: ");
      String lineText = sc.nextLine();
      sc.close();
      Map<String, Integer> map = Interpreter.getTranslator();

      lineText = lineText.replace("-", " ");
      String[] line = lineText.split("\\s+");
      StringBuilder sb = new StringBuilder();
      int flag = 0;
      for(String s : line){
         for(String translation : map.keySet()){
            if(s.equals(translation)){
               sb.append(map.get(translation) + " ");
               flag = 1;
               break;
            }
         }
         if(flag == 1){
            flag = 0;
            continue;
         }
         sb.append(s + " ");
      }
      
      System.out.println(sb.toString());
   }
}
