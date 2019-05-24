// Generated from MiniSql.g4 by ANTLR 4.7.2

package interpreter.antlrparser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiniSqlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(MiniSqlParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatType(MiniSqlParser.FloatTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charNType}
	 * labeled alternative in {@link MiniSqlParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharNType(MiniSqlParser.CharNTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(MiniSqlParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(MiniSqlParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#primaryKeyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyDefinition(MiniSqlParser.PrimaryKeyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(MiniSqlParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(MiniSqlParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(MiniSqlParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(MiniSqlParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#selectInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectInstruction(MiniSqlParser.SelectInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MiniSqlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#insertTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertTuple(MiniSqlParser.InsertTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#deleteTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteTuple(MiniSqlParser.DeleteTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(MiniSqlParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#quit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit(MiniSqlParser.QuitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniSqlParser#executeFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteFile(MiniSqlParser.ExecuteFileContext ctx);
}