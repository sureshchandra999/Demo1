package com.suresh1.Patterns;
import java.util.Scanner;

/*
if N= 5, then the pattern is:
0 0 0 0 5 0 0 0 0
0 0 0 4 8 12 0 0 0
0 0 3 6 9 12 15 0 0
0 2 4 6 8 10 12 14 0
1 2 3 4 5 6 7 8 9

if N= 4, then the pattern is:
0 0 0 4 0 0 0
0 0 3 6 9 0 0
0 2 4 6 8 10 0
1 2 3 4 5 6 7

if N= 3, then the pattern is:
0 0 3 0 0
0 2 4 6 0
1 2 3 4 5

if N= 2, then the pattern is:
0 2 0
1 2 3



*/

public class NumericPyramid {

    // Method to print Full Numeric Pyramid pattern
    public static void printFullNumericPyramid(int N) {
        for (int row = 1; row < N; row++) {
            // Print leading zeros
            for (int lzero = 0; lzero < N - row; lzero++) {
                System.out.print("0 ");
            }

            // Print increasing multiples or numbers
            /*for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }*/
            // Print numbers
            for (int j = 0; j < row; j++) {
                System.out.print((row + j) * (N ) + " ");
            }

            // Print trailing zeros
            for (int tzero = 0; tzero < N - row; tzero++) {
                System.out.print("0 ");
            }

            System.out.println();
        }

        // Print the last row with consecutive numbers
        for (int i = 1; i <= 2 * N - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number N from the user
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Print the Full Numeric Pyramid pattern for N
        System.out.println("Full Numeric Pyramid pattern:");
        printFullNumericPyramid(N);

        scanner.close();
    }
}
