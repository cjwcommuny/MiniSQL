package middlelayer;

import common.Column;
import common.info.Info;

import java.util.List;

public interface CatalogManager {
    List<Info> createTable(String tableName, List<Column> columns, Column primaryColumn);
    List<Info> deleteTable(String tableName);
}
