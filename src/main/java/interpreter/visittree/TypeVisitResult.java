package interpreter.visittree;

import common.type.Type;
import lombok.Getter;

public class TypeVisitResult extends ParseTreeVisitResult {
    @Getter
    private Type type;

    public TypeVisitResult(Type type) {
        this.type = type;
    }
}
