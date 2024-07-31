package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.SingletonDesignPattern1;

public class LoggerExampleClient {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message."); // Output: Log: This is a log message.
    }

}
