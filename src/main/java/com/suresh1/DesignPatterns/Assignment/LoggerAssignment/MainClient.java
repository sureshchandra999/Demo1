package com.suresh1.DesignPatterns.Assignment.LoggerAssignment;

public class MainClient {
    public static void main(String[] args) {
        LoggerSolution logger = LoggerSolution.getInstance();
        logger.setLogFile("MyApplication.log");
        System.out.println("Log file path: " + logger.getLogFile());

        logger.log(LogLevel.INFO, "This is an info message.");
        logger.log(LogLevel.DEBUG, "This is a debug message.");
        logger.log(LogLevel.WARN, "This is a warning message.");
        logger.log(LogLevel.ERROR, "This is an error message.");
        logger.log(LogLevel.FATAL, "This is a fatal message.");
        logger.log(LogLevel.TRACE, "This is a trace message.");
        logger.log(LogLevel.ALL, "This is an all message.");

        logger.flush();
        logger.close();
        // Reset the logger instance
        LoggerSolution.resetInstance();
        // Re-initialize the logger



    }
}
