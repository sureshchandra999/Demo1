package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPattern1;

public class VehicleFactory {
    // Factory method to create vehicles based on the type
    public Vechile createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
