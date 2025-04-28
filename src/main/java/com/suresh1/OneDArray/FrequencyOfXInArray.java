package com.suresh1.OneDArray;

import java.util.Scanner;

public class FrequencyOfXInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int input = 5;
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == input){
                count++;
            }
        }
        //System.out.println("The frequency of " + x + " in the array is: " + count);
        //There are two occurences of 2 in array A.
        System.out.println("There are " + count + " occurences of " + input + " in array A.");


    }
}
