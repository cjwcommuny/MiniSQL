package file.diskfile;

import file.buffer.DiskFileManager;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DefaultDiskFileManager implements DiskFileManager {
    private static final String DATABASE_DIRECTORY = "./db";
    private static final String TABLE_RELATIVE_DIRECTORY = "tables";
    private static final String CATALOG_RELATIVE_DIRECTORY = "catalogs";
    private static final String INDEX_RELATIVE_DIRECTORY = "indexes";

    public DefaultDiskFileManager() {
        //TODO: read all file from disk
    }

    @Override
    public File createTableFile(String tableName) {
        Path tableFilePath = Paths.get(DATABASE_DIRECTORY, TABLE_RELATIVE_DIRECTORY, tableName + ".db");
        return tableFilePath.toFile();
    }

    @Override
    public File createIndexFile(String indexName) {
        Path indexFilePath = Paths.get(DATABASE_DIRECTORY, INDEX_RELATIVE_DIRECTORY, indexName + ".db");
        return indexFilePath.toFile();
    }

    @Override
    public File createCatalogFile() {
        throw new UnsupportedOperationException();
    }
}
