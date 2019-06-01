package file.diskfile;

import file.buffer.DiskFileManager;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DefaultDiskFileManager implements DiskFileManager {
    private static final String DATABASE_DIRECTORY = "./db";
    private static final String TABLE_RELATIVE_DIRECTORY = "tables";
    private static final String CATALOG_RELATIVE_DIRECTORY = "catalogs";
    private static final String INDEX_RELATIVE_DIRECTORY = "indexes";

    private static final String RECORD_FILE_POSTFIX = ".db";
    private static final String CATALOG_FILE_POSTFIX = ".ser";

    public DefaultDiskFileManager() {
        //TODO: read all file from disk
    }

    @Override
    public File createTableFile(String tableName) {
        Path tableFilePath = Paths.get(DATABASE_DIRECTORY,
                TABLE_RELATIVE_DIRECTORY,
                tableName + RECORD_FILE_POSTFIX);
        return tableFilePath.toFile();
    }

    @Override
    public File createIndexFile(String indexName) {
        Path indexFilePath = Paths.get(DATABASE_DIRECTORY,
                INDEX_RELATIVE_DIRECTORY,
                indexName + RECORD_FILE_POSTFIX);
        return indexFilePath.toFile();
    }

    @Override
    public File createTableCatalogFile(String tableName) {
        Path catalogFile = Paths.get(DATABASE_DIRECTORY,
                CATALOG_RELATIVE_DIRECTORY,
                tableName + CATALOG_FILE_POSTFIX);
        return catalogFile.toFile();
    }

//    @Override
//    public File getTableCatalogFile(String tableName) {
//        return createTableCatalogFile(tableName);
//    }

    @Override
    public File[] getAllTableFiles() {
        return Paths.get(DATABASE_DIRECTORY, CATALOG_RELATIVE_DIRECTORY).toFile().listFiles();
    }
}
