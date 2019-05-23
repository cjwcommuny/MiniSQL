// Generated from MiniSql.g4 by ANTLR 4.7.2

package interpreter.antlrparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniSqlParser extends Parser {
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
	public static final int
		RULE_literal = 0, RULE_type_identifier = 1, RULE_instruction = 2, RULE_createTable = 3, 
		RULE_primaryKeyDefinition = 4, RULE_columnDefinition = 5, RULE_dropTable = 6, 
		RULE_createIndex = 7, RULE_dropIndex = 8, RULE_selectInstruction = 9, 
		RULE_condition = 10, RULE_insertTuple = 11, RULE_deleteTuple = 12, RULE_quit = 13, 
		RULE_executeFile = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "type_identifier", "instruction", "createTable", "primaryKeyDefinition", 
			"columnDefinition", "dropTable", "createIndex", "dropIndex", "selectInstruction", 
			"condition", "insertTuple", "deleteTuple", "quit", "executeFile"
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

	@Override
	public String getGrammarFileName() { return "MiniSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    //added component of generated class

	public MiniSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MiniSqlParser.STRING_LITERAL, 0); }
		public TerminalNode INT_LITERAL() { return getToken(MiniSqlParser.INT_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !(_la==INT_LITERAL || _la==STRING_LITERAL) ) {
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

	public static class Type_identifierContext extends ParserRuleContext {
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
	 
		public Type_identifierContext() { }
		public void copyFrom(Type_identifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatTypeContext extends Type_identifierContext {
		public TerminalNode FLOAT() { return getToken(MiniSqlParser.FLOAT, 0); }
		public FloatTypeContext(Type_identifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends Type_identifierContext {
		public TerminalNode INT() { return getToken(MiniSqlParser.INT, 0); }
		public IntTypeContext(Type_identifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharNTypeContext extends Type_identifierContext {
		public TerminalNode CHAR() { return getToken(MiniSqlParser.CHAR, 0); }
		public TerminalNode INT_LITERAL() { return getToken(MiniSqlParser.INT_LITERAL, 0); }
		public CharNTypeContext(Type_identifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterCharNType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitCharNType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitCharNType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type_identifier);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharNTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(CHAR);
				setState(35);
				match(T__0);
				setState(36);
				match(INT_LITERAL);
				setState(37);
				match(T__1);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public SelectInstructionContext selectInstruction() {
			return getRuleContext(SelectInstructionContext.class,0);
		}
		public InsertTupleContext insertTuple() {
			return getRuleContext(InsertTupleContext.class,0);
		}
		public DeleteTupleContext deleteTuple() {
			return getRuleContext(DeleteTupleContext.class,0);
		}
		public QuitContext quit() {
			return getRuleContext(QuitContext.class,0);
		}
		public ExecuteFileContext executeFile() {
			return getRuleContext(ExecuteFileContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				createTable();
				setState(41);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				dropTable();
				setState(44);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				createIndex();
				setState(47);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				dropIndex();
				setState(50);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				selectInstruction();
				setState(53);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				insertTuple();
				setState(56);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				deleteTuple();
				setState(59);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				quit();
				setState(62);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				executeFile();
				setState(65);
				match(T__2);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MiniSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MiniSqlParser.TABLE, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public PrimaryKeyDefinitionContext primaryKeyDefinition() {
			return getRuleContext(PrimaryKeyDefinitionContext.class,0);
		}
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CREATE);
			setState(70);
			match(TABLE);
			setState(71);
			match(NAME_IDENTIFIER);
			setState(72);
			match(T__0);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				columnDefinition();
				setState(74);
				match(T__3);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME_IDENTIFIER );
			setState(80);
			primaryKeyDefinition();
			setState(81);
			match(T__1);
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

	public static class PrimaryKeyDefinitionContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(MiniSqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(MiniSqlParser.KEY, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public PrimaryKeyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterPrimaryKeyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitPrimaryKeyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitPrimaryKeyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyDefinitionContext primaryKeyDefinition() throws RecognitionException {
		PrimaryKeyDefinitionContext _localctx = new PrimaryKeyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primaryKeyDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(PRIMARY);
			setState(84);
			match(KEY);
			setState(85);
			match(T__0);
			setState(86);
			match(NAME_IDENTIFIER);
			setState(87);
			match(T__1);
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(MiniSqlParser.UNIQUE, 0); }
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(NAME_IDENTIFIER);
			setState(90);
			type_identifier();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(91);
				match(UNIQUE);
				}
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MiniSqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MiniSqlParser.TABLE, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DROP);
			setState(95);
			match(TABLE);
			setState(96);
			match(NAME_IDENTIFIER);
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MiniSqlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(MiniSqlParser.INDEX, 0); }
		public List<TerminalNode> NAME_IDENTIFIER() { return getTokens(MiniSqlParser.NAME_IDENTIFIER); }
		public TerminalNode NAME_IDENTIFIER(int i) {
			return getToken(MiniSqlParser.NAME_IDENTIFIER, i);
		}
		public TerminalNode ON() { return getToken(MiniSqlParser.ON, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CREATE);
			setState(99);
			match(INDEX);
			setState(100);
			match(NAME_IDENTIFIER);
			setState(101);
			match(ON);
			setState(102);
			match(NAME_IDENTIFIER);
			setState(103);
			match(T__0);
			setState(104);
			match(NAME_IDENTIFIER);
			setState(105);
			match(T__1);
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MiniSqlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(MiniSqlParser.INDEX, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(DROP);
			setState(108);
			match(INDEX);
			setState(109);
			match(NAME_IDENTIFIER);
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

	public static class SelectInstructionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MiniSqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(MiniSqlParser.FROM, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public List<TerminalNode> WHERE() { return getTokens(MiniSqlParser.WHERE); }
		public TerminalNode WHERE(int i) {
			return getToken(MiniSqlParser.WHERE, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public SelectInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterSelectInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitSelectInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitSelectInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectInstructionContext selectInstruction() throws RecognitionException {
		SelectInstructionContext _localctx = new SelectInstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(SELECT);
			setState(112);
			match(T__4);
			setState(113);
			match(FROM);
			setState(114);
			match(NAME_IDENTIFIER);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHERE) {
				{
				{
				setState(115);
				match(WHERE);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					condition();
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME_IDENTIFIER );
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(MiniSqlParser.OP, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(NAME_IDENTIFIER);
			setState(127);
			match(OP);
			setState(128);
			literal();
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

	public static class InsertTupleContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MiniSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(MiniSqlParser.INTO, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public TerminalNode VALUES() { return getToken(MiniSqlParser.VALUES, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public InsertTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterInsertTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitInsertTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitInsertTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertTupleContext insertTuple() throws RecognitionException {
		InsertTupleContext _localctx = new InsertTupleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insertTuple);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(INSERT);
			setState(131);
			match(INTO);
			setState(132);
			match(NAME_IDENTIFIER);
			setState(133);
			match(VALUES);
			setState(134);
			match(T__0);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					literal();
					setState(136);
					match(T__3);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(143);
			literal();
			setState(144);
			match(T__1);
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

	public static class DeleteTupleContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MiniSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(MiniSqlParser.FROM, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public TerminalNode WHERE() { return getToken(MiniSqlParser.WHERE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public DeleteTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterDeleteTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitDeleteTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitDeleteTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteTupleContext deleteTuple() throws RecognitionException {
		DeleteTupleContext _localctx = new DeleteTupleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_deleteTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(DELETE);
			setState(147);
			match(FROM);
			setState(148);
			match(NAME_IDENTIFIER);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(149);
				match(WHERE);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					condition();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME_IDENTIFIER );
				}
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

	public static class QuitContext extends ParserRuleContext {
		public TerminalNode QUIT() { return getToken(MiniSqlParser.QUIT, 0); }
		public QuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterQuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitQuit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitQuit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuitContext quit() throws RecognitionException {
		QuitContext _localctx = new QuitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(QUIT);
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

	public static class ExecuteFileContext extends ParserRuleContext {
		public TerminalNode EXECFILE() { return getToken(MiniSqlParser.EXECFILE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MiniSqlParser.STRING_LITERAL, 0); }
		public ExecuteFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterExecuteFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitExecuteFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitExecuteFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteFileContext executeFile() throws RecognitionException {
		ExecuteFileContext _localctx = new ExecuteFileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_executeFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(EXECFILE);
			setState(160);
			match(STRING_LITERAL);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5O\n\5\r\5\16\5P\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\6\13"+
		"x\n\13\r\13\16\13y\7\13|\n\13\f\13\16\13\177\13\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008d\n\r\f\r\16\r\u0090\13\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u009a\n\16\r\16\16\16\u009b\5\16\u009e"+
		"\n\16\3\17\3\17\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36\2\3\3\2\b\t\2\u00a6\2 \3\2\2\2\4(\3\2\2\2\6E\3\2\2\2\bG\3"+
		"\2\2\2\nU\3\2\2\2\f[\3\2\2\2\16`\3\2\2\2\20d\3\2\2\2\22m\3\2\2\2\24q\3"+
		"\2\2\2\26\u0080\3\2\2\2\30\u0084\3\2\2\2\32\u0094\3\2\2\2\34\u009f\3\2"+
		"\2\2\36\u00a1\3\2\2\2 !\t\2\2\2!\3\3\2\2\2\")\7\20\2\2#)\7\22\2\2$%\7"+
		"\21\2\2%&\7\3\2\2&\'\7\b\2\2\')\7\4\2\2(\"\3\2\2\2(#\3\2\2\2($\3\2\2\2"+
		")\5\3\2\2\2*+\5\b\5\2+,\7\5\2\2,F\3\2\2\2-.\5\16\b\2./\7\5\2\2/F\3\2\2"+
		"\2\60\61\5\20\t\2\61\62\7\5\2\2\62F\3\2\2\2\63\64\5\22\n\2\64\65\7\5\2"+
		"\2\65F\3\2\2\2\66\67\5\24\13\2\678\7\5\2\28F\3\2\2\29:\5\30\r\2:;\7\5"+
		"\2\2;F\3\2\2\2<=\5\32\16\2=>\7\5\2\2>F\3\2\2\2?@\5\34\17\2@A\7\5\2\2A"+
		"F\3\2\2\2BC\5\36\20\2CD\7\5\2\2DF\3\2\2\2E*\3\2\2\2E-\3\2\2\2E\60\3\2"+
		"\2\2E\63\3\2\2\2E\66\3\2\2\2E9\3\2\2\2E<\3\2\2\2E?\3\2\2\2EB\3\2\2\2F"+
		"\7\3\2\2\2GH\7\13\2\2HI\7\f\2\2IJ\7\'\2\2JN\7\3\2\2KL\5\f\7\2LM\7\6\2"+
		"\2MO\3\2\2\2NK\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\n\6"+
		"\2ST\7\4\2\2T\t\3\2\2\2UV\7\r\2\2VW\7\16\2\2WX\7\3\2\2XY\7\'\2\2YZ\7\4"+
		"\2\2Z\13\3\2\2\2[\\\7\'\2\2\\^\5\4\3\2]_\7\17\2\2^]\3\2\2\2^_\3\2\2\2"+
		"_\r\3\2\2\2`a\7\23\2\2ab\7\f\2\2bc\7\'\2\2c\17\3\2\2\2de\7\13\2\2ef\7"+
		"\24\2\2fg\7\'\2\2gh\7\25\2\2hi\7\'\2\2ij\7\3\2\2jk\7\'\2\2kl\7\4\2\2l"+
		"\21\3\2\2\2mn\7\23\2\2no\7\24\2\2op\7\'\2\2p\23\3\2\2\2qr\7\26\2\2rs\7"+
		"\7\2\2st\7\30\2\2t}\7\'\2\2uw\7\27\2\2vx\5\26\f\2wv\3\2\2\2xy\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{u\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2"+
		"\2\2~\25\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\'\2\2\u0081\u0082\7 \2\2\u0082"+
		"\u0083\5\2\2\2\u0083\27\3\2\2\2\u0084\u0085\7\32\2\2\u0085\u0086\7\33"+
		"\2\2\u0086\u0087\7\'\2\2\u0087\u0088\7\35\2\2\u0088\u008e\7\3\2\2\u0089"+
		"\u008a\5\2\2\2\u008a\u008b\7\6\2\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5\2\2\2\u0092\u0093\7\4"+
		"\2\2\u0093\31\3\2\2\2\u0094\u0095\7\34\2\2\u0095\u0096\7\30\2\2\u0096"+
		"\u009d\7\'\2\2\u0097\u0099\7\27\2\2\u0098\u009a\5\26\f\2\u0099\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009e\3\2\2\2\u009e\33\3\2\2"+
		"\2\u009f\u00a0\7\36\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\7\37\2\2\u00a2\u00a3"+
		"\7\t\2\2\u00a3\37\3\2\2\2\13(EP^y}\u008e\u009b\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}