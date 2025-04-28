package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintPattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The pattern is:: ");
        for (int row = 1; row <= N; row++) {

            for (int star = 1; star <= (N - row + 1); star++) {

                System.out.print("*");
            }
            for (int space = 1; space <= (2*row - 2); space++) {
                System.out.print("-");
            }
            for (int star = 1; star <= (N - row + 1); star++) {

                System.out.print("*");
            }


            System.out.println();
        }
    }
}
