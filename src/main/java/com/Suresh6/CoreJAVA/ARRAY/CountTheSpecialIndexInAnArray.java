package com.Suresh6.CoreJAVA.ARRAY;

public class CountTheSpecialIndexInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int specialIndexCount = countSpecialIndices(arr);
        System.out.println("Number of special indices: " + specialIndexCount);
    }

    // This method counts the number of special indices in the array.
    static int countSpecialIndices(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {// TC: O(N)// Iterate through each index of the array
            if (isSpecialIndex(arr, i)) {// Check if the index is special
                count++;
            }
        }
        return count;
    }

    // This method checks if the index is special.
    static boolean isSpecialIndex(int[] arr, int index) {// TC: O(1) // Check if the index meets the special condition
        // Define the condition for a special index.
        return arr[index] % 2 == 0; // Example condition: even number at the index
    }
}
