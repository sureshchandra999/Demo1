package com.suresh1.Patterns;

import java.util.Scanner;

/*
if N= 5, then the pattern is:
____*
___**
__***
_****
*****
if N= 4, then the pattern is:
___*
__**
_***
****

 */

public class StairCasePattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println("The pattern is:: ");
        for(int row =1; row <= N; row++) {
            for(int space = 1; space <= (N-row); space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= row; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
