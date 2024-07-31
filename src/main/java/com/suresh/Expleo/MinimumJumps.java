package com.suresh.Expleo;

public class MinimumJumps {
    public static void main(String[] args) {

        int[] arr = {1, 3, 0, 81, 9, 2, 6, 7, 6, 8, 9};
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        int noOfJumps = calculateNoOfJumpsInAnAarray(arr);
        System.out.println(noOfJumps);


    }

    private static int calculateNoOfJumpsInAnAarray(int[] arr) {

        int resultantNoOfJumps=0;
        int length = arr.length;
        for(int i =0; i< length; i++){
            if(length == 0){
                return -1;
            }
            if(arr[i] >= length){
                return resultantNoOfJumps+1;
            }
            if(arr[i] < length){
                resultantNoOfJumps = resultantNoOfJumps+1;
                //i= i+3;
                System.out.println(arr[i]);
            }
        }

        return resultantNoOfJumps;
    }


}
