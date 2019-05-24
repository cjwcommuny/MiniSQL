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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT_LITERAL=7, STRING_LITERAL=8, 
		DIGIT=9, CREATE=10, TABLE=11, PRIMARY=12, KEY=13, UNIQUE=14, INT=15, CHAR=16, 
		FLOAT=17, DROP=18, INDEX=19, ON=20, SELECT=21, WHERE=22, FROM=23, AND=24, 
		INSERT=25, INTO=26, DELETE=27, VALUES=28, QUIT=29, EXECFILE=30, OP=31, 
		EQUAL=32, NOT_EQUAL=33, GREATER=34, LESS=35, GREATER_OR_EQUAL=36, LESS_OR_EQUAL=37, 
		NAME_IDENTIFIER=38, WHITE_SPACE=39, LINE_COMMENT=40, COMMENT=41;
	public static final int
		RULE_literal = 0, RULE_type_identifier = 1, RULE_instruction = 2, RULE_createTable = 3, 
		RULE_primaryKeyDefinition = 4, RULE_columnDefinition = 5, RULE_dropTable = 6, 
		RULE_createIndex = 7, RULE_dropIndex = 8, RULE_selectInstruction = 9, 
		RULE_condition = 10, RULE_insertTuple = 11, RULE_deleteTuple = 12, RULE_conditions = 13, 
		RULE_quit = 14, RULE_executeFile = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "type_identifier", "instruction", "createTable", "primaryKeyDefinition", 
			"columnDefinition", "dropTable", "createIndex", "dropIndex", "selectInstruction", 
			"condition", "insertTuple", "deleteTuple", "conditions", "quit", "executeFile"
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
			setState(32);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharNTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(CHAR);
				setState(37);
				match(T__0);
				setState(38);
				match(INT_LITERAL);
				setState(39);
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
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				createTable();
				setState(43);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				dropTable();
				setState(46);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				createIndex();
				setState(49);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				dropIndex();
				setState(52);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				selectInstruction();
				setState(55);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				insertTuple();
				setState(58);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				deleteTuple();
				setState(61);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				quit();
				setState(64);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				executeFile();
				setState(67);
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
			setState(71);
			match(CREATE);
			setState(72);
			match(TABLE);
			setState(73);
			match(NAME_IDENTIFIER);
			setState(74);
			match(T__0);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				columnDefinition();
				setState(76);
				match(T__3);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME_IDENTIFIER );
			setState(82);
			primaryKeyDefinition();
			setState(83);
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
			setState(85);
			match(PRIMARY);
			setState(86);
			match(KEY);
			setState(87);
			match(T__0);
			setState(88);
			match(NAME_IDENTIFIER);
			setState(89);
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
			setState(91);
			match(NAME_IDENTIFIER);
			setState(92);
			type_identifier();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(93);
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
			setState(96);
			match(DROP);
			setState(97);
			match(TABLE);
			setState(98);
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
			setState(100);
			match(CREATE);
			setState(101);
			match(INDEX);
			setState(102);
			match(NAME_IDENTIFIER);
			setState(103);
			match(ON);
			setState(104);
			match(NAME_IDENTIFIER);
			setState(105);
			match(T__0);
			setState(106);
			match(NAME_IDENTIFIER);
			setState(107);
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
			setState(109);
			match(DROP);
			setState(110);
			match(INDEX);
			setState(111);
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
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
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
			setState(113);
			match(SELECT);
			setState(114);
			match(T__4);
			setState(115);
			match(FROM);
			setState(116);
			match(NAME_IDENTIFIER);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHERE) {
				{
				{
				setState(117);
				match(WHERE);
				setState(118);
				conditions();
				}
				}
				setState(123);
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
			setState(124);
			match(NAME_IDENTIFIER);
			setState(125);
			match(OP);
			setState(126);
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
			setState(128);
			match(INSERT);
			setState(129);
			match(INTO);
			setState(130);
			match(NAME_IDENTIFIER);
			setState(131);
			match(VALUES);
			setState(132);
			match(T__0);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					literal();
					setState(134);
					match(T__3);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(141);
			literal();
			setState(142);
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
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
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
			setState(144);
			match(DELETE);
			setState(145);
			match(FROM);
			setState(146);
			match(NAME_IDENTIFIER);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(147);
				match(WHERE);
				setState(148);
				conditions();
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

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(151);
				condition();
				setState(152);
				match(T__5);
				}
				break;
			}
			setState(156);
			condition();
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
		enterRule(_localctx, 28, RULE_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 30, RULE_executeFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(EXECFILE);
			setState(161);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5Q\n\5\r\5\16\5R\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13z\n\13\f\13\16\13}\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e\13\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\17\5\17\u009d\n\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \2\3\3\2\t\n\2\u00a5\2\"\3\2\2\2\4*\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2"+
		"\nW\3\2\2\2\f]\3\2\2\2\16b\3\2\2\2\20f\3\2\2\2\22o\3\2\2\2\24s\3\2\2\2"+
		"\26~\3\2\2\2\30\u0082\3\2\2\2\32\u0092\3\2\2\2\34\u009c\3\2\2\2\36\u00a0"+
		"\3\2\2\2 \u00a2\3\2\2\2\"#\t\2\2\2#\3\3\2\2\2$+\7\21\2\2%+\7\23\2\2&\'"+
		"\7\22\2\2\'(\7\3\2\2()\7\t\2\2)+\7\4\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2"+
		"+\5\3\2\2\2,-\5\b\5\2-.\7\5\2\2.H\3\2\2\2/\60\5\16\b\2\60\61\7\5\2\2\61"+
		"H\3\2\2\2\62\63\5\20\t\2\63\64\7\5\2\2\64H\3\2\2\2\65\66\5\22\n\2\66\67"+
		"\7\5\2\2\67H\3\2\2\289\5\24\13\29:\7\5\2\2:H\3\2\2\2;<\5\30\r\2<=\7\5"+
		"\2\2=H\3\2\2\2>?\5\32\16\2?@\7\5\2\2@H\3\2\2\2AB\5\36\20\2BC\7\5\2\2C"+
		"H\3\2\2\2DE\5 \21\2EF\7\5\2\2FH\3\2\2\2G,\3\2\2\2G/\3\2\2\2G\62\3\2\2"+
		"\2G\65\3\2\2\2G8\3\2\2\2G;\3\2\2\2G>\3\2\2\2GA\3\2\2\2GD\3\2\2\2H\7\3"+
		"\2\2\2IJ\7\f\2\2JK\7\r\2\2KL\7(\2\2LP\7\3\2\2MN\5\f\7\2NO\7\6\2\2OQ\3"+
		"\2\2\2PM\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\5\n\6\2UV\7"+
		"\4\2\2V\t\3\2\2\2WX\7\16\2\2XY\7\17\2\2YZ\7\3\2\2Z[\7(\2\2[\\\7\4\2\2"+
		"\\\13\3\2\2\2]^\7(\2\2^`\5\4\3\2_a\7\20\2\2`_\3\2\2\2`a\3\2\2\2a\r\3\2"+
		"\2\2bc\7\24\2\2cd\7\r\2\2de\7(\2\2e\17\3\2\2\2fg\7\f\2\2gh\7\25\2\2hi"+
		"\7(\2\2ij\7\26\2\2jk\7(\2\2kl\7\3\2\2lm\7(\2\2mn\7\4\2\2n\21\3\2\2\2o"+
		"p\7\24\2\2pq\7\25\2\2qr\7(\2\2r\23\3\2\2\2st\7\27\2\2tu\7\7\2\2uv\7\31"+
		"\2\2v{\7(\2\2wx\7\30\2\2xz\5\34\17\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|\25\3\2\2\2}{\3\2\2\2~\177\7(\2\2\177\u0080\7!\2\2\u0080\u0081"+
		"\5\2\2\2\u0081\27\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0084\7\34\2\2\u0084"+
		"\u0085\7(\2\2\u0085\u0086\7\36\2\2\u0086\u008c\7\3\2\2\u0087\u0088\5\2"+
		"\2\2\u0088\u0089\7\6\2\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\2\2\2\u0090\u0091\7\4\2\2\u0091"+
		"\31\3\2\2\2\u0092\u0093\7\35\2\2\u0093\u0094\7\31\2\2\u0094\u0097\7(\2"+
		"\2\u0095\u0096\7\30\2\2\u0096\u0098\5\34\17\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\b\2"+
		"\2\u009b\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\5\26\f\2\u009f\35\3\2\2\2\u00a0\u00a1\7\37\2\2\u00a1"+
		"\37\3\2\2\2\u00a2\u00a3\7 \2\2\u00a3\u00a4\7\n\2\2\u00a4!\3\2\2\2\n*G"+
		"R`{\u008c\u0097\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}