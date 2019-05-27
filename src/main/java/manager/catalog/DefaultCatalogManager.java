package manager.catalog;

import common.datastructure.Column;
import common.info.Info;
import file.buffer.DefaultBufferManager;
import manager.FileHandler;
import manager.TableManager;
import middlelayer.CatalogManager;

import java.util.List;

public class DefaultCatalogManager implements CatalogManager {
    private TableManager tableManager = TableManager.getInstance();
    private FileHandler fileHandler = DefaultBufferManager.getInstance();

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
        //TODO: save all catalog info to file
        throw new UnsupportedOperationException();
    }
}
