package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.AbstractFactoryPattern;

public class AbstractFactoryPatternExampleClient {

    public static void main(String[] args) {
        // Create electric vehicles
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        Car electricCar = electricFactory.createCar();
        Bike electricBike = electricFactory.createBike();
        Bus elcetricBus = electricFactory.createBus();

        electricCar.drive(); // Output: Driving an electric car.
        electricBike.ride(); // Output: Riding an electric bike.
        elcetricBus.drive(); //

        System.out.println("=================================");
        // Create gasoline vehicles
        VehicleFactory gasolineFactory = new GasolineVehicleFactory();
        Car gasolineCar = gasolineFactory.createCar();
        Bike gasolineBike = gasolineFactory.createBike();
        Bus gasolineBus = gasolineFactory.createBus();

        gasolineCar.drive(); // Output: Driving a gasoline car.
        gasolineBike.ride(); // Output: Riding a gasoline bike.
        gasolineBus.drive();

        System.out.println("=================================");
        // Create CNG vehicles
        VehicleFactory cngFactory = new CNGVechileFactory();
        Car cngCar = cngFactory.createCar();
        Bike cngBike = cngFactory.createBike();
        Bus cngBus = cngFactory.createBus();

        cngCar.drive();//
        cngBike.ride();//
        cngBus.drive();//


    }
}
