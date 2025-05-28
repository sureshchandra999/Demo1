package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPatter3UsingAbstractClass;

//Client1 class
public class FactoryMethodExample {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.factoryMethod();
        productA.display();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.factoryMethod();
        productB.display();

        Factory factoryC = new ConcreteFactoryC();
        Product productC= factoryC.factoryMethod();
        productC.display();

        Factory factoryD = new ConcreteFactoryD();
        Product productD = factoryD.factoryMethod();
        productD.display();


    }
}
