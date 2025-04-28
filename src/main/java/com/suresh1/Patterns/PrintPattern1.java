package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The pattern is:: ");
        for (int row = 1; row <= N; row++) {
            System.out.print("*");
            for (int col= 1; col <= N-2; col++) {

                    System.out.print("-");


            }
            System.out.print("*");
            System.out.println();
        }
    }
}
