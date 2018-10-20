// Generated from A2_grammar.g4 by ANTLR 4.7.1

import java.io.*;

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
	 * Enter a parse tree produced by {@link A2_grammarParser#field_declarations}.
	 * @param ctx the parse tree
	 */
	void enterField_declarations(A2_grammarParser.Field_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#field_declarations}.
	 * @param ctx the parse tree
	 */
	void exitField_declarations(A2_grammarParser.Field_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#method_declarations}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declarations(A2_grammarParser.Method_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#method_declarations}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declarations(A2_grammarParser.Method_declarationsContext ctx);
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
	 * Enter a parse tree produced by {@link A2_grammarParser#temp}.
	 * @param ctx the parse tree
	 */
	void enterTemp(A2_grammarParser.TempContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#temp}.
	 * @param ctx the parse tree
	 */
	void exitTemp(A2_grammarParser.TempContext ctx);
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
	 * Enter a parse tree produced by {@link A2_grammarParser#tempParam}.
	 * @param ctx the parse tree
	 */
	void enterTempParam(A2_grammarParser.TempParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#tempParam}.
	 * @param ctx the parse tree
	 */
	void exitTempParam(A2_grammarParser.TempParamContext ctx);
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
	 * Enter a parse tree produced by {@link A2_grammarParser#var_decl_temp}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_temp(A2_grammarParser.Var_decl_tempContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#var_decl_temp}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_temp(A2_grammarParser.Var_decl_tempContext ctx);
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
	 * Enter a parse tree produced by {@link A2_grammarParser#var_decl_extra}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_extra(A2_grammarParser.Var_decl_extraContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#var_decl_extra}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_extra(A2_grammarParser.Var_decl_extraContext ctx);
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
	 * Enter a parse tree produced by {@link A2_grammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(A2_grammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(A2_grammarParser.StatementsContext ctx);
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
	 * Enter a parse tree produced by {@link A2_grammarParser#methodArgs}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgs(A2_grammarParser.MethodArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#methodArgs}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgs(A2_grammarParser.MethodArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#calloutArgs}.
	 * @param ctx the parse tree
	 */
	void enterCalloutArgs(A2_grammarParser.CalloutArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#calloutArgs}.
	 * @param ctx the parse tree
	 */
	void exitCalloutArgs(A2_grammarParser.CalloutArgsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#binOp}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(A2_grammarParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#binOp}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(A2_grammarParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2_grammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(A2_grammarParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2_grammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(A2_grammarParser.Int_literalContext ctx);
}