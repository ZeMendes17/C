// Generated from Distance.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DistanceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DistanceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DistanceParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(DistanceParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link DistanceParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatExpr(DistanceParser.StatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(DistanceParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParents}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParents(DistanceParser.ExprParentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDistance}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDistance(DistanceParser.ExprDistanceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(DistanceParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(DistanceParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistanceParser#distance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistance(DistanceParser.DistanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DistanceParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(DistanceParser.PointContext ctx);
}