package com.suresh1;

import java.util.Arrays;

public class FirstMain {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] arr = { 2, 26, -20, 16, 5};

        /*for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        int[] sortIntArray= sortIntArry(arr);
        System.out.println();
        System.out.println("Result sort array is::::");
        for (int i=0; i< sortIntArray.length ; i++){
            System.out.print(sortIntArray[i] + ",");
        }*/

        //

        // Sorting logic in a single for loop
        for (int i = 0; i < arr.length - 1; ) {
            if (sortOnce(arr, i)) {
                i++; // Move to the next index only when the inner comparison is complete
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }

    //Sort int array without using datastructure

    static int[] sortIntArray(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                arr[i]=arr[i+1];
            }

        }

        return arr;
    }


    // Recursive method to perform sorting logic for a single iteration
    public static boolean sortOnce(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true; // End recursion when the index reaches the end
        }

        if (arr[index] > arr[index + 1]) {
            // Swap the elements
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }

        // Recur for the next index
        return sortOnce(arr, index + 1);
    }
}
