package common.datastructure;

import lombok.Value;

@Value
public class Pair<A, B> {
    private A value1;
    private B value2;
}
