package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.SingletonDesignPattern4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    //volatile variable ensure visibility of changes to instance across threads
    private static volatile DatabaseConnection instance = null;
    private Connection connection;

    private DatabaseConnection(){
        if(instance != null){
            throw new IllegalStateException("Can not create a new instance of Singleton using reflection");

        }
        //Initialize the database connection here
        try{
            String url="jdbc:postgracesql://localhost:5432/mydb";
            String user="Admin";
            String password="Admin";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    //public static method to provide access to the instance
    public static DatabaseConnection getInstance(){
        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;

    }
    //method to return the database connection
    public Connection getConnection(){
        return connection;
    }

    //prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone of this class is not allowed");

    }

    //Ensure deserialization does not create another instance

    protected Object readResolve(){
        return getInstance();
    }
}
