package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPattern;

public class BusFactory implements VehicleFactory{
    /**
     * @return
     */
    @Override
    public Vehicle factory() {
        return new Bus();
    }
}
