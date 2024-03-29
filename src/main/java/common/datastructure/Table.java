package common.datastructure;

import common.type.Type;
import manager.FileHandler;
import middlelayer.RecordManager;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public interface Table extends Serializable {
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

//    Tuple bytesToTuple(String tableName, FileHandler fileHandler, int base);

    Index getPrimaryIndex();

    boolean existIndex(String indexName);

    Column getColumn(String columnName);

    void deleteIndex(String indexName);

    void addIndex(Index index, String columnName, String indexName);

    int getTuplesCount();

    List<Tuple> getAllTuplesAndOffsets(FileHandler fileHandler, List<Integer> OUT_offsets, RecordManager recordManager);

    Queue<Integer> getFreeTuplePositions();
}
