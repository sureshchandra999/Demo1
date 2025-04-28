package com.suresh1;

import java.util.Scanner;

// Full Numeric Pyramid
/*
if N=3,
0 0 3 0 0
0 2 4 6 0
1 2 3 4 5

if N=4,
0 0 0 4 0 0 0
0 0 3 6 9 0 0
0 2 4 6 8 10 0
1 2 3 4 5 6 7

if N=5,
0 0 0 0 5 0 0 0 0
0 0 0 4 8 12 0 0 0
0 0 3 6 9 12 15 0 0
0 2 4 6 8 10 12 14 0
1 2 3 4 5 6 7 8 9

 */


public class FullNumericPyramid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int spaces = N - i; // Number of leading and trailing zeros
            int count = i;      // Number of elements in the middle

            // Print leading zeros
            for (int j = 0; j < spaces; j++) {
                System.out.print("0 ");
            }

            // Print Number pattern values
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print( N-j+1 + " ");
            }

            // Print trailing zeros
            for (int j = 0; j < spaces; j++) {
                System.out.print("0 ");
            }

            System.out.println();
        }
    }
}

