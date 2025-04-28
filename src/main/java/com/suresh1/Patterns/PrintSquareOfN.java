package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintSquareOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The pattern is:: ");
        for(int i=1; i <= N; i++){
            for(int j=1; j<= N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
