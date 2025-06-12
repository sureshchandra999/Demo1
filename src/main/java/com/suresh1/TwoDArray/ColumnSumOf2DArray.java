package com.suresh1.TwoDArray;

public class ColumnSumOf2DArray {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original 2D Array:");
        for (int[] row : A) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Array dimensions: " + A.length + " rows and " + A[0].length + " columns");


        int[] colSum = columnSum(A);
        System.out.println("Column sums:");
        for (int sum : colSum) {
            System.out.print(sum + " ");
        }

    }
    static int[] columnSum(int[][] A){// //TC: O(m*n), SC: O(n) why // O(m*n) because we are iterating through each element of the 2D array, where m is the number of rows and n is the number of columns.
        //SC: O(n) because we are using an additional array of size n to store the column sums.

        int rows = A.length;
        int cols = A[0].length;
        int[] colSum = new int[cols];

        for (int i = 0; i < rows; i++) { //
            for (int j = 0; j < cols; j++) {//
                colSum[j] += A[i][j];
            }
        }
        return colSum;
    }
    // Note: The above implementation assumes that the 2D array is rectangular (i.e., all rows have the same number of columns).
    // If the 2D array is jagged (i.e., rows can have different lengths), you would need to handle that case separately.
    // In that case, you can use a List to store the column sums and dynamically adjust the size as needed.
    // However, for simplicity, the above implementation assumes a rectangular 2D array.
    // If you want to handle jagged arrays, you can modify the code as follows:
    static int[] columnSumJagged(int[][] A) { //TC: O(m*n), SC: O(n)
        int cols = 0;
        for (int[] row : A) {
            cols = Math.max(cols, row.length);
        }
        int[] colSum = new int[cols];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                colSum[j] += A[i][j];
            }
        }
        return colSum;
    }

}
