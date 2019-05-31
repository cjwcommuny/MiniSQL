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

    String getColumnName(int i);

    List<Type> getTypes();

    void deleteTuple(int i);

    Map<String, Index> getIndexesMap();

    int getTupleSize();

    int addTuple();

    Index getIndex(String columnName);

    Tuple bytesToTuple(byte[] bytes, int base);
}
