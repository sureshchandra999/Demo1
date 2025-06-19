package com.suresh1.OneDArray;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        // Example usage
        int[] A = {1, 2, 3, 4, 5};
        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(A));
        System.out.println("Original Array: " );
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println(); // Print a new line for better readability
        int[] reversedArr = reverseArray(A);
        System.out.println(); // Print a new line for better readability
        System.out.println("Reversed Array: " + Arrays.toString(reversedArr));
        System.out.println("Reversed Array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }

        System.out.println(); // Print a new line for better readability
        int[] B = {10, 20, 30, 40, 50};
        // Print the original array
        System.out.println("Original Array B: " + Arrays.toString(B));
        int[] reverseArray =reverseArrayInPlaceUsingXOR(B);
        System.out.println("Reversed Array B using XOR: " + Arrays.toString(reverseArray));

    }

    // Function to reverse an integer array
    public static int[] reverseArray(int[] arr) { //TC: O(n), SC: O(1)
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
        return arr; // Return the reversed array
    }
    // Function to reverse an integer array in place using XOR operation
    public static int[] reverseArrayInPlaceUsingXOR(int[] A) { //TC: O(n), SC: O(1)
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            // Swap elements using XOR operation
            A[left] = A[left] ^ A[right]; // Step 1: XOR both numbers
            A[right] = A[left] ^ A[right]; // Step 2: XOR the new value of 'left' with 'right' to get the original value of 'left'
            A[left] = A[left] ^ A[right]; // Step 3: XOR the new value of 'right' with 'left' to get the original value of 'right'


            // Move towards the middle
            left++;
            right--;
        }
        return A; // Return the reversed array
    }

    //Reverse the part of an array from index u to index v
    public static int[] reversePartOfArray(int[] arr, int u, int v) { //TC: O(n), SC: O(1)
        if (u < 0 || v >= arr.length || u >= v) {
            throw new IllegalArgumentException("Invalid indices for reversal");
        }

        while (u < v) {
            // Swap elements at u and v indices
            int temp = arr[u];
            arr[u] = arr[v];
            arr[v] = temp;

            // Move towards the middle
            u++;
            v--;
        }
        return arr; // Return the array with the specified part reversed
    }

}
