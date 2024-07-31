package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern;

public class TruckFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Vehicle factory() {
        return new Truck();
    }
}
