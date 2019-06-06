// Generated from MiniSql.g4 by ANTLR 4.7.2

package interpreter.antlrparser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT_LITERAL=6, FLOAT_LITERAL=7, 
		STRING_LITERAL=8, DIGIT=9, CREATE=10, TABLE=11, PRIMARY=12, KEY=13, UNIQUE=14, 
		INT=15, CHAR=16, FLOAT=17, DROP=18, INDEX=19, ON=20, SELECT=21, WHERE=22, 
		FROM=23, AND=24, INSERT=25, INTO=26, DELETE=27, VALUES=28, QUIT=29, EXECFILE=30, 
		OP=31, EQUAL=32, NOT_EQUAL=33, GREATER=34, LESS=35, GREATER_OR_EQUAL=36, 
		LESS_OR_EQUAL=37, NAME_IDENTIFIER=38, WHITE_SPACE=39, LINE_COMMENT=40, 
		COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT_LITERAL", "FLOAT_LITERAL", 
			"STRING_LITERAL", "DIGIT", "CREATE", "TABLE", "PRIMARY", "KEY", "UNIQUE", 
			"INT", "CHAR", "FLOAT", "DROP", "INDEX", "ON", "SELECT", "WHERE", "FROM", 
			"AND", "INSERT", "INTO", "DELETE", "VALUES", "QUIT", "EXECFILE", "OP", 
			"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "GREATER_OR_EQUAL", "LESS_OR_EQUAL", 
			"NAME_IDENTIFIER", "WHITE_SPACE", "LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'*'", "'and'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'='", "'<>'", 
			"'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"DIGIT", "CREATE", "TABLE", "PRIMARY", "KEY", "UNIQUE", "INT", "CHAR", 
			"FLOAT", "DROP", "INDEX", "ON", "SELECT", "WHERE", "FROM", "AND", "INSERT", 
			"INTO", "DELETE", "VALUES", "QUIT", "EXECFILE", "OP", "EQUAL", "NOT_EQUAL", 
			"GREATER", "LESS", "GREATER_OR_EQUAL", "LESS_OR_EQUAL", "NAME_IDENTIFIER", 
			"WHITE_SPACE", "LINE_COMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	    //added component of generated class


	public MiniSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniSql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\5\7c\n\7\3\7\6\7f\n\7\r\7"+
		"\16\7g\3\b\5\bk\n\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\5\bt\n\b\3\b\6\bw"+
		"\n\b\r\b\16\bx\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0093"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00af\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00c5\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00cd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d7\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e3\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ed\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f9\n\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00ff\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u010d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0119\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0123\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012b\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0139\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0143\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0151\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u015f\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0169\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u017b\n\37\3 \3 \3"+
		" \3 \3 \3 \5 \u0183\n \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\7\'\u0196\n\'\f\'\16\'\u0199\13\'\3(\6(\u019c\n(\r(\16(\u019d"+
		"\3(\3(\3)\3)\3)\3)\7)\u01a6\n)\f)\16)\u01a9\13)\3)\3)\3*\3*\3*\3*\7*\u01b1"+
		"\n*\f*\16*\u01b4\13*\3*\3*\3*\3*\3*\3\u01b2\2+\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+\3\2\t\4\2--//\f\2\13\13\"\"*+/\61<<C\\^^aac|\u0080\u0080\3\2\62"+
		";\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u01df\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2"+
		"\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\rb\3\2\2\2\17j\3\2\2"+
		"\2\21z\3\2\2\2\23\u0084\3\2\2\2\25\u0092\3\2\2\2\27\u009e\3\2\2\2\31\u00ae"+
		"\3\2\2\2\33\u00b6\3\2\2\2\35\u00c4\3\2\2\2\37\u00cc\3\2\2\2!\u00d6\3\2"+
		"\2\2#\u00e2\3\2\2\2%\u00ec\3\2\2\2\'\u00f8\3\2\2\2)\u00fe\3\2\2\2+\u010c"+
		"\3\2\2\2-\u0118\3\2\2\2/\u0122\3\2\2\2\61\u012a\3\2\2\2\63\u0138\3\2\2"+
		"\2\65\u0142\3\2\2\2\67\u0150\3\2\2\29\u015e\3\2\2\2;\u0168\3\2\2\2=\u017a"+
		"\3\2\2\2?\u0182\3\2\2\2A\u0184\3\2\2\2C\u0186\3\2\2\2E\u0189\3\2\2\2G"+
		"\u018b\3\2\2\2I\u018d\3\2\2\2K\u0190\3\2\2\2M\u0193\3\2\2\2O\u019b\3\2"+
		"\2\2Q\u01a1\3\2\2\2S\u01ac\3\2\2\2UV\7*\2\2V\4\3\2\2\2WX\7+\2\2X\6\3\2"+
		"\2\2YZ\7.\2\2Z\b\3\2\2\2[\\\7,\2\2\\\n\3\2\2\2]^\7c\2\2^_\7p\2\2_`\7f"+
		"\2\2`\f\3\2\2\2ac\t\2\2\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\23\n\2ed\3"+
		"\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\16\3\2\2\2ik\t\2\2\2ji\3\2\2\2j"+
		"k\3\2\2\2ko\3\2\2\2ln\5\23\n\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"ps\3\2\2\2qo\3\2\2\2rt\7\60\2\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5\23\n"+
		"\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\20\3\2\2\2z\177\7)\2\2{~\5"+
		"\23\n\2|~\t\3\2\2}{\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7)\2"+
		"\2\u0083\22\3\2\2\2\u0084\u0085\t\4\2\2\u0085\24\3\2\2\2\u0086\u0087\7"+
		"e\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u0093\7g\2\2\u008c\u008d\7E\2\2\u008d\u008e\7T\2\2\u008e"+
		"\u008f\7G\2\2\u008f\u0090\7C\2\2\u0090\u0091\7V\2\2\u0091\u0093\7G\2\2"+
		"\u0092\u0086\3\2\2\2\u0092\u008c\3\2\2\2\u0093\26\3\2\2\2\u0094\u0095"+
		"\7v\2\2\u0095\u0096\7c\2\2\u0096\u0097\7d\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u009f\7g\2\2\u0099\u009a\7V\2\2\u009a\u009b\7C\2\2\u009b\u009c\7D\2\2"+
		"\u009c\u009d\7N\2\2\u009d\u009f\7G\2\2\u009e\u0094\3\2\2\2\u009e\u0099"+
		"\3\2\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\u00a3\7k\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7t\2\2"+
		"\u00a6\u00af\7{\2\2\u00a7\u00a8\7R\2\2\u00a8\u00a9\7T\2\2\u00a9\u00aa"+
		"\7K\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\7T\2\2\u00ad"+
		"\u00af\7[\2\2\u00ae\u00a0\3\2\2\2\u00ae\u00a7\3\2\2\2\u00af\32\3\2\2\2"+
		"\u00b0\u00b1\7m\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b7\7{\2\2\u00b3\u00b4"+
		"\7M\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b7\7[\2\2\u00b6\u00b0\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7p\2\2"+
		"\u00ba\u00bb\7k\2\2\u00bb\u00bc\7s\2\2\u00bc\u00bd\7w\2\2\u00bd\u00c5"+
		"\7g\2\2\u00be\u00bf\7W\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1\7K\2\2\u00c1"+
		"\u00c2\7S\2\2\u00c2\u00c3\7W\2\2\u00c3\u00c5\7G\2\2\u00c4\u00b8\3\2\2"+
		"\2\u00c4\u00be\3\2\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00cd\7v\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7P\2\2\u00cb"+
		"\u00cd\7V\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd \3\2\2\2\u00ce"+
		"\u00cf\7e\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d7\7t\2\2"+
		"\u00d2\u00d3\7E\2\2\u00d3\u00d4\7J\2\2\u00d4\u00d5\7C\2\2\u00d5\u00d7"+
		"\7T\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7\"\3\2\2\2\u00d8"+
		"\u00d9\7h\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7c\2\2"+
		"\u00dc\u00e3\7v\2\2\u00dd\u00de\7H\2\2\u00de\u00df\7N\2\2\u00df\u00e0"+
		"\7Q\2\2\u00e0\u00e1\7C\2\2\u00e1\u00e3\7V\2\2\u00e2\u00d8\3\2\2\2\u00e2"+
		"\u00dd\3\2\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00ed\7r\2\2\u00e8\u00e9\7F\2\2\u00e9\u00ea\7T\2\2"+
		"\u00ea\u00eb\7Q\2\2\u00eb\u00ed\7R\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e8"+
		"\3\2\2\2\u00ed&\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7f\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f9\7z\2\2\u00f3\u00f4\7K\2\2\u00f4"+
		"\u00f5\7P\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f9\7Z\2\2"+
		"\u00f8\u00ee\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7"+
		"q\2\2\u00fb\u00ff\7p\2\2\u00fc\u00fd\7Q\2\2\u00fd\u00ff\7P\2\2\u00fe\u00fa"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff*\3\2\2\2\u0100\u0101\7u\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7n\2\2\u0103\u0104\7g\2\2\u0104\u0105\7e\2\2\u0105"+
		"\u010d\7v\2\2\u0106\u0107\7U\2\2\u0107\u0108\7G\2\2\u0108\u0109\7N\2\2"+
		"\u0109\u010a\7G\2\2\u010a\u010b\7E\2\2\u010b\u010d\7V\2\2\u010c\u0100"+
		"\3\2\2\2\u010c\u0106\3\2\2\2\u010d,\3\2\2\2\u010e\u010f\7y\2\2\u010f\u0110"+
		"\7j\2\2\u0110\u0111\7g\2\2\u0111\u0112\7t\2\2\u0112\u0119\7g\2\2\u0113"+
		"\u0114\7Y\2\2\u0114\u0115\7J\2\2\u0115\u0116\7G\2\2\u0116\u0117\7T\2\2"+
		"\u0117\u0119\7G\2\2\u0118\u010e\3\2\2\2\u0118\u0113\3\2\2\2\u0119.\3\2"+
		"\2\2\u011a\u011b\7H\2\2\u011b\u011c\7T\2\2\u011c\u011d\7Q\2\2\u011d\u0123"+
		"\7O\2\2\u011e\u011f\7h\2\2\u011f\u0120\7t\2\2\u0120\u0121\7q\2\2\u0121"+
		"\u0123\7o\2\2\u0122\u011a\3\2\2\2\u0122\u011e\3\2\2\2\u0123\60\3\2\2\2"+
		"\u0124\u0125\7c\2\2\u0125\u0126\7p\2\2\u0126\u012b\7f\2\2\u0127\u0128"+
		"\7C\2\2\u0128\u0129\7P\2\2\u0129\u012b\7F\2\2\u012a\u0124\3\2\2\2\u012a"+
		"\u0127\3\2\2\2\u012b\62\3\2\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2"+
		"\u012e\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130\u0131\7t\2\2\u0131\u0139"+
		"\7v\2\2\u0132\u0133\7K\2\2\u0133\u0134\7P\2\2\u0134\u0135\7U\2\2\u0135"+
		"\u0136\7G\2\2\u0136\u0137\7T\2\2\u0137\u0139\7V\2\2\u0138\u012c\3\2\2"+
		"\2\u0138\u0132\3\2\2\2\u0139\64\3\2\2\2\u013a\u013b\7k\2\2\u013b\u013c"+
		"\7p\2\2\u013c\u013d\7v\2\2\u013d\u0143\7q\2\2\u013e\u013f\7K\2\2\u013f"+
		"\u0140\7P\2\2\u0140\u0141\7V\2\2\u0141\u0143\7Q\2\2\u0142\u013a\3\2\2"+
		"\2\u0142\u013e\3\2\2\2\u0143\66\3\2\2\2\u0144\u0145\7f\2\2\u0145\u0146"+
		"\7g\2\2\u0146\u0147\7n\2\2\u0147\u0148\7g\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u0151\7g\2\2\u014a\u014b\7F\2\2\u014b\u014c\7G\2\2\u014c\u014d\7N\2\2"+
		"\u014d\u014e\7G\2\2\u014e\u014f\7V\2\2\u014f\u0151\7G\2\2\u0150\u0144"+
		"\3\2\2\2\u0150\u014a\3\2\2\2\u01518\3\2\2\2\u0152\u0153\7x\2\2\u0153\u0154"+
		"\7c\2\2\u0154\u0155\7n\2\2\u0155\u0156\7w\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u015f\7u\2\2\u0158\u0159\7X\2\2\u0159\u015a\7C\2\2\u015a\u015b\7N\2\2"+
		"\u015b\u015c\7W\2\2\u015c\u015d\7G\2\2\u015d\u015f\7U\2\2\u015e\u0152"+
		"\3\2\2\2\u015e\u0158\3\2\2\2\u015f:\3\2\2\2\u0160\u0161\7s\2\2\u0161\u0162"+
		"\7w\2\2\u0162\u0163\7k\2\2\u0163\u0169\7v\2\2\u0164\u0165\7S\2\2\u0165"+
		"\u0166\7W\2\2\u0166\u0167\7K\2\2\u0167\u0169\7V\2\2\u0168\u0160\3\2\2"+
		"\2\u0168\u0164\3\2\2\2\u0169<\3\2\2\2\u016a\u016b\7g\2\2\u016b\u016c\7"+
		"z\2\2\u016c\u016d\7g\2\2\u016d\u016e\7e\2\2\u016e\u016f\7h\2\2\u016f\u0170"+
		"\7k\2\2\u0170\u0171\7n\2\2\u0171\u017b\7g\2\2\u0172\u0173\7G\2\2\u0173"+
		"\u0174\7Z\2\2\u0174\u0175\7G\2\2\u0175\u0176\7E\2\2\u0176\u0177\7H\2\2"+
		"\u0177\u0178\7K\2\2\u0178\u0179\7N\2\2\u0179\u017b\7G\2\2\u017a\u016a"+
		"\3\2\2\2\u017a\u0172\3\2\2\2\u017b>\3\2\2\2\u017c\u0183\5A!\2\u017d\u0183"+
		"\5C\"\2\u017e\u0183\5E#\2\u017f\u0183\5G$\2\u0180\u0183\5I%\2\u0181\u0183"+
		"\5K&\2\u0182\u017c\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0182"+
		"\u017f\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183@\3\2\2\2"+
		"\u0184\u0185\7?\2\2\u0185B\3\2\2\2\u0186\u0187\7>\2\2\u0187\u0188\7@\2"+
		"\2\u0188D\3\2\2\2\u0189\u018a\7@\2\2\u018aF\3\2\2\2\u018b\u018c\7>\2\2"+
		"\u018cH\3\2\2\2\u018d\u018e\7@\2\2\u018e\u018f\7?\2\2\u018fJ\3\2\2\2\u0190"+
		"\u0191\7>\2\2\u0191\u0192\7?\2\2\u0192L\3\2\2\2\u0193\u0197\t\5\2\2\u0194"+
		"\u0196\t\6\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198N\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c"+
		"\t\7\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b(\2\2\u01a0P\3\2\2\2\u01a1"+
		"\u01a2\7/\2\2\u01a2\u01a3\7/\2\2\u01a3\u01a7\3\2\2\2\u01a4\u01a6\n\b\2"+
		"\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\b)\2\2\u01ab"+
		"R\3\2\2\2\u01ac\u01ad\7\61\2\2\u01ad\u01ae\7,\2\2\u01ae\u01b2\3\2\2\2"+
		"\u01af\u01b1\13\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01b6\7,\2\2\u01b6\u01b7\7\61\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\b*"+
		"\2\2\u01b9T\3\2\2\2%\2bgjosx}\177\u0092\u009e\u00ae\u00b6\u00c4\u00cc"+
		"\u00d6\u00e2\u00ec\u00f8\u00fe\u010c\u0118\u0122\u012a\u0138\u0142\u0150"+
		"\u015e\u0168\u017a\u0182\u0197\u019d\u01a7\u01b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}