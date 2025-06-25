package com.suresh3.DesignPatterns.Creational_Patterns.Singleton.Java_Singleton_Configuration_Manager;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("App Name: " + config.getProperty("app.name"));
        System.out.println("Version: " + config.getProperty("app.version"));
        System.out.println("Log Level: " + config.getProperty("log.level"));
    }
}
