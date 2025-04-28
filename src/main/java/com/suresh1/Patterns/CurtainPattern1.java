package com.suresh1.Patterns;

/*

if N: 4, print the pattern as below:
********
***  ***
**    **
*      *

if N: 5, print
**********
****  ****
***    ***
**      **
*        *



 */
import java.util.Scanner;

public class CurtainPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        for(int row = 1; row <= N; row++) {
            for(int st1 = 1; st1 <= (N-row+1); st1++){
                System.out.print("*");
            }
            for(int sp = 1; sp <= (2*row -2); sp++){
                System.out.print(" ");
            }
            for(int st2 = 1; st2 <= (N-row+1); st2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
