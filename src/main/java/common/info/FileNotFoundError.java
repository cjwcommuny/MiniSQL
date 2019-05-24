package common.info;

import lombok.Getter;

public class FileNotFoundError implements OrdinaryInfo {
    @Getter
    private Rank rank = Rank.ERROR;
    @Getter
    private String fileName;

    public FileNotFoundError(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getMessage() {
        return "file not found: " + fileName;
    }
}
