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
	 * Enter a parse tree produced by the {@code TrimExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrimExpr(StrLangParser.TrimExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrimExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrimExpr(StrLangParser.TrimExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(StrLangParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(StrLangParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(StrLangParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(StrLangParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpr(StrLangParser.InputExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpr(StrLangParser.InputExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConcatRemvExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatRemvExpr(StrLangParser.ConcatRemvExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConcatRemvExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatRemvExpr(StrLangParser.ConcatRemvExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(StrLangParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(StrLangParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReplaceExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReplaceExpr(StrLangParser.ReplaceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReplaceExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReplaceExpr(StrLangParser.ReplaceExprContext ctx);
}