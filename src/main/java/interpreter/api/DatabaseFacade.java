package interpreter.api;

import common.datastructure.Column;
import common.datastructure.Condition;
import common.info.Info;

import java.util.List;

public interface DatabaseFacade {
    List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn);
    List<Info> deleteTable(String tableName);

    List<Info> createIndex(String indexName, String tableName, String columnName);
    List<Info> deleteIndex(String indexName);

    List<Info> select(String tableName, List<Condition> conditions);
    List<Info> insertTuple(String tableName, List<Object> values);
    List<Info> deleteTuple(String tableName, List<Condition> conditions);

    List<Info> quit();

    List<Info> executeFile(String fileName);
}
