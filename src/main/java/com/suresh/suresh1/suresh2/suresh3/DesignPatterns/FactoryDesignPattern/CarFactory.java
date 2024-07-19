package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPattern;

public class CarFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Vehicle factory() {
        return new Car();
    }
}
