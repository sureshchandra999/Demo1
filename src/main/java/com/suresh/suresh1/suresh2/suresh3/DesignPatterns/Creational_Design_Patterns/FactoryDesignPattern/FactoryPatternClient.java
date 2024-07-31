package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern;

public class FactoryPatternClient {

    public static void main(String[] args) {

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.factory();
        car.drive();//Driving a CAR.....


        VehicleFactory busFactory = new BusFactory();
        Vehicle bus = busFactory.factory();
        bus.drive();//Driving a BUS...............

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.factory();
        truck.drive();//Driving a TRUCK....


    }
}
