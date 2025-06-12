package com.suresh1.TwoDArray;

public class TransposeTwoDMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        int[][] transposed = transpose(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
        int[][] inPlaceTransposed = transposeInPlace(matrix);
        System.out.println("In-Place Transposed Matrix:");
        printMatrix(inPlaceTransposed);


    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transposed = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    static int[][] transposeInPlace(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Transpose the matrix in place
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        return matrix;
    }
    static void swap(int[] x, int[] y) {
        int temp = x[0];
        x[0] = y[0];
        y[0] = temp;
    }
    static void swap(int[] x, int y) {
        int temp = x[0];
        x[0] = y;
        y = temp;
    }

    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }


}
