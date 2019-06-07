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
    void writeTupleToFile(byte[] bytes, String tableName, int offset);
    Collection<Table> readAllTableCatalogsFromFiles();
    ByteCarrier readTupleBytes(String tableName, int offset, int length);
    void createTable(String tableName);
    void init();
    List<Info> deleteTable(String tableName);
}
