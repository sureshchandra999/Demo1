package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.AbstractFactoryPattern;

public class GasolineVehicleFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Car createCar() {
        return new GasolineCar();
    }

    /**
     * @return
     */
    @Override
    public Bike createBike() {
        return new GasolineBike();
    }

    /**
     * @return
     */
    @Override
    public Bus createBus() {
        return new GasolineBus();
    }
}
