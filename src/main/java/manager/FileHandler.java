package manager;

import common.datastructure.ByteCarrier;
import common.datastructure.Table;
import common.info.Info;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface FileHandler {
    List<Info> quit();

    void writeTableCatalogToFile(Table table);
//    void writeIndexToFile(byte[] bytes, String indexName, String tableName);
    void writeTupleToFile(byte[] bytes, String tableName, int offset);
    Collection<Table> readAllTableCatalogsFromFiles();
//    byte[] readIndex(String indexName);
//    byte[] readTupleBytes(String tableName);
    ByteCarrier readTupleBytes(String tableName, int offset, int length);


    void createTable(String tableName);

//    long getTableTuplesTotalLength(String tableName);

    void init();
}
