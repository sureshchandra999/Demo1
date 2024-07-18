package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPatter3UsingAbstractClass;

public class ConcreteFactoryB extends Factory{
    /**
     * @return
     */
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
