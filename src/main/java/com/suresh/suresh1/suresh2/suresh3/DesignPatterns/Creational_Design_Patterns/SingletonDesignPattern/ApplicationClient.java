package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.SingletonDesignPattern;

public class ApplicationClient {
    public static void main(String[] args) {
        // Accessing the single instance of DatabaseConnectionManager
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        // Using the connection manager to handle database connections...

        System.out.println(connectionManager.hashCode());

        DatabaseConnectionManager connectionManager1 = DatabaseConnectionManager.getInstance();

        System.out.println(connectionManager1.hashCode());

        System.out.println(connectionManager.hashCode() == connectionManager1.hashCode());



    }
}
