package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Creational_Design_Patterns.FactoryDesignPattern1;

public class Car implements Vechile{

    /**
     *The Factory Design Pattern is a creational pattern that provides an interface for creating objects
     *  in a superclass but allows subclasses to alter the type of objects that will be created.
     *  This pattern is particularly useful when the exact type of the object to be created is
     *  determined at runtime.
     */
    @Override
    public void drive() {

            System.out.println("Driving a car.");

    }
}
