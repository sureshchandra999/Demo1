package com.suresh1.OneDArray;

public class PrintNegativeElementFromArray {
    public static void main(String[] args) {
        int[] A = {1, -2, 3, -4, 5, -1, 2, -3, 4, -5};
        System.out.println("The negative elements in the array are: ");
        for(int i = 0; i < A.length; i++){
            if(A[i] < 0){
                System.out.print(A[i] + " ");
            }
        }
    }
}
