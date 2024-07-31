package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.SingletonDesignPattern1;

public class Logger {
    private static Logger instance;

    private Logger() {
        // Initialization code
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log:::::: " + message);
    }
}
