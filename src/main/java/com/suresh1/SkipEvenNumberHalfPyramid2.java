package com.suresh1;

public class SkipEvenNumberHalfPyramid2 {

    public static void main(String[] args) {
        /*
        1
        1_
        1_3
        1_3_
        1_3_5

         */
        //The above pattern is to be printed
        int rows = 5;
        int num = 1;

        //


                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        if (j % 2 == 1) {
                            System.out.print(j);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }




    }
}
