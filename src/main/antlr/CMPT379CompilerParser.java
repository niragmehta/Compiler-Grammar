// Generated from CMPT379Compiler.g4 by ANTLR 4.7.1

import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMPT379CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WhiteSpace=12, Char=13, Str=14, Class=15, Program=16, 
		Void=17, If=18, Else=19, While=20, Switch=21, Case=22, Ret=23, Brk=24, 
		Cnt=25, Callout=26, DecNum=27, HexNum=28, BoolLit=29, Type=30, Ident=31, 
		RelOp=32, AssignOp=33, MulDiv=34, AddOp=35, SubOp=36, AndOp=37, OrOp=38;
	public static final int
		RULE_prog = 0, RULE_field_decls = 1, RULE_field_decl = 2, RULE_inited_field_decl = 3, 
		RULE_method_decls = 4, RULE_method_decl = 5, RULE_params = 6, RULE_nextParams = 7, 
		RULE_block = 8, RULE_var_decl = 9, RULE_var_decl_extra = 10, RULE_statements = 11, 
		RULE_statement = 12, RULE_cases = 13, RULE_methodCall = 14, RULE_args = 15, 
		RULE_someArgs = 16, RULE_calloutArgs = 17, RULE_expr = 18, RULE_location = 19, 
		RULE_m = 20, RULE_n = 21, RULE_k = 22, RULE_num = 23, RULE_literal = 24, 
		RULE_eqOp = 25;
	public static final String[] ruleNames = {
		"prog", "field_decls", "field_decl", "inited_field_decl", "method_decls", 
		"method_decl", "params", "nextParams", "block", "var_decl", "var_decl_extra", 
		"statements", "statement", "cases", "methodCall", "args", "someArgs", 
		"calloutArgs", "expr", "location", "m", "n", "k", "num", "literal", "eqOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "','", "'['", "']'", "'='", "'('", "')'", "':'", 
		"'!'", null, null, null, "'class'", "'Program'", "'void'", "'if'", "'else'", 
		"'while'", "'switch'", "'case'", "'return'", "'break'", "'continue'", 
		"'callout'", null, null, null, null, null, null, null, null, "'+'", "'-'", 
		"'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"WhiteSpace", "Char", "Str", "Class", "Program", "Void", "If", "Else", 
		"While", "Switch", "Case", "Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", 
		"BoolLit", "Type", "Ident", "RelOp", "AssignOp", "MulDiv", "AddOp", "SubOp", 
		"AndOp", "OrOp"
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
	public String getGrammarFileName() { return "CMPT379Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public enum Types {INT, CHAR, BOOL, STR, VOID, LABEL, INVALID}; //symbol type
	public enum Scope {GLOBAL, LOCAL, CONST, INVALID}; //symbol scope
	public enum Opcode {ADD, SUB, MUL, DIV, NEG, READ, WRITE, ASSIGN, GOTO, LT, GT, LE, GE, EQ, NE, PARAM, CALL, RET, LABEL};

	public static class Symbol
	{
	    public static int idCounter = 0;
	    public static Types multiType;
	    public static List<Symbol> list = new ArrayList();

	    public int id;
	    public int tabid;
	    public String name;
	    public boolean isArray;
	    public boolean isInited;
	    public String arrSize;
	    public Types type;
	    public Scope scope;

	    int i;
	    boolean b;

	    public List<Instructions> truelist;
	    public List<Instructions> falselist;

	    public Symbol()
	    {
	        id = ++idCounter;
	        tabid=0;
	        name="";
	        isArray=false;
	        isInited=false;
	        arrSize="0";

	        truelist = new ArrayList();
	        falselist = new ArrayList();

	        scope=Scope.LOCAL;

	    }

	    public static void add(Symbol symbol)
	    {
	        list.add(symbol);
	    }

	    public static void backpatch(List<Instructions> list, int id)
	    {
	        for(int i=0;i<list.size();i++)
	        {if(list.get(i).res == -1)
	            list.get(i).res = id;
	        }
	    }

	}

	public static class Symtables
	{
	    public static int idCounter = 0;
	    public static Stack<Symtables> stack = new Stack();
	    public static List<Symtables> list = new ArrayList();

	    public int id;
	    public int parentId;
	    public List<Symbol> symbols;

	    Symtables()
	    {
	        id = ++idCounter;
	        parentId=0;
	        symbols = new ArrayList();
	    }

	    public void add(Symbol symbol)
	    {
	        symbols.add(symbol);
	    }

	    public static void addSymTableToList(Symtables symtable)
	    {
	        list.add(symtable);
	    }

	}
	public static class Instructions
	{
	    public int id;
	    public int res;
	    public Opcode opc;
	    public int op1;
	    public int op2;

	    public static int idCounter = 0;
	    public static List<Instructions> list = new ArrayList();

	    Instructions(){
	        id=++idCounter;
	    }

	    Instructions(int op1, int op2,int res, Opcode opc)
	    {
	        id=++idCounter;
	        this.op1=op1;
	        this.op2=op2;
	        this.res = res;
	        this.opc = opc;
	    }

	    public static boolean arrayRead = true;
	    public static String arrayAccess = "8";

	}

	public static class Csv
	{
	    public static void createSymbols() throws IOException
	    {
	        FileWriter writer = new FileWriter("symbols.csv");
	        List<Symbol> list = Symbol.list;
	        writer.append("id"+","+"tabid"+","+"name"+","+"type"+","+"scope"+","+"isArray"+"," + "arrSize" + "," + "isInited" + "," + "int_val" + "," + "bool_val" + "\n");
	        for(int i=0;i<list.size();i++)
	        {
	            writer.append(list.get(i).id+",");
	            writer.append(list.get(i).tabid+",");
	            writer.append(list.get(i).name+",");
	            writer.append(list.get(i).type+",");
	            writer.append(list.get(i).scope+",");
	            writer.append(list.get(i).isArray+",");
	            writer.append(list.get(i).arrSize+",");
	            writer.append(list.get(i).isInited+",");

	            writer.append(list.get(i).i+",");
	            writer.append(list.get(i).b+"\n");

	        }
	        writer.flush();
	        writer.close();
	    }
	    public static void createSymTable() throws IOException
	    {
	        FileWriter writer = new FileWriter("symtables.csv");
	        List<Symtables> list = Symtables.list;
	        writer.append("id"+","+"parent\n");
	        for(int i=0;i<list.size();i++)
	        {
	            writer.append(list.get(i).id+",");
	            writer.append(list.get(i).parentId+"\n");
	        }
	        writer.flush();
	        writer.close();
	    }
	    public static void createInstructionsTable() throws IOException
	    {
	        FileWriter writer = new FileWriter("instructions.csv");
	        List<Instructions> list = Instructions.list;
	        writer.append("id"+","+"res"+","+"opcode"+","+"op1"+","+"op2\n");
	        for(int i=0;i<list.size();i++)
	        {
	            writer.append(list.get(i).id+",");
	            writer.append(list.get(i).res+",");
	            writer.append(list.get(i).opc+",");
	            writer.append(list.get(i).op1+",");
	            writer.append(list.get(i).op2+"\n");
	        }
	        writer.flush();
	        writer.close();
	    }

	}

	int count = 0;
	int symbolCount = 0;


	public CMPT379CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Symtables symtable;
		public TerminalNode Class() { return getToken(CMPT379CompilerParser.Class, 0); }
		public TerminalNode Program() { return getToken(CMPT379CompilerParser.Program, 0); }
		public Field_declsContext field_decls() {
			return getRuleContext(Field_declsContext.class,0);
		}
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Class);
			setState(53);
			match(Program);
			 ((ProgContext)_localctx).symtable =  new Symtables(); Symtables.stack.push(_localctx.symtable); Symtables.addSymTableToList(_localctx.symtable);
			setState(55);
			match(T__0);
			setState(56);
			field_decls(0);
			setState(57);
			method_decls(0);
			setState(58);
			match(T__1);

			    Symtables.stack.pop();
			    try{Csv.createSymbols(); Csv.createSymTable(); Csv.createInstructionsTable();}
			    catch(Exception e){}

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

	public static class Field_declsContext extends ParserRuleContext {
		public Field_declsContext field_decls() {
			return getRuleContext(Field_declsContext.class,0);
		}
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public Inited_field_declContext inited_field_decl() {
			return getRuleContext(Inited_field_declContext.class,0);
		}
		public Field_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterField_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitField_decls(this);
		}
	}

	public final Field_declsContext field_decls() throws RecognitionException {
		return field_decls(0);
	}

	private Field_declsContext field_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_declsContext _localctx = new Field_declsContext(_ctx, _parentState);
		Field_declsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_field_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						field_decl(0);
						setState(64);
						match(T__2);
						}
						break;
					case 2:
						{
						_localctx = new Field_declsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_field_decls);
						setState(66);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(67);
						inited_field_decl();
						setState(68);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Field_declContext extends ParserRuleContext {
		public Symbol symbol;
		public Token Type;
		public Token Ident;
		public NumContext num;
		public TerminalNode Type() { return getToken(CMPT379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
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
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitField_decl(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_field_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(76);
				((Field_declContext)_localctx).Type = match(Type);
				setState(77);
				((Field_declContext)_localctx).Ident = match(Ident);


				    ((Field_declContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.tabid = Symtables.stack.peek().id;
				    _localctx.symbol.name = (((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null);
				    if((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).equals("int")){
				        _localctx.symbol.type=Types.INT;
				        Symbol.multiType=Types.INT;
				        }
				    else if((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).equals("boolean")){
				        _localctx.symbol.type=Types.BOOL;
				        Symbol.multiType=Types.BOOL;
				        }
				    else{
				        _localctx.symbol.type=Types.INVALID;
				        Symbol.multiType=Types.INVALID;
				        }

				    _localctx.symbol.scope=Scope.GLOBAL;

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);

				}
				break;
			case 2:
				{
				setState(79);
				((Field_declContext)_localctx).Type = match(Type);
				setState(80);
				((Field_declContext)_localctx).Ident = match(Ident);
				setState(81);
				match(T__4);
				setState(82);
				((Field_declContext)_localctx).num = num();
				setState(83);
				match(T__5);

				    ((Field_declContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.tabid = Symtables.stack.peek().id;
				    _localctx.symbol.name = (((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null);
				    if((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).equals("int")){
				        _localctx.symbol.type=Types.INT;
				        Symbol.multiType=Types.INT;
				        }
				    else if((((Field_declContext)_localctx).Type!=null?((Field_declContext)_localctx).Type.getText():null).equals("boolean")){
				        _localctx.symbol.type=Types.BOOL;
				        Symbol.multiType=Types.BOOL;
				        }
				    else{
				        _localctx.symbol.type=Types.INVALID;
				        Symbol.multiType=Types.INVALID;
				        }

				    _localctx.symbol.scope=Scope.GLOBAL;
				    _localctx.symbol.isArray=true;
				    _localctx.symbol.arrSize=(((Field_declContext)_localctx).num!=null?_input.getText(((Field_declContext)_localctx).num.start,((Field_declContext)_localctx).num.stop):null);

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);

				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(88);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(89);
						match(T__3);
						setState(90);
						((Field_declContext)_localctx).Ident = match(Ident);

						              ((Field_declContext)_localctx).symbol =  new Symbol();
						              _localctx.symbol.tabid = Symtables.stack.peek().id;
						              _localctx.symbol.name = (((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null);
						              _localctx.symbol.type=Symbol.multiType;
						              _localctx.symbol.scope=Scope.GLOBAL;
						              Symtables.stack.peek().add(_localctx.symbol);

						              Symbol.add(_localctx.symbol);
						          
						}
						break;
					case 2:
						{
						_localctx = new Field_declContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_field_decl);
						setState(92);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(93);
						match(T__3);
						setState(94);
						((Field_declContext)_localctx).Ident = match(Ident);
						setState(95);
						match(T__4);
						setState(96);
						((Field_declContext)_localctx).num = num();
						setState(97);
						match(T__5);

						              ((Field_declContext)_localctx).symbol =  new Symbol();
						              _localctx.symbol.tabid = Symtables.stack.peek().id;
						              _localctx.symbol.name = (((Field_declContext)_localctx).Ident!=null?((Field_declContext)_localctx).Ident.getText():null);
						              _localctx.symbol.type=Symbol.multiType;
						              _localctx.symbol.scope=Scope.GLOBAL;

						              _localctx.symbol.isArray=true;
						              _localctx.symbol.arrSize=(((Field_declContext)_localctx).num!=null?_input.getText(((Field_declContext)_localctx).num.start,((Field_declContext)_localctx).num.stop):null);

						              Symtables.stack.peek().add(_localctx.symbol);
						              Symbol.add(_localctx.symbol);
						          
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Inited_field_declContext extends ParserRuleContext {
		public Symbol symbol;
		public Token Type;
		public Token Ident;
		public LiteralContext literal;
		public TerminalNode Type() { return getToken(CMPT379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Inited_field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inited_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterInited_field_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitInited_field_decl(this);
		}
	}

	public final Inited_field_declContext inited_field_decl() throws RecognitionException {
		Inited_field_declContext _localctx = new Inited_field_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inited_field_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((Inited_field_declContext)_localctx).Type = match(Type);
			setState(106);
			((Inited_field_declContext)_localctx).Ident = match(Ident);
			setState(107);
			match(T__6);
			setState(108);
			((Inited_field_declContext)_localctx).literal = literal();

			    ((Inited_field_declContext)_localctx).symbol =  new Symbol();
			    _localctx.symbol.tabid = Symtables.stack.peek().id;
			    _localctx.symbol.name = (((Inited_field_declContext)_localctx).Ident!=null?((Inited_field_declContext)_localctx).Ident.getText():null);
			    _localctx.symbol.isInited = true;
			    _localctx.symbol.scope=Scope.GLOBAL;
			    if((((Inited_field_declContext)_localctx).Type!=null?((Inited_field_declContext)_localctx).Type.getText():null).equals("int")){
			        _localctx.symbol.type=Types.INT;
			        Symbol.multiType=Types.INT;
			        int value = 0;
			        try{value = Integer.parseInt((((Inited_field_declContext)_localctx).literal!=null?_input.getText(((Inited_field_declContext)_localctx).literal.start,((Inited_field_declContext)_localctx).literal.stop):null));}
			        catch(Exception e){}
			        _localctx.symbol.i = value;
			        }
			    else if((((Inited_field_declContext)_localctx).Type!=null?((Inited_field_declContext)_localctx).Type.getText():null).equals("boolean")){
			        _localctx.symbol.type=Types.BOOL;
			        Symbol.multiType=Types.BOOL;
			        boolean value = true;
			        try{value = Boolean.parseBoolean((((Inited_field_declContext)_localctx).literal!=null?_input.getText(((Inited_field_declContext)_localctx).literal.start,((Inited_field_declContext)_localctx).literal.stop):null));}
			        catch(Exception e){}
			        _localctx.symbol.b = value;
			        }
			    else{
			        _localctx.symbol.type=Types.INVALID;
			        Symbol.multiType=Types.INVALID;
			        }

			    Instructions instruction = new Instructions(_localctx.symbol.id,((Inited_field_declContext)_localctx).literal.symbol.id,-1,Opcode.ASSIGN);
			    Instructions.list.add(instruction);

			    Symtables.stack.peek().add(_localctx.symbol);
			    Symbol.add(_localctx.symbol);

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

	public static class Method_declsContext extends ParserRuleContext {
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Method_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterMethod_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitMethod_decls(this);
		}
	}

	public final Method_declsContext method_decls() throws RecognitionException {
		return method_decls(0);
	}

	private Method_declsContext method_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Method_declsContext _localctx = new Method_declsContext(_ctx, _parentState);
		Method_declsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_method_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Method_declsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_method_decls);
					setState(112);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(113);
					method_decl();
					}
					} 
				}
				setState(118);
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

	public static class Method_declContext extends ParserRuleContext {
		public Symbol symbol;
		public Token Ident;
		public TerminalNode Void() { return getToken(CMPT379CompilerParser.Void, 0); }
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode Type() { return getToken(CMPT379CompilerParser.Type, 0); }
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(Void);
				setState(120);
				((Method_declContext)_localctx).Ident = match(Ident);

				     ((Method_declContext)_localctx).symbol =  new Symbol();
				     _localctx.symbol.tabid = Symtables.stack.peek().id;
				     _localctx.symbol.name = (((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null);
				     _localctx.symbol.type=Types.LABEL;
				     _localctx.symbol.scope = Scope.GLOBAL;

				     Symtables.stack.peek().add(_localctx.symbol);
				     Symtables symtable = new Symtables();
				     symtable.parentId=Symtables.stack.peek().id;
				     Symtables.stack.push(symtable);

				     Symbol.add(_localctx.symbol);
				     Symtables.addSymTableToList(symtable);

				             
				setState(122);
				match(T__7);
				setState(123);
				params();
				setState(124);
				match(T__8);
				setState(125);
				match(T__0);
				setState(126);
				var_decl();
				setState(127);
				statements();
				setState(128);
				match(T__1);

				    Symtables.stack.pop();


				}
				break;
			case Type:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(Type);
				setState(132);
				((Method_declContext)_localctx).Ident = match(Ident);

				     ((Method_declContext)_localctx).symbol =  new Symbol();
				     _localctx.symbol.tabid = Symtables.stack.peek().id;
				     _localctx.symbol.name = (((Method_declContext)_localctx).Ident!=null?((Method_declContext)_localctx).Ident.getText():null);
				     _localctx.symbol.scope = Scope.GLOBAL;

				     _localctx.symbol.type=Types.LABEL;
				     Symtables.stack.peek().add(_localctx.symbol);
				     Symtables symtable = new Symtables();
				     symtable.parentId=Symtables.stack.peek().id;
				     Symtables.stack.push(symtable);

				     Symbol.add(_localctx.symbol);
				     Symtables.addSymTableToList(symtable);


				setState(134);
				match(T__7);
				setState(135);
				params();
				setState(136);
				match(T__8);
				setState(137);
				match(T__0);
				setState(138);
				var_decl();
				setState(139);
				statements();
				setState(140);
				match(T__1);
				Symtables.stack.pop();
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

	public static class ParamsContext extends ParserRuleContext {
		public Symbol symbol;
		public Token Type;
		public Token Ident;
		public TerminalNode Type() { return getToken(CMPT379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public NextParamsContext nextParams() {
			return getRuleContext(NextParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((ParamsContext)_localctx).Type = match(Type);
				setState(146);
				((ParamsContext)_localctx).Ident = match(Ident);
				setState(147);
				nextParams();

				    ((ParamsContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.tabid = Symtables.stack.peek().id;
				    _localctx.symbol.name = (((ParamsContext)_localctx).Ident!=null?((ParamsContext)_localctx).Ident.getText():null);
				    if((((ParamsContext)_localctx).Type!=null?((ParamsContext)_localctx).Type.getText():null).equals("int")){
				        _localctx.symbol.type=Types.INT;
				        Symbol.multiType=Types.INT;
				        }
				    else if((((ParamsContext)_localctx).Type!=null?((ParamsContext)_localctx).Type.getText():null).equals("boolean")){
				        _localctx.symbol.type=Types.BOOL;
				        Symbol.multiType=Types.BOOL;
				        }
				    else{
				        _localctx.symbol.type=Types.INVALID;
				        Symbol.multiType=Types.INVALID;
				        }

				    _localctx.symbol.scope=Scope.LOCAL;
				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);


				}
				break;
			case T__8:
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

	public static class NextParamsContext extends ParserRuleContext {
		public Symbol symbol;
		public Token Ident;
		public TerminalNode Type() { return getToken(CMPT379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public NextParamsContext nextParams() {
			return getRuleContext(NextParamsContext.class,0);
		}
		public NextParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterNextParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitNextParams(this);
		}
	}

	public final NextParamsContext nextParams() throws RecognitionException {
		NextParamsContext _localctx = new NextParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nextParams);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__3);
				setState(154);
				match(Type);
				setState(155);
				((NextParamsContext)_localctx).Ident = match(Ident);
				setState(156);
				nextParams();

				    ((NextParamsContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.tabid = Symtables.stack.peek().id;
				    _localctx.symbol.name = (((NextParamsContext)_localctx).Ident!=null?((NextParamsContext)_localctx).Ident.getText():null);
				    _localctx.symbol.type=Symbol.multiType;
				    _localctx.symbol.scope=Scope.LOCAL;
				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);


				}
				break;
			case T__8:
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

	public static class BlockContext extends ParserRuleContext {
		public Symtables symtable;
		public List<Instructions> nextlist;
		public StatementsContext statements;
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
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
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__0);

			             Symtables symtable = new Symtables();
			             symtable.parentId=Symtables.stack.peek().id;
			             Symtables.stack.push(symtable);
			             Symtables.addSymTableToList(symtable);
			      
			setState(164);
			var_decl();
			setState(165);
			((BlockContext)_localctx).statements = statements();
			setState(166);
			match(T__1);

			  ((BlockContext)_localctx).nextlist =  ((BlockContext)_localctx).statements.nextlist;
			  Symtables.stack.pop();
			  
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
		public Symbol symbol;
		public Token Type;
		public Token Ident;
		public TerminalNode Type() { return getToken(CMPT379CompilerParser.Type, 0); }
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public Var_decl_extraContext var_decl_extra() {
			return getRuleContext(Var_decl_extraContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_decl);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((Var_declContext)_localctx).Type = match(Type);
				setState(170);
				((Var_declContext)_localctx).Ident = match(Ident);
				setState(171);
				var_decl_extra();
				setState(172);
				match(T__2);
				setState(173);
				var_decl();

				    ((Var_declContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.tabid = Symtables.stack.peek().id;
				    _localctx.symbol.name = (((Var_declContext)_localctx).Ident!=null?((Var_declContext)_localctx).Ident.getText():null);

				    if((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null).equals("int")){
				        _localctx.symbol.type=Types.INT;
				        Symbol.multiType = Types.INT;
				        }
				    else if((((Var_declContext)_localctx).Type!=null?((Var_declContext)_localctx).Type.getText():null).equals("boolean")){
				        _localctx.symbol.type=Types.BOOL;
				        Symbol.multiType = Types.BOOL;
				        }
				    else{
				        _localctx.symbol.type=Types.INVALID;
				        Symbol.multiType = Types.INVALID;
				        }

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);

				}
				break;
			case T__0:
			case T__1:
			case If:
			case While:
			case Switch:
			case Ret:
			case Brk:
			case Cnt:
			case Callout:
			case Ident:
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

	public static class Var_decl_extraContext extends ParserRuleContext {
		public Symbol symbol;
		public Token Ident;
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public Var_decl_extraContext var_decl_extra() {
			return getRuleContext(Var_decl_extraContext.class,0);
		}
		public Var_decl_extraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterVar_decl_extra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitVar_decl_extra(this);
		}
	}

	public final Var_decl_extraContext var_decl_extra() throws RecognitionException {
		Var_decl_extraContext _localctx = new Var_decl_extraContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_decl_extra);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__3);
				setState(180);
				((Var_decl_extraContext)_localctx).Ident = match(Ident);
				setState(181);
				var_decl_extra();

				    ((Var_decl_extraContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.name = (((Var_decl_extraContext)_localctx).Ident!=null?((Var_decl_extraContext)_localctx).Ident.getText():null);
				    _localctx.symbol.tabid = Symtables.stack.peek().id;
				    _localctx.symbol.type = Symbol.multiType;

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);

				}
				break;
			case T__2:
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

	public static class StatementsContext extends ParserRuleContext {
		public List<Instructions> nextlist;
		public List<Instructions> breaklist;
		public List<Instructions> continuelist;
		public StatementContext statement;
		public KContext k;
		public StatementsContext statements;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public KContext k() {
			return getRuleContext(KContext.class,0);
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
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case If:
			case While:
			case Switch:
			case Ret:
			case Brk:
			case Cnt:
			case Callout:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				((StatementsContext)_localctx).statement = statement();
				setState(188);
				((StatementsContext)_localctx).k = k();
				setState(189);
				((StatementsContext)_localctx).statements = statements();

				    Symbol.backpatch(((StatementsContext)_localctx).statement.nextlist,((StatementsContext)_localctx).k.symbol.id);
				    ((StatementsContext)_localctx).nextlist =  ((StatementsContext)_localctx).statements.nextlist;

				    ((StatementsContext)_localctx).breaklist =  new ArrayList();
				    ((StatementsContext)_localctx).continuelist =  new ArrayList();

				}
				break;
			case T__1:
			case Case:
				enterOuterAlt(_localctx, 2);
				{

				    ((StatementsContext)_localctx).nextlist =  new ArrayList();
				    ((StatementsContext)_localctx).breaklist =  new ArrayList();
				    ((StatementsContext)_localctx).continuelist =  new ArrayList();

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
		public Instructions instruction;
		public List<Instructions> nextlist;
		public List<Instructions> breaklist;
		public List<Instructions> continuelist;
		public LocationContext location;
		public ExprContext expr;
		public MContext m;
		public BlockContext block;
		public MContext m1;
		public BlockContext b1;
		public NContext n;
		public MContext m2;
		public BlockContext b2;
		public StatementContext s;
		public CasesContext cases;
		public MethodCallContext methodCall;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode If() { return getToken(CMPT379CompilerParser.If, 0); }
		public List<MContext> m() {
			return getRuleContexts(MContext.class);
		}
		public MContext m(int i) {
			return getRuleContext(MContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public TerminalNode Else() { return getToken(CMPT379CompilerParser.Else, 0); }
		public TerminalNode While() { return getToken(CMPT379CompilerParser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Switch() { return getToken(CMPT379CompilerParser.Switch, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode Ret() { return getToken(CMPT379CompilerParser.Ret, 0); }
		public TerminalNode Brk() { return getToken(CMPT379CompilerParser.Brk, 0); }
		public TerminalNode Cnt() { return getToken(CMPT379CompilerParser.Cnt, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				Instructions.arrayRead = false;
				setState(196);
				((StatementContext)_localctx).location = location();
				setState(197);
				eqOp();
				setState(198);
				((StatementContext)_localctx).expr = expr(0);
				setState(199);
				match(T__2);

				    ((StatementContext)_localctx).nextlist =  new ArrayList();
				    ((StatementContext)_localctx).instruction =  new Instructions();

				    if(((StatementContext)_localctx).location.symbol.isArray)
				    {
				        _localctx.instruction.opc = Opcode.WRITE;
				        int offset = 8;
				        try{offset = Integer.parseInt(Instructions.arrayAccess); offset*=8;}
				        catch(Exception e){}
				        _localctx.instruction.op1 = offset;
				        _localctx.instruction.op2 = ((StatementContext)_localctx).expr.symbol.id;
				        _localctx.instruction.res = ((StatementContext)_localctx).location.symbol.id;
				    }
				    else
				    {
				        _localctx.instruction.op1 = ((StatementContext)_localctx).expr.symbol.id;
				        _localctx.instruction.op2 = -1;
				        _localctx.instruction.opc = Opcode.ASSIGN;
				        _localctx.instruction.res = ((StatementContext)_localctx).location.symbol.id;
				    }

				    Instructions.list.add(_localctx.instruction);

				    ((StatementContext)_localctx).breaklist =  new ArrayList();
				    ((StatementContext)_localctx).continuelist =  new ArrayList();


				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(If);
				setState(203);
				match(T__7);
				setState(204);
				((StatementContext)_localctx).expr = expr(0);
				setState(205);
				match(T__8);
				setState(206);
				((StatementContext)_localctx).m = m();
				setState(207);
				((StatementContext)_localctx).block = block();

				   Symbol.backpatch(((StatementContext)_localctx).expr.symbol.truelist , ((StatementContext)_localctx).m.symbol.id);
				   List<Instructions> mergelist = new ArrayList();
				   mergelist.addAll(((StatementContext)_localctx).expr.symbol.falselist);
				   mergelist.addAll(((StatementContext)_localctx).block.nextlist);
				   ((StatementContext)_localctx).nextlist =  mergelist;

				   ((StatementContext)_localctx).breaklist =  new ArrayList();
				   ((StatementContext)_localctx).continuelist =  new ArrayList();

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(If);
				setState(211);
				match(T__7);
				setState(212);
				((StatementContext)_localctx).expr = expr(0);
				setState(213);
				match(T__8);
				setState(214);
				((StatementContext)_localctx).m1 = m();
				setState(215);
				((StatementContext)_localctx).b1 = block();
				setState(216);
				((StatementContext)_localctx).n = n();
				setState(217);
				match(Else);
				setState(218);
				((StatementContext)_localctx).m2 = m();
				setState(219);
				((StatementContext)_localctx).b2 = block();

				    Symbol.backpatch(((StatementContext)_localctx).expr.symbol.truelist,((StatementContext)_localctx).m1.symbol.id);
				    Symbol.backpatch(((StatementContext)_localctx).expr.symbol.falselist,((StatementContext)_localctx).m2.symbol.id);
				    List<Instructions> list = new ArrayList();
				    list.addAll(((StatementContext)_localctx).b1.nextlist);
				    list.addAll(((StatementContext)_localctx).n.nextlist);
				    list.addAll(((StatementContext)_localctx).b2.nextlist);
				    ((StatementContext)_localctx).nextlist = list;

				    ((StatementContext)_localctx).breaklist =  new ArrayList();
				    ((StatementContext)_localctx).continuelist =  new ArrayList();

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(While);
				setState(223);
				((StatementContext)_localctx).m1 = m();
				setState(224);
				match(T__7);
				setState(225);
				((StatementContext)_localctx).expr = expr(0);
				setState(226);
				match(T__8);
				setState(227);
				((StatementContext)_localctx).m2 = m();
				setState(228);
				((StatementContext)_localctx).s = statement();

				    ((StatementContext)_localctx).nextlist =  new ArrayList();
				    Symbol.backpatch(((StatementContext)_localctx).expr.symbol.truelist,((StatementContext)_localctx).m2.symbol.id);
				    Symbol.backpatch(((StatementContext)_localctx).s.nextlist,((StatementContext)_localctx).m1.symbol.id);

				    ((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).expr.symbol.falselist;
				    Instructions instruction = new Instructions(-1,-1,((StatementContext)_localctx).m1.symbol.id,Opcode.GOTO);
				    Instructions.list.add(instruction);

				    ((StatementContext)_localctx).breaklist =  new ArrayList();
				    ((StatementContext)_localctx).continuelist =  new ArrayList();

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(Switch);
				setState(232);
				((StatementContext)_localctx).expr = expr(0);
				setState(233);
				((StatementContext)_localctx).m = m();
				setState(234);
				match(T__0);
				setState(235);
				((StatementContext)_localctx).cases = cases();
				setState(236);
				match(T__1);

				    ((StatementContext)_localctx).nextlist =  new ArrayList();
				    Symbol.backpatch(((StatementContext)_localctx).expr.symbol.truelist,((StatementContext)_localctx).m.symbol.id);

				    List<Instructions> mergedlist = new ArrayList();
				    mergedlist.addAll(((StatementContext)_localctx).expr.symbol.falselist);
				    mergedlist.addAll(((StatementContext)_localctx).cases.nextlist);
				    ((StatementContext)_localctx).nextlist =  mergedlist;

				    ((StatementContext)_localctx).breaklist =  ((StatementContext)_localctx).cases.breaklist;
				    ((StatementContext)_localctx).continuelist =  ((StatementContext)_localctx).cases.continuelist;


				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(Ret);
				setState(240);
				((StatementContext)_localctx).expr = expr(0);
				setState(241);
				match(T__2);
				Instructions instruction = new Instructions(((StatementContext)_localctx).expr.symbol.id,-1,-1,Opcode.RET);Instructions.list.add(instruction);
				                ((StatementContext)_localctx).nextlist =  new ArrayList();
				                ((StatementContext)_localctx).breaklist =  new ArrayList();
				                ((StatementContext)_localctx).continuelist =  new ArrayList();
				                
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(Ret);
				setState(245);
				match(T__7);
				setState(246);
				((StatementContext)_localctx).expr = expr(0);
				setState(247);
				match(T__8);
				setState(248);
				match(T__2);
				Instructions instruction = new Instructions(((StatementContext)_localctx).expr.symbol.id,-1,-1,Opcode.RET);Instructions.list.add(instruction);
				                       ((StatementContext)_localctx).nextlist =  new ArrayList();
				                       ((StatementContext)_localctx).breaklist =  new ArrayList();
				                       ((StatementContext)_localctx).continuelist =  new ArrayList();
				                       
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				match(Brk);
				setState(252);
				match(T__2);
				       Instructions instruction = new Instructions(-1,-1,-1,Opcode.GOTO);Instructions.list.add(instruction);
				        ((StatementContext)_localctx).nextlist =  new ArrayList();
				        ((StatementContext)_localctx).breaklist =  new ArrayList();
				        _localctx.breaklist.add(instruction);

				        ((StatementContext)_localctx).continuelist =  new ArrayList();
				          
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				match(Cnt);
				setState(255);
				match(T__2);
				Instructions instruction = new Instructions(-1,-1,-1,Opcode.GOTO);Instructions.list.add(instruction);
				           ((StatementContext)_localctx).nextlist =  new ArrayList();

				           ((StatementContext)_localctx).continuelist =  new ArrayList();
				           _localctx.continuelist.add(instruction);
				           ((StatementContext)_localctx).breaklist =  new ArrayList();
				           
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(257);
				((StatementContext)_localctx).block = block();

				((StatementContext)_localctx).nextlist =  ((StatementContext)_localctx).block.nextlist;
				    ((StatementContext)_localctx).breaklist =  new ArrayList();
				    ((StatementContext)_localctx).continuelist =  new ArrayList();

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(260);
				((StatementContext)_localctx).methodCall = methodCall();
				setState(261);
				match(T__2);

				    ((StatementContext)_localctx).nextlist =  new ArrayList();

				    Symbol symbol = new Symbol();
				    symbol.name = Integer.toString(((StatementContext)_localctx).methodCall.paramCount);
				    symbol.tabid = Symtables.stack.peek().id;

				    Symtables.stack.peek().add(symbol);
				    Symbol.add(symbol);

				    Instructions instruction = new Instructions(((StatementContext)_localctx).methodCall.symbol.id,symbol.id,-1,Opcode.CALL);
				    Instructions.list.add(instruction);

				        ((StatementContext)_localctx).breaklist =  new ArrayList();
				        ((StatementContext)_localctx).continuelist =  new ArrayList();

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

	public static class CasesContext extends ParserRuleContext {
		public List<Instructions> nextlist;
		public List<Instructions> breaklist;
		public List<Instructions> continuelist;
		public StatementsContext statements;
		public MContext m;
		public CasesContext cases;
		public TerminalNode Case() { return getToken(CMPT379CompilerParser.Case, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cases);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(Case);
				setState(267);
				literal();
				setState(268);
				match(T__9);
				setState(269);
				((CasesContext)_localctx).statements = statements();
				setState(270);
				((CasesContext)_localctx).m = m();
				setState(271);
				((CasesContext)_localctx).cases = cases();

				    Symbol.backpatch(((CasesContext)_localctx).statements.nextlist,((CasesContext)_localctx).m.symbol.id);

				    List<Instructions> mergedlist =new ArrayList();
				    mergedlist.addAll(((CasesContext)_localctx).statements.nextlist);
				    mergedlist.addAll(((CasesContext)_localctx).cases.nextlist);
				    ((CasesContext)_localctx).nextlist =  mergedlist;

				    List<Instructions> bl = new ArrayList();
				    List<Instructions> cl = new ArrayList();

				    bl.addAll(((CasesContext)_localctx).statements.breaklist);
				    bl.addAll(((CasesContext)_localctx).cases.breaklist);

				    cl.addAll(((CasesContext)_localctx).statements.breaklist);
				    cl.addAll(((CasesContext)_localctx).cases.breaklist);

				    ((CasesContext)_localctx).breaklist =  bl;
				    ((CasesContext)_localctx).continuelist =  cl;

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(Case);
				setState(275);
				literal();
				setState(276);
				match(T__9);
				setState(277);
				((CasesContext)_localctx).statements = statements();

				    ((CasesContext)_localctx).nextlist =  ((CasesContext)_localctx).statements.nextlist;
				    ((CasesContext)_localctx).breaklist =  ((CasesContext)_localctx).statements.breaklist;
				    ((CasesContext)_localctx).continuelist =  ((CasesContext)_localctx).statements.continuelist;

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

	public static class MethodCallContext extends ParserRuleContext {
		public Symbol symbol;
		public int paramCount;
		public Token Ident;
		public ArgsContext args;
		public Token Str;
		public CalloutArgsContext calloutArgs;
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode Callout() { return getToken(CMPT379CompilerParser.Callout, 0); }
		public TerminalNode Str() { return getToken(CMPT379CompilerParser.Str, 0); }
		public CalloutArgsContext calloutArgs() {
			return getRuleContext(CalloutArgsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodCall);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((MethodCallContext)_localctx).Ident = match(Ident);
				setState(283);
				match(T__7);
				setState(284);
				((MethodCallContext)_localctx).args = args();
				setState(285);
				match(T__8);

				    ((MethodCallContext)_localctx).paramCount =  ((MethodCallContext)_localctx).args.count;
				    for(int i=0;i<Symbol.list.size();i++)
				    {
				        if(Symbol.list.get(i).name.equals((((MethodCallContext)_localctx).Ident!=null?((MethodCallContext)_localctx).Ident.getText():null)))
				            {((MethodCallContext)_localctx).symbol =  Symbol.list.get(i); break;}
				    }

				}
				break;
			case Callout:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(Callout);
				setState(289);
				match(T__7);
				setState(290);
				((MethodCallContext)_localctx).Str = match(Str);
				setState(291);
				((MethodCallContext)_localctx).calloutArgs = calloutArgs(0);
				setState(292);
				match(T__8);

				    ((MethodCallContext)_localctx).paramCount =  ((MethodCallContext)_localctx).calloutArgs.count;
				    ((MethodCallContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.name = (((MethodCallContext)_localctx).Str!=null?((MethodCallContext)_localctx).Str.getText():null);
				    _localctx.symbol.type = Types.STR;
				    _localctx.symbol.tabid = Symtables.stack.peek().id;

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);


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

	public static class ArgsContext extends ParserRuleContext {
		public int count;
		public SomeArgsContext someArgs;
		public SomeArgsContext someArgs() {
			return getRuleContext(SomeArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__10:
			case Char:
			case Callout:
			case DecNum:
			case HexNum:
			case BoolLit:
			case Ident:
			case SubOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((ArgsContext)_localctx).someArgs = someArgs(0);
				 ((ArgsContext)_localctx).count =  ((ArgsContext)_localctx).someArgs.count;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				((ArgsContext)_localctx).count =  0;
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

	public static class SomeArgsContext extends ParserRuleContext {
		public int count;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SomeArgsContext someArgs() {
			return getRuleContext(SomeArgsContext.class,0);
		}
		public SomeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterSomeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitSomeArgs(this);
		}
	}

	public final SomeArgsContext someArgs() throws RecognitionException {
		return someArgs(0);
	}

	private SomeArgsContext someArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SomeArgsContext _localctx = new SomeArgsContext(_ctx, _parentState);
		SomeArgsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_someArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			expr(0);
			((SomeArgsContext)_localctx).count =  1;
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SomeArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_someArgs);
					setState(307);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(308);
					match(T__3);
					setState(309);
					expr(0);
					((SomeArgsContext)_localctx).count =  _localctx.count +1;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class CalloutArgsContext extends ParserRuleContext {
		public int count;
		public Symbol symbol;
		public ExprContext expr;
		public Token Str;
		public CalloutArgsContext calloutArgs() {
			return getRuleContext(CalloutArgsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Str() { return getToken(CMPT379CompilerParser.Str, 0); }
		public CalloutArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calloutArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterCalloutArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitCalloutArgs(this);
		}
	}

	public final CalloutArgsContext calloutArgs() throws RecognitionException {
		return calloutArgs(0);
	}

	private CalloutArgsContext calloutArgs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalloutArgsContext _localctx = new CalloutArgsContext(_ctx, _parentState);
		CalloutArgsContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_calloutArgs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			((CalloutArgsContext)_localctx).count =   0;
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new CalloutArgsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_calloutArgs);
						setState(320);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(321);
						match(T__3);
						setState(322);
						((CalloutArgsContext)_localctx).expr = expr(0);


						              ((CalloutArgsContext)_localctx).count =  _localctx.count + 1;
						              ((CalloutArgsContext)_localctx).symbol =  ((CalloutArgsContext)_localctx).expr.symbol;
						              Instructions instruction = new Instructions(_localctx.symbol.id,-1,-1,Opcode.PARAM);
						              Instructions.list.add(instruction);
						          
						}
						break;
					case 2:
						{
						_localctx = new CalloutArgsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_calloutArgs);
						setState(325);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(326);
						match(T__3);
						setState(327);
						((CalloutArgsContext)_localctx).Str = match(Str);

						              ((CalloutArgsContext)_localctx).count =  _localctx.count + 1;
						              ((CalloutArgsContext)_localctx).symbol =  new Symbol();
						              _localctx.symbol.name = (((CalloutArgsContext)_localctx).Str!=null?((CalloutArgsContext)_localctx).Str.getText():null);
						              _localctx.symbol.type = Types.STR;
						              _localctx.symbol.tabid = Symtables.stack.peek().id;
						              Instructions instruction = new Instructions(_localctx.symbol.id,-1,-1,Opcode.PARAM);

						              Symtables.stack.peek().add(_localctx.symbol);
						              Symbol.add(_localctx.symbol);
						              Instructions.list.add(instruction);
						          
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public Symbol symbol;
		public ExprContext e1;
		public LiteralContext literal;
		public LocationContext location;
		public ExprContext expr;
		public ExprContext e2;
		public Token MulDiv;
		public Token RelOp;
		public MContext m;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SubOp() { return getToken(CMPT379CompilerParser.SubOp, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode AddOp() { return getToken(CMPT379CompilerParser.AddOp, 0); }
		public TerminalNode MulDiv() { return getToken(CMPT379CompilerParser.MulDiv, 0); }
		public TerminalNode RelOp() { return getToken(CMPT379CompilerParser.RelOp, 0); }
		public TerminalNode AndOp() { return getToken(CMPT379CompilerParser.AndOp, 0); }
		public MContext m() {
			return getRuleContext(MContext.class,0);
		}
		public TerminalNode OrOp() { return getToken(CMPT379CompilerParser.OrOp, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitExpr(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(335);
				((ExprContext)_localctx).literal = literal();
				((ExprContext)_localctx).symbol =  ((ExprContext)_localctx).literal.symbol;
				}
				break;
			case 2:
				{
				setState(338);
				((ExprContext)_localctx).location = location();
				((ExprContext)_localctx).symbol =  ((ExprContext)_localctx).location.symbol; 
				}
				break;
			case 3:
				{
				setState(341);
				match(T__7);
				setState(342);
				((ExprContext)_localctx).expr = expr(0);
				setState(343);
				match(T__8);
				 ((ExprContext)_localctx).symbol =  ((ExprContext)_localctx).expr.symbol; 
				}
				break;
			case 4:
				{
				setState(346);
				match(SubOp);
				setState(347);
				((ExprContext)_localctx).expr = expr(9);

				   ((ExprContext)_localctx).symbol =  new Symbol();
				   _localctx.symbol.name = "T"+ (++symbolCount);
				   _localctx.symbol.type = Types.INT;
				   _localctx.symbol.scope = Scope.LOCAL;
				   _localctx.symbol.tabid = Symtables.stack.peek().id;
				   Instructions instruction = new Instructions();

				   instruction.res = _localctx.symbol.id;
				   instruction.op1 = -1;
				   instruction.op2 = ((ExprContext)_localctx).expr.symbol.id;
				   instruction.opc = Opcode.SUB;

				   Instructions.list.add(instruction);
				   Symtables.stack.peek().add(_localctx.symbol);
				   Symbol.add(_localctx.symbol);

				}
				break;
			case 5:
				{
				setState(350);
				match(T__10);
				setState(351);
				((ExprContext)_localctx).expr = expr(8);

				   ((ExprContext)_localctx).symbol =  new Symbol();
				   _localctx.symbol.name = "T"+ (++symbolCount);
				   _localctx.symbol.type = Types.BOOL;
				   _localctx.symbol.scope = Scope.LOCAL;
				   _localctx.symbol.tabid = Symtables.stack.peek().id;
				   Instructions instruction = new Instructions();

				   instruction.res = _localctx.symbol.id;
				   instruction.op1 = -1;
				   instruction.op2 = ((ExprContext)_localctx).expr.symbol.id;
				   instruction.opc = Opcode.NEG;

				   Instructions.list.add(instruction);
				   Symtables.stack.peek().add(_localctx.symbol);
				   Symbol.add(_localctx.symbol);

				}
				break;
			case 6:
				{
				setState(354);
				methodCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(389);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(358);
						match(AddOp);
						setState(359);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(8);

						             ((ExprContext)_localctx).symbol =  new Symbol();
						             _localctx.symbol.name = "T"+ (++symbolCount);
						             _localctx.symbol.type = Types.INT;
						             _localctx.symbol.scope = Scope.LOCAL;
						             _localctx.symbol.tabid = Symtables.stack.peek().id;
						             Instructions instruction = new Instructions();

						             instruction.res = _localctx.symbol.id;
						             instruction.op1 = ((ExprContext)_localctx).e1.symbol.id;
						             instruction.op2 = ((ExprContext)_localctx).e2.symbol.id;
						             instruction.opc = Opcode.ADD;

						             Instructions.list.add(instruction);
						             Symtables.stack.peek().add(_localctx.symbol);
						             Symbol.add(_localctx.symbol);
						          
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(363);
						((ExprContext)_localctx).MulDiv = match(MulDiv);
						setState(364);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(7);

						             ((ExprContext)_localctx).symbol =  new Symbol();
						             _localctx.symbol.name = "T"+ (++symbolCount);
						             _localctx.symbol.type = Types.INT;
						             _localctx.symbol.scope = Scope.LOCAL;
						             _localctx.symbol.tabid = Symtables.stack.peek().id;

						             if((((ExprContext)_localctx).MulDiv!=null?((ExprContext)_localctx).MulDiv.getText():null).equals("*"))
						             {
						                Instructions instruction = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,_localctx.symbol.id,Opcode.MUL);
						                Instructions.list.add(instruction);
						                Symtables.stack.peek().add(_localctx.symbol);
						                Symbol.add(_localctx.symbol);
						             }
						             else if((((ExprContext)_localctx).MulDiv!=null?((ExprContext)_localctx).MulDiv.getText():null).equals("/")){
						                Instructions instruction = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,_localctx.symbol.id,Opcode.DIV);
						                Instructions.list.add(instruction);
						                Symtables.stack.peek().add(_localctx.symbol);
						                Symbol.add(_localctx.symbol);
						             }
						             else
						             {
						                 Symbol sym1 = new Symbol(); sym1.name = "T"+ (++symbolCount); sym1.type = Types.INT;
						                 Symbol sym2 = new Symbol(); sym2.name = "T"+ (++symbolCount); sym2.type = Types.INT;
						                 Instructions instruction1 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,sym1.id,Opcode.DIV);
						                 Instructions instruction2 = new Instructions(sym1.id,((ExprContext)_localctx).e2.symbol.id,sym2.id,Opcode.MUL);
						                 Instructions instruction3 = new Instructions(((ExprContext)_localctx).e2.symbol.id,sym2.id,_localctx.symbol.id,Opcode.SUB);

						                 Symbol.add(sym1);
						                 Symbol.add(sym2);
						                 Symbol.add(_localctx.symbol);
						                 Instructions.list.add(instruction1);
						                 Instructions.list.add(instruction2);
						                 Instructions.list.add(instruction3);
						             }

						          
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(367);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(368);
						match(SubOp);
						setState(369);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(6);

						             ((ExprContext)_localctx).symbol =  new Symbol();
						             _localctx.symbol.name = "T"+ (++symbolCount);
						             _localctx.symbol.type = Types.INT;
						             _localctx.symbol.scope = Scope.LOCAL;
						             _localctx.symbol.tabid = Symtables.stack.peek().id;
						             Instructions instruction = new Instructions();

						             instruction.res = _localctx.symbol.id;
						             instruction.op1 = ((ExprContext)_localctx).e1.symbol.id;
						             instruction.op2 = ((ExprContext)_localctx).e2.symbol.id;
						             instruction.opc = Opcode.SUB;

						             Instructions.list.add(instruction);
						             Symtables.stack.peek().add(_localctx.symbol);
						             Symbol.add(_localctx.symbol);
						          
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(372);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(373);
						((ExprContext)_localctx).RelOp = match(RelOp);
						setState(374);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);

						             ((ExprContext)_localctx).symbol =  new Symbol();
						             _localctx.symbol.name = "T"+ (++symbolCount);
						             _localctx.symbol.type = Types.BOOL;
						             _localctx.symbol.scope = Scope.LOCAL;
						             _localctx.symbol.tabid = Symtables.stack.peek().id;

						             Instructions instruction1 = new Instructions();
						             Instructions instruction2 = new Instructions();

						             if((((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null).equals("<=")){
						                  instruction1 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.LE);
						                  instruction2 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.GT);}
						             if((((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null).equals(">=")){
						                 instruction1 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.GE);
						                 instruction2 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.LT);}
						              if((((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null).equals("<")){
						                  instruction1 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.LT);
						                  instruction2 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.GE);}
						              if((((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null).equals(">")){
						                     instruction1 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.GT);
						                     instruction2 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.LE);}
						              if((((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null).equals("==")){
						                    instruction1 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.EQ);
						                    instruction2 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.NE);}
						              if((((ExprContext)_localctx).RelOp!=null?((ExprContext)_localctx).RelOp.getText():null).equals("!=")){
						                   instruction1 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.NE);
						                   instruction2 = new Instructions(((ExprContext)_localctx).e1.symbol.id,((ExprContext)_localctx).e2.symbol.id,-1,Opcode.EQ);}

						             _localctx.symbol.truelist.add(instruction1);
						             _localctx.symbol.falselist.add(instruction2);

						             Instructions.list.add(instruction1);
						             Instructions.list.add(instruction2);

						             Symtables.stack.peek().add(_localctx.symbol);
						             Symbol.add(_localctx.symbol);
						          
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(377);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(378);
						match(AndOp);
						setState(379);
						((ExprContext)_localctx).m = m();
						setState(380);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(4);

						             ((ExprContext)_localctx).symbol =  new Symbol();
						             _localctx.symbol.name = "T"+ (++symbolCount);
						             _localctx.symbol.type = Types.BOOL;
						             _localctx.symbol.scope = Scope.LOCAL;
						             _localctx.symbol.tabid = Symtables.stack.peek().id;

						             //back patch
						             if(((ExprContext)_localctx).e1.symbol.truelist.isEmpty())
						             {
						                Instructions  instruction = new Instructions(((ExprContext)_localctx).e1.symbol.id,-1,-1,Opcode.GOTO);
						                Instructions.list.add(instruction);
						                ((ExprContext)_localctx).e1.symbol.truelist.add(instruction);
						             }
						             Symbol.backpatch(((ExprContext)_localctx).e1.symbol.truelist ,((ExprContext)_localctx).m.symbol.id );
						             _localctx.symbol.truelist = ((ExprContext)_localctx).e2.symbol.truelist;


						             //merge lists
						             for(int i = 0;i<((ExprContext)_localctx).e1.symbol.falselist.size();i++)
						             {_localctx.symbol.falselist.add(((ExprContext)_localctx).e1.symbol.falselist.get(i));}

						             for(int i = 0;i<((ExprContext)_localctx).e2.symbol.falselist.size();i++)
						             {_localctx.symbol.falselist.add(((ExprContext)_localctx).e2.symbol.falselist.get(i));}

						             Symtables.stack.peek().add(_localctx.symbol);
						             Symbol.add(_localctx.symbol);

						          
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(383);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(384);
						match(OrOp);
						setState(385);
						((ExprContext)_localctx).m = m();
						setState(386);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(3);


						             ((ExprContext)_localctx).symbol =  new Symbol();
						             _localctx.symbol.name = "T"+ (++symbolCount);
						             _localctx.symbol.type = Types.BOOL;
						             _localctx.symbol.scope = Scope.LOCAL;
						             _localctx.symbol.tabid = Symtables.stack.peek().id;

						            //back patch
						            if(((ExprContext)_localctx).e1.symbol.falselist.isEmpty())
						            {
						                 Instructions instruction = new Instructions(((ExprContext)_localctx).e1.symbol.id,-1,-1,Opcode.GOTO);
						                 Instructions.list.add(instruction);
						                 ((ExprContext)_localctx).e1.symbol.falselist.add(instruction);
						            }
						            for(int i=0 ; i < ((ExprContext)_localctx).e1.symbol.falselist.size();i++)
						            {
						                 if(((ExprContext)_localctx).e1.symbol.falselist.get(i).res == -1)
						                     {((ExprContext)_localctx).e1.symbol.falselist.get(i).res = ((ExprContext)_localctx).m.symbol.id;}
						            }

						            _localctx.symbol.falselist = ((ExprContext)_localctx).e2.symbol.falselist;

						            //merge lists
						            for(int i = 0;i < ((ExprContext)_localctx).e1.symbol.truelist.size();i++)
						            {_localctx.symbol.truelist.add(((ExprContext)_localctx).e1.symbol.truelist.get(i));}

						            for(int i = 0;i < ((ExprContext)_localctx).e2.symbol.truelist.size();i++)
						            {_localctx.symbol.truelist.add(((ExprContext)_localctx).e2.symbol.truelist.get(i));}

						             Symtables.stack.peek().add(_localctx.symbol);
						             Symbol.add(_localctx.symbol);

						          
						}
						break;
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class LocationContext extends ParserRuleContext {
		public Symbol symbol;
		public Token Ident;
		public ExprContext expr;
		public TerminalNode Ident() { return getToken(CMPT379CompilerParser.Ident, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_location);
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				((LocationContext)_localctx).Ident = match(Ident);

				    int flag=0;
				    Symtables table = Symtables.stack.peek();
				    for(int i=0;i<table.symbols.size();i++)
				    {
				        if(table.symbols.get(i).name.equals((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null)))
				        {
				            ((LocationContext)_localctx).symbol = table.symbols.get(i);
				            flag=1;
				            break;
				        }
				    }
				    if(flag==0)
				    {
				        Symtables table2 = Symtables.list.get(0);
				        for(int i=0;i<table2.symbols.size();i++)
				        {
				            if(table2.symbols.get(i).name.equals((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null)))
				            {
				                ((LocationContext)_localctx).symbol = table2.symbols.get(i);
				                break;
				            }
				        }
				    }

				    Instructions.arrayRead=true;


				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				((LocationContext)_localctx).Ident = match(Ident);
				setState(397);
				match(T__4);
				setState(398);
				((LocationContext)_localctx).expr = expr(0);
				setState(399);
				match(T__5);

				    //first find corresponding symbol
				    int flag=0;
				    Instructions.arrayAccess = ((LocationContext)_localctx).expr.symbol.name;
				    Symtables table = Symtables.stack.peek();
				    for(int i=0;i<table.symbols.size();i++)
				    {
				        if(table.symbols.get(i).name.equals((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null)))
				        {
				            ((LocationContext)_localctx).symbol = table.symbols.get(i);
				            flag=1;
				            break;
				        }
				    }
				    if(flag==0)
				    {
				        Symtables table2 = Symtables.list.get(0);
				        for(int i=0;i<table2.symbols.size();i++)
				        {
				            if(table2.symbols.get(i).name.equals((((LocationContext)_localctx).Ident!=null?((LocationContext)_localctx).Ident.getText():null)))
				            {
				                ((LocationContext)_localctx).symbol = table2.symbols.get(i);
				                break;
				            }
				        }
				    }

				    Instructions instruction = new Instructions();

				    if(Instructions.arrayRead)
				    {
				        Symbol symbolTemp = new Symbol();
				        symbolTemp.tabid = Symtables.stack.peek().id;
				        instruction.opc = Opcode.READ;
				        int offset=8;
				        try{offset = Integer.parseInt(((LocationContext)_localctx).expr.symbol.name); offset*=8;}
				        catch(Exception e){}
				        instruction.op1 = _localctx.symbol.id;
				        instruction.op2 = offset;
				        instruction.res = symbolTemp.id;

				        ((LocationContext)_localctx).symbol =  symbolTemp;
				        Symtables.stack.peek().add(_localctx.symbol);
				        Symbol.add(_localctx.symbol);
				    }

				    Instructions.list.add(instruction);
				    Instructions.arrayRead=true;


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

	public static class MContext extends ParserRuleContext {
		public Symbol symbol;
		public MContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitM(this);
		}
	}

	public final MContext m() throws RecognitionException {
		MContext _localctx = new MContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_m);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    ((MContext)_localctx).symbol =  new Symbol();
			    _localctx.symbol.type = Types.LABEL;
			    _localctx.symbol.name = "L"+ (++count);
			    Symtables.stack.peek().add(_localctx.symbol);
			    Symbol.add(_localctx.symbol);

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

	public static class NContext extends ParserRuleContext {
		public List<Instructions> nextlist;
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitN(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_n);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    ((NContext)_localctx).nextlist =  new ArrayList();
			    Instructions instruction = new Instructions(-1,-1,-1,Opcode.GOTO);
			    Instructions.list.add(instruction);
			    _localctx.nextlist.add(instruction);

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

	public static class KContext extends ParserRuleContext {
		public Symbol symbol;
		public KContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitK(this);
		}
	}

	public final KContext k() throws RecognitionException {
		KContext _localctx = new KContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_k);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    ((KContext)_localctx).symbol =  new Symbol();

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

	public static class NumContext extends ParserRuleContext {
		public String string;
		public Token DecNum;
		public Token HexNum;
		public TerminalNode DecNum() { return getToken(CMPT379CompilerParser.DecNum, 0); }
		public TerminalNode HexNum() { return getToken(CMPT379CompilerParser.HexNum, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_num);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				((NumContext)_localctx).DecNum = match(DecNum);
				((NumContext)_localctx).string =  (((NumContext)_localctx).DecNum!=null?((NumContext)_localctx).DecNum.getText():null);
				}
				break;
			case HexNum:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				((NumContext)_localctx).HexNum = match(HexNum);
				((NumContext)_localctx).string =  (((NumContext)_localctx).HexNum!=null?((NumContext)_localctx).HexNum.getText():null);
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

	public static class LiteralContext extends ParserRuleContext {
		public String string;
		public Symbol symbol;
		public NumContext num;
		public Token Char;
		public Token BoolLit;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode Char() { return getToken(CMPT379CompilerParser.Char, 0); }
		public TerminalNode BoolLit() { return getToken(CMPT379CompilerParser.BoolLit, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DecNum:
			case HexNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				((LiteralContext)_localctx).num = num();
				((LiteralContext)_localctx).string =  ((LiteralContext)_localctx).num.string;
				    ((LiteralContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.name = ((LiteralContext)_localctx).num.string;
				    _localctx.symbol.scope = Scope.CONST;
				    _localctx.symbol.type=Types.INT;
				    _localctx.symbol.tabid = Symtables.stack.peek().id;

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);

				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				((LiteralContext)_localctx).Char = match(Char);
				((LiteralContext)_localctx).string = (((LiteralContext)_localctx).Char!=null?((LiteralContext)_localctx).Char.getText():null);
				    ((LiteralContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.name = (((LiteralContext)_localctx).Char!=null?((LiteralContext)_localctx).Char.getText():null);
				    _localctx.symbol.scope = Scope.CONST;
				    _localctx.symbol.type=Types.CHAR;
				    _localctx.symbol.tabid = Symtables.stack.peek().id;

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);

				}
				break;
			case BoolLit:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				((LiteralContext)_localctx).BoolLit = match(BoolLit);
				((LiteralContext)_localctx).string = (((LiteralContext)_localctx).BoolLit!=null?((LiteralContext)_localctx).BoolLit.getText():null);
				    ((LiteralContext)_localctx).symbol =  new Symbol();
				    _localctx.symbol.name = (((LiteralContext)_localctx).BoolLit!=null?((LiteralContext)_localctx).BoolLit.getText():null);
				    _localctx.symbol.scope = Scope.CONST;
				    _localctx.symbol.type=Types.BOOL;
				    _localctx.symbol.tabid = Symtables.stack.peek().id;

				    Symtables.stack.peek().add(_localctx.symbol);
				    Symbol.add(_localctx.symbol);

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

	public static class EqOpContext extends ParserRuleContext {
		public TerminalNode AssignOp() { return getToken(CMPT379CompilerParser.AssignOp, 0); }
		public EqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMPT379CompilerListener ) ((CMPT379CompilerListener)listener).exitEqOp(this);
		}
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==AssignOp) ) {
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
			return field_decls_sempred((Field_declsContext)_localctx, predIndex);
		case 2:
			return field_decl_sempred((Field_declContext)_localctx, predIndex);
		case 4:
			return method_decls_sempred((Method_declsContext)_localctx, predIndex);
		case 16:
			return someArgs_sempred((SomeArgsContext)_localctx, predIndex);
		case 17:
			return calloutArgs_sempred((CalloutArgsContext)_localctx, predIndex);
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean field_decls_sempred(Field_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean field_decl_sempred(Field_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean method_decls_sempred(Method_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean someArgs_sempred(SomeArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean calloutArgs_sempred(CalloutArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u01ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6u\n\6\f\6\16\6x\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a3\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00b4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00c4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u010b\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011b\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012a\n\20\3\21\3\21"+
		"\3\21\3\21\5\21\u0130\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u013b\n\22\f\22\16\22\u013e\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u014c\n\23\f\23\16\23\u014f\13\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0166\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0188\n\24\f\24\16\24\u018b\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0195\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\5\31\u01a1\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01aa\n"+
		"\32\3\33\3\33\3\33\2\b\4\6\n\"$&\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\3\4\2\t\t##\2\u01be\2\66\3\2\2\2\4?\3\2\2\2\6"+
		"X\3\2\2\2\bk\3\2\2\2\nq\3\2\2\2\f\u0091\3\2\2\2\16\u0099\3\2\2\2\20\u00a2"+
		"\3\2\2\2\22\u00a4\3\2\2\2\24\u00b3\3\2\2\2\26\u00bb\3\2\2\2\30\u00c3\3"+
		"\2\2\2\32\u010a\3\2\2\2\34\u011a\3\2\2\2\36\u0129\3\2\2\2 \u012f\3\2\2"+
		"\2\"\u0131\3\2\2\2$\u013f\3\2\2\2&\u0165\3\2\2\2(\u0194\3\2\2\2*\u0196"+
		"\3\2\2\2,\u0198\3\2\2\2.\u019a\3\2\2\2\60\u01a0\3\2\2\2\62\u01a9\3\2\2"+
		"\2\64\u01ab\3\2\2\2\66\67\7\21\2\2\678\7\22\2\289\b\2\1\29:\7\3\2\2:;"+
		"\5\4\3\2;<\5\n\6\2<=\7\4\2\2=>\b\2\1\2>\3\3\2\2\2?J\b\3\1\2@A\f\5\2\2"+
		"AB\5\6\4\2BC\7\5\2\2CI\3\2\2\2DE\f\4\2\2EF\5\b\5\2FG\7\5\2\2GI\3\2\2\2"+
		"H@\3\2\2\2HD\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LJ\3\2\2"+
		"\2MN\b\4\1\2NO\7 \2\2OP\7!\2\2PY\b\4\1\2QR\7 \2\2RS\7!\2\2ST\7\7\2\2T"+
		"U\5\60\31\2UV\7\b\2\2VW\b\4\1\2WY\3\2\2\2XM\3\2\2\2XQ\3\2\2\2Yh\3\2\2"+
		"\2Z[\f\6\2\2[\\\7\6\2\2\\]\7!\2\2]g\b\4\1\2^_\f\5\2\2_`\7\6\2\2`a\7!\2"+
		"\2ab\7\7\2\2bc\5\60\31\2cd\7\b\2\2de\b\4\1\2eg\3\2\2\2fZ\3\2\2\2f^\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\7\3\2\2\2jh\3\2\2\2kl\7 \2\2lm\7!"+
		"\2\2mn\7\t\2\2no\5\62\32\2op\b\5\1\2p\t\3\2\2\2qv\b\6\1\2rs\f\4\2\2su"+
		"\5\f\7\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\13\3\2\2\2xv\3\2\2\2"+
		"yz\7\23\2\2z{\7!\2\2{|\b\7\1\2|}\7\n\2\2}~\5\16\b\2~\177\7\13\2\2\177"+
		"\u0080\7\3\2\2\u0080\u0081\5\24\13\2\u0081\u0082\5\30\r\2\u0082\u0083"+
		"\7\4\2\2\u0083\u0084\b\7\1\2\u0084\u0092\3\2\2\2\u0085\u0086\7 \2\2\u0086"+
		"\u0087\7!\2\2\u0087\u0088\b\7\1\2\u0088\u0089\7\n\2\2\u0089\u008a\5\16"+
		"\b\2\u008a\u008b\7\13\2\2\u008b\u008c\7\3\2\2\u008c\u008d\5\24\13\2\u008d"+
		"\u008e\5\30\r\2\u008e\u008f\7\4\2\2\u008f\u0090\b\7\1\2\u0090\u0092\3"+
		"\2\2\2\u0091y\3\2\2\2\u0091\u0085\3\2\2\2\u0092\r\3\2\2\2\u0093\u0094"+
		"\7 \2\2\u0094\u0095\7!\2\2\u0095\u0096\5\20\t\2\u0096\u0097\b\b\1\2\u0097"+
		"\u009a\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\17\3\2\2\2\u009b\u009c\7\6\2\2\u009c\u009d\7 \2\2\u009d\u009e"+
		"\7!\2\2\u009e\u009f\5\20\t\2\u009f\u00a0\b\t\1\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\21\3\2\2"+
		"\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\b\n\1\2\u00a6\u00a7\5\24\13\2\u00a7"+
		"\u00a8\5\30\r\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\b\n\1\2\u00aa\23\3\2\2"+
		"\2\u00ab\u00ac\7 \2\2\u00ac\u00ad\7!\2\2\u00ad\u00ae\5\26\f\2\u00ae\u00af"+
		"\7\5\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\b\13\1\2\u00b1\u00b4\3\2\2"+
		"\2\u00b2\u00b4\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\25"+
		"\3\2\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b8\5\26\f\2\u00b8"+
		"\u00b9\b\f\1\2\u00b9\u00bc\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b5\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00be\5\32\16\2\u00be"+
		"\u00bf\5.\30\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\b\r\1\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c4\b\r\1\2\u00c3\u00bd\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\31\3\2\2\2\u00c5\u00c6\b\16\1\2\u00c6\u00c7\5(\25\2\u00c7\u00c8\5\64"+
		"\33\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\b\16\1\2\u00cb"+
		"\u010b\3\2\2\2\u00cc\u00cd\7\24\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\5"+
		"&\24\2\u00cf\u00d0\7\13\2\2\u00d0\u00d1\5*\26\2\u00d1\u00d2\5\22\n\2\u00d2"+
		"\u00d3\b\16\1\2\u00d3\u010b\3\2\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\7"+
		"\n\2\2\u00d6\u00d7\5&\24\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5*\26\2\u00d9"+
		"\u00da\5\22\n\2\u00da\u00db\5,\27\2\u00db\u00dc\7\25\2\2\u00dc\u00dd\5"+
		"*\26\2\u00dd\u00de\5\22\n\2\u00de\u00df\b\16\1\2\u00df\u010b\3\2\2\2\u00e0"+
		"\u00e1\7\26\2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5"+
		"&\24\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\5\32\16\2"+
		"\u00e7\u00e8\b\16\1\2\u00e8\u010b\3\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb"+
		"\5&\24\2\u00eb\u00ec\5*\26\2\u00ec\u00ed\7\3\2\2\u00ed\u00ee\5\34\17\2"+
		"\u00ee\u00ef\7\4\2\2\u00ef\u00f0\b\16\1\2\u00f0\u010b\3\2\2\2\u00f1\u00f2"+
		"\7\31\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\7\5\2\2\u00f4\u00f5\b\16\1\2"+
		"\u00f5\u010b\3\2\2\2\u00f6\u00f7\7\31\2\2\u00f7\u00f8\7\n\2\2\u00f8\u00f9"+
		"\5&\24\2\u00f9\u00fa\7\13\2\2\u00fa\u00fb\7\5\2\2\u00fb\u00fc\b\16\1\2"+
		"\u00fc\u010b\3\2\2\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\7\5\2\2\u00ff\u010b"+
		"\b\16\1\2\u0100\u0101\7\33\2\2\u0101\u0102\7\5\2\2\u0102\u010b\b\16\1"+
		"\2\u0103\u0104\5\22\n\2\u0104\u0105\b\16\1\2\u0105\u010b\3\2\2\2\u0106"+
		"\u0107\5\36\20\2\u0107\u0108\7\5\2\2\u0108\u0109\b\16\1\2\u0109\u010b"+
		"\3\2\2\2\u010a\u00c5\3\2\2\2\u010a\u00cc\3\2\2\2\u010a\u00d4\3\2\2\2\u010a"+
		"\u00e0\3\2\2\2\u010a\u00e9\3\2\2\2\u010a\u00f1\3\2\2\2\u010a\u00f6\3\2"+
		"\2\2\u010a\u00fd\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0103\3\2\2\2\u010a"+
		"\u0106\3\2\2\2\u010b\33\3\2\2\2\u010c\u010d\7\30\2\2\u010d\u010e\5\62"+
		"\32\2\u010e\u010f\7\f\2\2\u010f\u0110\5\30\r\2\u0110\u0111\5*\26\2\u0111"+
		"\u0112\5\34\17\2\u0112\u0113\b\17\1\2\u0113\u011b\3\2\2\2\u0114\u0115"+
		"\7\30\2\2\u0115\u0116\5\62\32\2\u0116\u0117\7\f\2\2\u0117\u0118\5\30\r"+
		"\2\u0118\u0119\b\17\1\2\u0119\u011b\3\2\2\2\u011a\u010c\3\2\2\2\u011a"+
		"\u0114\3\2\2\2\u011b\35\3\2\2\2\u011c\u011d\7!\2\2\u011d\u011e\7\n\2\2"+
		"\u011e\u011f\5 \21\2\u011f\u0120\7\13\2\2\u0120\u0121\b\20\1\2\u0121\u012a"+
		"\3\2\2\2\u0122\u0123\7\34\2\2\u0123\u0124\7\n\2\2\u0124\u0125\7\20\2\2"+
		"\u0125\u0126\5$\23\2\u0126\u0127\7\13\2\2\u0127\u0128\b\20\1\2\u0128\u012a"+
		"\3\2\2\2\u0129\u011c\3\2\2\2\u0129\u0122\3\2\2\2\u012a\37\3\2\2\2\u012b"+
		"\u012c\5\"\22\2\u012c\u012d\b\21\1\2\u012d\u0130\3\2\2\2\u012e\u0130\b"+
		"\21\1\2\u012f\u012b\3\2\2\2\u012f\u012e\3\2\2\2\u0130!\3\2\2\2\u0131\u0132"+
		"\b\22\1\2\u0132\u0133\5&\24\2\u0133\u0134\b\22\1\2\u0134\u013c\3\2\2\2"+
		"\u0135\u0136\f\4\2\2\u0136\u0137\7\6\2\2\u0137\u0138\5&\24\2\u0138\u0139"+
		"\b\22\1\2\u0139\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d#\3\2\2\2\u013e\u013c\3"+
		"\2\2\2\u013f\u0140\b\23\1\2\u0140\u0141\b\23\1\2\u0141\u014d\3\2\2\2\u0142"+
		"\u0143\f\5\2\2\u0143\u0144\7\6\2\2\u0144\u0145\5&\24\2\u0145\u0146\b\23"+
		"\1\2\u0146\u014c\3\2\2\2\u0147\u0148\f\4\2\2\u0148\u0149\7\6\2\2\u0149"+
		"\u014a\7\20\2\2\u014a\u014c\b\23\1\2\u014b\u0142\3\2\2\2\u014b\u0147\3"+
		"\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"%\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\b\24\1\2\u0151\u0152\5\62\32"+
		"\2\u0152\u0153\b\24\1\2\u0153\u0166\3\2\2\2\u0154\u0155\5(\25\2\u0155"+
		"\u0156\b\24\1\2\u0156\u0166\3\2\2\2\u0157\u0158\7\n\2\2\u0158\u0159\5"+
		"&\24\2\u0159\u015a\7\13\2\2\u015a\u015b\b\24\1\2\u015b\u0166\3\2\2\2\u015c"+
		"\u015d\7&\2\2\u015d\u015e\5&\24\13\u015e\u015f\b\24\1\2\u015f\u0166\3"+
		"\2\2\2\u0160\u0161\7\r\2\2\u0161\u0162\5&\24\n\u0162\u0163\b\24\1\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0166\5\36\20\2\u0165\u0150\3\2\2\2\u0165\u0154\3"+
		"\2\2\2\u0165\u0157\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u0160\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0189\3\2\2\2\u0167\u0168\f\t\2\2\u0168\u0169\7%"+
		"\2\2\u0169\u016a\5&\24\n\u016a\u016b\b\24\1\2\u016b\u0188\3\2\2\2\u016c"+
		"\u016d\f\b\2\2\u016d\u016e\7$\2\2\u016e\u016f\5&\24\t\u016f\u0170\b\24"+
		"\1\2\u0170\u0188\3\2\2\2\u0171\u0172\f\7\2\2\u0172\u0173\7&\2\2\u0173"+
		"\u0174\5&\24\b\u0174\u0175\b\24\1\2\u0175\u0188\3\2\2\2\u0176\u0177\f"+
		"\6\2\2\u0177\u0178\7\"\2\2\u0178\u0179\5&\24\7\u0179\u017a\b\24\1\2\u017a"+
		"\u0188\3\2\2\2\u017b\u017c\f\5\2\2\u017c\u017d\7\'\2\2\u017d\u017e\5*"+
		"\26\2\u017e\u017f\5&\24\6\u017f\u0180\b\24\1\2\u0180\u0188\3\2\2\2\u0181"+
		"\u0182\f\4\2\2\u0182\u0183\7(\2\2\u0183\u0184\5*\26\2\u0184\u0185\5&\24"+
		"\5\u0185\u0186\b\24\1\2\u0186\u0188\3\2\2\2\u0187\u0167\3\2\2\2\u0187"+
		"\u016c\3\2\2\2\u0187\u0171\3\2\2\2\u0187\u0176\3\2\2\2\u0187\u017b\3\2"+
		"\2\2\u0187\u0181\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\'\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7!\2\2"+
		"\u018d\u0195\b\25\1\2\u018e\u018f\7!\2\2\u018f\u0190\7\7\2\2\u0190\u0191"+
		"\5&\24\2\u0191\u0192\7\b\2\2\u0192\u0193\b\25\1\2\u0193\u0195\3\2\2\2"+
		"\u0194\u018c\3\2\2\2\u0194\u018e\3\2\2\2\u0195)\3\2\2\2\u0196\u0197\b"+
		"\26\1\2\u0197+\3\2\2\2\u0198\u0199\b\27\1\2\u0199-\3\2\2\2\u019a\u019b"+
		"\b\30\1\2\u019b/\3\2\2\2\u019c\u019d\7\35\2\2\u019d\u01a1\b\31\1\2\u019e"+
		"\u019f\7\36\2\2\u019f\u01a1\b\31\1\2\u01a0\u019c\3\2\2\2\u01a0\u019e\3"+
		"\2\2\2\u01a1\61\3\2\2\2\u01a2\u01a3\5\60\31\2\u01a3\u01a4\b\32\1\2\u01a4"+
		"\u01aa\3\2\2\2\u01a5\u01a6\7\17\2\2\u01a6\u01aa\b\32\1\2\u01a7\u01a8\7"+
		"\37\2\2\u01a8\u01aa\b\32\1\2\u01a9\u01a2\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\63\3\2\2\2\u01ab\u01ac\t\2\2\2\u01ac\65\3\2\2\2\33"+
		"HJXfhv\u0091\u0099\u00a2\u00b3\u00bb\u00c3\u010a\u011a\u0129\u012f\u013c"+
		"\u014b\u014d\u0165\u0187\u0189\u0194\u01a0\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}