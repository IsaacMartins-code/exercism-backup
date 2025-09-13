public class LogLine {
    
    private final LogLevel logLevel;
    private final String logMessage;

    public LogLine(String logLine) {
        String[] fields = logLine.split("]: ");
        this.logLevel = LogLevel.shortLogWord(fields[0].substring(1));
        this.logMessage = fields[1];
        
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        return getLogLevel().getLogIntegerLevel() + ":" + logMessage;
    }   
}
