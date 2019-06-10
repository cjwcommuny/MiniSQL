package interpreter.visittree;

import lombok.Getter;

import java.util.List;

public class ColumnNamesVisitResult extends ParseTreeVisitResult {
    @Getter
    private List<String> columnNames;

    public ColumnNamesVisitResult(List<String> columnNames) {
        this.columnNames = columnNames;
    }
}
