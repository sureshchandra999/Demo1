package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPattern4;

public class TwoWheelerFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
