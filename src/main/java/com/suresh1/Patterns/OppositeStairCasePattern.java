package com.suresh1.Patterns;

import java.util.Scanner;
/*
N= 5, then the pattern is:
* * * * *
* * * *
* * *
* *
*

N= 4, then the pattern is:
* * * *
* * *
* *
*


 */

public class OppositeStairCasePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The pattern is:: ");

        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= (N-row+1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
