package common.datastructure;

import common.type.Type;

import java.io.Serializable;
import java.util.List;

public interface Table extends Serializable {
    String getTableName();

    List<Column> getColumns();

    int getColumnsCount();

    Column getPrimaryKey();

    Index getIndex();

    boolean existColumn(String columnName);

    int getColumnIndex(String columnName);

    void putTuple(Tuple tuple);

    List<Type> getTypes();

    void deleteTuple(List<Condition> conditions);
}
