package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern2;

public class ConcreteFactoryD implements Factory{
    /**
     * @return
     */
    @Override
    public Product factoryMethod() {
        return new ConcreteProductD();
    }
}
