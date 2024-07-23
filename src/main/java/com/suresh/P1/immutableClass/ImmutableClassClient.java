package com.suresh.P1.immutableClass;

import java.util.Date;

public class ImmutableClassClient {

    public static void main(String[] args) {
        Date birthDate = new Date();
        Person person = new Person("John Doe", 30, birthDate);

        System.out.println(person);

        // Attempting to modify the birthDate should not affect the Person object
        birthDate.setTime(birthDate.getTime() - 1000000000L);
        System.out.println(person.getBirthDate());

        Person person1 = new Person("Ram", 30, new Date(23-10-2000));
        System.out.println(person1);

        // Attempting to modify the birthDate should not affect the Person object
        birthDate.setTime(birthDate.getTime() - 1000000000L);
        System.out.println(person.getBirthDate());
    }
}
