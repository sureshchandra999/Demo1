package com.First;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Initialize matrices
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Read matrix A
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Read matrix B
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        // Print the resulting matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
            System.out.println("size of matrix is: " + result.length + "x" + result[0].length);
        }
        //print the no of rows and columns of the matrix
        System.out.println("size of matrix is: " + result.length + "x" + result[0].length);
        //
    }
}
