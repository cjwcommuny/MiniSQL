package common.datastructure;

import common.type.Type;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface Table {
    String getTableName();

    List<Column> getColumns();

    int getColumnsCount();

    Column getPrimaryKey();

    void putIndex(Index index);

    boolean existColumn(String columnName);

    int getColumnIndex(String columnName);

    List<Type> getTypes();

    void deleteTuple(List<Condition> conditions);

    Map<String, Index> getIndexesMap();

    int getTupleSize();
}
