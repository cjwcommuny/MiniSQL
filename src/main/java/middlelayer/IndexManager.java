package middlelayer;

import common.datastructure.Table;
import common.datastructure.Tuple;

public interface IndexManager {
    void updateIndexes(Tuple tuple, Table table, int offset);
}
