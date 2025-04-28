package com.suresh1.DesignPatterns.Assignment;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {


    private static FileBasedConfigurationManagerImpl instance;

    private FileBasedConfigurationManagerImpl() {
       //private constructor to prevent instantiation
    }



    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        String value=properties.getProperty(key);
        if(value == null) {
            return null;
        }
        switch (type.getSimpleName()) {
            case "Integer":
                return (T) Integer.valueOf(value);
            case "Long":
                return (T) Long.valueOf(value);
            case "Float":
                return (T) Float.valueOf(value);
            case "Double":
                return (T) Double.valueOf(value);
        }



        throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub

        throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub

        throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

       //throw new UnsupportedOperationException("Unimplemented method 'clear'");
        properties.clear();

    }

    public static FileBasedConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (instance == null) {
                    instance = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        if (instance != null) {
            instance.clear();
            instance = null;
        }
    }

}
