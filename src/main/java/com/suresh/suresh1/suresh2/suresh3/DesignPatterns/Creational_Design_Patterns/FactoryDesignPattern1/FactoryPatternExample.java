package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern1;

public class FactoryPatternExample {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vechile car = factory.createVehicle("car");
        car.drive(); // Output: Driving a car.

        Vechile bike = factory.createVehicle("bike");
        bike.drive(); // Output: Riding a bike.

        Vechile truck = factory.createVehicle("truck");
        truck.drive(); // Output: Driving a truck.
    }
}
