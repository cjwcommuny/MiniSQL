package common.datastructure;

import java.io.Serializable;
import java.util.List;

public interface Index extends Serializable {
    List<Integer> getTupleIndex(List<Condition> conditions);
    String getIndexName();
    String getColumnName();
    void update(Object key, int offset);
}
