package com.suresh1.Patterns.ArrayPatterns;

public class First1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        //iterate through the array  1 to 5 always
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //iterate through the array using the modulus operator
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] % 2 + " ");
        }
        //iterate through the array using the modulus Number
        System.out.println("iterate through the array using the modulus Number:");
        int lngth = arr.length;
        for (int i = 0; i < lngth; i++) {
            System.out.print(arr[i] % lngth + " ");
        }

    }
}
