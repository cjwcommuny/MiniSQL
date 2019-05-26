package common.datastructure;

import java.io.Serializable;
import java.util.List;

public interface Catalog extends Serializable {
    String getTableName();
    List<Column> getColumns();
    Column getPrimaryKey();
}
