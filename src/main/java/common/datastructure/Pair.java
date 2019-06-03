package common.datastructure;

import lombok.*;
import lombok.Value;

@ToString
public class Pair<A, B> {
    @Getter@Setter
    private A value1;
    @Getter@Setter
    private B value2;

    public Pair(A value1, B value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
