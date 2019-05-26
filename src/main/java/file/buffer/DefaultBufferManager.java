package file.buffer;

import common.info.Info;
import manager.FileHandler;

import java.util.LinkedList;
import java.util.List;

public class DefaultBufferManager implements FileHandler {
    @Override
    public List<Info> quit() {
        //TODO: write all buffer to disk
        return new LinkedList<>();
    }
}
