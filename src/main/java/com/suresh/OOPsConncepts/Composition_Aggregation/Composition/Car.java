package com.suresh.OOPsConncepts.Composition_Aggregation.Composition;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Car creates and owns the Engine
    }

    public void startCar() {
        engine.start();
        System.out.println("Car starts.............................");
    }

    public String getCarDetails() {
        return "Car model: " + model + ", Engine type: " + engine.getType();
    }
}
