package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPattern2;

public class ConcreteFactoryD implements Factory{
    /**
     * @return
     */
    @Override
    public Product factoryMethod() {
        return new ConcreteProductD();
    }
}
