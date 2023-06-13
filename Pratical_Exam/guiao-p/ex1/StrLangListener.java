// Generated from StrLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLangParser}.
 */
public interface StrLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(StrLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(StrLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(StrLangParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(StrLangParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StrLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StrLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StrLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StrLangParser.ExpressionContext ctx);
}