package com.suresh1.TwoDArray;

import java.util.Arrays;

public class FirstTwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;
        System.out.println("Printing 2D array");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Printing 2D array using enhanced for loop");
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
