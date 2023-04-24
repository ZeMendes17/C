// Generated from FractionCalc.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FractionCalcParser}.
 */
public interface FractionCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FractionCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FractionCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FractionCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionCalcParser#statList}.
	 * @param ctx the parse tree
	 */
	void enterStatList(FractionCalcParser.StatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalcParser#statList}.
	 * @param ctx the parse tree
	 */
	void exitStatList(FractionCalcParser.StatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(FractionCalcParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(FractionCalcParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionCalcParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(FractionCalcParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalcParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(FractionCalcParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FractionCalcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FractionCalcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(FractionCalcParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(FractionCalcParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPow(FractionCalcParser.ExprPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPow}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPow(FractionCalcParser.ExprPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(FractionCalcParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(FractionCalcParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSumSub}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSumSub(FractionCalcParser.ExprSumSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSumSub}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSumSub(FractionCalcParser.ExprSumSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(FractionCalcParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(FractionCalcParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FractionCalcParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FractionCalcParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNegative}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNegative(FractionCalcParser.ExprNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNegative}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNegative(FractionCalcParser.ExprNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(FractionCalcParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(FractionCalcParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FractionCalcParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FractionCalcParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(FractionCalcParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(FractionCalcParser.ExprFractionContext ctx);
}