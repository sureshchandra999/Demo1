package com.suresh1.OneDArray;

public class PrefixSum {
    public static void main(String[] args) {

    }
    // Function to calculate the prefix sum of an array
    public static int[] prefixSum(int[] arr) { //TC: O(n), SC: O(n)
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }
    // Function to calculate the sum of elements in a subarray using prefix sum
    public static int rangeSum(int[] prefix, int l, int r) { //TC: O(1), SC: O(1)
        if (l == 0) {
            return prefix[r];
        } else {
            return prefix[r] - prefix[l - 1];
        }
    }
    // calculate the suffix sum array of an array
    public static int[] suffixSum(int[] A) { //TC: O(n), SC: O(n)
        int n = A.length;
        int[] suffixSumArray = new int[n];
        suffixSumArray[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSumArray[i] = suffixSumArray[i + 1] + A[i];
        }
        return suffixSumArray;

    }
    // Function to calculate the sum of elements in a subarray using suffix sum
    public static int rangeSumSuffix(int[] suffix, int l, int r) { //TC: O(1), SC: O(1)
        if (r == suffix.length - 1) {
            return suffix[l];
        } else {
            return suffix[l] - suffix[r + 1];
        }
    }

    // Functio to calcualte prefix max array of an array
    public static int[] prefixMax(int[] A) { //TC: O(n), SC: O(n)
        int n = A.length;
        int[] prefixMaxArray = new int[n];
        prefixMaxArray[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixMaxArray[i] = Math.max(prefixMaxArray[i - 1], A[i]);
        }
        return prefixMaxArray;
    }
    // Function to calculate the maximum element in a subarray using prefix max
    public static int rangeMax(int[] prefixMax, int l, int r) { //TC: O(1), SC: O(1)
        if (l == 0) {
            return prefixMax[r];
        } else {
            return Math.max(prefixMax[r], prefixMax[l - 1]);
        }
    }
    // Function to calculate prefix min array of an array
    public static int[] prefixMin(int[] A) { //TC: O(n), SC: O(n)
        int n = A.length;
        int[] prefixMinArray = new int[n];
        prefixMinArray[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixMinArray[i] = Math.min(prefixMinArray[i - 1], A[i]);
        }
        return prefixMinArray;
    }
    // Function to calculate the minimum element in a subarray using prefix min
    public static int rangeMin(int[] prefixMin, int l, int r) { //TC: O(1), SC: O(1)
        if (l == 0) {
            return prefixMin[r];
        } else {
            return Math.min(prefixMin[r], prefixMin[l - 1]);
        }
    }
    // Function to calculate prefix product array of an array
    public static long[] prefixProduct(int[] A) { //TC: O(n), SC: O(n)
        int n = A.length;
        long[] prefixProductArray = new long[n];
        prefixProductArray[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixProductArray[i] = prefixProductArray[i - 1] * A[i];
        }
        return prefixProductArray;
    }



}
