package com.suresh1.DesignPatterns.Assignment.LoggerAssignment;

public interface Logger {
    void setLogFile(String logFilePath);
    void log(LogLevel level, String message);
    String getLogFile();
    void flush();
    void close();
}
