package file.buffer;

import java.io.File;
import java.util.List;

public interface DiskFileManager {
    File createTableFile(String tableName);
    File createIndexFile(String indexName);
    File createTableCatalogFile(String tableName);
//    File getTableCatalogFile(String tableName);

    File[] getAllTableFiles();
}
