package com.suresh3.DesignPatterns.Creational_Patterns.Builder.With_Examples;

public class Main {
    public static void main(String[] args) {
        // Create a Computer object using the Builder pattern
        Computer gamingPC = new Computer.ComputerBuilder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOS("Windows 10")
                .setHasWiFi("Yes")
                .setHasBluetooth("Yes")
                .build();
    }
}
