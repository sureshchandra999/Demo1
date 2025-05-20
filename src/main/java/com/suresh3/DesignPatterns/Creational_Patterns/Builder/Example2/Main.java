package com.suresh3.DesignPatterns.Creational_Patterns.Builder.Example2;

public class Main {
    public static void main(String[] args) {
        // Create a Pizza object using the Builder pattern
        Pizza pizza = new Pizza.Builder()
                .dough("Thin crust")
                .sauce("Tomato")
                .cheese("Mozzarella")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .build();

        System.out.println("Pizza created with required: " + pizza);
        //System.out.println("Pizza created with dough : " + pizza.dough);

    }

}
