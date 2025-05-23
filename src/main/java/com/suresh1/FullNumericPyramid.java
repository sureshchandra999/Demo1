package com.suresh1;

import java.util.Scanner;

public class FullNumericPyramid {
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

            // Print increasing pattern values
            for (int j = 1; j <= count; j++) {
                System.out.print((i * j) + " ");
            }

            // Print trailing zeros
            for (int j = 0; j < spaces; j++) {
                System.out.print("0 ");
            }

            System.out.println();
        }
    }
}

