package common.datastructure;

import common.datastructure.restriction.Restriction;

import java.io.Serializable;
import java.util.List;

public interface Index extends Serializable {
    List<Integer> getTupleIndex(Restriction restriction);
    String getIndexName();
    String getColumnName();
    void update(Object key, int offset);
    void delete(Restriction restriction);
    void delete(Object value);
}
