package file.buffer;

import common.datastructure.Pair;

import java.io.File;
import java.util.List;

public interface DiskFileManager {
    File createRecordFile(String tableName);
    File createIndexFile(String indexName);
    File createTableCatalogFile(String tableName);

    File[] getAllTableFiles();
    List<Pair<File, String>> getAllRecordFiles();
}
