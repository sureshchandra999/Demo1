package com.suresh1.OneDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Client3 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "Hello";
        arr[1] = "World";
        arr[2] = "Java";
        System.out.println("Printing 1D array");
        for (String str : arr) {
            System.out.print(str + " ");
        }

        System.out.println();
        int[] A = new int[5];
        A[0] = 5;
        A[1] = 10;
        A[2] = 3;
        A[3] = 8;
        A[4] = 1;
        System.out.println("Printing 1D array using for loop");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        //sort the array in ascending order using inbuilt sort method
        Arrays.sort(A); //TC: O(n log n), SC: O(1)

        System.out.println("Printing sorted 1D array in ascending order");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }


    }

    /*
    Order of Time Complexity:
    1. O(1) - Constant Time: The time taken by the algorithm is constant and does not depend on the size of the input.
    2. O(log n) - Logarithmic Time: The time taken by the algorithm increases logarithmically with the size of the input.
    3. O(n) - Linear Time: The time taken by the algorithm increases linearly with the size of the input.
    4. O(n log n) - Linearithmic Time: The time taken by the algorithm increases linearly with the size of the input multiplied by the logarithm of the size of the input.
    5. O(n^2) - Quadratic Time: The time taken by the algorithm increases quadratically with the size of the input.
    6. O(2^n) - Exponential Time: The time taken by the algorithm increases exponentially with the size of the input.
    7. O(n!) - Factorial Time: The time taken by the algorithm increases factorially with the size of the input.
    Note: The order of time complexity is important to understand the efficiency of an algorithm. The lower the order, the more efficient the algorithm is.

    O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(2^n) < O(n!)

    Note: The above order is based on the assumption that n is a large number. For small values of n, the order may not hold true.
    Note: The above order is based on the assumption that n is a large number. For small values of n, the order may not hold true.
    Note: The above order is based on the assumption that n is a large number. For small values of n, the order may not hold true.

    Give the simple example of O(log n) time complexity. In which case we use O(log n) time complexity?:
    ========================================================================================
    O(log n) time complexity is commonly seen in algorithms that divide the input size in half at each step, such as binary search.
    For example, in a binary search algorithm, we repeatedly divide the search space in half until we find the target element or determine that it is not present. This results in a logarithmic time complexity because the number of steps required to reduce the search space to one element is proportional to the logarithm of the size of the input.
    Example of O(log n) time complexity:
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // To avoid overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
    Note: O(log n) is often used in algorithms that involve searching or sorting, where the input size is reduced significantly at each step, leading to a logarithmic growth in time complexity.
    Note: O(log n) is often used in algorithms that involve searching or sorting, where the input size is reduced significantly at each step, leading to a logarithmic growth in time complexity.
    Note: O(log n) is often used in algorithms that involve searching or sorting, where the input size is reduced significantly at each step, leading to a logarithmic growth in time complexity.
    




     */
}
