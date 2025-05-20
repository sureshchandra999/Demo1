package com.First;

import java.util.Scanner;

public class RowSumMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Initialize matrix
        int[][] A = new int[N][M];

        // Read matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print sum of each row
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < M; j++) {
                rowSum += A[i][j];
            }
            System.out.print(rowSum + " ");
        }


    }
}
