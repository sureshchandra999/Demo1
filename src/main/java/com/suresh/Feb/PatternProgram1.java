package com.suresh.Feb;
/*

*
**
***
****
*****

 */

public class PatternProgram1 {
    public static void main(String[] args) {
        int numberOfRows = 5; // Number of rows for the pattern
        printPattern(numberOfRows);
    }

    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
