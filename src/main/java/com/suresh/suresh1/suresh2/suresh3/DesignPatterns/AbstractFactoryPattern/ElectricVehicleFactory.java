package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.AbstractFactoryPattern;

public class ElectricVehicleFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    /**
     * @return
     */
    @Override
    public Bike createBike() {
        return new ElectricBike();
    }

    /**
     * @return
     */
    @Override
    public Bus createBus() {
        return new ElectricBus();
    }
}
