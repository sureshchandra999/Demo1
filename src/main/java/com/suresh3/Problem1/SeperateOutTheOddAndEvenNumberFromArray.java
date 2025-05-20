package com.suresh3.Problem1;

import java.util.Scanner;

public class SeperateOutTheOddAndEvenNumberFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of array:");
        int numberOfArray = scanner.nextInt();
        System.out.println("Enter the Length of array:");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the Length of array:");
        int lengthOfArray1 = scanner.nextInt();
        int[] array1 = new int[lengthOfArray1];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < lengthOfArray1; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\nEven numbers:");
        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }



    }
}
