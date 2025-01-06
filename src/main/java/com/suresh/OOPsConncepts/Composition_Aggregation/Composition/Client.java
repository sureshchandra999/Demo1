package com.suresh.OOPsConncepts.Composition_Aggregation.Composition;

public class Client {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Electric");
        System.out.println(car.getCarDetails());
        car.startCar();
    }
}
