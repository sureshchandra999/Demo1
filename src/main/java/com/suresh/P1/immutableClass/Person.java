package com.suresh.P1.immutableClass;

import java.util.Date;

public class Person {
    private final String name;
    private final int age;
    private final Date birthDate;

    public Person(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        // Create a new Date object to ensure immutability
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        // Return a new Date object to ensure immutability
        return new Date(birthDate.getTime());
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", birthDate=" + birthDate + '}';
    }
}

