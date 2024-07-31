package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.SingletonDesignPattern2;

public class ConfigurationManagerExampleClient {

    public static void main(String[] args) {
        // Get the singleton instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Access configuration properties
        String dbHost = configManager.getProperty("db.host");
        String dbPort = configManager.getProperty("db.port");
        String dbUser = configManager.getProperty("db.user");

        // Output the configuration properties
        System.out.println("Database Host: " + dbHost);
        System.out.println("Database Port: " + dbPort);
        System.out.println("Database User: " + dbUser);

        // Attempt to clone the singleton instance (this should throw an exception)
        try {
            ConfigurationManager cloneManager = (ConfigurationManager) configManager.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage()); // Output: Cloning of this singleton instance is not allowed
        }
    }
}
