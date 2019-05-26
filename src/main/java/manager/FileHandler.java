package manager;

import common.info.Info;

import java.util.List;

public interface FileHandler {
    List<Info> quit();

    List<Info> writeTableCatalogToFile(byte[] bytes);
    List<Info> writeIndexToFile(byte[] bytes);
    List<Info> writeTuplesToFile(byte[] bytes);

    byte[] readTableCatalog(String tableName, List<Info> infos);
    byte[] readIndex(String indexName, List<Info> infos);
    byte[] readTuples(String tableName, List<Info> infos);
}
