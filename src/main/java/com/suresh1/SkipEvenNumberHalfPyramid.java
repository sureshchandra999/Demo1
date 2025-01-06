package com.suresh1;

public class SkipEvenNumberHalfPyramid {

    public static void main(String[] args) {
        int rows = 5;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    num++;
                    j--;
                }
            }
            System.out.println();
        }
        /*for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    num++;
                    j--;
                }
            }
            System.out.println();
        }*/
    }

}
