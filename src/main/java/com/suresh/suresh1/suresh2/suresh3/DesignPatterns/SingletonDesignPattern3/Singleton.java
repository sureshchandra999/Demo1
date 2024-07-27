package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.SingletonDesignPattern3;

public class Singleton {
    //volatile variable to ensure visibility of changes across threads
    private static volatile Singleton instance;

    //private constructor to prevent instantiation
    private Singleton(){
        //Prevent instantiation via refection
        if(instance != null){
            throw new IllegalStateException("Singleton instance already exists!");
        }
    }

    //public static getInstance() method to get the singleton instance copy
    //Double check locking to ensure thread safety and performance
    public static Singleton getInstance(){
        //
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //overriding clone() method to prevent cloning.
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this Singleton instance is not allowed!");
    }

    public void showMessage(){
        System.out.println("This is a Singleton Class.");
    }
}
