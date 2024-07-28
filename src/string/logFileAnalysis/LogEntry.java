package string.logFileAnalysis;

public class LogEntry {
    private String timestamp;
    private String logLevel;
    private String message;

    public LogEntry(String timestamp, String logLevel, String message) {
        this.timestamp = timestamp;
        this.logLevel = logLevel;
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "timestamp='" + timestamp + '\'' +
                ", logLevel='" + logLevel + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
