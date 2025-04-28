package com.suresh1.DesignPatterns.SingletonDesignPattern;

public class DBC {
    private static DBC instance;

    private DBC() {
        // Private constructor to prevent instantiation
    }

    public static DBC getInstance() {
        if (instance == null) {
            synchronized (DBC.class) {
                if (instance == null) { // Double-checked locking
                    instance = new DBC();
                }
            }

        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }

    public void disconnect() {
        System.out.println("Disconnected from the database.");
    }
}
