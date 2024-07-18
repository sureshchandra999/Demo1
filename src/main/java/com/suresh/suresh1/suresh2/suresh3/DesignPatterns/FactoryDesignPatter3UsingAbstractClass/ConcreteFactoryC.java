package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.FactoryDesignPatter3UsingAbstractClass;

public class ConcreteFactoryC extends Factory{
    /**
     * @return
     */
    @Override
    public Product factoryMethod() {
        return new ConcreteProductC();
    }
}
