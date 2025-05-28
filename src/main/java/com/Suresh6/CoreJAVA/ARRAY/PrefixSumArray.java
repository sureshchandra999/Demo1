package com.Suresh6.CoreJAVA.ARRAY;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Calculate prefix sum array
        //TC: O(N), SC: O(N)


    }
    // This method calculates the prefix sum array of the given array.

    static int[] calculatePrefixSumOfGivenArray(int[] arr) {
        for(int i=0; i<arr.length; i++){ //TC: O(N)
            int sum= 0;
            for(int j=0; j<=i; j++){// TC: O(N)
                sum += arr[j];
            }
            arr[i] = sum; // Update the current index with the prefix sum


        }// Total TC: O(N^2), SC: O(1)
        return arr;

    }// This method modifies the original array to contain the prefix sums.

    // This method returns a new array containing the prefix sums. //
    static int[] calculatePrefixSumOfGivenArrayNew(int[] arr) {
        int[] prefixSum = new int[arr.length]; // Create a new array for prefix sums
        int sum = 0; // Initialize sum
        for (int i = 0; i < arr.length; i++) { // TC: O(N)
            sum += arr[i]; // Update sum with the current element
            prefixSum[i] = sum; // Store the prefix sum in the new array
        }// Total TC: O(N), SC: O(N)
        return prefixSum; // Return the new array containing prefix sums
    }
    // This method calculates the prefix sum array of the given array.
    static int[] calculatePrefixSumOfGivenArrayWithRecursion(int[] arr, int index, int sum) {
        if (index == arr.length) { // Base case: if index reaches the length of the array
            return arr; // Return the modified array
        }
        sum += arr[index]; // Update sum with the current element
        arr[index] = sum; // Store the prefix sum in the current index
        return calculatePrefixSumOfGivenArrayWithRecursion(arr, index + 1, sum); // Recursive call
    }

}
