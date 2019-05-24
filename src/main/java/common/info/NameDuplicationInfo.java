package common.info;

import lombok.Getter;

public class NameDuplicationInfo implements OrdinaryInfo {
    @Getter
    private Rank rank = Rank.ERROR;
    private String title;
    private String name;

    public NameDuplicationInfo(String title, String name) {
        this.title = title;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Name duplication: " + title + ": " + name;
    }
}
