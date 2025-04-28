package com.suresh1.Patterns;

import java.util.Scanner;

/*
if N= 5, then the pattern is:
    *
   ***
  *****
  *******
 *********


if N= 4, then the pattern is:
   *
  ***
 *****
*******




 */

public class PyramidPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        for(int row = 1; row <= N; row++) {
            for(int sp = 1; sp <= (N-row); sp++){
                System.out.print(" ");
            }
            for(int st = 1; st <= (2*row-1); st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
