// Generated from A2_grammar.g4 by ANTLR 4.7.1

import java.io.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A2_grammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WhiteSpace=5, Char=6, Str=7, Class=8, 
		Program=9, Void=10, If=11, Else=12, While=13, Switch=14, Case=15, Ret=16, 
		Brk=17, Cnt=18, Callout=19, Num=20, HexNum=21, BoolLit=22, Type=23, Ident=24, 
		Relop=25, AssignOp=26, ArithOp=27, CondOp=28, OParen=29, CParen=30, OBrace=31, 
		CBrace=32, OBracket=33, CBracket=34, SemiColon=35, Comma=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "Delim", "Letter", "Digit", "HexDigit", 
		"Alpha", "AlphaNum", "WhiteSpace", "Char", "Str", "Class", "Program", 
		"Void", "If", "Else", "While", "Switch", "Case", "Ret", "Brk", "Cnt", 
		"Callout", "Num", "HexNum", "BoolLit", "Type", "Ident", "Relop", "AssignOp", 
		"ArithOp", "CondOp", "OParen", "CParen", "OBrace", "CBrace", "OBracket", 
		"CBracket", "SemiColon", "Comma"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "':'", "'-'", "'!'", null, null, null, "'class'", "'Program'", 
		"'Void'", "'if'", "'else'", "'while'", "'switch'", "'case'", "'return'", 
		"'break'", "'continue'", "'callout'", null, null, null, null, null, null, 
		null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "WhiteSpace", "Char", "Str", "Class", "Program", 
		"Void", "If", "Else", "While", "Switch", "Case", "Ret", "Brk", "Cnt", 
		"Callout", "Num", "HexNum", "BoolLit", "Type", "Ident", "Relop", "AssignOp", 
		"ArithOp", "CondOp", "OParen", "CParen", "OBrace", "CBrace", "OBracket", 
		"CBracket", "SemiColon", "Comma"
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


	public A2_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A2_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u012e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\th\n"+
		"\t\3\n\3\n\5\nl\n\n\3\13\3\13\5\13p\n\13\3\f\6\fs\n\f\r\f\16\ft\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n\r\3\16\3\16\3\16\3\16\7"+
		"\16\u0087\n\16\f\16\16\16\u008a\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\6\33\u00da\n\33\r\33\16\33\u00db\3\34\3\34\3\34\3\34\6\34\u00e2"+
		"\n\34\r\34\16\34\u00e3\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u00ef\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u00fb\n\36\3\37\3\37\7\37\u00ff\n\37\f\37\16\37\u0102\13\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u010d\n \3!\3!\3!\3!\3!\5!\u0114\n!\3\"\3\"\3#\3"+
		"#\3#\3#\3#\5#\u011d\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\2\2,\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\2\25\2\27\7\31\b\33\t\35"+
		"\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31"+
		"=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&\3\2\n\4\2\13\f\"\"\4\2C\\c|\3"+
		"\2\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\6\2\'\',-//\61\61\2\u013b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2"+
		"\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2"+
		"\2\21g\3\2\2\2\23k\3\2\2\2\25o\3\2\2\2\27r\3\2\2\2\31\u0080\3\2\2\2\33"+
		"\u0082\3\2\2\2\35\u008d\3\2\2\2\37\u0093\3\2\2\2!\u009b\3\2\2\2#\u00a0"+
		"\3\2\2\2%\u00a3\3\2\2\2\'\u00a8\3\2\2\2)\u00ae\3\2\2\2+\u00b5\3\2\2\2"+
		"-\u00ba\3\2\2\2/\u00c1\3\2\2\2\61\u00c7\3\2\2\2\63\u00d0\3\2\2\2\65\u00d9"+
		"\3\2\2\2\67\u00dd\3\2\2\29\u00ee\3\2\2\2;\u00fa\3\2\2\2=\u00fc\3\2\2\2"+
		"?\u010c\3\2\2\2A\u0113\3\2\2\2C\u0115\3\2\2\2E\u011c\3\2\2\2G\u011e\3"+
		"\2\2\2I\u0120\3\2\2\2K\u0122\3\2\2\2M\u0124\3\2\2\2O\u0126\3\2\2\2Q\u0128"+
		"\3\2\2\2S\u012a\3\2\2\2U\u012c\3\2\2\2WX\7?\2\2X\4\3\2\2\2YZ\7<\2\2Z\6"+
		"\3\2\2\2[\\\7/\2\2\\\b\3\2\2\2]^\7#\2\2^\n\3\2\2\2_`\t\2\2\2`\f\3\2\2"+
		"\2ab\t\3\2\2b\16\3\2\2\2cd\t\4\2\2d\20\3\2\2\2eh\5\17\b\2fh\t\5\2\2ge"+
		"\3\2\2\2gf\3\2\2\2h\22\3\2\2\2il\5\r\7\2jl\7a\2\2ki\3\2\2\2kj\3\2\2\2"+
		"l\24\3\2\2\2mp\5\23\n\2np\5\17\b\2om\3\2\2\2on\3\2\2\2p\26\3\2\2\2qs\5"+
		"\13\6\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\f\2\2w\30"+
		"\3\2\2\2xy\7)\2\2yz\n\6\2\2z\u0081\7)\2\2{|\7)\2\2|}\7^\2\2}~\3\2\2\2"+
		"~\177\13\2\2\2\177\u0081\7)\2\2\u0080x\3\2\2\2\u0080{\3\2\2\2\u0081\32"+
		"\3\2\2\2\u0082\u0088\7$\2\2\u0083\u0087\n\7\2\2\u0084\u0085\7^\2\2\u0085"+
		"\u0087\13\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7$\2\2\u008c\34\3\2\2\2\u008d\u008e\7e\2\2"+
		"\u008e\u008f\7n\2\2\u008f\u0090\7c\2\2\u0090\u0091\7u\2\2\u0091\u0092"+
		"\7u\2\2\u0092\36\3\2\2\2\u0093\u0094\7R\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7q\2\2\u0096\u0097\7i\2\2\u0097\u0098\7t\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7o\2\2\u009a \3\2\2\2\u009b\u009c\7X\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7f\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1"+
		"\u00a2\7h\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9"+
		"\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2"+
		"\u00ad(\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7k\2"+
		"\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7j\2\2\u00b4*\3\2"+
		"\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		".\3\2\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7m\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7k\2\2"+
		"\u00cc\u00cd\7p\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2\u00cf\62\3\2"+
		"\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4"+
		"\7n\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\64\3\2\2\2\u00d8\u00da\5\17\b\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2"+
		"\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\66\3\2\2\2\u00dd\u00de"+
		"\7\62\2\2\u00de\u00df\7z\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\5\21\t\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e48\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00ef\7g\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7c\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ef\7g\2\2\u00ee\u00e5\3\2\2"+
		"\2\u00ee\u00e9\3\2\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7"+
		"p\2\2\u00f2\u00fb\7v\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fb\7p\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fb<\3\2\2\2\u00fc"+
		"\u0100\5\23\n\2\u00fd\u00ff\5\25\13\2\u00fe\u00fd\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101>\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7>\2\2\u0104\u010d\7?\2\2\u0105\u0106\7@\2"+
		"\2\u0106\u010d\7?\2\2\u0107\u010d\t\b\2\2\u0108\u0109\7?\2\2\u0109\u010d"+
		"\7?\2\2\u010a\u010b\7#\2\2\u010b\u010d\7?\2\2\u010c\u0103\3\2\2\2\u010c"+
		"\u0105\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d@\3\2\2\2\u010e\u0114\7?\2\2\u010f\u0110\7-\2\2\u0110\u0114"+
		"\7?\2\2\u0111\u0112\7/\2\2\u0112\u0114\7?\2\2\u0113\u010e\3\2\2\2\u0113"+
		"\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0114B\3\2\2\2\u0115\u0116\t\t\2\2"+
		"\u0116D\3\2\2\2\u0117\u0118\7(\2\2\u0118\u011d\7(\2\2\u0119\u011a\7~\2"+
		"\2\u011a\u011d\7~\2\2\u011b\u011d\7#\2\2\u011c\u0117\3\2\2\2\u011c\u0119"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011dF\3\2\2\2\u011e\u011f\7*\2\2\u011fH"+
		"\3\2\2\2\u0120\u0121\7+\2\2\u0121J\3\2\2\2\u0122\u0123\7}\2\2\u0123L\3"+
		"\2\2\2\u0124\u0125\7\177\2\2\u0125N\3\2\2\2\u0126\u0127\7]\2\2\u0127P"+
		"\3\2\2\2\u0128\u0129\7_\2\2\u0129R\3\2\2\2\u012a\u012b\7=\2\2\u012bT\3"+
		"\2\2\2\u012c\u012d\7.\2\2\u012dV\3\2\2\2\22\2gkot\u0080\u0086\u0088\u00db"+
		"\u00e3\u00ee\u00fa\u0100\u010c\u0113\u011c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}