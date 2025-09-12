public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String[] fields = logLine.split("]: ");
        String log = fields[0].split("\\[")[1];

        switch(log) {
            case "TRC":
                return LogLevel.TRACE;

            case "DBG":
                return LogLevel.DEBUG;

            case "INF":
                return LogLevel.INFO;

            case "WRN":
                return LogLevel.WARNING;

            case "ERR": 
                return LogLevel.ERROR;

            case "FTL": 
                return LogLevel.FATAL;
        }
        
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        LogLevel log = getLogLevel();
        String message = "<ENCODED_LEVEL>:" + logLine.split(": ")[1];

        switch(log) {
            case LogLevel.TRACE:
                return message.replace("<ENCODED_LEVEL>", "1");

            case LogLevel.DEBUG:
                return message.replace("<ENCODED_LEVEL>", "2");

            case LogLevel.INFO:
                return message.replace("<ENCODED_LEVEL>", "4");

            case LogLevel.WARNING:
                return message.replace("<ENCODED_LEVEL>", "5");

            case LogLevel.ERROR: 
                return message.replace("<ENCODED_LEVEL>", "6");

            case LogLevel.FATAL: 
                return message.replace("<ENCODED_LEVEL>", "42");
        }

        return message.replace("<ENCODED_LEVEL>", "0");
    }   
}
