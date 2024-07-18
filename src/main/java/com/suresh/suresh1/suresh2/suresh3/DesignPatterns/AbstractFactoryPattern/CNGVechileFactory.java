package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.AbstractFactoryPattern;

public class CNGVechileFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Car createCar() {
        return new CNGCar();
    }

    /**
     * @return
     */
    @Override
    public Bike createBike() {
        return new CNGBike();
    }

    /**
     * @return
     */
    @Override
    public Bus createBus() {
        return new CNGBus();
    }
}
