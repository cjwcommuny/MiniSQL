package common.info;

import common.datastructure.Column;
import common.datastructure.Tuple;
import error.ColumnNameNotExistException;
import org.checkerframework.checker.units.qual.C;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * the result returned by the query
 * */
public class ResultInfo implements Info {
    private List<Column> columns;
    private List<Tuple> tuples;
    private List<Integer> filterList;

    public ResultInfo(List<Column> columns, List<Tuple> tuples) {
        this.columns = columns;
        this.tuples = tuples;
    }

    @Override
    public String getFormatMessage() {
        if (tuples.size() == 0) {
            return "Empty result set";
        }
        StringBuilder sb = new StringBuilder();
        for (var column: columns) {
            sb.append(column.visualInfo());
            sb.append(", ");
        }
        sb.append("\n");
        for (var tuple: tuples) {
            sb.append(tuple.visualInfo(filterList));
            sb.append("\n");
        }
        return sb.toString();
    }

    public void filterColumnName(List<String> columnNames) throws ColumnNameNotExistException {
        List<Integer> columnIndexes = new LinkedList<>();
        for (var columnName: columnNames) {
            int index = -1;
            for (int i = 0; i < columns.size(); ++i) {
                var column = columns.get(i);
                if (column.getColumnName().equals(columnName)) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                throw new ColumnNameNotExistException(columnName);
            } else {
                columnIndexes.add(index);
            }
        }
        Collections.sort(columnIndexes);
        filterList = columnIndexes;
    }
}
