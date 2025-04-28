package com.suresh1.Patterns;
/*
if N= 3, then the pattern is:
0 0 3 0 0
0 2 4 6 0
1 2 3 4 5

if N= 4, then the pattern is:
0 0 0 4 0 0 0
0 0 3 6 9 0 0
0 2 4 6 8 10 0
1 2 3 4 5 6 7

if N= 5, then the pattern is:
0 0 0 0 5 0 0 0 0
0 0 0 4 8 12 0 0 0
0 0 3 6 9 12 15 0 0
0 2 4 6 8 10 12 14 0
1 2 3 4 5 6 7 8 9

 */


import java.util.Scanner;

public class PrintPattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The pattern is:: ");
        for(int row = 1; row <= N; row++) {
            //Leading zeros
            for(int zero = 1; zero < row; zero++){
                System.out.print("0 ");
            }
            //print the numbers
            for(int num = 1; num <= (N-row+1); num++){
                System.out.print(num + " ");
            }
            //Trailing zeros
            for(int space = 1; space < row; space++){
                System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
