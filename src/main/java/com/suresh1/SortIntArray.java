package com.suresh1;

import java.util.Arrays;

public class SortIntArray {
    public static void main(String[] args) {
        int[] arr = {-20, 2, 26, 16, -50, 5};
        System.out.println("Int Array: " + Arrays.toString(arr));

        // Sorting logic in a single for loop
        for (int i = 0; i < arr.length - 1; ) {
            if (sortOnce(arr, i)) {
                i++; // Move to the next index only when the inner comparison is complete
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Recursive method to perform sorting logic for a single iteration
    public static boolean sortOnce(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true; // End recursion when the index reaches the end
        }

        if (arr[index] > arr[index + 1]) {
            // Swap the elements
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }

        // Recur for the next index
        return sortOnce(arr, index + 1);
    }
}

