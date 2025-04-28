package com.suresh1.DesignPatterns.SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        // Get the single instance of DBC
        DBC db1 = DBC.getInstance();
        DBC db2 = DBC.getInstance();
        // Check if both instances are the same
        if (db1 == db2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }


    }
}
