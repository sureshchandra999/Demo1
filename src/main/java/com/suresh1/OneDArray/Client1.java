package com.suresh1.OneDArray;

public class Client1 {
    public static void main(String[] args) {

    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = A[i] * A[i] * A[i];
        }
        return res;
    }
    //sort the array in ascending order
    public static int[] sortArray(int[] A) { //TC: O(n^2), SC: O(1)
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    // swap A[j] and A[j + 1]
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }
    //sort the array in descending order
public static int[] sortArrayDescending(int[] A) { //TC: O(n^2), SC: O(1)
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] < A[j + 1]) {
                    // swap A[j] and A[j + 1]
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }
    // Find the maximum element in the array
public static int findMax(int[] A) { //TC: O(n), SC: O(1)
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
    // Find the minimum element in the array
public static int findMin(int[] A) { //TC: O(n), SC: O(1)
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }
    // Count the frequency of each element in the array
public static int[] countFrequency(int[] A) { //TC: O(n^2), SC: O(n)
        int n = A.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[i] = 1; // Initialize frequency of each element to 1
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) {
                    freq[i]++;
                    freq[j] = -1; // Mark as counted
                }
            }
        }
        return freq;
    }
    // Reverse the array
public static int[] reverseArray(int[] A) { //TC: O(n), SC: O(1)
        int n = A.length;
        for (int i = 0; i < n / 2; i++) {
            // swap A[i] and A[n - i - 1]
            int temp = A[i];
            A[i] = A[n - i - 1];
            A[n - i - 1] = temp;
        }
        return A;
    }


}
