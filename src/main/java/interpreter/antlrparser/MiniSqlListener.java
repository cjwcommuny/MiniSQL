// Generated from MiniSql.g4 by ANTLR 4.7.2

package interpreter.antlrparser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniSqlParser}.
 */
public interface MiniSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiniSqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiniSqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MiniSqlParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MiniSqlParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFloatType(MiniSqlParser.FloatTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFloatType(MiniSqlParser.FloatTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charNType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCharNType(MiniSqlParser.CharNTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charNType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCharNType(MiniSqlParser.CharNTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(MiniSqlParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(MiniSqlParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(MiniSqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(MiniSqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyDefinition(MiniSqlParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyDefinition(MiniSqlParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(MiniSqlParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(MiniSqlParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(MiniSqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(MiniSqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(MiniSqlParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(MiniSqlParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(MiniSqlParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(MiniSqlParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#selectInstruction}.
	 * @param ctx the parse tree
	 */
	void enterSelectInstruction(MiniSqlParser.SelectInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#selectInstruction}.
	 * @param ctx the parse tree
	 */
	void exitSelectInstruction(MiniSqlParser.SelectInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MiniSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MiniSqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#insertTuple}.
	 * @param ctx the parse tree
	 */
	void enterInsertTuple(MiniSqlParser.InsertTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#insertTuple}.
	 * @param ctx the parse tree
	 */
	void exitInsertTuple(MiniSqlParser.InsertTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#deleteTuple}.
	 * @param ctx the parse tree
	 */
	void enterDeleteTuple(MiniSqlParser.DeleteTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#deleteTuple}.
	 * @param ctx the parse tree
	 */
	void exitDeleteTuple(MiniSqlParser.DeleteTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#quit}.
	 * @param ctx the parse tree
	 */
	void enterQuit(MiniSqlParser.QuitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#quit}.
	 * @param ctx the parse tree
	 */
	void exitQuit(MiniSqlParser.QuitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniSqlParser#executeFile}.
	 * @param ctx the parse tree
	 */
	void enterExecuteFile(MiniSqlParser.ExecuteFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniSqlParser#executeFile}.
	 * @param ctx the parse tree
	 */
	void exitExecuteFile(MiniSqlParser.ExecuteFileContext ctx);
}