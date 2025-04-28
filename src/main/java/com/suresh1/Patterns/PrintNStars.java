package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("*");

        }
    }
}
