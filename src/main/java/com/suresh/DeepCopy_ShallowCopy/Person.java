package com.suresh.DeepCopy_ShallowCopy;

import java.util.HashMap;
import java.util.Map;

public class Person implements Cloneable {

    String name;
    Address address;
    Map<String, String> attributes;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
        this.attributes = new HashMap<>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow copy
        Person clonedPerson = (Person) super.clone();

        // Deep copy of address
        clonedPerson.address = (Address) this.address.clone();

        // Deep copy of attributes
        clonedPerson.attributes = new HashMap<>(this.attributes);

        return clonedPerson;
    }
}
