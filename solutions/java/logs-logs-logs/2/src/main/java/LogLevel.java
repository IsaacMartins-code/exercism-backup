public enum LogLevel {
    UNKNOWN("", 0),
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42);

    private final String shortWord;
    private final int integerLevel;

    LogLevel(String shortWord, int integerLevel) {
        this.shortWord = shortWord;
        this.integerLevel = integerLevel;
    }
    public int getLogIntegerLevel() {
        return integerLevel;
    }
    public static LogLevel shortLogWord(String shortWord) {
        for (LogLevel logLevel : values()) {
            if (logLevel.shortWord.equals(shortWord)) {
                return logLevel;
            }
        }
        return UNKNOWN;
    }
}


