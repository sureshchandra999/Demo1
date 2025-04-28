package com.suresh1.Patterns;
import java.util.Scanner;

public class GenratePattern1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        printPattern(N);
        scanner.close();
    }

    private static void printPattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (2 * N - 1); j++) {
                if (j < (N - i - 1) || j > (N + i - 1)) {
                    System.out.print("0 ");
                } else {
                    if (i == 0) {
                        System.out.print(N + " ");
                    } else {
                        int value = i % 2 == 0 ? (j - (N - i - 1)) : (N - (j - (N - i - 1)));
                        System.out.print(value + " ");
                    }
                }
            }
            System.out.println();
        }
    }

}