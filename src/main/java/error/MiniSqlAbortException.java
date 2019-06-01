package error;

import common.info.Info;
import lombok.Getter;

import java.util.List;

public class MiniSqlAbortException extends MiniSqlCheckedError {
    @Getter
    private List<Info> infos;

    public MiniSqlAbortException(List<Info> infos) {
        this.infos = infos;
    }
}
