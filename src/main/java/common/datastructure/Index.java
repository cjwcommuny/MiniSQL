package common.datastructure;

import java.util.List;

public interface Index {
    List<Integer> getTupleIndex(List<Condition> conditions);
}
