package middlelayer;

import common.datastructure.Tuple;
import common.datastructure.restriction.Restriction;
import common.info.Info;
import common.type.Type;

import java.util.List;

public interface RecordManager {
    List<Info> insertTuple(String tableName, List<Object> values);
    List<Info> deleteTuple(String tableName, List<Restriction> restrictions);
    List<Info> selectTuple(String tableName, List<Restriction> restrictions);
    Tuple bytesToTuple(String tableName, List<Type> types, int base);
}
