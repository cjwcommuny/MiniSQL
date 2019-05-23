package common.info;

public interface OridinaryInfo extends Info {
    enum Rank {
        INFO,
        WARNING,
        ERROR,
    }

    String getMessage();
}
