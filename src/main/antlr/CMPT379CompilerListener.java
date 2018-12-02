// Generated from CMPT379Compiler.g4 by ANTLR 4.7.1

import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMPT379CompilerParser}.
 */
public interface CMPT379CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CMPT379CompilerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CMPT379CompilerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void enterField_decls(CMPT379CompilerParser.Field_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void exitField_decls(CMPT379CompilerParser.Field_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(CMPT379CompilerParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(CMPT379CompilerParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void enterInited_field_decl(CMPT379CompilerParser.Inited_field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void exitInited_field_decl(CMPT379CompilerParser.Inited_field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decls(CMPT379CompilerParser.Method_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decls(CMPT379CompilerParser.Method_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(CMPT379CompilerParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(CMPT379CompilerParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CMPT379CompilerParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CMPT379CompilerParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#nextParams}.
	 * @param ctx the parse tree
	 */
	void enterNextParams(CMPT379CompilerParser.NextParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#nextParams}.
	 * @param ctx the parse tree
	 */
	void exitNextParams(CMPT379CompilerParser.NextParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CMPT379CompilerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CMPT379CompilerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CMPT379CompilerParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CMPT379CompilerParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#var_decl_extra}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_extra(CMPT379CompilerParser.Var_decl_extraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#var_decl_extra}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_extra(CMPT379CompilerParser.Var_decl_extraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CMPT379CompilerParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CMPT379CompilerParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMPT379CompilerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMPT379CompilerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(CMPT379CompilerParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(CMPT379CompilerParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(CMPT379CompilerParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(CMPT379CompilerParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CMPT379CompilerParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CMPT379CompilerParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#someArgs}.
	 * @param ctx the parse tree
	 */
	void enterSomeArgs(CMPT379CompilerParser.SomeArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#someArgs}.
	 * @param ctx the parse tree
	 */
	void exitSomeArgs(CMPT379CompilerParser.SomeArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#calloutArgs}.
	 * @param ctx the parse tree
	 */
	void enterCalloutArgs(CMPT379CompilerParser.CalloutArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#calloutArgs}.
	 * @param ctx the parse tree
	 */
	void exitCalloutArgs(CMPT379CompilerParser.CalloutArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CMPT379CompilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CMPT379CompilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(CMPT379CompilerParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(CMPT379CompilerParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#m}.
	 * @param ctx the parse tree
	 */
	void enterM(CMPT379CompilerParser.MContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#m}.
	 * @param ctx the parse tree
	 */
	void exitM(CMPT379CompilerParser.MContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#n}.
	 * @param ctx the parse tree
	 */
	void enterN(CMPT379CompilerParser.NContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#n}.
	 * @param ctx the parse tree
	 */
	void exitN(CMPT379CompilerParser.NContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#k}.
	 * @param ctx the parse tree
	 */
	void enterK(CMPT379CompilerParser.KContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#k}.
	 * @param ctx the parse tree
	 */
	void exitK(CMPT379CompilerParser.KContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(CMPT379CompilerParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(CMPT379CompilerParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CMPT379CompilerParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CMPT379CompilerParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMPT379CompilerParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(CMPT379CompilerParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMPT379CompilerParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(CMPT379CompilerParser.EqOpContext ctx);
}