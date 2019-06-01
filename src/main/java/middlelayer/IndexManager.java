package middlelayer;

import common.datastructure.Table;
import common.datastructure.Tuple;
import common.datastructure.restriction.Restriction;
import common.info.Info;

import java.util.List;

public interface IndexManager {
    void updateIndexes(Tuple tuple, Table table, int offset);
    List<Integer> getOffsets(List<Restriction> restrictions, Table table);

    void deleteOffsets(List<Tuple> tuples, Table table);
    List<Info> createIndex(String indexName, String tableName, String columnName);

    List<Info> deleteIndex(String indexName);
}
