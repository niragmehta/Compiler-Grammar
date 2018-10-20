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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WhiteSpace=10, Char=11, Str=12, Class=13, Program=14, Void=15, If=16, 
		Else=17, While=18, Switch=19, Case=20, Ret=21, Brk=22, Cnt=23, Callout=24, 
		Num=25, HexNum=26, BoolLit=27, Type=28, Ident=29, Relop=30, AssignOp=31, 
		ArithOp=32, CondOp=33, OParen=34, CParen=35, OBrace=36, CBrace=37, OBracket=38, 
		CBracket=39, SemiColon=40, Comma=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"Delim", "Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", "WhiteSpace", 
		"Char", "Str", "Class", "Program", "Void", "If", "Else", "While", "Switch", 
		"Case", "Ret", "Brk", "Cnt", "Callout", "Num", "HexNum", "BoolLit", "Type", 
		"Ident", "Relop", "AssignOp", "ArithOp", "CondOp", "OParen", "CParen", 
		"OBrace", "CBrace", "OBracket", "CBracket", "SemiColon", "Comma"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\5\16\u0092\n\16\3\17\3\17\5\17\u0096\n\17\3\20\3\20"+
		"\5\20\u009a\n\20\3\21\6\21\u009d\n\21\r\21\16\21\u009e\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ab\n\22\3\23\3\23\3\23\3\23"+
		"\7\23\u00b1\n\23\f\23\16\23\u00b4\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \6 \u0104\n \r \16 \u0105\3!\3!\3!\3!\6!\u010c\n!\r!\16!\u010d"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0119\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u0125\n#\3$\3$\7$\u0129\n$\f$\16$\u012c\13$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u0137\n%\3&\3&\3&\3&\3&\5&\u013e\n&\3\'\3\'\3(\3(\3"+
		"(\3(\3(\5(\u0147\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\35"+
		"\2\37\2!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31"+
		"=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+\3\2\n\4\2\13\f\"\""+
		"\4\2C\\c|\3\2\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\6\2\'\',-//\61\61\2\u0165"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5"+
		"q\3\2\2\2\7s\3\2\2\2\tx\3\2\2\2\13{\3\2\2\2\r~\3\2\2\2\17\u0083\3\2\2"+
		"\2\21\u0085\3\2\2\2\23\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008b\3\2\2\2"+
		"\31\u008d\3\2\2\2\33\u0091\3\2\2\2\35\u0095\3\2\2\2\37\u0099\3\2\2\2!"+
		"\u009c\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'\u00b7\3\2\2\2)\u00bd\3"+
		"\2\2\2+\u00c5\3\2\2\2-\u00ca\3\2\2\2/\u00cd\3\2\2\2\61\u00d2\3\2\2\2\63"+
		"\u00d8\3\2\2\2\65\u00df\3\2\2\2\67\u00e4\3\2\2\29\u00eb\3\2\2\2;\u00f1"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u0103\3\2\2\2A\u0107\3\2\2\2C\u0118\3\2\2\2E"+
		"\u0124\3\2\2\2G\u0126\3\2\2\2I\u0136\3\2\2\2K\u013d\3\2\2\2M\u013f\3\2"+
		"\2\2O\u0146\3\2\2\2Q\u0148\3\2\2\2S\u014a\3\2\2\2U\u014c\3\2\2\2W\u014e"+
		"\3\2\2\2Y\u0150\3\2\2\2[\u0152\3\2\2\2]\u0154\3\2\2\2_\u0156\3\2\2\2a"+
		"b\7e\2\2bc\7n\2\2cd\7c\2\2de\7u\2\2ef\7u\2\2fg\7\"\2\2gh\7R\2\2hi\7t\2"+
		"\2ij\7q\2\2jk\7i\2\2kl\7t\2\2lm\7c\2\2mn\7o\2\2no\7\"\2\2op\7}\2\2p\4"+
		"\3\2\2\2qr\7?\2\2r\6\3\2\2\2st\7x\2\2tu\7q\2\2uv\7k\2\2vw\7f\2\2w\b\3"+
		"\2\2\2xy\7-\2\2yz\7?\2\2z\n\3\2\2\2{|\7/\2\2|}\7?\2\2}\f\3\2\2\2~\177"+
		"\7g\2\2\177\u0080\7z\2\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2\2\u0082\16"+
		"\3\2\2\2\u0083\u0084\7<\2\2\u0084\20\3\2\2\2\u0085\u0086\7/\2\2\u0086"+
		"\22\3\2\2\2\u0087\u0088\7#\2\2\u0088\24\3\2\2\2\u0089\u008a\t\2\2\2\u008a"+
		"\26\3\2\2\2\u008b\u008c\t\3\2\2\u008c\30\3\2\2\2\u008d\u008e\t\4\2\2\u008e"+
		"\32\3\2\2\2\u008f\u0092\5\31\r\2\u0090\u0092\t\5\2\2\u0091\u008f\3\2\2"+
		"\2\u0091\u0090\3\2\2\2\u0092\34\3\2\2\2\u0093\u0096\5\27\f\2\u0094\u0096"+
		"\7a\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\36\3\2\2\2\u0097"+
		"\u009a\5\35\17\2\u0098\u009a\5\31\r\2\u0099\u0097\3\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a \3\2\2\2\u009b\u009d\5\25\13\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\b\21\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7)\2\2\u00a3\u00a4"+
		"\n\6\2\2\u00a4\u00ab\7)\2\2\u00a5\u00a6\7)\2\2\u00a6\u00a7\7^\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\13\2\2\2\u00a9\u00ab\7)\2\2\u00aa\u00a2\3\2"+
		"\2\2\u00aa\u00a5\3\2\2\2\u00ab$\3\2\2\2\u00ac\u00b2\7$\2\2\u00ad\u00b1"+
		"\n\7\2\2\u00ae\u00af\7^\2\2\u00af\u00b1\13\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6"+
		"&\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7u\2\2\u00bc(\3\2\2\2\u00bd\u00be\7R\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\u00c3\7c\2\2\u00c3\u00c4\7o\2\2\u00c4*\3\2\2\2\u00c5\u00c6\7X\2"+
		"\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7f\2\2\u00c9,\3\2"+
		"\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\60\3\2\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9"+
		"\u00da\7y\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7e\2\2"+
		"\u00dd\u00de\7j\2\2\u00de\64\3\2\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7"+
		"c\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3\66\3\2\2\2\u00e4\u00e5"+
		"\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7w\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7p\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7d\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7m\2\2"+
		"\u00f0:\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2"+
		"\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8"+
		"\7w\2\2\u00f8\u00f9\7g\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7w\2\2\u0100\u0101\7v\2\2\u0101>\3\2\2\2\u0102\u0104\5\31\r\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106@\3\2\2\2\u0107\u0108\7\62\2\2\u0108\u0109\7z\2\2\u0109\u010b"+
		"\3\2\2\2\u010a\u010c\5\33\16\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010eB\3\2\2\2\u010f\u0110\7"+
		"v\2\2\u0110\u0111\7t\2\2\u0111\u0112\7w\2\2\u0112\u0119\7g\2\2\u0113\u0114"+
		"\7h\2\2\u0114\u0115\7c\2\2\u0115\u0116\7n\2\2\u0116\u0117\7u\2\2\u0117"+
		"\u0119\7g\2\2\u0118\u010f\3\2\2\2\u0118\u0113\3\2\2\2\u0119D\3\2\2\2\u011a"+
		"\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c\u0125\7v\2\2\u011d\u011e\7d\2\2"+
		"\u011e\u011f\7q\2\2\u011f\u0120\7q\2\2\u0120\u0121\7n\2\2\u0121\u0122"+
		"\7g\2\2\u0122\u0123\7c\2\2\u0123\u0125\7p\2\2\u0124\u011a\3\2\2\2\u0124"+
		"\u011d\3\2\2\2\u0125F\3\2\2\2\u0126\u012a\5\35\17\2\u0127\u0129\5\37\20"+
		"\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012bH\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7>\2\2\u012e\u0137"+
		"\7?\2\2\u012f\u0130\7@\2\2\u0130\u0137\7?\2\2\u0131\u0137\t\b\2\2\u0132"+
		"\u0133\7?\2\2\u0133\u0137\7?\2\2\u0134\u0135\7#\2\2\u0135\u0137\7?\2\2"+
		"\u0136\u012d\3\2\2\2\u0136\u012f\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0132"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137J\3\2\2\2\u0138\u013e\7?\2\2\u0139\u013a"+
		"\7-\2\2\u013a\u013e\7?\2\2\u013b\u013c\7/\2\2\u013c\u013e\7?\2\2\u013d"+
		"\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013eL\3\2\2\2"+
		"\u013f\u0140\t\t\2\2\u0140N\3\2\2\2\u0141\u0142\7(\2\2\u0142\u0147\7("+
		"\2\2\u0143\u0144\7~\2\2\u0144\u0147\7~\2\2\u0145\u0147\7#\2\2\u0146\u0141"+
		"\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0147P\3\2\2\2\u0148"+
		"\u0149\7*\2\2\u0149R\3\2\2\2\u014a\u014b\7+\2\2\u014bT\3\2\2\2\u014c\u014d"+
		"\7}\2\2\u014dV\3\2\2\2\u014e\u014f\7\177\2\2\u014fX\3\2\2\2\u0150\u0151"+
		"\7]\2\2\u0151Z\3\2\2\2\u0152\u0153\7_\2\2\u0153\\\3\2\2\2\u0154\u0155"+
		"\7=\2\2\u0155^\3\2\2\2\u0156\u0157\7.\2\2\u0157`\3\2\2\2\22\2\u0091\u0095"+
		"\u0099\u009e\u00aa\u00b0\u00b2\u0105\u010d\u0118\u0124\u012a\u0136\u013d"+
		"\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}