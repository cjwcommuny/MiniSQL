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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT_LITERAL=6, FLOAT_LITERAL=7, 
		STRING_LITERAL=8, DIGIT=9, CREATE=10, TABLE=11, PRIMARY=12, KEY=13, UNIQUE=14, 
		INT=15, CHAR=16, FLOAT=17, DROP=18, INDEX=19, ON=20, SELECT=21, WHERE=22, 
		FROM=23, AND=24, INSERT=25, INTO=26, DELETE=27, VALUES=28, QUIT=29, EXECFILE=30, 
		OP=31, EQUAL=32, NOT_EQUAL=33, GREATER=34, LESS=35, GREATER_OR_EQUAL=36, 
		LESS_OR_EQUAL=37, NAME_IDENTIFIER=38, WHITE_SPACE=39, LINE_COMMENT=40, 
		COMMENT=41;
	public static final int
		RULE_literal = 0, RULE_type_identifier = 1, RULE_instructionWrap = 2, 
		RULE_instruction = 3, RULE_createTable = 4, RULE_primaryKeyDefinition = 5, 
		RULE_columnDefinition = 6, RULE_dropTable = 7, RULE_createIndex = 8, RULE_dropIndex = 9, 
		RULE_selectInstruction = 10, RULE_columnNames = 11, RULE_condition = 12, 
		RULE_insertTuple = 13, RULE_deleteTuple = 14, RULE_conditions = 15, RULE_quit = 16, 
		RULE_executeFile = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "type_identifier", "instructionWrap", "instruction", "createTable", 
			"primaryKeyDefinition", "columnDefinition", "dropTable", "createIndex", 
			"dropIndex", "selectInstruction", "columnNames", "condition", "insertTuple", 
			"deleteTuple", "conditions", "quit", "executeFile"
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
		public TerminalNode FLOAT_LITERAL() { return getToken(MiniSqlParser.FLOAT_LITERAL, 0); }
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
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
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
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(FLOAT);
				}
				break;
			case CHAR:
				_localctx = new CharNTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(CHAR);
				setState(41);
				match(T__0);
				setState(42);
				match(INT_LITERAL);
				setState(43);
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

	public static class InstructionWrapContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniSqlParser.EOF, 0); }
		public InstructionWrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionWrap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterInstructionWrap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitInstructionWrap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitInstructionWrap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionWrapContext instructionWrap() throws RecognitionException {
		InstructionWrapContext _localctx = new InstructionWrapContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instructionWrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			instruction();
			setState(47);
			match(EOF);
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
		public TerminalNode EOF() { return getToken(MiniSqlParser.EOF, 0); }
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
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				dropTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				createIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				dropIndex();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				selectInstruction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				insertTuple();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				deleteTuple();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				quit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				executeFile();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				match(EOF);
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
		enterRule(_localctx, 8, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CREATE);
			setState(62);
			match(TABLE);
			setState(63);
			match(NAME_IDENTIFIER);
			setState(64);
			match(T__0);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				columnDefinition();
				setState(66);
				match(T__2);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME_IDENTIFIER );
			setState(72);
			primaryKeyDefinition();
			setState(73);
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
		enterRule(_localctx, 10, RULE_primaryKeyDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PRIMARY);
			setState(76);
			match(KEY);
			setState(77);
			match(T__0);
			setState(78);
			match(NAME_IDENTIFIER);
			setState(79);
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
		enterRule(_localctx, 12, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(NAME_IDENTIFIER);
			setState(82);
			type_identifier();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(83);
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
		enterRule(_localctx, 14, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DROP);
			setState(87);
			match(TABLE);
			setState(88);
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
		enterRule(_localctx, 16, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CREATE);
			setState(91);
			match(INDEX);
			setState(92);
			match(NAME_IDENTIFIER);
			setState(93);
			match(ON);
			setState(94);
			match(NAME_IDENTIFIER);
			setState(95);
			match(T__0);
			setState(96);
			match(NAME_IDENTIFIER);
			setState(97);
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
		public List<TerminalNode> NAME_IDENTIFIER() { return getTokens(MiniSqlParser.NAME_IDENTIFIER); }
		public TerminalNode NAME_IDENTIFIER(int i) {
			return getToken(MiniSqlParser.NAME_IDENTIFIER, i);
		}
		public TerminalNode ON() { return getToken(MiniSqlParser.ON, 0); }
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
		enterRule(_localctx, 18, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(DROP);
			setState(100);
			match(INDEX);
			setState(101);
			match(NAME_IDENTIFIER);
			setState(102);
			match(ON);
			setState(103);
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
		public SelectInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectInstruction; }
	 
		public SelectInstructionContext() { }
		public void copyFrom(SelectInstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectInstructionContext {
		public TerminalNode SELECT() { return getToken(MiniSqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(MiniSqlParser.FROM, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public TerminalNode WHERE() { return getToken(MiniSqlParser.WHERE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public SelectAllContext(SelectInstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectColumnsContext extends SelectInstructionContext {
		public TerminalNode SELECT() { return getToken(MiniSqlParser.SELECT, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MiniSqlParser.FROM, 0); }
		public TerminalNode NAME_IDENTIFIER() { return getToken(MiniSqlParser.NAME_IDENTIFIER, 0); }
		public TerminalNode WHERE() { return getToken(MiniSqlParser.WHERE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public SelectColumnsContext(SelectInstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterSelectColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitSelectColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitSelectColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectInstructionContext selectInstruction() throws RecognitionException {
		SelectInstructionContext _localctx = new SelectInstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectInstruction);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(SELECT);
				setState(106);
				match(T__3);
				setState(107);
				match(FROM);
				setState(108);
				match(NAME_IDENTIFIER);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(109);
					match(WHERE);
					setState(110);
					conditions();
					}
				}

				}
				break;
			case 2:
				_localctx = new SelectColumnsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(SELECT);
				setState(114);
				columnNames();
				setState(115);
				match(FROM);
				setState(116);
				match(NAME_IDENTIFIER);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(117);
					match(WHERE);
					setState(118);
					conditions();
					}
				}

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

	public static class ColumnNamesContext extends ParserRuleContext {
		public List<TerminalNode> NAME_IDENTIFIER() { return getTokens(MiniSqlParser.NAME_IDENTIFIER); }
		public TerminalNode NAME_IDENTIFIER(int i) {
			return getToken(MiniSqlParser.NAME_IDENTIFIER, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniSqlListener ) ((MiniSqlListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniSqlVisitor ) return ((MiniSqlVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnNames);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(NAME_IDENTIFIER);
					setState(124);
					match(T__2);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(130);
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
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(NAME_IDENTIFIER);
			setState(133);
			match(OP);
			setState(134);
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
		enterRule(_localctx, 26, RULE_insertTuple);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(INSERT);
			setState(137);
			match(INTO);
			setState(138);
			match(NAME_IDENTIFIER);
			setState(139);
			match(VALUES);
			setState(140);
			match(T__0);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					literal();
					setState(142);
					match(T__2);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(149);
			literal();
			setState(150);
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
		enterRule(_localctx, 28, RULE_deleteTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(DELETE);
			setState(153);
			match(FROM);
			setState(154);
			match(NAME_IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(155);
				match(WHERE);
				setState(156);
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
		enterRule(_localctx, 30, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					condition();
					setState(160);
					match(T__4);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(167);
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
		enterRule(_localctx, 32, RULE_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		enterRule(_localctx, 34, RULE_executeFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(EXECFILE);
			setState(172);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6G\n\6\r\6\16\6H\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\5\bW\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fr\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\fz\n\f\5\f|\n\f\3\r\3\r\7\r\u0080\n\r\f\r\16\r\u0083\13\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0093\n\17\f\17\16\17\u0096\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00a0\n\20\3\21\3\21\3\21\7\21\u00a5\n\21\f\21\16\21\u00a8"+
		"\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$\2\3\3\2\b\n\2\u00b2\2&\3\2\2\2\4.\3\2\2\2\6"+
		"\60\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fM\3\2\2\2\16S\3\2\2\2\20X\3\2\2\2\22"+
		"\\\3\2\2\2\24e\3\2\2\2\26{\3\2\2\2\30\u0081\3\2\2\2\32\u0086\3\2\2\2\34"+
		"\u008a\3\2\2\2\36\u009a\3\2\2\2 \u00a6\3\2\2\2\"\u00ab\3\2\2\2$\u00ad"+
		"\3\2\2\2&\'\t\2\2\2\'\3\3\2\2\2(/\7\21\2\2)/\7\23\2\2*+\7\22\2\2+,\7\3"+
		"\2\2,-\7\b\2\2-/\7\4\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2/\5\3\2\2\2\60\61"+
		"\5\b\5\2\61\62\7\2\2\3\62\7\3\2\2\2\63>\5\n\6\2\64>\5\20\t\2\65>\5\22"+
		"\n\2\66>\5\24\13\2\67>\5\26\f\28>\5\34\17\29>\5\36\20\2:>\5\"\22\2;>\5"+
		"$\23\2<>\7\2\2\3=\63\3\2\2\2=\64\3\2\2\2=\65\3\2\2\2=\66\3\2\2\2=\67\3"+
		"\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?@"+
		"\7\f\2\2@A\7\r\2\2AB\7(\2\2BF\7\3\2\2CD\5\16\b\2DE\7\5\2\2EG\3\2\2\2F"+
		"C\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5\f\7\2KL\7\4\2\2"+
		"L\13\3\2\2\2MN\7\16\2\2NO\7\17\2\2OP\7\3\2\2PQ\7(\2\2QR\7\4\2\2R\r\3\2"+
		"\2\2ST\7(\2\2TV\5\4\3\2UW\7\20\2\2VU\3\2\2\2VW\3\2\2\2W\17\3\2\2\2XY\7"+
		"\24\2\2YZ\7\r\2\2Z[\7(\2\2[\21\3\2\2\2\\]\7\f\2\2]^\7\25\2\2^_\7(\2\2"+
		"_`\7\26\2\2`a\7(\2\2ab\7\3\2\2bc\7(\2\2cd\7\4\2\2d\23\3\2\2\2ef\7\24\2"+
		"\2fg\7\25\2\2gh\7(\2\2hi\7\26\2\2ij\7(\2\2j\25\3\2\2\2kl\7\27\2\2lm\7"+
		"\6\2\2mn\7\31\2\2nq\7(\2\2op\7\30\2\2pr\5 \21\2qo\3\2\2\2qr\3\2\2\2r|"+
		"\3\2\2\2st\7\27\2\2tu\5\30\r\2uv\7\31\2\2vy\7(\2\2wx\7\30\2\2xz\5 \21"+
		"\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{k\3\2\2\2{s\3\2\2\2|\27\3\2\2\2}~\7("+
		"\2\2~\u0080\7\5\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\7(\2\2\u0085\31\3\2\2\2\u0086\u0087\7(\2\2\u0087\u0088\7!\2\2\u0088\u0089"+
		"\5\2\2\2\u0089\33\3\2\2\2\u008a\u008b\7\33\2\2\u008b\u008c\7\34\2\2\u008c"+
		"\u008d\7(\2\2\u008d\u008e\7\36\2\2\u008e\u0094\7\3\2\2\u008f\u0090\5\2"+
		"\2\2\u0090\u0091\7\5\2\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\2\2\2\u0098\u0099\7\4\2\2\u0099"+
		"\35\3\2\2\2\u009a\u009b\7\35\2\2\u009b\u009c\7\31\2\2\u009c\u009f\7(\2"+
		"\2\u009d\u009e\7\30\2\2\u009e\u00a0\5 \21\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\37\3\2\2\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\7\7"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00aa\5\32\16\2\u00aa!\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac#"+
		"\3\2\2\2\u00ad\u00ae\7 \2\2\u00ae\u00af\7\n\2\2\u00af%\3\2\2\2\r.=HVq"+
		"y{\u0081\u0094\u009f\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}