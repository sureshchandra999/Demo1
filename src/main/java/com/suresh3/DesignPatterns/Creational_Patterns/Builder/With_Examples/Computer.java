package com.suresh3.DesignPatterns.Creational_Patterns.Builder.With_Examples;

/*
The Builder pattern is particularly useful when you need to create complex objects with
many optional components or configurations.



 */
public class Computer {
    //Required parameters
    private final String CPU;
    private final String RAM;

    //Optional parameters
    private String storage;
    private String graphicsCard;
    private String OS;
    private String hasWiFi;
    private String hasBluetooth;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.OS = builder.OS;
        this.hasWiFi = builder.hasWiFi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public static class ComputerBuilder {
        //Required parameters
        private final String CPU;
        private final String RAM;

        //Optional parameters
        private String storage;
        private String graphicsCard;
        private String OS;
        private String hasWiFi;
        private String hasBluetooth;

        ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public ComputerBuilder setHasWiFi(String hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public ComputerBuilder setHasBluetooth(String hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }


    }
}
