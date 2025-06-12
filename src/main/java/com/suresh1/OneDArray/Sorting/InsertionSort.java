package com.suresh1.OneDArray.Sorting;

public class InsertionSort {
    public static void main(String[] args) {

    }

    static int[] insertionSortAscending(int[] A) { //TC: O(n^2), SC: O(1)
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int key = A[i];
            int j = i - 1;

            // Move elements of A[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
        return A;
    }
    // Note: The above implementation sorts the array in ascending order.
    static int[] insertionSortDescending(int[] A) { //TC: O(n^2), SC: O(1)
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int key = A[i];
            int j = i - 1;

            // Move elements of A[0..i-1], that are less than key,
            // to one position ahead of their current position
            while (j >= 0 && A[j] < key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
        return A;
    }
    // Note: The above implementation sorts the array in descending order.
}
