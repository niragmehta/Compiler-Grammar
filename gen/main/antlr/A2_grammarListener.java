// Generated from /Users/niragmehta/IdeaProjects/Assignment1_379/src/main/antlr/A2_grammar.g4 by ANTLR 4.7
package main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A2_grammarParser}.
 */
public interface A2_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(A2_grammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(A2_grammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(A2_grammarParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(A2_grammarParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(A2_grammarParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(A2_grammarParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(A2_grammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(A2_grammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(A2_grammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(A2_grammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(A2_grammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(A2_grammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(A2_grammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(A2_grammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(A2_grammarParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(A2_grammarParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(A2_grammarParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(A2_grammarParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(A2_grammarParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(A2_grammarParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(A2_grammarParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(A2_grammarParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(A2_grammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(A2_grammarParser.LiteralContext ctx);
}