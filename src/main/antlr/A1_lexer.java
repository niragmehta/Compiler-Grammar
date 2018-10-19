// Generated from A1_lexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class A1_lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Class=1, Program=2, Type=3, Id=4, If=5, Else=6, Switch=7, Case=8, While=9, 
		Return=10, Break=11, Continue=12, OpenBracket=13, CloseBracket=14, OpenParenthesis=15, 
		CloseParenthesis=16, OpenSquare=17, CloseSquare=18, Void=19, Newline=20, 
		WhiteSpace=21, Bin_op=22, Assign_op=23, Comma=24, Semicolon=25, Arith_op=26, 
		Rel_op=27, Eq_op=28, Cond_op=29, Int_literal=30, Hex_digit=31, Hex_literal=32, 
		Digit=33, Decimal_literal=34, Bool_literal=35, True=36, False=37, Char_literal=38, 
		String_literal=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Class", "Program", "Type", "Id", "If", "Else", "Switch", "Case", "While", 
		"Return", "Break", "Continue", "OpenBracket", "CloseBracket", "OpenParenthesis", 
		"CloseParenthesis", "OpenSquare", "CloseSquare", "Void", "Newline", "WhiteSpace", 
		"Bin_op", "Assign_op", "Comma", "Semicolon", "Arith_op", "Rel_op", "Eq_op", 
		"Cond_op", "Alpha", "Alpha_num", "Int_literal", "Hex_digit", "Hex_literal", 
		"Digit", "Decimal_literal", "Bool_literal", "True", "False", "Char_literal", 
		"String_literal", "Char"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'program'", null, null, "'if'", "'else'", "'switch'", 
		"'case'", "'while'", "'return'", "'break'", "'continue'", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "'void'", null, null, null, null, "','", "';'", 
		null, null, null, null, null, null, null, null, null, null, "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Class", "Program", "Type", "Id", "If", "Else", "Switch", "Case", 
		"While", "Return", "Break", "Continue", "OpenBracket", "CloseBracket", 
		"OpenParenthesis", "CloseParenthesis", "OpenSquare", "CloseSquare", "Void", 
		"Newline", "WhiteSpace", "Bin_op", "Assign_op", "Comma", "Semicolon", 
		"Arith_op", "Rel_op", "Eq_op", "Cond_op", "Int_literal", "Hex_digit", 
		"Hex_literal", "Digit", "Decimal_literal", "Bool_literal", "True", "False", 
		"Char_literal", "String_literal"
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


	public A1_lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "A1_lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\7\5t\n\5\f\5\16\5w\13\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\5\25\u00bb\n\25\3\25\3\25\3\25\3\25\3\26\6\26\u00c2\n\26\r\26\16"+
		"\26\u00c3\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00cc\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00d3\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u00e0\n\34\3\35\3\35\3\35\3\35\5\35\u00e6\n\35\3\36\3"+
		"\36\3\36\3\36\5\36\u00ec\n\36\3\37\3\37\3 \3 \5 \u00f2\n \3!\3!\5!\u00f6"+
		"\n!\3\"\3\"\5\"\u00fa\n\"\3#\3#\3#\6#\u00ff\n#\r#\16#\u0100\3$\3$\3%\6"+
		"%\u0106\n%\r%\16%\u0107\3&\3&\5&\u010c\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3*\3*\7*\u011f\n*\f*\16*\u0122\13*\3*\3*\3+\3+"+
		"\3\u0120\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37=\2?\2A C!E\"G#I$K%M&O\'Q(S)U\2\3\2\b\4\2\13\13\"\"\6\2\'\'"+
		",-//\61\61\4\2>>@@\4\2C\\c|\4\2CHch\3\2\62;\2\u0137\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3W\3\2\2\2\5]\3\2\2\2\7o\3\2\2\2\tq\3\2\2"+
		"\2\13x\3\2\2\2\r{\3\2\2\2\17\u0080\3\2\2\2\21\u0087\3\2\2\2\23\u008c\3"+
		"\2\2\2\25\u0092\3\2\2\2\27\u0099\3\2\2\2\31\u009f\3\2\2\2\33\u00a8\3\2"+
		"\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b0\3\2\2\2%"+
		"\u00b2\3\2\2\2\'\u00b4\3\2\2\2)\u00ba\3\2\2\2+\u00c1\3\2\2\2-\u00cb\3"+
		"\2\2\2/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2"+
		"\2\67\u00df\3\2\2\29\u00e5\3\2\2\2;\u00eb\3\2\2\2=\u00ed\3\2\2\2?\u00f1"+
		"\3\2\2\2A\u00f5\3\2\2\2C\u00f9\3\2\2\2E\u00fb\3\2\2\2G\u0102\3\2\2\2I"+
		"\u0105\3\2\2\2K\u010b\3\2\2\2M\u010d\3\2\2\2O\u0112\3\2\2\2Q\u0118\3\2"+
		"\2\2S\u011c\3\2\2\2U\u0125\3\2\2\2WX\7e\2\2XY\7n\2\2YZ\7c\2\2Z[\7u\2\2"+
		"[\\\7u\2\2\\\4\3\2\2\2]^\7r\2\2^_\7t\2\2_`\7q\2\2`a\7i\2\2ab\7t\2\2bc"+
		"\7c\2\2cd\7o\2\2d\6\3\2\2\2ef\7k\2\2fg\7p\2\2gp\7v\2\2hi\7d\2\2ij\7q\2"+
		"\2jk\7q\2\2kl\7n\2\2lm\7g\2\2mn\7c\2\2np\7p\2\2oe\3\2\2\2oh\3\2\2\2p\b"+
		"\3\2\2\2qu\5=\37\2rt\5? \2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\n"+
		"\3\2\2\2wu\3\2\2\2xy\7k\2\2yz\7h\2\2z\f\3\2\2\2{|\7g\2\2|}\7n\2\2}~\7"+
		"u\2\2~\177\7g\2\2\177\16\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7y\2\2"+
		"\u0082\u0083\7k\2\2\u0083\u0084\7v\2\2\u0084\u0085\7e\2\2\u0085\u0086"+
		"\7j\2\2\u0086\20\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7c\2\2\u0089\u008a"+
		"\7u\2\2\u008a\u008b\7g\2\2\u008b\22\3\2\2\2\u008c\u008d\7y\2\2\u008d\u008e"+
		"\7j\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091"+
		"\24\3\2\2\2\u0092\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7w\2\2\u0096\u0097\7t\2\2\u0097\u0098\7p\2\2\u0098\26\3\2\2\2\u0099"+
		"\u009a\7d\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2"+
		"\u009d\u009e\7m\2\2\u009e\30\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7"+
		"q\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5"+
		"\7p\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7g\2\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\7}\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7\177\2\2\u00ab\36\3\2\2\2\u00ac"+
		"\u00ad\7*\2\2\u00ad \3\2\2\2\u00ae\u00af\7+\2\2\u00af\"\3\2\2\2\u00b0"+
		"\u00b1\7]\2\2\u00b1$\3\2\2\2\u00b2\u00b3\7_\2\2\u00b3&\3\2\2\2\u00b4\u00b5"+
		"\7x\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7f\2\2\u00b8"+
		"(\3\2\2\2\u00b9\u00bb\7\17\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\b\25\2\2\u00bf*\3\2\2\2\u00c0\u00c2\t\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\b\26\2\2\u00c6,\3\2\2\2\u00c7\u00cc\5\65\33\2\u00c8\u00cc"+
		"\5\67\34\2\u00c9\u00cc\59\35\2\u00ca\u00cc\5;\36\2\u00cb\u00c7\3\2\2\2"+
		"\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc.\3"+
		"\2\2\2\u00cd\u00d3\7?\2\2\u00ce\u00cf\7-\2\2\u00cf\u00d3\7?\2\2\u00d0"+
		"\u00d1\7/\2\2\u00d1\u00d3\7?\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2"+
		"\2\u00d2\u00d0\3\2\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7.\2\2\u00d5\62\3"+
		"\2\2\2\u00d6\u00d7\7=\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\t\3\2\2\u00d9\66"+
		"\3\2\2\2\u00da\u00e0\t\4\2\2\u00db\u00dc\7>\2\2\u00dc\u00e0\7?\2\2\u00dd"+
		"\u00de\7@\2\2\u00de\u00e0\7?\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2"+
		"\2\u00df\u00dd\3\2\2\2\u00e08\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e6\7"+
		"?\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e6\7?\2\2\u00e5\u00e1\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7(\2\2\u00e8\u00ec\7(\2\2\u00e9"+
		"\u00ea\7~\2\2\u00ea\u00ec\7~\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2"+
		"\2\u00ec<\3\2\2\2\u00ed\u00ee\t\5\2\2\u00ee>\3\2\2\2\u00ef\u00f2\5=\37"+
		"\2\u00f0\u00f2\5G$\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2@\3"+
		"\2\2\2\u00f3\u00f6\5I%\2\u00f4\u00f6\5E#\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6B\3\2\2\2\u00f7\u00fa\5G$\2\u00f8\u00fa\t\6\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00f8\3\2\2\2\u00faD\3\2\2\2\u00fb\u00fc\7\62\2\2\u00fc"+
		"\u00fe\7z\2\2\u00fd\u00ff\5C\"\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101F\3\2\2\2\u0102\u0103"+
		"\t\7\2\2\u0103H\3\2\2\2\u0104\u0106\5G$\2\u0105\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108J\3\2\2\2\u0109"+
		"\u010c\5M\'\2\u010a\u010c\5O(\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2"+
		"\2\u010cL\3\2\2\2\u010d\u010e\7v\2\2\u010e\u010f\7t\2\2\u010f\u0110\7"+
		"w\2\2\u0110\u0111\7g\2\2\u0111N\3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114"+
		"\7c\2\2\u0114\u0115\7n\2\2\u0115\u0116\7u\2\2\u0116\u0117\7g\2\2\u0117"+
		"P\3\2\2\2\u0118\u0119\7)\2\2\u0119\u011a\5U+\2\u011a\u011b\7)\2\2\u011b"+
		"R\3\2\2\2\u011c\u0120\7$\2\2\u011d\u011f\5U+\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7$\2\2\u0124T\3\2\2\2\u0125\u0126"+
		"\13\2\2\2\u0126V\3\2\2\2\23\2ou\u00ba\u00c3\u00cb\u00d2\u00df\u00e5\u00eb"+
		"\u00f1\u00f5\u00f9\u0100\u0107\u010b\u0120\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}