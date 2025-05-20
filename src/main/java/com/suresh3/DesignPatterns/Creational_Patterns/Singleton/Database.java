package com.suresh3.DesignPatterns.Creational_Patterns.Singleton;

public class Database {
    private static Database instance=null;
    private Database() {
        // private constructor to prevent instantiation
    }
    public static Database getInstance(){
        if(instance==null){
            synchronized (Database.class){
                if(instance==null){
                    instance=new Database();

                }
            }
        }
        return instance;
    }
}
