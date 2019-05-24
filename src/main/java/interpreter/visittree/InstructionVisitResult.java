package interpreter.visittree;

import common.info.Info;
import lombok.Getter;

import java.util.List;

public class InstructionVisitResult extends ParseTreeVisitResult {
    @Getter
    private List<Info> infos;

    public InstructionVisitResult(List<Info> infos) {
        this.infos = infos;
    }
}
