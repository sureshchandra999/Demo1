package com.suresh1.Patterns;

public class StairCasePattern1 {

        public static void main(String[] args) {
            int Num = 5;

            System.out.println("The pattern is:: ");
            for (int row = 1; row <= Num; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
