package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The pattern is:: ");
        for (int row = 1; row <= N; row++) {

            for (int col= 1; col <= N; col++) {

                if(col == 1 || col == N){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }
}
