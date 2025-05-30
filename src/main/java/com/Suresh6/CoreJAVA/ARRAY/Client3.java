package com.Suresh6.CoreJAVA.ARRAY;



public class Client3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 2}, {1, 3}, {2, 4}};
        long[] result = rangeSum(A, B);
        System.out.println("The result of range sums is:");
        for (long sum : result) {
            System.out.print(sum + " ");
        }

    }

    static long[] rangeSum(int[] A, int[][] B) {
        // This method calculates the sum of elements in the array A for each range specified in B.
        long[] resultArray = new long[B.length];
        for (int i = 0; i < B.length; i++) {
            int startIndexOfArray = B[i][0];
            int endIndexOfArray = B[i][1];
            long sum = 0;
            for (int j = startIndexOfArray; j <= endIndexOfArray; j++) {
                sum += A[j];
            }
            resultArray[i] = sum;
        }
        return resultArray;
    }
    // This method calculates the sum of elements in the array A for each range specified in B using prefix sums.
    // This is an optimized version of the rangeSum method that uses prefix sums to improve performance.
    //Total Time Complexity: O(N + M), where N is the length of array A and M is the number of queries in B.
    //Total Space Complexity: O(N), where N is the length of array A for storing the prefix sums.

    static long[] rangeSumOptimized(int[] A, int[][] B) {
        // This method calculates the sum of elements in the array A for each range specified in B using prefix sums.
        long[] resultArray = new long[B.length];
        long[] prefixSum = new long[A.length + 1];

        // Calculate prefix sums
        for (int i = 0; i < A.length; i++) { //TC: O(N), SC: O(N)
            prefixSum[i + 1] = prefixSum[i] + A[i];
        }

        // Calculate range sums using prefix sums
        for (int i = 0; i < B.length; i++) {// TC: O(M), SC: O(1)
            int startIndexOfArray = B[i][0];
            int endIndexOfArray = B[i][1];
            resultArray[i] = prefixSum[endIndexOfArray + 1] - prefixSum[startIndexOfArray];
        }
        return resultArray;
    }
}

