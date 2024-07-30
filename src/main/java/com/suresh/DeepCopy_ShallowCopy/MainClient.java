package com.suresh.DeepCopy_ShallowCopy;

public class MainClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "NY");
        Person person1 = new Person("John Doe", address);
        person1.attributes.put("height", "6ft");

        // Cloning person1
        Person person2 = (Person) person1.clone();

        // Modify the cloned object's address and attributes
        person2.address.city = "Los Angeles";
        person2.attributes.put("weight", "180lbs");

        // Outputs
        System.out.println("Person 1: " + person1.name + ", " + person1.address.city + ", " + person1.attributes);
        System.out.println("Person 2: " + person2.name + ", " + person2.address.city + ", " + person2.attributes);

        // They should be different objects
        System.out.println(person1.address == person2.address); // false
        System.out.println(person1.attributes == person2.attributes); // false
    }

}
