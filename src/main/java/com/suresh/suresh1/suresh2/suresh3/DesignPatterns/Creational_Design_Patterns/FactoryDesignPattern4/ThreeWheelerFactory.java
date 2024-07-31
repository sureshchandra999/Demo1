package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern4;

public class ThreeWheelerFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Vehicle createVehicle() {
        return new ThreeWheeler();
    }
}
