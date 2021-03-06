// Generated from CMPT379Compiler.g4 by ANTLR 4.7.1

import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A3_grammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "Delim", "Letter", "Digit", "HexDigit", "Alpha", "AlphaNum", 
		"WhiteSpace", "Char", "Str", "Class", "Program", "Void", "If", "Else", 
		"While", "Switch", "Case", "Ret", "Brk", "Cnt", "Callout", "DecNum", "HexNum", 
		"BoolLit", "Type", "Ident", "RelOp", "AssignOp", "MulDiv", "AddOp", "SubOp", 
		"AndOp", "OrOp"
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


	public A3_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMPT379Compiler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0132\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5"+
		"\20z\n\20\3\21\3\21\5\21~\n\21\3\22\3\22\5\22\u0082\n\22\3\23\6\23\u0085"+
		"\n\23\r\23\16\23\u0086\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0093\n\24\3\25\3\25\3\25\3\25\7\25\u0099\n\25\f\25\16\25\u009c"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\6\"\u00ec\n\"\r\"\16\"\u00ed\3#\3#\3#\3#\6#\u00f4\n#\r#\16"+
		"#\u00f5\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0101\n$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u010d\n%\3&\3&\7&\u0111\n&\f&\16&\u0114\13&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u011f\n\'\3(\3(\3(\3(\5(\u0125\n(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3,\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\2\33\2\35\2\37\2!\2#\2%\16\'\17)\20+\21-\22/\23\61\24\63"+
		"\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y(\3"+
		"\2\n\4\2\13\f\"\"\4\2C\\c|\3\2\62;\4\2CHch\3\2^^\4\2$$^^\4\2>>@@\5\2\'"+
		"\',,\61\61\2\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3"+
		"\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3"+
		"\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37"+
		"y\3\2\2\2!}\3\2\2\2#\u0081\3\2\2\2%\u0084\3\2\2\2\'\u0092\3\2\2\2)\u0094"+
		"\3\2\2\2+\u009f\3\2\2\2-\u00a5\3\2\2\2/\u00ad\3\2\2\2\61\u00b2\3\2\2\2"+
		"\63\u00b5\3\2\2\2\65\u00ba\3\2\2\2\67\u00c0\3\2\2\29\u00c7\3\2\2\2;\u00cc"+
		"\3\2\2\2=\u00d3\3\2\2\2?\u00d9\3\2\2\2A\u00e2\3\2\2\2C\u00eb\3\2\2\2E"+
		"\u00ef\3\2\2\2G\u0100\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u011e\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u0126\3\2\2\2S\u0128\3\2\2\2U\u012a\3\2\2\2W\u012c"+
		"\3\2\2\2Y\u012f\3\2\2\2[\\\7}\2\2\\\4\3\2\2\2]^\7\177\2\2^\6\3\2\2\2_"+
		"`\7=\2\2`\b\3\2\2\2ab\7.\2\2b\n\3\2\2\2cd\7]\2\2d\f\3\2\2\2ef\7_\2\2f"+
		"\16\3\2\2\2gh\7?\2\2h\20\3\2\2\2ij\7*\2\2j\22\3\2\2\2kl\7+\2\2l\24\3\2"+
		"\2\2mn\7<\2\2n\26\3\2\2\2op\7#\2\2p\30\3\2\2\2qr\t\2\2\2r\32\3\2\2\2s"+
		"t\t\3\2\2t\34\3\2\2\2uv\t\4\2\2v\36\3\2\2\2wz\5\35\17\2xz\t\5\2\2yw\3"+
		"\2\2\2yx\3\2\2\2z \3\2\2\2{~\5\33\16\2|~\7a\2\2}{\3\2\2\2}|\3\2\2\2~\""+
		"\3\2\2\2\177\u0082\5!\21\2\u0080\u0082\5\35\17\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082$\3\2\2\2\u0083\u0085\5\31\r\2\u0084\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\b\23\2\2\u0089&\3\2\2\2\u008a\u008b\7)\2\2\u008b"+
		"\u008c\n\6\2\2\u008c\u0093\7)\2\2\u008d\u008e\7)\2\2\u008e\u008f\7^\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0091\13\2\2\2\u0091\u0093\7)\2\2\u0092\u008a"+
		"\3\2\2\2\u0092\u008d\3\2\2\2\u0093(\3\2\2\2\u0094\u009a\7$\2\2\u0095\u0099"+
		"\n\7\2\2\u0096\u0097\7^\2\2\u0097\u0099\13\2\2\2\u0098\u0095\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e"+
		"*\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7u\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7R\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7i\2\2\u00a9\u00aa\7t\2\2"+
		"\u00aa\u00ab\7c\2\2\u00ab\u00ac\7o\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7x\2"+
		"\2\u00ae\u00af\7q\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7f\2\2\u00b1\60\3"+
		"\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4\62\3\2\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\64\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7y\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7e\2\2"+
		"\u00c5\u00c6\7j\2\2\u00c68\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7c\2"+
		"\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7"+
		"t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1"+
		"\7t\2\2\u00d1\u00d2\7p\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5"+
		"\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7m\2\2\u00d8"+
		">\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7p\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7w\2\2"+
		"\u00e0\u00e1\7g\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7c\2"+
		"\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00e9\7v\2\2\u00e9B\3\2\2\2\u00ea\u00ec\5\35\17\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00eeD\3\2\2\2\u00ef\u00f0\7\62\2\2\u00f0\u00f1\7z\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f4\5\37\20\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6F\3\2\2\2\u00f7\u00f8\7"+
		"v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7w\2\2\u00fa\u0101\7g\2\2\u00fb\u00fc"+
		"\7h\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7u\2\2\u00ff"+
		"\u0101\7g\2\2\u0100\u00f7\3\2\2\2\u0100\u00fb\3\2\2\2\u0101H\3\2\2\2\u0102"+
		"\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104\u010d\7v\2\2\u0105\u0106\7d\2\2"+
		"\u0106\u0107\7q\2\2\u0107\u0108\7q\2\2\u0108\u0109\7n\2\2\u0109\u010a"+
		"\7g\2\2\u010a\u010b\7c\2\2\u010b\u010d\7p\2\2\u010c\u0102\3\2\2\2\u010c"+
		"\u0105\3\2\2\2\u010dJ\3\2\2\2\u010e\u0112\5!\21\2\u010f\u0111\5#\22\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113L\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7>\2\2\u0116\u011f"+
		"\7?\2\2\u0117\u0118\7@\2\2\u0118\u011f\7?\2\2\u0119\u011f\t\b\2\2\u011a"+
		"\u011b\7?\2\2\u011b\u011f\7?\2\2\u011c\u011d\7#\2\2\u011d\u011f\7?\2\2"+
		"\u011e\u0115\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011a"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011fN\3\2\2\2\u0120\u0121\7-\2\2\u0121\u0125"+
		"\7?\2\2\u0122\u0123\7/\2\2\u0123\u0125\7?\2\2\u0124\u0120\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125P\3\2\2\2\u0126\u0127\t\t\2\2\u0127R\3\2\2\2\u0128"+
		"\u0129\7-\2\2\u0129T\3\2\2\2\u012a\u012b\7/\2\2\u012bV\3\2\2\2\u012c\u012d"+
		"\7(\2\2\u012d\u012e\7(\2\2\u012eX\3\2\2\2\u012f\u0130\7~\2\2\u0130\u0131"+
		"\7~\2\2\u0131Z\3\2\2\2\21\2y}\u0081\u0086\u0092\u0098\u009a\u00ed\u00f5"+
		"\u0100\u010c\u0112\u011e\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}