package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintStaireCasePattern {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
         */
        //The above pattern is to be printed
        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();


        System.out.println("The pattern is:: ");
        for (int row = 1; row <= Num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
