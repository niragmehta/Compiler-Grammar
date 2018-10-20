// Generated from A2_grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A2_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WhiteSpace=10, Char=11, Str=12, Class=13, Program=14, Void=15, If=16, 
		Else=17, While=18, Switch=19, Case=20, Ret=21, Brk=22, Cnt=23, Callout=24, 
		Num=25, HexNum=26, BoolLit=27, Type=28, Ident=29, Relop=30, AssignOp=31, 
		ArithOp=32, CondOp=33, OParen=34, CParen=35, OBrace=36, CBrace=37, OBracket=38, 
		CBracket=39, SemiColon=40, Comma=41;
	public static final int
		RULE_prog = 0, RULE_field_declarations = 1, RULE_method_declTemp = 2, 
		RULE_field_decl = 3, RULE_temp = 4, RULE_method_decl = 5, RULE_tempParam = 6, 
		RULE_block = 7, RULE_var_decl_temp = 8, RULE_var_decl = 9, RULE_var_decl_extra = 10, 
		RULE_statement = 11, RULE_statements = 12, RULE_expr = 13, RULE_method_call = 14, 
		RULE_callout_arg = 15, RULE_method_name = 16, RULE_location = 17, RULE_literal = 18, 
		RULE_binOp = 19, RULE_int_literal = 20;
	public static final String[] ruleNames = {
		"prog", "field_declarations", "method_declTemp", "field_decl", "temp", 
		"method_decl", "tempParam", "block", "var_decl_temp", "var_decl", "var_decl_extra", 
		"statement", "statements", "expr", "method_call", "callout_arg", "method_name", 
		"location", "literal", "binOp", "int_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class Program {'", "'='", "'void'", "'+='", "'-='", "'expr'", 
		"':'", "'-'", "'!'", null, null, null, "'class'", "'Program'", "'Void'", 
		"'if'", "'else'", "'while'", "'switch'", "'case'", "'return'", "'break'", 
		"'continue'", "'callout'", null, null, null, null, null, null, null, null, 
		null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WhiteSpace", 
		"Char", "Str", "Class", "Program", "Void", "If", "Else", "While", "Switch", 
		"Case", "Ret", "Brk", "Cnt", "Callout", "Num", "HexNum", "BoolLit", "Type", 
		"Ident", "Relop", "AssignOp", "ArithOp", "CondOp", "OParen", "CParen", 
		"OBrace", "CBrace", "OBracket", "CBracket", "SemiColon", "Comma"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "A2_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public A2_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Field_declarationsContext field_declarations() {
			return getRuleContext(Field_declarationsContext.class,0);
		}
		public Method_declTempContext method_declTemp() {
			return getRuleContext(Method_declTempContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			field_declarations();
			setState(44);
			method_declTemp();
			setState(45);
			match(CBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declarationsContext extends ParserRuleContext {
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public Field_declarationsContext field_declarations() {
			return getRuleContext(Field_declarationsContext.class,0);
		}
		public Field_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterField_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitField_declarations(this);
		}
	}

	public final Field_declarationsContext field_declarations() throws RecognitionException {
		Field_declarationsContext _localctx = new Field_declarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_declarations);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				field_decl();
				setState(48);
				field_declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declTempContext extends ParserRuleContext {
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Method_declTempContext method_declTemp() {
			return getRuleContext(Method_declTempContext.class,0);
		}
		public Method_declTempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterMethod_declTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitMethod_declTemp(this);
		}
	}

	public final Method_declTempContext method_declTemp() throws RecognitionException {
		Method_declTempContext _localctx = new Method_declTempContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_declTemp);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				method_decl();
				setState(54);
				method_declTemp();
				}
				break;
			case CBrace:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(A2_grammarParser.Type, 0); }
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(A2_grammarParser.SemiColon, 0); }
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
		}
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_decl);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(Type);
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(60);
					match(Ident);
					}
					break;
				case 2:
					{
					setState(61);
					match(Ident);
					setState(62);
					match(OBracket);
					setState(63);
					int_literal();
					setState(64);
					match(CBracket);
					}
					break;
				}
				setState(68);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(Type);
				setState(70);
				match(Ident);
				setState(71);
				match(T__1);
				setState(72);
				literal();
				setState(73);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(Type);
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(76);
					match(Ident);
					}
					break;
				case 2:
					{
					setState(77);
					match(Ident);
					setState(78);
					match(OBracket);
					setState(79);
					int_literal();
					setState(80);
					match(CBracket);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				temp();
				setState(85);
				field_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Comma:
					{
					setState(87);
					match(Comma);
					setState(88);
					match(Ident);
					}
					break;
				case Ident:
					{
					setState(89);
					match(Ident);
					setState(90);
					match(OBracket);
					setState(91);
					int_literal();
					setState(92);
					match(CBracket);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitTemp(this);
		}
	}

	public final TempContext temp() throws RecognitionException {
		TempContext _localctx = new TempContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_temp);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(Comma);
				setState(100);
				match(Ident);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(Ident);
				setState(102);
				match(OBracket);
				setState(103);
				int_literal();
				setState(104);
				match(CBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public TempParamContext tempParam() {
			return getRuleContext(TempParamContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Type() { return getToken(A2_grammarParser.Type, 0); }
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==Type) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			match(Ident);
			setState(110);
			match(OParen);
			setState(111);
			tempParam();
			setState(112);
			match(CParen);
			setState(113);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempParamContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(A2_grammarParser.Type, 0); }
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public TempParamContext tempParam() {
			return getRuleContext(TempParamContext.class,0);
		}
		public TempParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterTempParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitTempParam(this);
		}
	}

	public final TempParamContext tempParam() throws RecognitionException {
		TempParamContext _localctx = new TempParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tempParam);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(115);
				match(Type);
				setState(116);
				match(Ident);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(117);
				match(Type);
				setState(118);
				match(Ident);
				}
				setState(120);
				tempParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(121);
				match(Comma);
				setState(122);
				match(Type);
				setState(123);
				match(Ident);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Var_decl_tempContext var_decl_temp() {
			return getRuleContext(Var_decl_tempContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(OBrace);
			setState(128);
			var_decl_temp();
			setState(129);
			statements();
			setState(130);
			match(CBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_tempContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_decl_tempContext var_decl_temp() {
			return getRuleContext(Var_decl_tempContext.class,0);
		}
		public Var_decl_tempContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_temp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterVar_decl_temp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitVar_decl_temp(this);
		}
	}

	public final Var_decl_tempContext var_decl_temp() throws RecognitionException {
		Var_decl_tempContext _localctx = new Var_decl_tempContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_decl_temp);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				var_decl();
				setState(133);
				var_decl_temp();
				}
				break;
			case If:
			case While:
			case Switch:
			case Ret:
			case Brk:
			case Cnt:
			case Callout:
			case Ident:
			case OBrace:
			case CBrace:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(A2_grammarParser.Type, 0); }
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public Var_decl_extraContext var_decl_extra() {
			return getRuleContext(Var_decl_extraContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(Type);
			setState(139);
			match(Ident);
			setState(140);
			var_decl_extra();
			setState(141);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_extraContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public Var_decl_extraContext var_decl_extra() {
			return getRuleContext(Var_decl_extraContext.class,0);
		}
		public Var_decl_extraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterVar_decl_extra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitVar_decl_extra(this);
		}
	}

	public final Var_decl_extraContext var_decl_extra() throws RecognitionException {
		Var_decl_extraContext _localctx = new Var_decl_extraContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_decl_extra);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(Comma);
				setState(144);
				match(Ident);
				setState(145);
				var_decl_extra();
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(A2_grammarParser.SemiColon, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode OParen() { return getToken(A2_grammarParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(A2_grammarParser.CParen, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				location();
				setState(150);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				expr(0);
				setState(152);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				method_call();
				setState(155);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(If);
				setState(158);
				match(OParen);
				setState(159);
				match(T__5);
				setState(160);
				match(CParen);
				setState(161);
				block();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(162);
					match(Else);
					setState(163);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(Switch);
				setState(167);
				expr(0);
				setState(168);
				match(OBrace);
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(169);
					match(Case);
					setState(170);
					literal();
					setState(171);
					match(T__6);
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Switch) | (1L << Ret) | (1L << Brk) | (1L << Cnt) | (1L << Callout) | (1L << Ident) | (1L << OBrace))) != 0)) {
						{
						{
						setState(172);
						statement();
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Case );
				setState(182);
				match(CBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(While);
				setState(185);
				match(OParen);
				setState(186);
				expr(0);
				setState(187);
				match(CParen);
				setState(188);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(Ret);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Char) | (1L << Callout) | (1L << Num) | (1L << HexNum) | (1L << BoolLit) | (1L << Ident) | (1L << OParen))) != 0)) {
					{
					setState(191);
					expr(0);
					}
				}

				setState(194);
				match(SemiColon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				match(Brk);
				setState(196);
				match(SemiColon);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				match(Cnt);
				setState(198);
				match(SemiColon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statements);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
			case While:
			case Switch:
			case Ret:
			case Brk:
			case Cnt:
			case Callout:
			case Ident:
			case OBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				statement();
				setState(203);
				statements();
				}
				break;
			case CBrace:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(209);
				location();
				}
				break;
			case 2:
				{
				setState(210);
				method_call();
				}
				break;
			case 3:
				{
				setState(211);
				literal();
				}
				break;
			case 4:
				{
				setState(212);
				match(T__7);
				setState(213);
				expr(3);
				}
				break;
			case 5:
				{
				setState(214);
				match(T__8);
				setState(215);
				expr(2);
				}
				break;
			case 6:
				{
				setState(216);
				match(OParen);
				setState(217);
				expr(0);
				setState(218);
				match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(222);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(223);
					binOp();
					setState(224);
					expr(5);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Callout() { return getToken(A2_grammarParser.Callout, 0); }
		public TerminalNode Str() { return getToken(A2_grammarParser.Str, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_call);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				method_name();
				setState(232);
				match(OParen);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Char) | (1L << Callout) | (1L << Num) | (1L << HexNum) | (1L << BoolLit) | (1L << Ident) | (1L << OParen))) != 0)) {
					{
					setState(233);
					expr(0);
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(234);
						match(Comma);
						setState(235);
						expr(0);
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(243);
				match(CParen);
				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(Callout);
				setState(246);
				match(OParen);
				setState(247);
				match(Str);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(248);
					match(Comma);
					setState(249);
					callout_arg();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(CParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Str() { return getToken(A2_grammarParser.Str, 0); }
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callout_arg);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case Char:
			case Callout:
			case Num:
			case HexNum:
			case BoolLit:
			case Ident:
			case OParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				expr(0);
				}
				break;
			case Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(Str);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(A2_grammarParser.Ident, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_location);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(Ident);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(Ident);
				setState(266);
				match(OBracket);
				setState(267);
				expr(0);
				setState(268);
				match(CBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode Char() { return getToken(A2_grammarParser.Char, 0); }
		public TerminalNode BoolLit() { return getToken(A2_grammarParser.BoolLit, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Num:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				int_literal();
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(Char);
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(BoolLit);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinOpContext extends ParserRuleContext {
		public TerminalNode ArithOp() { return getToken(A2_grammarParser.ArithOp, 0); }
		public TerminalNode Relop() { return getToken(A2_grammarParser.Relop, 0); }
		public TerminalNode AssignOp() { return getToken(A2_grammarParser.AssignOp, 0); }
		public TerminalNode CondOp() { return getToken(A2_grammarParser.CondOp, 0); }
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitBinOp(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Relop) | (1L << AssignOp) | (1L << ArithOp) | (1L << CondOp))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(A2_grammarParser.Num, 0); }
		public TerminalNode HexNum() { return getToken(A2_grammarParser.HexNum, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==Num || _la==HexNum) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"U\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\5\5d\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u0096\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a7\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b0\n\r\f\r\16\r"+
		"\u00b3\13\r\6\r\u00b5\n\r\r\r\16\r\u00b6\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00c3\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cb\n\r\3\16\3"+
		"\16\3\16\3\16\5\16\u00d1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00df\n\17\3\17\3\17\3\17\3\17\7\17\u00e5\n"+
		"\17\f\17\16\17\u00e8\13\17\3\20\3\20\3\20\3\20\3\20\7\20\u00ef\n\20\f"+
		"\20\16\20\u00f2\13\20\5\20\u00f4\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00fd\n\20\f\20\16\20\u0100\13\20\3\20\5\20\u0103\n\20\3\21\3"+
		"\21\5\21\u0107\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0111"+
		"\n\23\3\24\3\24\3\24\5\24\u0116\n\24\3\25\3\25\3\26\3\26\3\26\2\3\34\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\4\2\5\5\36\36\4\2\4"+
		"\4\6\7\3\2 #\3\2\33\34\2\u0130\2,\3\2\2\2\4\65\3\2\2\2\6;\3\2\2\2\bc\3"+
		"\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16\177\3\2\2\2\20\u0081\3\2\2\2\22\u008a"+
		"\3\2\2\2\24\u008c\3\2\2\2\26\u0095\3\2\2\2\30\u00ca\3\2\2\2\32\u00d0\3"+
		"\2\2\2\34\u00de\3\2\2\2\36\u0102\3\2\2\2 \u0106\3\2\2\2\"\u0108\3\2\2"+
		"\2$\u0110\3\2\2\2&\u0115\3\2\2\2(\u0117\3\2\2\2*\u0119\3\2\2\2,-\7\3\2"+
		"\2-.\5\4\3\2./\5\6\4\2/\60\7\'\2\2\60\3\3\2\2\2\61\62\5\b\5\2\62\63\5"+
		"\4\3\2\63\66\3\2\2\2\64\66\3\2\2\2\65\61\3\2\2\2\65\64\3\2\2\2\66\5\3"+
		"\2\2\2\678\5\f\7\289\5\6\4\29<\3\2\2\2:<\3\2\2\2;\67\3\2\2\2;:\3\2\2\2"+
		"<\7\3\2\2\2=D\7\36\2\2>E\7\37\2\2?@\7\37\2\2@A\7(\2\2AB\5*\26\2BC\7)\2"+
		"\2CE\3\2\2\2D>\3\2\2\2D?\3\2\2\2EF\3\2\2\2Fd\7*\2\2GH\7\36\2\2HI\7\37"+
		"\2\2IJ\7\4\2\2JK\5&\24\2KL\7*\2\2Ld\3\2\2\2MT\7\36\2\2NU\7\37\2\2OP\7"+
		"\37\2\2PQ\7(\2\2QR\5*\26\2RS\7)\2\2SU\3\2\2\2TN\3\2\2\2TO\3\2\2\2Ud\3"+
		"\2\2\2VW\5\n\6\2WX\5\b\5\2Xd\3\2\2\2YZ\7+\2\2Za\7\37\2\2[\\\7\37\2\2\\"+
		"]\7(\2\2]^\5*\26\2^_\7)\2\2_a\3\2\2\2`Y\3\2\2\2`[\3\2\2\2ab\3\2\2\2bd"+
		"\7*\2\2c=\3\2\2\2cG\3\2\2\2cM\3\2\2\2cV\3\2\2\2c`\3\2\2\2d\t\3\2\2\2e"+
		"f\7+\2\2fm\7\37\2\2gh\7\37\2\2hi\7(\2\2ij\5*\26\2jk\7)\2\2km\3\2\2\2l"+
		"e\3\2\2\2lg\3\2\2\2m\13\3\2\2\2no\t\2\2\2op\7\37\2\2pq\7$\2\2qr\5\16\b"+
		"\2rs\7%\2\2st\5\20\t\2t\r\3\2\2\2uv\7\36\2\2v\u0080\7\37\2\2wx\7\36\2"+
		"\2xy\7\37\2\2yz\3\2\2\2z\u0080\5\16\b\2{|\7+\2\2|}\7\36\2\2}\u0080\7\37"+
		"\2\2~\u0080\3\2\2\2\177u\3\2\2\2\177w\3\2\2\2\177{\3\2\2\2\177~\3\2\2"+
		"\2\u0080\17\3\2\2\2\u0081\u0082\7&\2\2\u0082\u0083\5\22\n\2\u0083\u0084"+
		"\5\32\16\2\u0084\u0085\7\'\2\2\u0085\21\3\2\2\2\u0086\u0087\5\24\13\2"+
		"\u0087\u0088\5\22\n\2\u0088\u008b\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0086"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\23\3\2\2\2\u008c\u008d\7\36\2\2\u008d"+
		"\u008e\7\37\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7*\2\2\u0090\25\3\2\2"+
		"\2\u0091\u0092\7+\2\2\u0092\u0093\7\37\2\2\u0093\u0096\5\26\f\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0094\3\2\2\2\u0096\27\3\2\2"+
		"\2\u0097\u0098\5$\23\2\u0098\u0099\t\3\2\2\u0099\u009a\5\34\17\2\u009a"+
		"\u009b\7*\2\2\u009b\u00cb\3\2\2\2\u009c\u009d\5\36\20\2\u009d\u009e\7"+
		"*\2\2\u009e\u00cb\3\2\2\2\u009f\u00a0\7\22\2\2\u00a0\u00a1\7$\2\2\u00a1"+
		"\u00a2\7\b\2\2\u00a2\u00a3\7%\2\2\u00a3\u00a6\5\20\t\2\u00a4\u00a5\7\23"+
		"\2\2\u00a5\u00a7\5\20\t\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00cb\3\2\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00b4"+
		"\7&\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\5&\24\2\u00ad\u00b1\7\t\2\2\u00ae"+
		"\u00b0\5\30\r\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00ab\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\'\2\2\u00b9\u00cb\3\2\2\2\u00ba"+
		"\u00bb\7\24\2\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\7"+
		"%\2\2\u00be\u00bf\5\30\r\2\u00bf\u00cb\3\2\2\2\u00c0\u00c2\7\27\2\2\u00c1"+
		"\u00c3\5\34\17\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00cb\7*\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00cb\7*\2\2\u00c7"+
		"\u00c8\7\31\2\2\u00c8\u00cb\7*\2\2\u00c9\u00cb\5\20\t\2\u00ca\u0097\3"+
		"\2\2\2\u00ca\u009c\3\2\2\2\u00ca\u009f\3\2\2\2\u00ca\u00a8\3\2\2\2\u00ca"+
		"\u00ba\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c7\3\2"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00cb\31\3\2\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce"+
		"\5\32\16\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\b\17\1\2\u00d3\u00df"+
		"\5$\23\2\u00d4\u00df\5\36\20\2\u00d5\u00df\5&\24\2\u00d6\u00d7\7\n\2\2"+
		"\u00d7\u00df\5\34\17\5\u00d8\u00d9\7\13\2\2\u00d9\u00df\5\34\17\4\u00da"+
		"\u00db\7$\2\2\u00db\u00dc\5\34\17\2\u00dc\u00dd\7%\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00d2\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d5\3\2\2\2\u00de"+
		"\u00d6\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e6\3\2"+
		"\2\2\u00e0\u00e1\f\6\2\2\u00e1\u00e2\5(\25\2\u00e2\u00e3\5\34\17\7\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\35\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\5\"\22\2\u00ea\u00f3\7$\2\2\u00eb\u00f0\5\34\17\2\u00ec\u00ed\7+\2\2"+
		"\u00ed\u00ef\5\34\17\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00eb\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7%"+
		"\2\2\u00f6\u0103\3\2\2\2\u00f7\u00f8\7\32\2\2\u00f8\u00f9\7$\2\2\u00f9"+
		"\u00fe\7\16\2\2\u00fa\u00fb\7+\2\2\u00fb\u00fd\5 \21\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\7%\2\2\u0102\u00e9\3\2"+
		"\2\2\u0102\u00f7\3\2\2\2\u0103\37\3\2\2\2\u0104\u0107\5\34\17\2\u0105"+
		"\u0107\7\16\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107!\3\2\2\2"+
		"\u0108\u0109\7\37\2\2\u0109#\3\2\2\2\u010a\u0111\7\37\2\2\u010b\u010c"+
		"\7\37\2\2\u010c\u010d\7(\2\2\u010d\u010e\5\34\17\2\u010e\u010f\7)\2\2"+
		"\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0111%\3"+
		"\2\2\2\u0112\u0116\5*\26\2\u0113\u0116\7\r\2\2\u0114\u0116\7\35\2\2\u0115"+
		"\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\'\3\2\2\2"+
		"\u0117\u0118\t\4\2\2\u0118)\3\2\2\2\u0119\u011a\t\5\2\2\u011a+\3\2\2\2"+
		"\33\65;DT`cl\177\u008a\u0095\u00a6\u00b1\u00b6\u00c2\u00ca\u00d0\u00de"+
		"\u00e6\u00f0\u00f3\u00fe\u0102\u0106\u0110\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}