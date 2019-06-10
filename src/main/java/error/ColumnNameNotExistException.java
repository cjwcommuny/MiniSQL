package error;

import lombok.Getter;

public class ColumnNameNotExistException extends MiniSqlCheckedError {
    @Getter
    String columnName;

    public ColumnNameNotExistException(String columnName) {
        this.columnName = columnName;
    }
}
