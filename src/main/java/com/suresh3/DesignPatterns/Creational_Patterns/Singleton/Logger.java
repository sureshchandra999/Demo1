package com.suresh3.DesignPatterns.Creational_Patterns.Singleton;

public class Logger {
    // Volatile keyword ensures changes are visible to all threads
    private static volatile Logger instance;

    // Private constructor prevents instantiation from other classes
    private Logger() {}

    // Global access point with double-checked locking
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
