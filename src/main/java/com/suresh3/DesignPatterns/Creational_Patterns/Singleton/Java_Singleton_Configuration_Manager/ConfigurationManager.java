package com.suresh3.DesignPatterns.Creational_Patterns.Singleton.Java_Singleton_Configuration_Manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private Properties properties;

    // Private constructor to load properties
    private ConfigurationManager() {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("C:\\Workspace_1\\Abc\\Demo1\\src\\main\\java\\com\\suresh3\\DesignPatterns\\Creational_Patterns\\Singleton\\Java_Singleton_Configuration_Manager\\config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file", e);
        }
    }

    // Double-checked locking Singleton
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

    // Getter for config values
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
