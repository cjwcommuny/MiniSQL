package common;

import java.util.List;

public interface Table {
    String getTableName();
    List<Column> getColumns();
    int getColumnsCount();
    Column getPrimaryKey();
    Index getIndex();


}
