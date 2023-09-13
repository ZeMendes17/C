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
	 * Enter a parse tree produced by {@link StrLangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(StrLangParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(StrLangParser.CommandContext ctx);
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
	 * Enter a parse tree produced by {@link StrLangParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(StrLangParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(StrLangParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrLangParser#elsecond}.
	 * @param ctx the parse tree
	 */
	void enterElsecond(StrLangParser.ElsecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#elsecond}.
	 * @param ctx the parse tree
	 */
	void exitElsecond(StrLangParser.ElsecondContext ctx);
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
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(StrLangParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(StrLangParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentExpr(StrLangParser.ParentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentExpr(StrLangParser.ParentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(StrLangParser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(StrLangParser.OpExprContext ctx);
}