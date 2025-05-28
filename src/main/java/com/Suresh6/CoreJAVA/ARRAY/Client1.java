package com.Suresh6.CoreJAVA.ARRAY;

import java.util.ArrayList;

public class Client1 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("ArrayList: " + arrayList);
        for (Integer number : arrayList) {
            System.out.println("Number: " + number);
        }
arrayList.remove(2); // Remove element at index

        System.out.println("ArrayList after removing element at index 2: " + arrayList);
        arrayList.add(6); // Add new element
        System.out.println("ArrayList after adding element 6: " + arrayList);
        arrayList.set(1, 10); // Update element at index 1
        System.out.println("ArrayList after updating element at index 1 to 10: " + arrayList);
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());
        System.out.println("Does ArrayList contain 3? " + arrayList.contains(3));
        System.out.println("Index of element 4: " + arrayList.indexOf(4));
        System.out.println("Last index of element 4: " + arrayList.lastIndexOf(4));
        System.out.println("Element at index 0: " + arrayList.get(0));
        System.out.println("Iterating through ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + arrayList.get(i));
        }

    }

}
