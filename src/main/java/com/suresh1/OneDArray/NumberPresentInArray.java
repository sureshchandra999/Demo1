package com.suresh1.OneDArray;

import java.util.Scanner;

public class NumberPresentInArray {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Read the size of the array
            int N = scanner.nextInt();

            // Read the elements of the array
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Read the integer B
            int B = scanner.nextInt();

            // Check if B is present in A
            boolean isPresent = false;
            for (int i = 0; i < N; i++) {
                if (A[i] == B) {
                    isPresent = true;
                    break;
                }
            }

            // Print the result for this test case
            if (isPresent) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }



}


/*
import java.lang.*;
        import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Read the size of the array
            int N = scanner.nextInt();

            // Read the elements of the array
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Read the integer B
            int B = scanner.nextInt();

            // Check if B is present in A
            boolean isPresent = false;
            for (int i = 0; i < N; i++) {
                if (A[i] == B) {
                    isPresent = true;
                    break;
                }
            }

            // Print the result for this test case
            if (isPresent) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}*/
