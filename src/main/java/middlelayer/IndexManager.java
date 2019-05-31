package middlelayer;

import common.datastructure.Table;
import common.datastructure.Tuple;
import common.datastructure.restriction.Restriction;

import java.util.List;

public interface IndexManager {
    void updateIndexes(Tuple tuple, Table table, int offset);
    List<Integer> getOffsets(List<Restriction> restrictions, Table table);

    void deleteOffsets(List<Tuple> tuples, Table table);
}
