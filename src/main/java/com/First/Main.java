package com.First;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] array = new int[10];
        /*array.add(2);
        array.add(3);
        array.add(4);
*/

        Scanner scanner = new Scanner(System.in);

        // Reading N and M
        System.out.println("Enter the number of rows (N): ");
        int N = scanner.nextInt();
        System.out.println("Enter the number of columns (M): ");
        int M = scanner.nextInt();

        // Creating the matrix
        int[][] mat = new int[N][M];

        // Reading the matrix elements
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        // Printing the matrix row by row
        System.out.println("The matrix is: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }






    }
    /*static int countTheSumPairsInArray(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;

    }*/



}
