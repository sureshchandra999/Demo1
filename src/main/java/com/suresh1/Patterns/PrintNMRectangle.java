package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintNMRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N and M:: ");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println("The pattern is:: ");
        for( int i=1; i <= N; i++){
            for(int j=1; j<= M; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
