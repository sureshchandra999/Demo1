package com.Suresh6.CoreJAVA.ARRAY;

public class FindMinAndMaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] minMax = findMinAndMax(arr);
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);


    }
    // This method finds the minimum and maximum elements in an array.
    //TC: O(N), where N is the number of elements in the array.
    //SC: O(1), as it uses a constant amount of space for min and max variables.
    static int[] findMinAndMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max}; // Return an array containing min and max
    }
}
