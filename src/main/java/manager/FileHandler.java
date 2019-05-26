package manager;

import common.info.Info;

import java.util.List;

public interface FileHandler {
    List<Info> quit();

    void writeTableCatalogToFile(byte[] bytes, String tableName, int offset);
    void writeIndexToFile(byte[] bytes, String indexName, String tableName);
    void writeTupleToFile(byte[] bytes, String tableName, int offset);

    byte[] readTableCatalog(String tableName);
    byte[] readIndex(String indexName);
    byte[] readTuples(String tableName);
}
