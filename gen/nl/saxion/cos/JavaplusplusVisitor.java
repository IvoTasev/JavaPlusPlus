// Generated from C:/Users/IvoTasev/Desktop/CnOS/src\Javaplusplus.g4 by ANTLR 4.8
package nl.saxion.cos;
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
	 * Visit a parse tree produced by {@link JavaplusplusParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(JavaplusplusParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(JavaplusplusParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_init(JavaplusplusParser.Var_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#func_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_init(JavaplusplusParser.Func_initContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExEqualsExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExEqualsExpression(JavaplusplusParser.ExEqualsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JavaplusplusParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIdentifier}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIdentifier(JavaplusplusParser.ExIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(JavaplusplusParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparatorExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(JavaplusplusParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AskExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAskExpression(JavaplusplusParser.AskExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExStrLiteral}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExStrLiteral(JavaplusplusParser.ExStrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMethodInvocation}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMethodInvocation(JavaplusplusParser.ExMethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(JavaplusplusParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIntLiteral}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIntLiteral(JavaplusplusParser.ExIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(JavaplusplusParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpression}
	 * labeled alternative in {@link JavaplusplusParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(JavaplusplusParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#func_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_vars(JavaplusplusParser.Func_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaplusplusParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaplusplusParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(JavaplusplusParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(JavaplusplusParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#func_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_var(JavaplusplusParser.Func_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#ask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsk(JavaplusplusParser.AskContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(JavaplusplusParser.CheckContext ctx);
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
	 * Visit a parse tree produced by {@link JavaplusplusParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(JavaplusplusParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaplusplusParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(JavaplusplusParser.ParamsContext ctx);
}