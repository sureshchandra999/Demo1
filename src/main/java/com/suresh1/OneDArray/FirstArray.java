package com.suresh1.OneDArray;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = -20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //arr[5] = 60; // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        String[] names = new String[3];
        names[0] = "Suresh";
        names[1] = "null";
        names[2] = "Ramesh";
        System.out.println("Printing names array");
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Printing names array using enhanced for loop");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(arr));




    }
}
