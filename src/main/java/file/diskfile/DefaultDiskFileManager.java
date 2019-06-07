package file.diskfile;

import com.google.common.io.Files;
import common.datastructure.Pair;
import error.MiniSqlRuntimeException;
import file.buffer.DiskFileManager;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultDiskFileManager implements DiskFileManager {
    private static final String DATABASE_DIRECTORY = "./db";
    private static final String RECORDS_RELATIVE_DIRECTORY = "tables";
    private static final String CATALOG_RELATIVE_DIRECTORY = "catalogs";
    private static final String INDEX_RELATIVE_DIRECTORY = "indexes";

    private static final String RECORD_FILE_EXTENSION = "db";
    private static final String RECORD_FILE_POSTFIX = "." + RECORD_FILE_EXTENSION;
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
    public List<File> getAllTableFiles() {
        File[] files = Paths.get(DATABASE_DIRECTORY, CATALOG_RELATIVE_DIRECTORY).toFile().listFiles();
        if (files == null) {
            System.err.println("Get catalog file error");
        }
        return Arrays.asList(files).stream().filter((file) -> isCatalogFileName(file.getName())).collect(Collectors.toList());
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
            if (isRecordFileName(fileName)) {
                result.add(new Pair<>(file, extractTableName(fileName)));
            }
        }
        return result;
    }

    private boolean isRecordFileName(String fileName) {
        return RECORD_FILE_EXTENSION.equals(Files.getFileExtension(fileName));
    }


    private boolean isCatalogFileName(String fileName) {
        return CATALOG_FILE_EXTENSION.equals(Files.getFileExtension(fileName));
    }

    private String extractTableName(String fileName) {
        return Files.getNameWithoutExtension(fileName);
    }

    @Override
    public void deleteTableFile(String tableName) {
        var recordFile = Paths.get(DATABASE_DIRECTORY,
                RECORDS_RELATIVE_DIRECTORY,
                tableName + RECORD_FILE_POSTFIX).toFile();
        if (recordFile != null) {
            recordFile.delete();
        }
        var catalogFile = Paths.get(DATABASE_DIRECTORY,
                CATALOG_RELATIVE_DIRECTORY, tableName + CATALOG_FILE_EXTENSION).toFile();
        if (catalogFile != null) {
            catalogFile.delete();
        }
    }
}
