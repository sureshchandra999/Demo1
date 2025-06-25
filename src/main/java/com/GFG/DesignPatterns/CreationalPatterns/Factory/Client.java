package com.GFG.DesignPatterns.CreationalPatterns.Factory;

public class Client {
    public static void main(String[] args) {
        // Create a TwoWheelerFactory
        VechileFactory twoWheelerFactory = new TwoWheelerFactory();
        // Create a TwoWheeler using the factory
        Vechile twoWheeler = twoWheelerFactory.createVechile();
        // Print the TwoWheeler details
        twoWheeler.printVechile();

        // Create a ThreeWheelerFactory
        VechileFactory threeWheelerFactory = new ThreeWheelerFactory();
        // Create a ThreeWheeler using the factory
        Vechile threeWheeler = threeWheelerFactory.createVechile();
        // Print the ThreeWheeler details
        threeWheeler.printVechile();

        // Create a FourWheelerFactory
        VechileFactory fourWheelerFactory = new FourWheelerFactory();
        // Create a FourWheeler using the factory
        Vechile fourWheeler = fourWheelerFactory.createVechile();
        // Print the FourWheeler details
        fourWheeler.printVechile();
        // Output:
        // TwoWheeler created
        // ThreeWheeler created
        // FourWheeler created
        // This demonstrates the Factory Design Pattern where the client code does not need to know
        // the details of how the objects are created. It only interacts with the factory interface
        // and the created objects.
        // This allows for better abstraction and flexibility in the code, as new types of vehicles
        // can be added without changing the client code.
        // This is a simple demonstration of the Factory Design Pattern in Java.
    }
}
