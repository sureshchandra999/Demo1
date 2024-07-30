package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPattern4;

public class FourWheelerFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
