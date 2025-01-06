package com.suresh.JAVA8_FEATURES.OPTIONAL_Examples;

import java.util.Optional;


//Optional
//
//Optional is a container object which may or may not contain a non-null value.
// It helps to avoid NullPointerException.


public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        // Using ifPresent
        optional.ifPresent(System.out::println);

        // Using orElse
        String value = optional.orElse("Default Value");
        System.out.println(value);

        // Using map
        String upperCase = optional.map(String::toUpperCase).orElse("Default Value");
        System.out.println(upperCase);
    }
}
