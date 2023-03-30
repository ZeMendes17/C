// Generated from Translator.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TranslatorParser}.
 */
public interface TranslatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TranslatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TranslatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TranslatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TranslatorParser.StatContext ctx);
}