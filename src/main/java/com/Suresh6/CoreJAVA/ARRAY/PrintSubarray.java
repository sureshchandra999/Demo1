package com.Suresh6.CoreJAVA.ARRAY;

public class PrintSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Print one subarrays of the array:");
        printOneSubArray(arr, 1,3); // Prints subarray from index 1 to 3 (2, 3, 4)

        System.out.println("Print all subarrays of the array:");
        printAllSubArrays(arr); // Prints all subarrays of the array





    }
    // This method prints all subarrays of a given array.
    static void printOneSubArray(int[] arr, int start, int end) {// TC: O(N), SC: O(1)
        for (int i = start; i <= end; i++) { // TC: O(N)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // This method prints all subarrays of a given array.
    static void printAllSubArrays(int[] arr) {// TC: O(N^2), SC: O(1), TC: O(N^3) in total
        for (int i = 0; i < arr.length; i++) { // TC: O(N)
            for (int j = i; j < arr.length; j++) { // TC: O(N)
                // Print the subarray from index i to j
                // This nested loop iterates through all possible subarrays
                System.out.print("[");
                for (int k = i; k <= j; k++) { // TC: O(N)
                    System.out.print(arr[k] + " "); // Print the subarray from index i to j
                }
                System.out.print("] ");
                System.out.println(); // New line after each subarray
            }
        }
    }


}
