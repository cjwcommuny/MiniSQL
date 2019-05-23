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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT_LITERAL=6, STRING_LITERAL=7, 
		DIGIT=8, CREATE=9, TABLE=10, PRIMARY=11, KEY=12, UNIQUE=13, INT=14, CHAR=15, 
		FLOAT=16, DROP=17, INDEX=18, ON=19, SELECT=20, WHERE=21, FROM=22, AND=23, 
		INSERT=24, INTO=25, DELETE=26, VALUES=27, QUIT=28, EXECFILE=29, OP=30, 
		EQUAL=31, NOT_EQUAL=32, GREATER=33, LESS=34, GREATER_OR_EQUAL=35, LESS_OR_EQUAL=36, 
		NAME_IDENTIFIER=37, WHITE_SPACE=38, LINE_COMMENT=39, COMMENT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT_LITERAL", "STRING_LITERAL", 
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
			null, "'('", "')'", "';'", "','", "'*'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'='", "'<>'", "'>'", 
			"'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT_LITERAL", "STRING_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u01a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7_\n\7\3\7\6\7b\n\7\r\7\16\7c\3\b\3\b"+
		"\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a2\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b0\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b8\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00c2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00ce\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00d8\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e4"+
		"\n\23\3\24\3\24\3\24\3\24\5\24\u00ea\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f8\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0104\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u010e\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0116\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0124"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012e\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013c\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014a\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0154\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0166\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016e\n\37\3 \3 \3!\3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\7&\u0181\n&\f&\16&\u0184\13"+
		"&\3\'\6\'\u0187\n\'\r\'\16\'\u0188\3\'\3\'\3(\3(\3(\3(\7(\u0191\n(\f("+
		"\16(\u0194\13(\3(\3(\3)\3)\3)\3)\7)\u019c\n)\f)\16)\u019f\13)\3)\3)\3"+
		")\3)\3)\3\u019d\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\t\4\2--//\n\2\13\13\""+
		"\"\60\61<<C\\^^aac|\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\2\u01c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r^\3"+
		"\2\2\2\17e\3\2\2\2\21o\3\2\2\2\23}\3\2\2\2\25\u0089\3\2\2\2\27\u0099\3"+
		"\2\2\2\31\u00a1\3\2\2\2\33\u00af\3\2\2\2\35\u00b7\3\2\2\2\37\u00c1\3\2"+
		"\2\2!\u00cd\3\2\2\2#\u00d7\3\2\2\2%\u00e3\3\2\2\2\'\u00e9\3\2\2\2)\u00f7"+
		"\3\2\2\2+\u0103\3\2\2\2-\u010d\3\2\2\2/\u0115\3\2\2\2\61\u0123\3\2\2\2"+
		"\63\u012d\3\2\2\2\65\u013b\3\2\2\2\67\u0149\3\2\2\29\u0153\3\2\2\2;\u0165"+
		"\3\2\2\2=\u016d\3\2\2\2?\u016f\3\2\2\2A\u0171\3\2\2\2C\u0174\3\2\2\2E"+
		"\u0176\3\2\2\2G\u0178\3\2\2\2I\u017b\3\2\2\2K\u017e\3\2\2\2M\u0186\3\2"+
		"\2\2O\u018c\3\2\2\2Q\u0197\3\2\2\2ST\7*\2\2T\4\3\2\2\2UV\7+\2\2V\6\3\2"+
		"\2\2WX\7=\2\2X\b\3\2\2\2YZ\7.\2\2Z\n\3\2\2\2[\\\7,\2\2\\\f\3\2\2\2]_\t"+
		"\2\2\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\21\t\2a`\3\2\2\2bc\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2d\16\3\2\2\2ej\7)\2\2fi\5\21\t\2gi\t\3\2\2hf\3\2\2\2"+
		"hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7)\2\2"+
		"n\20\3\2\2\2op\t\4\2\2p\22\3\2\2\2qr\7e\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2"+
		"uv\7v\2\2v~\7g\2\2wx\7E\2\2xy\7T\2\2yz\7G\2\2z{\7C\2\2{|\7V\2\2|~\7G\2"+
		"\2}q\3\2\2\2}w\3\2\2\2~\24\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2"+
		"\u0081\u0082\7d\2\2\u0082\u0083\7n\2\2\u0083\u008a\7g\2\2\u0084\u0085"+
		"\7V\2\2\u0085\u0086\7C\2\2\u0086\u0087\7D\2\2\u0087\u0088\7N\2\2\u0088"+
		"\u008a\7G\2\2\u0089\177\3\2\2\2\u0089\u0084\3\2\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7o\2\2"+
		"\u008f\u0090\7c\2\2\u0090\u0091\7t\2\2\u0091\u009a\7{\2\2\u0092\u0093"+
		"\7R\2\2\u0093\u0094\7T\2\2\u0094\u0095\7K\2\2\u0095\u0096\7O\2\2\u0096"+
		"\u0097\7C\2\2\u0097\u0098\7T\2\2\u0098\u009a\7[\2\2\u0099\u008b\3\2\2"+
		"\2\u0099\u0092\3\2\2\2\u009a\30\3\2\2\2\u009b\u009c\7m\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u00a2\7{\2\2\u009e\u009f\7M\2\2\u009f\u00a0\7G\2\2\u00a0"+
		"\u00a2\7[\2\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\32\3\2\2\2"+
		"\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7"+
		"\7s\2\2\u00a7\u00a8\7w\2\2\u00a8\u00b0\7g\2\2\u00a9\u00aa\7W\2\2\u00aa"+
		"\u00ab\7P\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7S\2\2\u00ad\u00ae\7W\2\2"+
		"\u00ae\u00b0\7G\2\2\u00af\u00a3\3\2\2\2\u00af\u00a9\3\2\2\2\u00b0\34\3"+
		"\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b8\7v\2\2\u00b4"+
		"\u00b5\7K\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b8\7V\2\2\u00b7\u00b1\3\2\2"+
		"\2\u00b7\u00b4\3\2\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb"+
		"\7j\2\2\u00bb\u00bc\7c\2\2\u00bc\u00c2\7t\2\2\u00bd\u00be\7E\2\2\u00be"+
		"\u00bf\7J\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c2\7T\2\2\u00c1\u00b9\3\2\2"+
		"\2\u00c1\u00bd\3\2\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7"+
		"n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7c\2\2\u00c7\u00ce\7v\2\2\u00c8\u00c9"+
		"\7H\2\2\u00c9\u00ca\7N\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00cc\7C\2\2\u00cc"+
		"\u00ce\7V\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\"\3\2\2\2"+
		"\u00cf\u00d0\7f\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d8"+
		"\7r\2\2\u00d3\u00d4\7F\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7Q\2\2\u00d6"+
		"\u00d8\7R\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8$\3\2\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00e4\7z\2\2\u00de\u00df\7K\2\2\u00df\u00e0\7P\2\2\u00e0\u00e1"+
		"\7F\2\2\u00e1\u00e2\7G\2\2\u00e2\u00e4\7Z\2\2\u00e3\u00d9\3\2\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7q\2\2\u00e6\u00ea\7p\2\2\u00e7"+
		"\u00e8\7Q\2\2\u00e8\u00ea\7P\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea(\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7"+
		"n\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f8\7v\2\2\u00f1\u00f2"+
		"\7U\2\2\u00f2\u00f3\7G\2\2\u00f3\u00f4\7N\2\2\u00f4\u00f5\7G\2\2\u00f5"+
		"\u00f6\7E\2\2\u00f6\u00f8\7V\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00f1\3\2\2"+
		"\2\u00f8*\3\2\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc\7"+
		"g\2\2\u00fc\u00fd\7t\2\2\u00fd\u0104\7g\2\2\u00fe\u00ff\7Y\2\2\u00ff\u0100"+
		"\7J\2\2\u0100\u0101\7G\2\2\u0101\u0102\7T\2\2\u0102\u0104\7G\2\2\u0103"+
		"\u00f9\3\2\2\2\u0103\u00fe\3\2\2\2\u0104,\3\2\2\2\u0105\u0106\7H\2\2\u0106"+
		"\u0107\7T\2\2\u0107\u0108\7Q\2\2\u0108\u010e\7O\2\2\u0109\u010a\7h\2\2"+
		"\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c\u010e\7o\2\2\u010d\u0105"+
		"\3\2\2\2\u010d\u0109\3\2\2\2\u010e.\3\2\2\2\u010f\u0110\7c\2\2\u0110\u0111"+
		"\7p\2\2\u0111\u0116\7f\2\2\u0112\u0113\7C\2\2\u0113\u0114\7P\2\2\u0114"+
		"\u0116\7F\2\2\u0115\u010f\3\2\2\2\u0115\u0112\3\2\2\2\u0116\60\3\2\2\2"+
		"\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a\7u\2\2\u011a\u011b"+
		"\7g\2\2\u011b\u011c\7t\2\2\u011c\u0124\7v\2\2\u011d\u011e\7K\2\2\u011e"+
		"\u011f\7P\2\2\u011f\u0120\7U\2\2\u0120\u0121\7G\2\2\u0121\u0122\7T\2\2"+
		"\u0122\u0124\7V\2\2\u0123\u0117\3\2\2\2\u0123\u011d\3\2\2\2\u0124\62\3"+
		"\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127\u0128\7v\2\2\u0128"+
		"\u012e\7q\2\2\u0129\u012a\7K\2\2\u012a\u012b\7P\2\2\u012b\u012c\7V\2\2"+
		"\u012c\u012e\7Q\2\2\u012d\u0125\3\2\2\2\u012d\u0129\3\2\2\2\u012e\64\3"+
		"\2\2\2\u012f\u0130\7f\2\2\u0130\u0131\7g\2\2\u0131\u0132\7n\2\2\u0132"+
		"\u0133\7g\2\2\u0133\u0134\7v\2\2\u0134\u013c\7g\2\2\u0135\u0136\7F\2\2"+
		"\u0136\u0137\7G\2\2\u0137\u0138\7N\2\2\u0138\u0139\7G\2\2\u0139\u013a"+
		"\7V\2\2\u013a\u013c\7G\2\2\u013b\u012f\3\2\2\2\u013b\u0135\3\2\2\2\u013c"+
		"\66\3\2\2\2\u013d\u013e\7x\2\2\u013e\u013f\7c\2\2\u013f\u0140\7n\2\2\u0140"+
		"\u0141\7w\2\2\u0141\u0142\7g\2\2\u0142\u014a\7u\2\2\u0143\u0144\7X\2\2"+
		"\u0144\u0145\7C\2\2\u0145\u0146\7N\2\2\u0146\u0147\7W\2\2\u0147\u0148"+
		"\7G\2\2\u0148\u014a\7U\2\2\u0149\u013d\3\2\2\2\u0149\u0143\3\2\2\2\u014a"+
		"8\3\2\2\2\u014b\u014c\7s\2\2\u014c\u014d\7w\2\2\u014d\u014e\7k\2\2\u014e"+
		"\u0154\7v\2\2\u014f\u0150\7S\2\2\u0150\u0151\7W\2\2\u0151\u0152\7K\2\2"+
		"\u0152\u0154\7V\2\2\u0153\u014b\3\2\2\2\u0153\u014f\3\2\2\2\u0154:\3\2"+
		"\2\2\u0155\u0156\7g\2\2\u0156\u0157\7z\2\2\u0157\u0158\7g\2\2\u0158\u0159"+
		"\7e\2\2\u0159\u015a\7h\2\2\u015a\u015b\7k\2\2\u015b\u015c\7n\2\2\u015c"+
		"\u0166\7g\2\2\u015d\u015e\7G\2\2\u015e\u015f\7Z\2\2\u015f\u0160\7G\2\2"+
		"\u0160\u0161\7E\2\2\u0161\u0162\7H\2\2\u0162\u0163\7K\2\2\u0163\u0164"+
		"\7N\2\2\u0164\u0166\7G\2\2\u0165\u0155\3\2\2\2\u0165\u015d\3\2\2\2\u0166"+
		"<\3\2\2\2\u0167\u016e\5? \2\u0168\u016e\5A!\2\u0169\u016e\5C\"\2\u016a"+
		"\u016e\5E#\2\u016b\u016e\5G$\2\u016c\u016e\5I%\2\u016d\u0167\3\2\2\2\u016d"+
		"\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016c\3\2\2\2\u016e>\3\2\2\2\u016f\u0170\7?\2\2\u0170@\3\2"+
		"\2\2\u0171\u0172\7>\2\2\u0172\u0173\7@\2\2\u0173B\3\2\2\2\u0174\u0175"+
		"\7@\2\2\u0175D\3\2\2\2\u0176\u0177\7>\2\2\u0177F\3\2\2\2\u0178\u0179\7"+
		"@\2\2\u0179\u017a\7?\2\2\u017aH\3\2\2\2\u017b\u017c\7>\2\2\u017c\u017d"+
		"\7?\2\2\u017dJ\3\2\2\2\u017e\u0182\t\5\2\2\u017f\u0181\t\6\2\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"L\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\t\7\2\2\u0186\u0185\3\2\2\2"+
		"\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\b\'\2\2\u018bN\3\2\2\2\u018c\u018d\7\61\2\2\u018d"+
		"\u018e\7\61\2\2\u018e\u0192\3\2\2\2\u018f\u0191\n\b\2\2\u0190\u018f\3"+
		"\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\b(\2\2\u0196P\3\2\2\2\u0197"+
		"\u0198\7\61\2\2\u0198\u0199\7,\2\2\u0199\u019d\3\2\2\2\u019a\u019c\13"+
		"\2\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7,"+
		"\2\2\u01a1\u01a2\7\61\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b)\2\2\u01a4"+
		"R\3\2\2\2!\2^chj}\u0089\u0099\u00a1\u00af\u00b7\u00c1\u00cd\u00d7\u00e3"+
		"\u00e9\u00f7\u0103\u010d\u0115\u0123\u012d\u013b\u0149\u0153\u0165\u016d"+
		"\u0182\u0188\u0192\u019d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}