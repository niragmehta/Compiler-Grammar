// Generated from A2_grammar.g4 by ANTLR 4.7.1

import java.io.*;

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
		RULE_prog = 0, RULE_field_declarations = 1, RULE_method_declarations = 2, 
		RULE_field_decl = 3, RULE_temp = 4, RULE_method_decl = 5, RULE_tempParam = 6, 
		RULE_block = 7, RULE_var_decl_temp = 8, RULE_var_decl = 9, RULE_var_decl_extra = 10, 
		RULE_statement = 11, RULE_statements = 12, RULE_expr = 13, RULE_method_call = 14, 
		RULE_methodArgs = 15, RULE_calloutArgs = 16, RULE_callout_arg = 17, RULE_method_name = 18, 
		RULE_location = 19, RULE_literal = 20, RULE_binOp = 21, RULE_int_literal = 22;
	public static final String[] ruleNames = {
		"prog", "field_declarations", "method_declarations", "field_decl", "temp", 
		"method_decl", "tempParam", "block", "var_decl_temp", "var_decl", "var_decl_extra", 
		"statement", "statements", "expr", "method_call", "methodArgs", "calloutArgs", 
		"callout_arg", "method_name", "location", "literal", "binOp", "int_literal"
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


	public class Graph {

	    private Node root;

	    public Graph() {
	    }

	    public Node GetRoot(){

	        return root;
	    }


	    public Node addRoot(String str){
	        root = new Node(str);
	        return root;
	    }

	};

	public class Node {

	    private String name;
	    private List<Node> edges ;

	    public Node(String string) {
	        name = string;
	        edges = new ArrayList<Node>();
	    }

	    public void addEdge(Node node){
	        edges.add(node);
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Node> getEdges() {
	        return edges;
	    }

	    public void printName(){
	        System.out.println(name);
	    }
	};


	public A2_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Field_declarationsContext field_declarations;
		public Method_declarationsContext method_declarations;
		public Field_declarationsContext field_declarations() {
			return getRuleContext(Field_declarationsContext.class,0);
		}
		public Method_declarationsContext method_declarations() {
			return getRuleContext(Method_declarationsContext.class,0);
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
			setState(46);
			match(T__0);
			setState(47);
			((ProgContext)_localctx).field_declarations = field_declarations();
			setState(48);
			((ProgContext)_localctx).method_declarations = method_declarations();
			setState(49);
			match(CBrace);

			    Graph g = new Graph();
			    Node root  = g.addRoot("program");

			    root.addEdge(((ProgContext)_localctx).field_declarations.node);
			    root.addEdge(((ProgContext)_localctx).method_declarations.node);

			    root.printName();



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
		public Node node;
		public Field_declContext field_decl;
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((Field_declarationsContext)_localctx).field_decl = field_decl();
				setState(53);
				field_declarations();

				    ((Field_declarationsContext)_localctx).node =  new Node("field_declarations");
				    _localctx.node.addEdge(((Field_declarationsContext)_localctx).field_decl.node);
				    _localctx.node.printName();


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

	public static class Method_declarationsContext extends ParserRuleContext {
		public Node node;
		public Method_declContext method_decl;
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Method_declarationsContext method_declarations() {
			return getRuleContext(Method_declarationsContext.class,0);
		}
		public Method_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterMethod_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitMethod_declarations(this);
		}
	}

	public final Method_declarationsContext method_declarations() throws RecognitionException {
		Method_declarationsContext _localctx = new Method_declarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_declarations);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((Method_declarationsContext)_localctx).method_decl = method_decl();
				setState(60);
				method_declarations();

				    ((Method_declarationsContext)_localctx).node =  new Node("method_declarations");
				    _localctx.node.addEdge(((Method_declarationsContext)_localctx).method_decl.node);
				    _localctx.node.printName();

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
		public Node node;
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(Type);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
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
				setState(75);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(Type);
				setState(77);
				match(Ident);
				setState(78);
				match(T__1);
				setState(79);
				literal();
				setState(80);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(Type);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(83);
					match(Ident);
					}
					break;
				case 2:
					{
					setState(84);
					match(Ident);
					setState(85);
					match(OBracket);
					setState(86);
					int_literal();
					setState(87);
					match(CBracket);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				temp();
				setState(92);
				field_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Comma:
					{
					setState(94);
					match(Comma);
					setState(95);
					match(Ident);
					}
					break;
				case Ident:
					{
					setState(96);
					match(Ident);
					setState(97);
					match(OBracket);
					setState(98);
					int_literal();
					setState(99);
					match(CBracket);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(Comma);
				setState(107);
				match(Ident);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(Ident);
				setState(109);
				match(OBracket);
				setState(110);
				int_literal();
				setState(111);
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
		public Node node;
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
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==Type) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			match(Ident);
			setState(117);
			match(OParen);
			setState(118);
			tempParam();
			setState(119);
			match(CParen);
			setState(120);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(122);
				match(Type);
				setState(123);
				match(Ident);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(124);
				match(Type);
				setState(125);
				match(Ident);
				}
				setState(127);
				tempParam();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(128);
				match(Comma);
				setState(129);
				match(Type);
				setState(130);
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
			setState(134);
			match(OBrace);
			setState(135);
			var_decl_temp();
			setState(136);
			statements();
			setState(137);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				var_decl();
				setState(140);
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
			setState(145);
			match(Type);
			setState(146);
			match(Ident);
			setState(147);
			var_decl_extra();
			setState(148);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(Comma);
				setState(151);
				match(Ident);
				setState(152);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				location();
				setState(157);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				expr(0);
				setState(159);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				method_call();
				setState(162);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(If);
				setState(165);
				match(OParen);
				setState(166);
				match(T__5);
				setState(167);
				match(CParen);
				setState(168);
				block();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(169);
					match(Else);
					setState(170);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(Switch);
				setState(174);
				expr(0);
				setState(175);
				match(OBrace);
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					match(Case);
					setState(177);
					literal();
					setState(178);
					match(T__6);
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Switch) | (1L << Ret) | (1L << Brk) | (1L << Cnt) | (1L << Callout) | (1L << Ident) | (1L << OBrace))) != 0)) {
						{
						{
						setState(179);
						statement();
						}
						}
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Case );
				setState(189);
				match(CBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(While);
				setState(192);
				match(OParen);
				setState(193);
				expr(0);
				setState(194);
				match(CParen);
				setState(195);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(Ret);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Char) | (1L << Callout) | (1L << Num) | (1L << HexNum) | (1L << BoolLit) | (1L << Ident) | (1L << OParen))) != 0)) {
					{
					setState(198);
					expr(0);
					}
				}

				setState(201);
				match(SemiColon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				match(Brk);
				setState(203);
				match(SemiColon);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(Cnt);
				setState(205);
				match(SemiColon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(206);
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
			setState(213);
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
				setState(209);
				statement();
				setState(210);
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(216);
				location();
				}
				break;
			case 2:
				{
				setState(217);
				method_call();
				}
				break;
			case 3:
				{
				setState(218);
				literal();
				}
				break;
			case 4:
				{
				setState(219);
				match(T__7);
				setState(220);
				expr(3);
				}
				break;
			case 5:
				{
				setState(221);
				match(T__8);
				setState(222);
				expr(2);
				}
				break;
			case 6:
				{
				setState(223);
				match(OParen);
				setState(224);
				expr(0);
				setState(225);
				match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
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
					setState(229);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(230);
					binOp();
					setState(231);
					expr(5);
					}
					} 
				}
				setState(237);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public TerminalNode Callout() { return getToken(A2_grammarParser.Callout, 0); }
		public TerminalNode Str() { return getToken(A2_grammarParser.Str, 0); }
		public CalloutArgsContext calloutArgs() {
			return getRuleContext(CalloutArgsContext.class,0);
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
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				method_name();
				setState(239);
				match(OParen);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Char) | (1L << Callout) | (1L << Num) | (1L << HexNum) | (1L << BoolLit) | (1L << Ident) | (1L << OParen))) != 0)) {
					{
					setState(240);
					expr(0);
					setState(241);
					methodArgs();
					}
				}

				setState(245);
				match(CParen);
				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(Callout);
				setState(248);
				match(OParen);
				setState(249);
				match(Str);
				setState(250);
				calloutArgs();
				setState(251);
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

	public static class MethodArgsContext extends ParserRuleContext {
		public MethodArgsContext methodArgs() {
			return getRuleContext(MethodArgsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterMethodArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitMethodArgs(this);
		}
	}

	public final MethodArgsContext methodArgs() throws RecognitionException {
		MethodArgsContext _localctx = new MethodArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodArgs);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(255);
				match(Comma);
				setState(256);
				expr(0);
				}
				setState(258);
				methodArgs();
				}
				break;
			case CParen:
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

	public static class CalloutArgsContext extends ParserRuleContext {
		public CalloutArgsContext calloutArgs() {
			return getRuleContext(CalloutArgsContext.class,0);
		}
		public Callout_argContext callout_arg() {
			return getRuleContext(Callout_argContext.class,0);
		}
		public CalloutArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calloutArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).enterCalloutArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2_grammarListener ) ((A2_grammarListener)listener).exitCalloutArgs(this);
		}
	}

	public final CalloutArgsContext calloutArgs() throws RecognitionException {
		CalloutArgsContext _localctx = new CalloutArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_calloutArgs);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Comma:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(263);
				match(Comma);
				setState(264);
				callout_arg();
				}
				setState(266);
				calloutArgs();
				}
				break;
			case CParen:
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
		enterRule(_localctx, 34, RULE_callout_arg);
		try {
			setState(273);
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
				setState(271);
				expr(0);
				}
				break;
			case Str:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
		enterRule(_localctx, 36, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 38, RULE_location);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(Ident);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(Ident);
				setState(279);
				match(OBracket);
				setState(280);
				expr(0);
				setState(281);
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
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Num:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				int_literal();
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(Char);
				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
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
		enterRule(_localctx, 42, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		enterRule(_localctx, 44, RULE_int_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\5\4C\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5h\n\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0087"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00b7\n\r\f\r\16\r\u00ba\13\r\6\r\u00bc\n\r\r\r\16\r\u00bd\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ca\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00d2\n\r\3\16\3\16\3\16\3\16\5\16\u00d8\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00ec\n\17\f\17\16\17\u00ef\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00f6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0100"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0110\n\22\3\23\3\23\5\23\u0114\n\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u011e\n\25\3\26\3\26\3\26\5\26\u0123\n\26"+
		"\3\27\3\27\3\30\3\30\3\30\2\3\34\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\6\4\2\5\5\36\36\4\2\4\4\6\7\3\2 #\3\2\33\34\2\u013b\2\60"+
		"\3\2\2\2\4;\3\2\2\2\6B\3\2\2\2\bj\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16\u0086"+
		"\3\2\2\2\20\u0088\3\2\2\2\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26\u009c\3"+
		"\2\2\2\30\u00d1\3\2\2\2\32\u00d7\3\2\2\2\34\u00e5\3\2\2\2\36\u00ff\3\2"+
		"\2\2 \u0107\3\2\2\2\"\u010f\3\2\2\2$\u0113\3\2\2\2&\u0115\3\2\2\2(\u011d"+
		"\3\2\2\2*\u0122\3\2\2\2,\u0124\3\2\2\2.\u0126\3\2\2\2\60\61\7\3\2\2\61"+
		"\62\5\4\3\2\62\63\5\6\4\2\63\64\7\'\2\2\64\65\b\2\1\2\65\3\3\2\2\2\66"+
		"\67\5\b\5\2\678\5\4\3\289\b\3\1\29<\3\2\2\2:<\3\2\2\2;\66\3\2\2\2;:\3"+
		"\2\2\2<\5\3\2\2\2=>\5\f\7\2>?\5\6\4\2?@\b\4\1\2@C\3\2\2\2AC\3\2\2\2B="+
		"\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DK\7\36\2\2EL\7\37\2\2FG\7\37\2\2GH\7(\2"+
		"\2HI\5.\30\2IJ\7)\2\2JL\3\2\2\2KE\3\2\2\2KF\3\2\2\2LM\3\2\2\2Mk\7*\2\2"+
		"NO\7\36\2\2OP\7\37\2\2PQ\7\4\2\2QR\5*\26\2RS\7*\2\2Sk\3\2\2\2T[\7\36\2"+
		"\2U\\\7\37\2\2VW\7\37\2\2WX\7(\2\2XY\5.\30\2YZ\7)\2\2Z\\\3\2\2\2[U\3\2"+
		"\2\2[V\3\2\2\2\\k\3\2\2\2]^\5\n\6\2^_\5\b\5\2_k\3\2\2\2`a\7+\2\2ah\7\37"+
		"\2\2bc\7\37\2\2cd\7(\2\2de\5.\30\2ef\7)\2\2fh\3\2\2\2g`\3\2\2\2gb\3\2"+
		"\2\2hi\3\2\2\2ik\7*\2\2jD\3\2\2\2jN\3\2\2\2jT\3\2\2\2j]\3\2\2\2jg\3\2"+
		"\2\2k\t\3\2\2\2lm\7+\2\2mt\7\37\2\2no\7\37\2\2op\7(\2\2pq\5.\30\2qr\7"+
		")\2\2rt\3\2\2\2sl\3\2\2\2sn\3\2\2\2t\13\3\2\2\2uv\t\2\2\2vw\7\37\2\2w"+
		"x\7$\2\2xy\5\16\b\2yz\7%\2\2z{\5\20\t\2{\r\3\2\2\2|}\7\36\2\2}\u0087\7"+
		"\37\2\2~\177\7\36\2\2\177\u0080\7\37\2\2\u0080\u0081\3\2\2\2\u0081\u0087"+
		"\5\16\b\2\u0082\u0083\7+\2\2\u0083\u0084\7\36\2\2\u0084\u0087\7\37\2\2"+
		"\u0085\u0087\3\2\2\2\u0086|\3\2\2\2\u0086~\3\2\2\2\u0086\u0082\3\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\17\3\2\2\2\u0088\u0089\7&\2\2\u0089\u008a\5"+
		"\22\n\2\u008a\u008b\5\32\16\2\u008b\u008c\7\'\2\2\u008c\21\3\2\2\2\u008d"+
		"\u008e\5\24\13\2\u008e\u008f\5\22\n\2\u008f\u0092\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2\2\2\u0093"+
		"\u0094\7\36\2\2\u0094\u0095\7\37\2\2\u0095\u0096\5\26\f\2\u0096\u0097"+
		"\7*\2\2\u0097\25\3\2\2\2\u0098\u0099\7+\2\2\u0099\u009a\7\37\2\2\u009a"+
		"\u009d\5\26\f\2\u009b\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009d\27\3\2\2\2\u009e\u009f\5(\25\2\u009f\u00a0\t\3\2\2\u00a0"+
		"\u00a1\5\34\17\2\u00a1\u00a2\7*\2\2\u00a2\u00d2\3\2\2\2\u00a3\u00a4\5"+
		"\36\20\2\u00a4\u00a5\7*\2\2\u00a5\u00d2\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7"+
		"\u00a8\7$\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ad\5\20"+
		"\t\2\u00ab\u00ac\7\23\2\2\u00ac\u00ae\5\20\t\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00d2\3\2\2\2\u00af\u00b0\7\25\2\2\u00b0\u00b1\5"+
		"\34\17\2\u00b1\u00bb\7&\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4\5*\26\2\u00b4"+
		"\u00b8\7\t\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0"+
		"\u00d2\3\2\2\2\u00c1\u00c2\7\24\2\2\u00c2\u00c3\7$\2\2\u00c3\u00c4\5\34"+
		"\17\2\u00c4\u00c5\7%\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00d2\3\2\2\2\u00c7"+
		"\u00c9\7\27\2\2\u00c8\u00ca\5\34\17\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d2\7*\2\2\u00cc\u00cd\7\30\2\2\u00cd"+
		"\u00d2\7*\2\2\u00ce\u00cf\7\31\2\2\u00cf\u00d2\7*\2\2\u00d0\u00d2\5\20"+
		"\t\2\u00d1\u009e\3\2\2\2\u00d1\u00a3\3\2\2\2\u00d1\u00a6\3\2\2\2\u00d1"+
		"\u00af\3\2\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00cc\3\2"+
		"\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d4"+
		"\5\30\r\2\u00d4\u00d5\5\32\16\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\3\2\2"+
		"\2\u00d7\u00d3\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\33\3\2\2\2\u00d9\u00da"+
		"\b\17\1\2\u00da\u00e6\5(\25\2\u00db\u00e6\5\36\20\2\u00dc\u00e6\5*\26"+
		"\2\u00dd\u00de\7\n\2\2\u00de\u00e6\5\34\17\5\u00df\u00e0\7\13\2\2\u00e0"+
		"\u00e6\5\34\17\4\u00e1\u00e2\7$\2\2\u00e2\u00e3\5\34\17\2\u00e3\u00e4"+
		"\7%\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5"+
		"\u00dc\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e1\3\2"+
		"\2\2\u00e6\u00ed\3\2\2\2\u00e7\u00e8\f\6\2\2\u00e8\u00e9\5,\27\2\u00e9"+
		"\u00ea\5\34\17\7\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\u00ef\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\35\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f1\5&\24\2\u00f1\u00f5\7$\2\2\u00f2\u00f3\5\34"+
		"\17\2\u00f3\u00f4\5 \21\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7%\2\2\u00f8\u0100\3\2"+
		"\2\2\u00f9\u00fa\7\32\2\2\u00fa\u00fb\7$\2\2\u00fb\u00fc\7\16\2\2\u00fc"+
		"\u00fd\5\"\22\2\u00fd\u00fe\7%\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f0\3\2"+
		"\2\2\u00ff\u00f9\3\2\2\2\u0100\37\3\2\2\2\u0101\u0102\7+\2\2\u0102\u0103"+
		"\5\34\17\2\u0103\u0104\3\2\2\2\u0104\u0105\5 \21\2\u0105\u0108\3\2\2\2"+
		"\u0106\u0108\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0106\3\2\2\2\u0108!\3"+
		"\2\2\2\u0109\u010a\7+\2\2\u010a\u010b\5$\23\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\5\"\22\2\u010d\u0110\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0109\3"+
		"\2\2\2\u010f\u010e\3\2\2\2\u0110#\3\2\2\2\u0111\u0114\5\34\17\2\u0112"+
		"\u0114\7\16\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114%\3\2\2\2"+
		"\u0115\u0116\7\37\2\2\u0116\'\3\2\2\2\u0117\u011e\7\37\2\2\u0118\u0119"+
		"\7\37\2\2\u0119\u011a\7(\2\2\u011a\u011b\5\34\17\2\u011b\u011c\7)\2\2"+
		"\u011c\u011e\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011e)\3"+
		"\2\2\2\u011f\u0123\5.\30\2\u0120\u0123\7\r\2\2\u0121\u0123\7\35\2\2\u0122"+
		"\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123+\3\2\2\2"+
		"\u0124\u0125\t\4\2\2\u0125-\3\2\2\2\u0126\u0127\t\5\2\2\u0127/\3\2\2\2"+
		"\33;BK[gjs\u0086\u0091\u009c\u00ad\u00b8\u00bd\u00c9\u00d1\u00d7\u00e5"+
		"\u00ed\u00f5\u00ff\u0107\u010f\u0113\u011d\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}