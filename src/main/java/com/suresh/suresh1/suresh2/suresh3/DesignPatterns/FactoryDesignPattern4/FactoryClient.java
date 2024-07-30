package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPattern4;

public class FactoryClient {
    public static void main(String[] args) {
        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Vehicle fourWheeler = fourWheelerFactory.createVehicle();
        fourWheeler.printVehicle();

        VehicleFactory threeWheelerFactory = new ThreeWheelerFactory();
        Vehicle threeWheeler = threeWheelerFactory.createVehicle();
        threeWheeler.printVehicle();

        VehicleFactory twoWheelerFActory = new TwoWheelerFactory();
        Vehicle twoWheeler = twoWheelerFActory.createVehicle();
        threeWheeler.printVehicle();



    }
}
