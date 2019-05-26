package common.datastructure.implementation;

import common.datastructure.Tuple;

import java.util.List;

public class TupleFactory {
    public Tuple createTuple(List<Object> data) {
        return new DefaultTuple(data);
    }
}
