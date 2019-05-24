package interpreter.error;

import common.info.Info;
import lombok.Getter;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.LinkedList;
import java.util.List;

public abstract class ParseException extends ParseCancellationException {
    @Getter
    private List<Info> infos = new LinkedList<>();

    public void addInfo(Info info) {
        infos.add(info);
    }
}
