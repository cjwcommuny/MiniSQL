package common.info;

import common.datastructure.Column;
import common.datastructure.Tuple;
import lombok.Getter;

import java.util.List;

/**
 * the result returned by the query
 * */
public class ResultInfo implements Info {
    private List<Column> columns;
    private List<Tuple> tuples;

    public ResultInfo(List<Column> columns, List<Tuple> tuples) {
        this.columns = columns;
        this.tuples = tuples;
    }

    @Override
    public String getFormatMessage() {
        StringBuilder sb = new StringBuilder();
        for (var column: columns) {
            sb.append(column.visualInfo());
            sb.append(", ");
        }
        sb.append("\n");
        for (var tuple: tuples) {
            sb.append(tuple.visualInfo());
            sb.append("\n");
        }
        return sb.toString();
    }
}
