package interpreter.visittree;

import common.datastructure.Column;
import lombok.Getter;

public class ColumnDefinitionVisitResult extends ParseTreeVisitResult {
    @Getter
    Column column;

    public ColumnDefinitionVisitResult(Column column) {
        this.column = column;
    }
}
