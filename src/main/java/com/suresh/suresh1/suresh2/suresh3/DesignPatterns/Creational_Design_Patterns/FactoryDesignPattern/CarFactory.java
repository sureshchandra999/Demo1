package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern;

public class CarFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Vehicle factory() {
        return new Car();
    }
}
