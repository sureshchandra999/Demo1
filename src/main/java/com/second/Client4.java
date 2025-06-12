package com.second;

public class Client4 {
    public static void main(String[] args) {
        String s="Java is a good technology";

        String reversedString = new StringBuilder(s).reverse().toString();
        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);
        // Reverse the string using Stream API

        String reversedStringUsingStream = s.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, String::concat);
        // Print the reversed string using Stream API
        System.out.println("Reversed String using Stream API: " + reversedStringUsingStream);

        // print the duplicate characters in the string using java 8 features
        s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) != s.lastIndexOf(c))
                .distinct()
                .forEach(c -> System.out.println("Duplicate character: " + c));
        System.out.println("=========================================");


        // print the duplicate characters in the string using java 8 features with frequency
        s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) != s.lastIndexOf(c))
                .distinct()
                .forEach(c -> {
                    long frequency = s.chars().filter(ch -> ch == c).count();
                    System.out.println("Duplicate character: " + c + " Frequency: " + frequency);
                });
        System.out.println("=========================================");
        // print the duplicate characters in the string using java 8 features with frequency and count
        s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) != s.lastIndexOf(c))
                .distinct()
                .forEach(c -> {
                    long frequency = s.chars().filter(ch -> ch == c).count();
                    System.out.println("Duplicate character: " + c + " Frequency: " + frequency);
                });
        System.out.println("=========================================");

//
        // print the duplicate characters in the string using java 8 features with frequency and count
        s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) != s.lastIndexOf(c))
                .distinct()
                .forEach(c -> {
                    long frequency = s.chars().filter(ch -> ch == c).count();
                    System.out.println("Duplicate character: " + c + " Frequency: " + frequency);
                });
        System.out.println("=========================================");

        s.chars().mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) != s.lastIndexOf(c))
                .distinct()
                .forEach(c -> {
                    long frequency = s.chars().filter(ch -> ch == c).count();
                    System.out.println("Duplicate character: " + c + " Frequency: " + frequency);
                }
        );
        System.out.println("=========================================");
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        String reversedStringUsingCharArray = sb.toString();
        // Print the reversed string using char array
        System.out.println("Reversed String using char array: " + reversedStringUsingCharArray);
        // Reverse the string using StringBuilder
        String reversedStringUsingStringBuilder = new StringBuilder(s).reverse().toString();
        // Print the reversed string using StringBuilder
        System.out.println("Reversed String using StringBuilder: " + reversedStringUsingStringBuilder);
        // Reverse the string using StringBuffer
        String reversedStringUsingStringBuffer = new StringBuffer(s).reverse().toString();
        // Print the reversed string using StringBuffer
        System.out.println("Reversed String using StringBuffer: " + reversedStringUsingStringBuffer);
        // Reverse the string using recursion
        //String reversedStringUsingRecursion = reverseStringRecursively(s);
        // Print the reversed string using recursion
       // System.out.println("Reversed String using recursion: " + reversedStringUsingRecursion);

        

    }
}
