package common.info;

public interface OrdinaryInfo extends Info {
    enum Rank {
        INFO,
        WARNING,
        ERROR,
    }

    Rank getRank();

    String getMessage();

    @Override
    default String getFormatMessage() {
        return getRank() + ": " + getMessage();
    }
}
