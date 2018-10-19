// Generated from /Users/niragmehta/IdeaProjects/Assignment1_379/src/main/antlr/A2_grammar.g4 by ANTLR 4.7
package main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link A2_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface A2_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(A2_grammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(A2_grammarParser.Field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(A2_grammarParser.Method_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(A2_grammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(A2_grammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(A2_grammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(A2_grammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(A2_grammarParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(A2_grammarParser.Callout_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(A2_grammarParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(A2_grammarParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2_grammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(A2_grammarParser.LiteralContext ctx);
}