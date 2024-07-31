package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern2;

public class ConcreteFactoryC implements Factory{
    /**
     * @return
     */
    @Override
    public Product factoryMethod() {
        return new ConcreteProductC();
    }
}
