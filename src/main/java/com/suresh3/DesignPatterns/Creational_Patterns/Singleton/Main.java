package com.suresh3.DesignPatterns.Creational_Patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        // Example usage of the Logger singleton
        /*
        R
         */
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.log(Thread.currentThread().getName() + " logging...");
        };

        // Simulating multiple threads using the logger
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
