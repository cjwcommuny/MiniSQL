package middlelayer;

import common.datastructure.restriction.Restriction;
import common.info.Info;

import java.util.List;

public interface RecordManager {
    List<Info> insertTuple(String tableName, List<Object> values);
    List<Info> deleteTuple(String tableName, List<Restriction> restrictions);
    List<Info> selectTuple(String tableName, List<Restriction> restrictions);
}
