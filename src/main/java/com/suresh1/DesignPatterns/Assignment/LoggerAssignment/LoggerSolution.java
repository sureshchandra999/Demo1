package com.suresh1.DesignPatterns.Assignment.LoggerAssignment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;

public class LoggerSolution implements Logger {

    private static LoggerSolution instance;
    private PrintWriter writer;
    private String logFilePath;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    //private constructor to prevent instantiation
    private LoggerSolution(){}

    //Singleton getInstance method
    public static LoggerSolution getInstance() {
        if (instance == null) {
            synchronized (LoggerSolution.class) {
                if (instance == null) { // Double-checked locking
                    instance = new LoggerSolution();
                }
            }
        }
        return instance;
    }
    public static void resetInstance() {
        synchronized (LoggerSolution.class) {
            if (instance != null) {
                instance.close();
                instance = null;
            }
        }
    }
    @Override
    public void setLogFile(String logFilePath) {
        try{
            if(writer != null) {
                writer.close();
            }
            this.logFilePath = logFilePath;
            //this.writer = new PrintWriter(logFilePath); //new FileWriter(filePath, true)
            this.writer = new PrintWriter(new FileWriter(logFilePath, true));
        } catch (IOException e) {
            System.err.println("Error setting log file: " + e.getMessage());
            throw new RuntimeException("Failed to set log file: " + logFilePath, e);
        }
    }
    @Override
    public void log(LogLevel level, String message) {
        if (writer == null) {
            throw new IllegalStateException("Log file not set. Call setLogFile() before logging.");
        }
        String logMessage = String.format("%s [%s] %s", java.time.LocalDateTime.now().format(formatter), level, message);
        writer.println(logMessage);
        //writer.flush();
    }
    @Override
    public String getLogFile() {
        return this.logFilePath;
    }
    @Override
    public void flush() {
        if (writer != null) {
            writer.flush();
        }
    }
    @Override
    public void close() {
        if (writer != null) {
            writer.close();
            writer = null;
        }
    }



}
