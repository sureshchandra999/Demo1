package com.suresh1.OneDArray;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] A = {1, 2, 1};
        boolean isSorted = true;
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] > A[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
