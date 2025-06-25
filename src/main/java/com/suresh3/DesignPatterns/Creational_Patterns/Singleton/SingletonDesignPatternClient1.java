package com.suresh3.DesignPatterns.Creational_Patterns.Singleton;

public class SingletonDesignPatternClient1 {
    public static void main(String[] args) {

    }
    //More examples of singleton Design patterns
    // lazy initialization and thread-safe singleton
    public static class LazySingleton {
        private static LazySingleton instance;

        private LazySingleton() {
            // private constructor to prevent instantiation
        }

        public static LazySingleton getInstance() {
            if (instance == null) {
                synchronized (LazySingleton.class) {
                    if (instance == null) {
                        instance = new LazySingleton();
                    }
                }
            }
            return instance;
        }
    }


}
