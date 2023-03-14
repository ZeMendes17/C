// Generated from Distance.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DistanceParser}.
 */
public interface DistanceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DistanceParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(DistanceParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistanceParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(DistanceParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link DistanceParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(DistanceParser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link DistanceParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(DistanceParser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(DistanceParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(DistanceParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParents}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParents(DistanceParser.ExprParentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParents}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParents(DistanceParser.ExprParentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDistance}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDistance(DistanceParser.ExprDistanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDistance}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDistance(DistanceParser.ExprDistanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(DistanceParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(DistanceParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(DistanceParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link DistanceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(DistanceParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link DistanceParser#distance}.
	 * @param ctx the parse tree
	 */
	void enterDistance(DistanceParser.DistanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistanceParser#distance}.
	 * @param ctx the parse tree
	 */
	void exitDistance(DistanceParser.DistanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DistanceParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(DistanceParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link DistanceParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(DistanceParser.PointContext ctx);
}