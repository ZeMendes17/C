// Generated from FractionCalc.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FractionCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FractionCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FractionCalcParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FractionCalcParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionCalcParser#statList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatList(FractionCalcParser.StatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionCalcParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(FractionCalcParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionCalcParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(FractionCalcParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionCalcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FractionCalcParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(FractionCalcParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPow(FractionCalcParser.ExprPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(FractionCalcParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSumSub}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSumSub(FractionCalcParser.ExprSumSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(FractionCalcParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(FractionCalcParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNegative}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNegative(FractionCalcParser.ExprNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(FractionCalcParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(FractionCalcParser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFraction(FractionCalcParser.ExprFractionContext ctx);
}