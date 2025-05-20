package com.suresh3.DesignPatterns.Creational_Patterns.Builder.Example3;

public class BuilderDesignPatternExample {
    public static void main(String[] args) {
        // Create a new Person object using the builder pattern
        Person person = new Person.Builder("John", "Doe")
                .age(30)
                .address("123 Main St")
                .phoneNumber("555-1234")
                .build();

        // Print the person's information
        System.out.println(person);
    }
}
