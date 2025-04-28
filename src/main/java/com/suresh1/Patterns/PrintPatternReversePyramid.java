package com.suresh1.Patterns;

public class PrintPatternReversePyramid {

    public static void main(String[] args) {
        /*
        *****
        ****
        ***
        **
        *
         */
        //The above pattern is to be printed
        int Num = 5;

        System.out.println("The pattern is:: ");
        for (int row = 1; row <= Num; row++) {
            for (int col = Num; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
