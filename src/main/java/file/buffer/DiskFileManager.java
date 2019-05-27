package file.buffer;

import java.io.File;

public interface DiskFileManager {
    File createTableFile(String tableName);
    File createIndexFile(String indexName);
    File createCatalogFile();
}
