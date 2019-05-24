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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT_LITERAL=7, STRING_LITERAL=8, 
		DIGIT=9, CREATE=10, TABLE=11, PRIMARY=12, KEY=13, UNIQUE=14, INT=15, CHAR=16, 
		FLOAT=17, DROP=18, INDEX=19, ON=20, SELECT=21, WHERE=22, FROM=23, AND=24, 
		INSERT=25, INTO=26, DELETE=27, VALUES=28, QUIT=29, EXECFILE=30, OP=31, 
		EQUAL=32, NOT_EQUAL=33, GREATER=34, LESS=35, GREATER_OR_EQUAL=36, LESS_OR_EQUAL=37, 
		NAME_IDENTIFIER=38, WHITE_SPACE=39, LINE_COMMENT=40, COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT_LITERAL", "STRING_LITERAL", 
			"DIGIT", "CREATE", "TABLE", "PRIMARY", "KEY", "UNIQUE", "INT", "CHAR", 
			"FLOAT", "DROP", "INDEX", "ON", "SELECT", "WHERE", "FROM", "AND", "INSERT", 
			"INTO", "DELETE", "VALUES", "QUIT", "EXECFILE", "OP", "EQUAL", "NOT_EQUAL", 
			"GREATER", "LESS", "GREATER_OR_EQUAL", "LESS_OR_EQUAL", "NAME_IDENTIFIER", 
			"WHITE_SPACE", "LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "','", "'*'", "'and'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'='", "'<>'", 
			"'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INT_LITERAL", "STRING_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\5\be\n\b\3\b\6\b"+
		"h\n\b\r\b\16\bi\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0084"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00a8\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00be\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c8\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00de\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ea\n\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00f0\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00fe\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u010a\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0114\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u011c\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012a\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0134\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0142\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0150\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u015a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016c\n\37\3 \3 \3"+
		" \3 \3 \3 \5 \u0174\n \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\7\'\u0187\n\'\f\'\16\'\u018a\13\'\3(\6(\u018d\n(\r(\16(\u018e"+
		"\3(\3(\3)\3)\3)\3)\7)\u0197\n)\f)\16)\u019a\13)\3)\3)\3*\3*\3*\3*\7*\u01a2"+
		"\n*\f*\16*\u01a5\13*\3*\3*\3*\3*\3*\3\u01a3\2+\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+\3\2\t\4\2--//\n\2\13\13\"\"\60\61<<C\\^^aac|\3\2\62;\4\2C\\c|\5"+
		"\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u01cc\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2"+
		"\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17d\3\2\2\2\21k\3\2\2"+
		"\2\23u\3\2\2\2\25\u0083\3\2\2\2\27\u008f\3\2\2\2\31\u009f\3\2\2\2\33\u00a7"+
		"\3\2\2\2\35\u00b5\3\2\2\2\37\u00bd\3\2\2\2!\u00c7\3\2\2\2#\u00d3\3\2\2"+
		"\2%\u00dd\3\2\2\2\'\u00e9\3\2\2\2)\u00ef\3\2\2\2+\u00fd\3\2\2\2-\u0109"+
		"\3\2\2\2/\u0113\3\2\2\2\61\u011b\3\2\2\2\63\u0129\3\2\2\2\65\u0133\3\2"+
		"\2\2\67\u0141\3\2\2\29\u014f\3\2\2\2;\u0159\3\2\2\2=\u016b\3\2\2\2?\u0173"+
		"\3\2\2\2A\u0175\3\2\2\2C\u0177\3\2\2\2E\u017a\3\2\2\2G\u017c\3\2\2\2I"+
		"\u017e\3\2\2\2K\u0181\3\2\2\2M\u0184\3\2\2\2O\u018c\3\2\2\2Q\u0192\3\2"+
		"\2\2S\u019d\3\2\2\2UV\7*\2\2V\4\3\2\2\2WX\7+\2\2X\6\3\2\2\2YZ\7=\2\2Z"+
		"\b\3\2\2\2[\\\7.\2\2\\\n\3\2\2\2]^\7,\2\2^\f\3\2\2\2_`\7c\2\2`a\7p\2\2"+
		"ab\7f\2\2b\16\3\2\2\2ce\t\2\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\23\n"+
		"\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\20\3\2\2\2kp\7)\2\2lo\5\23"+
		"\n\2mo\t\3\2\2nl\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2"+
		"\2\2rp\3\2\2\2st\7)\2\2t\22\3\2\2\2uv\t\4\2\2v\24\3\2\2\2wx\7e\2\2xy\7"+
		"t\2\2yz\7g\2\2z{\7c\2\2{|\7v\2\2|\u0084\7g\2\2}~\7E\2\2~\177\7T\2\2\177"+
		"\u0080\7G\2\2\u0080\u0081\7C\2\2\u0081\u0082\7V\2\2\u0082\u0084\7G\2\2"+
		"\u0083w\3\2\2\2\u0083}\3\2\2\2\u0084\26\3\2\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7d\2\2\u0088\u0089\7n\2\2\u0089\u0090\7g\2\2"+
		"\u008a\u008b\7V\2\2\u008b\u008c\7C\2\2\u008c\u008d\7D\2\2\u008d\u008e"+
		"\7N\2\2\u008e\u0090\7G\2\2\u008f\u0085\3\2\2\2\u008f\u008a\3\2\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7o\2\2\u0095\u0096\7c\2\2\u0096\u0097\7t\2\2\u0097\u00a0\7{\2\2"+
		"\u0098\u0099\7R\2\2\u0099\u009a\7T\2\2\u009a\u009b\7K\2\2\u009b\u009c"+
		"\7O\2\2\u009c\u009d\7C\2\2\u009d\u009e\7T\2\2\u009e\u00a0\7[\2\2\u009f"+
		"\u0091\3\2\2\2\u009f\u0098\3\2\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7m\2\2"+
		"\u00a2\u00a3\7g\2\2\u00a3\u00a8\7{\2\2\u00a4\u00a5\7M\2\2\u00a5\u00a6"+
		"\7G\2\2\u00a6\u00a8\7[\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8"+
		"\34\3\2\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7s\2\2\u00ad\u00ae\7w\2\2\u00ae\u00b6\7g\2\2\u00af\u00b0\7W\2\2"+
		"\u00b0\u00b1\7P\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7S\2\2\u00b3\u00b4"+
		"\7W\2\2\u00b4\u00b6\7G\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00af\3\2\2\2\u00b6"+
		"\36\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00be\7v\2\2\u00ba"+
		"\u00bb\7K\2\2\u00bb\u00bc\7P\2\2\u00bc\u00be\7V\2\2\u00bd\u00b7\3\2\2"+
		"\2\u00bd\u00ba\3\2\2\2\u00be \3\2\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7"+
		"j\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c8\7t\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c5"+
		"\7J\2\2\u00c5\u00c6\7C\2\2\u00c6\u00c8\7T\2\2\u00c7\u00bf\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7q\2\2\u00cc\u00cd\7c\2\2\u00cd\u00d4\7v\2\2\u00ce\u00cf\7H\2\2"+
		"\u00cf\u00d0\7N\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d4"+
		"\7V\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4$\3\2\2\2\u00d5\u00d6"+
		"\7f\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7q\2\2\u00d8\u00de\7r\2\2\u00d9"+
		"\u00da\7F\2\2\u00da\u00db\7T\2\2\u00db\u00dc\7Q\2\2\u00dc\u00de\7R\2\2"+
		"\u00dd\u00d5\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de&\3\2\2\2\u00df\u00e0\7"+
		"k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7g\2\2\u00e3\u00ea"+
		"\7z\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7\7F\2\2\u00e7"+
		"\u00e8\7G\2\2\u00e8\u00ea\7Z\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e4\3\2\2"+
		"\2\u00ea(\3\2\2\2\u00eb\u00ec\7q\2\2\u00ec\u00f0\7p\2\2\u00ed\u00ee\7"+
		"Q\2\2\u00ee\u00f0\7P\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"*\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7e\2\2\u00f6\u00fe\7v\2\2\u00f7\u00f8\7U\2\2"+
		"\u00f8\u00f9\7G\2\2\u00f9\u00fa\7N\2\2\u00fa\u00fb\7G\2\2\u00fb\u00fc"+
		"\7E\2\2\u00fc\u00fe\7V\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fe"+
		",\3\2\2\2\u00ff\u0100\7y\2\2\u0100\u0101\7j\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7t\2\2\u0103\u010a\7g\2\2\u0104\u0105\7Y\2\2\u0105\u0106\7J\2\2"+
		"\u0106\u0107\7G\2\2\u0107\u0108\7T\2\2\u0108\u010a\7G\2\2\u0109\u00ff"+
		"\3\2\2\2\u0109\u0104\3\2\2\2\u010a.\3\2\2\2\u010b\u010c\7H\2\2\u010c\u010d"+
		"\7T\2\2\u010d\u010e\7Q\2\2\u010e\u0114\7O\2\2\u010f\u0110\7h\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7q\2\2\u0112\u0114\7o\2\2\u0113\u010b\3\2\2"+
		"\2\u0113\u010f\3\2\2\2\u0114\60\3\2\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7p\2\2\u0117\u011c\7f\2\2\u0118\u0119\7C\2\2\u0119\u011a\7P\2\2\u011a"+
		"\u011c\7F\2\2\u011b\u0115\3\2\2\2\u011b\u0118\3\2\2\2\u011c\62\3\2\2\2"+
		"\u011d\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7u\2\2\u0120\u0121"+
		"\7g\2\2\u0121\u0122\7t\2\2\u0122\u012a\7v\2\2\u0123\u0124\7K\2\2\u0124"+
		"\u0125\7P\2\2\u0125\u0126\7U\2\2\u0126\u0127\7G\2\2\u0127\u0128\7T\2\2"+
		"\u0128\u012a\7V\2\2\u0129\u011d\3\2\2\2\u0129\u0123\3\2\2\2\u012a\64\3"+
		"\2\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u012e\7v\2\2\u012e"+
		"\u0134\7q\2\2\u012f\u0130\7K\2\2\u0130\u0131\7P\2\2\u0131\u0132\7V\2\2"+
		"\u0132\u0134\7Q\2\2\u0133\u012b\3\2\2\2\u0133\u012f\3\2\2\2\u0134\66\3"+
		"\2\2\2\u0135\u0136\7f\2\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2\2\u0138"+
		"\u0139\7g\2\2\u0139\u013a\7v\2\2\u013a\u0142\7g\2\2\u013b\u013c\7F\2\2"+
		"\u013c\u013d\7G\2\2\u013d\u013e\7N\2\2\u013e\u013f\7G\2\2\u013f\u0140"+
		"\7V\2\2\u0140\u0142\7G\2\2\u0141\u0135\3\2\2\2\u0141\u013b\3\2\2\2\u0142"+
		"8\3\2\2\2\u0143\u0144\7x\2\2\u0144\u0145\7c\2\2\u0145\u0146\7n\2\2\u0146"+
		"\u0147\7w\2\2\u0147\u0148\7g\2\2\u0148\u0150\7u\2\2\u0149\u014a\7X\2\2"+
		"\u014a\u014b\7C\2\2\u014b\u014c\7N\2\2\u014c\u014d\7W\2\2\u014d\u014e"+
		"\7G\2\2\u014e\u0150\7U\2\2\u014f\u0143\3\2\2\2\u014f\u0149\3\2\2\2\u0150"+
		":\3\2\2\2\u0151\u0152\7s\2\2\u0152\u0153\7w\2\2\u0153\u0154\7k\2\2\u0154"+
		"\u015a\7v\2\2\u0155\u0156\7S\2\2\u0156\u0157\7W\2\2\u0157\u0158\7K\2\2"+
		"\u0158\u015a\7V\2\2\u0159\u0151\3\2\2\2\u0159\u0155\3\2\2\2\u015a<\3\2"+
		"\2\2\u015b\u015c\7g\2\2\u015c\u015d\7z\2\2\u015d\u015e\7g\2\2\u015e\u015f"+
		"\7e\2\2\u015f\u0160\7h\2\2\u0160\u0161\7k\2\2\u0161\u0162\7n\2\2\u0162"+
		"\u016c\7g\2\2\u0163\u0164\7G\2\2\u0164\u0165\7Z\2\2\u0165\u0166\7G\2\2"+
		"\u0166\u0167\7E\2\2\u0167\u0168\7H\2\2\u0168\u0169\7K\2\2\u0169\u016a"+
		"\7N\2\2\u016a\u016c\7G\2\2\u016b\u015b\3\2\2\2\u016b\u0163\3\2\2\2\u016c"+
		">\3\2\2\2\u016d\u0174\5A!\2\u016e\u0174\5C\"\2\u016f\u0174\5E#\2\u0170"+
		"\u0174\5G$\2\u0171\u0174\5I%\2\u0172\u0174\5K&\2\u0173\u016d\3\2\2\2\u0173"+
		"\u016e\3\2\2\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0172\3\2\2\2\u0174@\3\2\2\2\u0175\u0176\7?\2\2\u0176B\3\2"+
		"\2\2\u0177\u0178\7>\2\2\u0178\u0179\7@\2\2\u0179D\3\2\2\2\u017a\u017b"+
		"\7@\2\2\u017bF\3\2\2\2\u017c\u017d\7>\2\2\u017dH\3\2\2\2\u017e\u017f\7"+
		"@\2\2\u017f\u0180\7?\2\2\u0180J\3\2\2\2\u0181\u0182\7>\2\2\u0182\u0183"+
		"\7?\2\2\u0183L\3\2\2\2\u0184\u0188\t\5\2\2\u0185\u0187\t\6\2\2\u0186\u0185"+
		"\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"N\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\t\7\2\2\u018c\u018b\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\b(\2\2\u0191P\3\2\2\2\u0192\u0193\7\61\2\2\u0193"+
		"\u0194\7\61\2\2\u0194\u0198\3\2\2\2\u0195\u0197\n\b\2\2\u0196\u0195\3"+
		"\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\b)\2\2\u019cR\3\2\2\2\u019d"+
		"\u019e\7\61\2\2\u019e\u019f\7,\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\13"+
		"\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7,"+
		"\2\2\u01a7\u01a8\7\61\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b*\2\2\u01aa"+
		"T\3\2\2\2!\2dinp\u0083\u008f\u009f\u00a7\u00b5\u00bd\u00c7\u00d3\u00dd"+
		"\u00e9\u00ef\u00fd\u0109\u0113\u011b\u0129\u0133\u0141\u014f\u0159\u016b"+
		"\u0173\u0188\u018e\u0198\u01a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}