package manager.catalog;

import common.datastructure.Column;
import common.datastructure.Table;
import common.info.Info;
import error.MiniSqlAbortException;
import error.MiniSqlRuntimeException;
import file.buffer.DefaultBufferManager;
import lombok.Getter;
import manager.FileHandler;
import manager.TableManager;
import middlelayer.CatalogManager;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class DefaultCatalogManager implements CatalogManager {
    private TableManager tableManager = TableManager.getInstance();
    private FileHandler fileHandler = DefaultBufferManager.getInstance();

    @Getter
    private static DefaultCatalogManager instance = new DefaultCatalogManager();

    private DefaultCatalogManager() {}

    @Override
    public List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn) {
        var infos = tableManager.createTable(tableName, columns, primaryColumn);
        fileHandler.createTable(tableName);
        return infos;
    }

    @Override
    public List<Info> deleteTable(String tableName) {
        return tableManager.deleteTable(tableName);
    }

    @Override
    public List<Info> quit() {
        for (Table table: tableManager.getAllTables()) {
            //TODO: 并发
            fileHandler.writeTableCatalogToFile(table);
        }
        return new LinkedList<>();
    }

    @Override
    public void init() {
        var tables = fileHandler.readAllTableCatalogsFromFiles();
        tableManager.addTables(tables);
    }
}
