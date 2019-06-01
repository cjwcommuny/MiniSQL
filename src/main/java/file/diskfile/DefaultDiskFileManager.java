package file.diskfile;

import com.google.common.io.Files;
import common.datastructure.Pair;
import error.MiniSqlRuntimeException;
import file.buffer.DiskFileManager;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class DefaultDiskFileManager implements DiskFileManager {
    private static final String DATABASE_DIRECTORY = "./db";
    private static final String RECORDS_RELATIVE_DIRECTORY = "tables";
    private static final String CATALOG_RELATIVE_DIRECTORY = "catalogs";
    private static final String INDEX_RELATIVE_DIRECTORY = "indexes";

    private static final String RECORD_FILE_POSTFIX = ".db";
    private static final String CATALOG_FILE_EXTENSION = "ser";
    private static final String CATALOG_FILE_POSTFIX = "." + CATALOG_FILE_EXTENSION;

    public DefaultDiskFileManager() {
        //TODO: read all file from disk
    }

    @Override
    public File createRecordFile(String tableName) {
        Path tableFilePath = Paths.get(DATABASE_DIRECTORY,
                RECORDS_RELATIVE_DIRECTORY,
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
    public File[] getAllTableFiles() {
        return Paths.get(DATABASE_DIRECTORY, CATALOG_RELATIVE_DIRECTORY).toFile().listFiles();
    }

    @Override
    public File createTableCatalogFile(String tableName) {
        Path catalogFile = Paths.get(DATABASE_DIRECTORY,
                CATALOG_RELATIVE_DIRECTORY,
                tableName + CATALOG_FILE_POSTFIX);
        return catalogFile.toFile();
    }

    @Override
    public List<Pair<File, String>> getAllRecordFiles() {
        File[] files = Paths.get(DATABASE_DIRECTORY, RECORDS_RELATIVE_DIRECTORY).toFile().listFiles();
        if (files == null) {
            System.err.println("Record files is null");
            throw new MiniSqlRuntimeException();
        }
        List<Pair<File, String>> result = new LinkedList<>();
        for (var file: files) {
            String fileName = file.getName();
            if (isCatalogFileName(fileName)) {
                result.add(new Pair<>(file, extractTableName(fileName)));
            }
        }
        return result;
    }

    private boolean isCatalogFileName(String fileName) {
        return "ser".equals(Files.getFileExtension(fileName));
    }

    private String extractTableName(String fileName) {
        return Files.getNameWithoutExtension(fileName);
    }
}
