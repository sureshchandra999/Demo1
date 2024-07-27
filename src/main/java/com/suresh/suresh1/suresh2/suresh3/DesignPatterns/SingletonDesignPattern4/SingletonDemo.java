package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.SingletonDesignPattern4;

import java.sql.Connection;

public class SingletonDemo {
    public static void main(String[] args) {
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();

        System.out.println(dbConnection1 == dbConnection2); //true

        Connection connection = dbConnection1.getConnection();
        

    }
}
