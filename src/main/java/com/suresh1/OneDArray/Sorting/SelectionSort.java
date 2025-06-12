package com.suresh1.OneDArray.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: ");
        printArray(arr);

        int[] sortedAsc = selectionSortAscending(arr.clone());
        System.out.println("Sorted Array in Ascending Order: ");
        printArray(sortedAsc);

        int[] sortedDesc = selectionSortDescending(arr.clone());
        System.out.println("Sorted Array in Descending Order: ");
        printArray(sortedDesc);

    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static int[] selectionSortAscending(int[] A) { //TC: O(n^2), SC: O(1)
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
        return A;
    }
    // Note: The above implementation sorts the array in ascending order.
    // To sort in descending order, simply change the comparison in the inner loop to A[j] > A[minIndex].

    static int[] selectionSortDescending(int[] A) { //TC: O(n^2), SC: O(1)
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the first element
            int temp = A[maxIndex];
            A[maxIndex] = A[i];
            A[i] = temp;
        }
        return A;
    }
}
