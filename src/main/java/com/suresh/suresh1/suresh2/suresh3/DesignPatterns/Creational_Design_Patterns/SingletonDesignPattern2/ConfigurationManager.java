package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.SingletonDesignPattern2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {
    // Volatile instance to ensure visibility of changes to instance across threads
    private static volatile ConfigurationManager instance;
    private Properties properties;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        properties = new Properties();
        loadProperties();
    }

    // Public static method to create and provide access to the singleton instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    // Load configuration properties from a file
    private void loadProperties() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Get a property value by key
    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    // Override clone method to prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton instance is not allowed");
    }




}
