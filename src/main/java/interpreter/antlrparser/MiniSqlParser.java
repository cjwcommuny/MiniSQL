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
			null, "'('", "')'", "','", "'*'", "'and'", null, null, null, null, null, 
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				createTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				dropTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				createIndex();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				dropIndex();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				selectInstruction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				insertTuple();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				deleteTuple();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(49);
				quit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(50);
				executeFile();
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
			setState(53);
			match(CREATE);
			setState(54);
			match(TABLE);
			setState(55);
			match(NAME_IDENTIFIER);
			setState(56);
			match(T__0);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				columnDefinition();
				setState(58);
				match(T__2);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME_IDENTIFIER );
			setState(64);
			primaryKeyDefinition();
			setState(65);
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
			setState(67);
			match(PRIMARY);
			setState(68);
			match(KEY);
			setState(69);
			match(T__0);
			setState(70);
			match(NAME_IDENTIFIER);
			setState(71);
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
			setState(73);
			match(NAME_IDENTIFIER);
			setState(74);
			type_identifier();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(75);
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
			setState(78);
			match(DROP);
			setState(79);
			match(TABLE);
			setState(80);
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
			setState(82);
			match(CREATE);
			setState(83);
			match(INDEX);
			setState(84);
			match(NAME_IDENTIFIER);
			setState(85);
			match(ON);
			setState(86);
			match(NAME_IDENTIFIER);
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
			setState(91);
			match(DROP);
			setState(92);
			match(INDEX);
			setState(93);
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
		public TerminalNode WHERE() { return getToken(MiniSqlParser.WHERE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
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
			setState(95);
			match(SELECT);
			setState(96);
			match(T__3);
			setState(97);
			match(FROM);
			setState(98);
			match(NAME_IDENTIFIER);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(99);
				match(WHERE);
				setState(100);
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
			setState(103);
			match(NAME_IDENTIFIER);
			setState(104);
			match(OP);
			setState(105);
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
			setState(107);
			match(INSERT);
			setState(108);
			match(INTO);
			setState(109);
			match(NAME_IDENTIFIER);
			setState(110);
			match(VALUES);
			setState(111);
			match(T__0);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					literal();
					setState(113);
					match(T__2);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(120);
			literal();
			setState(121);
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
			setState(123);
			match(DELETE);
			setState(124);
			match(FROM);
			setState(125);
			match(NAME_IDENTIFIER);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(126);
				match(WHERE);
				setState(127);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					condition();
					setState(131);
					match(T__4);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(138);
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
			setState(140);
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
			setState(142);
			match(EXECFILE);
			setState(143);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0094\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5?\n\5\r\5\16\5@\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13h\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\rv\n"+
		"\r\f\r\16\ry\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0083\n\16"+
		"\3\17\3\17\3\17\7\17\u0088\n\17\f\17\16\17\u008b\13\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \2\3\3\2\b\t\2\u0093\2\"\3\2\2\2\4*\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2"+
		"\nE\3\2\2\2\fK\3\2\2\2\16P\3\2\2\2\20T\3\2\2\2\22]\3\2\2\2\24a\3\2\2\2"+
		"\26i\3\2\2\2\30m\3\2\2\2\32}\3\2\2\2\34\u0089\3\2\2\2\36\u008e\3\2\2\2"+
		" \u0090\3\2\2\2\"#\t\2\2\2#\3\3\2\2\2$+\7\20\2\2%+\7\22\2\2&\'\7\21\2"+
		"\2\'(\7\3\2\2()\7\b\2\2)+\7\4\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2+\5\3\2"+
		"\2\2,\66\5\b\5\2-\66\5\16\b\2.\66\5\20\t\2/\66\5\22\n\2\60\66\5\24\13"+
		"\2\61\66\5\30\r\2\62\66\5\32\16\2\63\66\5\36\20\2\64\66\5 \21\2\65,\3"+
		"\2\2\2\65-\3\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2"+
		"\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\678\7\13\2\28"+
		"9\7\f\2\29:\7\'\2\2:>\7\3\2\2;<\5\f\7\2<=\7\5\2\2=?\3\2\2\2>;\3\2\2\2"+
		"?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5\n\6\2CD\7\4\2\2D\t\3\2\2"+
		"\2EF\7\r\2\2FG\7\16\2\2GH\7\3\2\2HI\7\'\2\2IJ\7\4\2\2J\13\3\2\2\2KL\7"+
		"\'\2\2LN\5\4\3\2MO\7\17\2\2NM\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PQ\7\23\2\2"+
		"QR\7\f\2\2RS\7\'\2\2S\17\3\2\2\2TU\7\13\2\2UV\7\24\2\2VW\7\'\2\2WX\7\25"+
		"\2\2XY\7\'\2\2YZ\7\3\2\2Z[\7\'\2\2[\\\7\4\2\2\\\21\3\2\2\2]^\7\23\2\2"+
		"^_\7\24\2\2_`\7\'\2\2`\23\3\2\2\2ab\7\26\2\2bc\7\6\2\2cd\7\30\2\2dg\7"+
		"\'\2\2ef\7\27\2\2fh\5\34\17\2ge\3\2\2\2gh\3\2\2\2h\25\3\2\2\2ij\7\'\2"+
		"\2jk\7 \2\2kl\5\2\2\2l\27\3\2\2\2mn\7\32\2\2no\7\33\2\2op\7\'\2\2pq\7"+
		"\35\2\2qw\7\3\2\2rs\5\2\2\2st\7\5\2\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu"+
		"\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\5\2\2\2{|\7\4\2\2|\31\3\2\2\2"+
		"}~\7\34\2\2~\177\7\30\2\2\177\u0082\7\'\2\2\u0080\u0081\7\27\2\2\u0081"+
		"\u0083\5\34\17\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\33\3\2"+
		"\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7\7\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0084\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5\26\f\2\u008d"+
		"\35\3\2\2\2\u008e\u008f\7\36\2\2\u008f\37\3\2\2\2\u0090\u0091\7\37\2\2"+
		"\u0091\u0092\7\t\2\2\u0092!\3\2\2\2\n*\65@Ngw\u0082\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}