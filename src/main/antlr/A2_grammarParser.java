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
		RULE_prog = 0, RULE_field_decl = 1, RULE_temp = 2, RULE_method_decl = 3, 
		RULE_tempParam = 4, RULE_block = 5, RULE_var_decl = 6, RULE_var_decl_extra = 7, 
		RULE_statement = 8, RULE_expr = 9, RULE_method_call = 10, RULE_callout_arg = 11, 
		RULE_method_name = 12, RULE_location = 13, RULE_literal = 14, RULE_binOp = 15, 
		RULE_int_literal = 16;
	public static final String[] ruleNames = {
		"prog", "field_decl", "temp", "method_decl", "tempParam", "block", "var_decl", 
		"var_decl_extra", "statement", "expr", "method_call", "callout_arg", "method_name", 
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
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					field_decl(0);
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==Type) {
				{
				{
				setState(41);
				method_decl();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public TempContext temp() {
			return getRuleContext(TempContext.class,0);
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
		return field_decl(0);
	}

	private Field_declContext field_decl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_declContext _localctx = new Field_declContext(_ctx, _parentState);
		Field_declContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_field_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(50);
				match(Type);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(51);
					match(Ident);
					}
					break;
				case 2:
					{
					setState(52);
					match(Ident);
					setState(53);
					match(OBracket);
					setState(54);
					int_literal();
					setState(55);
					match(CBracket);
					}
					break;
				}
				setState(59);
				match(SemiColon);
				}
				break;
			case 2:
				{
				setState(60);
				match(Type);
				setState(61);
				match(Ident);
				setState(62);
				match(T__1);
				setState(63);
				literal();
				setState(64);
				match(SemiColon);
				}
				break;
			case 3:
				{
				setState(66);
				match(Type);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(67);
					match(Ident);
					}
					break;
				case 2:
					{
					setState(68);
					match(Ident);
					setState(69);
					match(OBracket);
					setState(70);
					int_literal();
					setState(71);
					match(CBracket);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_declContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
					setState(77);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(78);
					temp();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 4, RULE_temp);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(Comma);
				setState(85);
				match(Ident);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(Ident);
				setState(87);
				match(OBracket);
				setState(88);
				int_literal();
				setState(89);
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
		enterRule(_localctx, 6, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==Type) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			match(Ident);
			setState(95);
			match(OParen);
			setState(96);
			tempParam();
			setState(97);
			match(CParen);
			setState(98);
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
		enterRule(_localctx, 8, RULE_tempParam);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(100);
				match(Type);
				setState(101);
				match(Ident);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(102);
				match(Type);
				setState(103);
				match(Ident);
				}
				setState(105);
				tempParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(106);
				match(Comma);
				setState(107);
				match(Type);
				setState(108);
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
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(OBrace);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Type) {
				{
				{
				setState(113);
				var_decl();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Switch) | (1L << Ret) | (1L << Brk) | (1L << Cnt) | (1L << Callout) | (1L << Ident) | (1L << OBrace))) != 0)) {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Type);
			setState(128);
			match(Ident);
			setState(129);
			var_decl_extra();
			setState(130);
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
		enterRule(_localctx, 14, RULE_var_decl_extra);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(Comma);
				setState(133);
				match(Ident);
				setState(134);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				location();
				setState(139);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				expr(0);
				setState(141);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				method_call();
				setState(144);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(If);
				setState(147);
				match(OParen);
				setState(148);
				match(T__5);
				setState(149);
				match(CParen);
				setState(150);
				block();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(151);
					match(Else);
					setState(152);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(Switch);
				setState(156);
				expr(0);
				setState(157);
				match(OBrace);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					match(Case);
					setState(159);
					literal();
					setState(160);
					match(T__6);
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Switch) | (1L << Ret) | (1L << Brk) | (1L << Cnt) | (1L << Callout) | (1L << Ident) | (1L << OBrace))) != 0)) {
						{
						{
						setState(161);
						statement();
						}
						}
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Case );
				setState(171);
				match(CBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(While);
				setState(174);
				match(OParen);
				setState(175);
				expr(0);
				setState(176);
				match(CParen);
				setState(177);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(Ret);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Char) | (1L << Callout) | (1L << Num) | (1L << HexNum) | (1L << BoolLit) | (1L << Ident) | (1L << OParen))) != 0)) {
					{
					setState(180);
					expr(0);
					}
				}

				setState(183);
				match(SemiColon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(Brk);
				setState(185);
				match(SemiColon);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(Cnt);
				setState(187);
				match(SemiColon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(192);
				location();
				}
				break;
			case 2:
				{
				setState(193);
				method_call();
				}
				break;
			case 3:
				{
				setState(194);
				literal();
				}
				break;
			case 4:
				{
				setState(195);
				match(T__7);
				setState(196);
				expr(3);
				}
				break;
			case 5:
				{
				setState(197);
				match(T__8);
				setState(198);
				expr(2);
				}
				break;
			case 6:
				{
				setState(199);
				match(OParen);
				setState(200);
				expr(0);
				setState(201);
				match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
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
					setState(205);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(206);
					binOp();
					setState(207);
					expr(5);
					}
					} 
				}
				setState(213);
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
		enterRule(_localctx, 20, RULE_method_call);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				method_name();
				setState(215);
				match(OParen);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Char) | (1L << Callout) | (1L << Num) | (1L << HexNum) | (1L << BoolLit) | (1L << Ident) | (1L << OParen))) != 0)) {
					{
					setState(216);
					expr(0);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(217);
						match(Comma);
						setState(218);
						expr(0);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(226);
				match(CParen);
				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(Callout);
				setState(229);
				match(OParen);
				setState(230);
				match(Str);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(231);
					match(Comma);
					setState(232);
					callout_arg();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
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
		enterRule(_localctx, 22, RULE_callout_arg);
		try {
			setState(243);
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
				setState(241);
				expr(0);
				}
				break;
			case Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		enterRule(_localctx, 24, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 26, RULE_location);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(Ident);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(Ident);
				setState(249);
				match(OBracket);
				setState(250);
				expr(0);
				setState(251);
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
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Num:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				int_literal();
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(Char);
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
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
		enterRule(_localctx, 30, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 32, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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
		case 1:
			return field_decl_sempred((Field_declContext)_localctx, predIndex);
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean field_decl_sempred(Field_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\5\3N\n\3\3\3\3\3\7\3R\n\3\f\3"+
		"\16\3U\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\7\7u\n"+
		"\7\f\7\16\7x\13\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00a5\n\n\f\n\16\n\u00a8\13\n\6\n\u00aa\n\n\r\n\16\n\u00ab\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00c0\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00ce\n\13\3\13\3\13\3\13\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\7\f\u00de\n\f\f\f\16\f\u00e1\13\f\5\f\u00e3"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ec\n\f\f\f\16\f\u00ef\13\f\3\f"+
		"\5\f\u00f2\n\f\3\r\3\r\5\r\u00f6\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0100\n\17\3\20\3\20\3\20\5\20\u0105\n\20\3\21\3\21\3\22\3"+
		"\22\3\22\2\4\4\24\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2"+
		"\5\5\36\36\4\2\4\4\6\7\3\2 #\3\2\33\34\2\u0121\2$\3\2\2\2\4M\3\2\2\2\6"+
		"]\3\2\2\2\b_\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16\u0081\3\2\2\2\20\u008a\3"+
		"\2\2\2\22\u00bf\3\2\2\2\24\u00cd\3\2\2\2\26\u00f1\3\2\2\2\30\u00f5\3\2"+
		"\2\2\32\u00f7\3\2\2\2\34\u00ff\3\2\2\2\36\u0104\3\2\2\2 \u0106\3\2\2\2"+
		"\"\u0108\3\2\2\2$(\7\3\2\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2).\3\2\2\2*(\3\2\2\2+-\5\b\5\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\'\2\2\62\3\3\2\2\2\63\64"+
		"\b\3\1\2\64;\7\36\2\2\65<\7\37\2\2\66\67\7\37\2\2\678\7(\2\289\5\"\22"+
		"\29:\7)\2\2:<\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2<=\3\2\2\2=N\7*\2\2>?\7\36"+
		"\2\2?@\7\37\2\2@A\7\4\2\2AB\5\36\20\2BC\7*\2\2CN\3\2\2\2DK\7\36\2\2EL"+
		"\7\37\2\2FG\7\37\2\2GH\7(\2\2HI\5\"\22\2IJ\7)\2\2JL\3\2\2\2KE\3\2\2\2"+
		"KF\3\2\2\2LN\3\2\2\2M\63\3\2\2\2M>\3\2\2\2MD\3\2\2\2NS\3\2\2\2OP\f\3\2"+
		"\2PR\5\6\4\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\5\3\2\2\2US\3\2"+
		"\2\2VW\7+\2\2W^\7\37\2\2XY\7\37\2\2YZ\7(\2\2Z[\5\"\22\2[\\\7)\2\2\\^\3"+
		"\2\2\2]V\3\2\2\2]X\3\2\2\2^\7\3\2\2\2_`\t\2\2\2`a\7\37\2\2ab\7$\2\2bc"+
		"\5\n\6\2cd\7%\2\2de\5\f\7\2e\t\3\2\2\2fg\7\36\2\2gq\7\37\2\2hi\7\36\2"+
		"\2ij\7\37\2\2jk\3\2\2\2kq\5\n\6\2lm\7+\2\2mn\7\36\2\2nq\7\37\2\2oq\3\2"+
		"\2\2pf\3\2\2\2ph\3\2\2\2pl\3\2\2\2po\3\2\2\2q\13\3\2\2\2rv\7&\2\2su\5"+
		"\16\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3\2\2\2xv\3\2\2\2y{"+
		"\5\22\n\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2"+
		"\2\177\u0080\7\'\2\2\u0080\r\3\2\2\2\u0081\u0082\7\36\2\2\u0082\u0083"+
		"\7\37\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7*\2\2\u0085\17\3\2\2\2\u0086"+
		"\u0087\7+\2\2\u0087\u0088\7\37\2\2\u0088\u008b\5\20\t\2\u0089\u008b\3"+
		"\2\2\2\u008a\u0086\3\2\2\2\u008a\u0089\3\2\2\2\u008b\21\3\2\2\2\u008c"+
		"\u008d\5\34\17\2\u008d\u008e\t\3\2\2\u008e\u008f\5\24\13\2\u008f\u0090"+
		"\7*\2\2\u0090\u00c0\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\7*\2\2\u0093"+
		"\u00c0\3\2\2\2\u0094\u0095\7\22\2\2\u0095\u0096\7$\2\2\u0096\u0097\7\b"+
		"\2\2\u0097\u0098\7%\2\2\u0098\u009b\5\f\7\2\u0099\u009a\7\23\2\2\u009a"+
		"\u009c\5\f\7\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00c0\3\2"+
		"\2\2\u009d\u009e\7\25\2\2\u009e\u009f\5\24\13\2\u009f\u00a9\7&\2\2\u00a0"+
		"\u00a1\7\26\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a6\7\t\2\2\u00a3\u00a5"+
		"\5\22\n\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00a0"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\7\'\2\2\u00ae\u00c0\3\2\2\2\u00af\u00b0\7\24"+
		"\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\5\24\13\2\u00b2\u00b3\7%\2\2\u00b3"+
		"\u00b4\5\22\n\2\u00b4\u00c0\3\2\2\2\u00b5\u00b7\7\27\2\2\u00b6\u00b8\5"+
		"\24\13\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00c0\7*\2\2\u00ba\u00bb\7\30\2\2\u00bb\u00c0\7*\2\2\u00bc\u00bd\7\31"+
		"\2\2\u00bd\u00c0\7*\2\2\u00be\u00c0\5\f\7\2\u00bf\u008c\3\2\2\2\u00bf"+
		"\u0091\3\2\2\2\u00bf\u0094\3\2\2\2\u00bf\u009d\3\2\2\2\u00bf\u00af\3\2"+
		"\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\b\13\1\2\u00c2\u00ce\5\34"+
		"\17\2\u00c3\u00ce\5\26\f\2\u00c4\u00ce\5\36\20\2\u00c5\u00c6\7\n\2\2\u00c6"+
		"\u00ce\5\24\13\5\u00c7\u00c8\7\13\2\2\u00c8\u00ce\5\24\13\4\u00c9\u00ca"+
		"\7$\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc\7%\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00c1\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c5\3\2"+
		"\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d5\3\2\2\2\u00cf"+
		"\u00d0\f\6\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\5\24\13\7\u00d2\u00d4\3"+
		"\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\32\16"+
		"\2\u00d9\u00e2\7$\2\2\u00da\u00df\5\24\13\2\u00db\u00dc\7+\2\2\u00dc\u00de"+
		"\5\24\13\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00da"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7%\2\2\u00e5"+
		"\u00f2\3\2\2\2\u00e6\u00e7\7\32\2\2\u00e7\u00e8\7$\2\2\u00e8\u00ed\7\16"+
		"\2\2\u00e9\u00ea\7+\2\2\u00ea\u00ec\5\30\r\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\7%\2\2\u00f1\u00d8\3\2\2\2\u00f1"+
		"\u00e6\3\2\2\2\u00f2\27\3\2\2\2\u00f3\u00f6\5\24\13\2\u00f4\u00f6\7\16"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\31\3\2\2\2\u00f7\u00f8"+
		"\7\37\2\2\u00f8\33\3\2\2\2\u00f9\u0100\7\37\2\2\u00fa\u00fb\7\37\2\2\u00fb"+
		"\u00fc\7(\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe\7)\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\35\3\2\2\2\u0101\u0105"+
		"\5\"\22\2\u0102\u0105\7\r\2\2\u0103\u0105\7\35\2\2\u0104\u0101\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\37\3\2\2\2\u0106\u0107"+
		"\t\4\2\2\u0107!\3\2\2\2\u0108\u0109\t\5\2\2\u0109#\3\2\2\2\33(.;KMS]p"+
		"v|\u008a\u009b\u00a6\u00ab\u00b7\u00bf\u00cd\u00d5\u00df\u00e2\u00ed\u00f1"+
		"\u00f5\u00ff\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}