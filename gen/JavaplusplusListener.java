// Generated from D:/Y2 - Q3/CompilersIvo/project_files\Javaplusplus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaplusplusParser}.
 */
public interface JavaplusplusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaplusplusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaplusplusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaplusplusParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaplusplusParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#variable_init}.
	 * @param ctx the parse tree
	 */
	void enterVariable_init(JavaplusplusParser.Variable_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#variable_init}.
	 * @param ctx the parse tree
	 */
	void exitVariable_init(JavaplusplusParser.Variable_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#variable_method_init}.
	 * @param ctx the parse tree
	 */
	void enterVariable_method_init(JavaplusplusParser.Variable_method_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#variable_method_init}.
	 * @param ctx the parse tree
	 */
	void exitVariable_method_init(JavaplusplusParser.Variable_method_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(JavaplusplusParser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(JavaplusplusParser.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(JavaplusplusParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(JavaplusplusParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#function_call_method}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_method(JavaplusplusParser.Function_call_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#function_call_method}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_method(JavaplusplusParser.Function_call_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(JavaplusplusParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(JavaplusplusParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JavaplusplusParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JavaplusplusParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(JavaplusplusParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(JavaplusplusParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#ask}.
	 * @param ctx the parse tree
	 */
	void enterAsk(JavaplusplusParser.AskContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#ask}.
	 * @param ctx the parse tree
	 */
	void exitAsk(JavaplusplusParser.AskContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#comparable_statement}.
	 * @param ctx the parse tree
	 */
	void enterComparable_statement(JavaplusplusParser.Comparable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#comparable_statement}.
	 * @param ctx the parse tree
	 */
	void exitComparable_statement(JavaplusplusParser.Comparable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(JavaplusplusParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(JavaplusplusParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#comparables}.
	 * @param ctx the parse tree
	 */
	void enterComparables(JavaplusplusParser.ComparablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#comparables}.
	 * @param ctx the parse tree
	 */
	void exitComparables(JavaplusplusParser.ComparablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavaplusplusParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavaplusplusParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaplusplusParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(JavaplusplusParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaplusplusParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(JavaplusplusParser.Var_nameContext ctx);
}