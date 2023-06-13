// Generated from StrLang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(StrLangParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrLangParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(StrLangParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(StrLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrimExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimExpr(StrLangParser.TrimExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(StrLangParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(StrLangParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpr(StrLangParser.InputExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatRemvExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatRemvExpr(StrLangParser.ConcatRemvExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(StrLangParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReplaceExpr}
	 * labeled alternative in {@link StrLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceExpr(StrLangParser.ReplaceExprContext ctx);
}