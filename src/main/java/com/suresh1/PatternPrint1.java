package com.suresh1;

import java.util.Scanner;
/*
if N=3
3
2 4 5
1 2 3 4 5

if N=4
4
3 6 9
2 4 6 8 10
1 2 3 4 5 6 7

if N=5
5
4 8 12 16
3 6 9 12 15 18
2 4 6 8 10 12 14 16 18
1 2 3 4 5 6 7 8 9 10




 */

public class PatternPrint1 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();*/
        System.out.println("The pattern is:: ");
        /*for( int i=1; i <= N; i++){
            for(int j=N; j>= (N-i); j--){
                System.out.print((N ) + "");
            }
            System.out.print(" ");

        }*/
        int N = 5;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println(); }
    }

}
