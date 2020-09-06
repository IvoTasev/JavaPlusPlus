// Generated from D:/Y2 - Q3/CompilersIvo/project_files\Javaplusplus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaplusplusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaplusplusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaplusplusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaplusplusParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#variable_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_init(JavaplusplusParser.Variable_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#variable_method_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_method_init(JavaplusplusParser.Variable_method_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(JavaplusplusParser.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(JavaplusplusParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#function_call_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_method(JavaplusplusParser.Function_call_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(JavaplusplusParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(JavaplusplusParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(JavaplusplusParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#ask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsk(JavaplusplusParser.AskContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#comparable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparable_statement(JavaplusplusParser.Comparable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(JavaplusplusParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#comparables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparables(JavaplusplusParser.ComparablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavaplusplusParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(JavaplusplusParser.Var_nameContext ctx);
}