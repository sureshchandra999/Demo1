package com.Suresh6.CoreJAVA.ARRAY;

public class RotateArrayClockWise {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] a1= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("the array is:");
        for(int i : a1){
            System.out.print(i + " ");
        }
        System.out.println("After rotate the array   9 times:"+ rotateArrayKTimes(a1, 9));
        for(int i : a1){
            System.out.print(i + " ");
        }

        int [] a2= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("After rotate the array 3 times: ");
        for(int i : a2){
            System.out.print(i + " ");
        }
        //Rotate array clock wise K times with TC : O(N) and SC: O(N).
        System.out.println();
        int[] rotatedArray = rotateArrayKTimesWithNTCSC(a2, 3, a2.length);
        System.out.println("After rotate the array 3 times: ");
        for(int i : rotatedArray){
            System.out.print(i + " ");
        }


    }
    //Given an array N. rotate the array K times from left to right/ clockwise.
    //Rotate array clockwise or left to right.
    /*
    N={1, 2, 3, 4, 5}
    k=1, 5,1,2,3,4
    k=2, 4,5,1,2,3
    k=3, 3,4,5,1,2
    k=4, 2,3,4,5,1

     */



    static int[] rotateArrayKTimes(int arr[], int K){
        int length = arr.length;
        for(int i=0; i < K; i++){ // TC: O(K)
            int temp= arr[length-1];
            for(int j=length-1; j>0; j--){//TC: O(N-1)
                arr[j]= arr[j-1];

            }
            arr[0]=temp;
        }
        return arr;
    }
    //Total TC is : O(K)* O(N-1) = O(KN), SC: O(1)
    //This method rotates the array K times from left to right/clockwise.


    static int[] rotateArrayKTimesWithNTCSC(int[] arr, int k, int n){
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            int j= (i+k) % n;
            temp[j]=arr[i];
        }
        for (int i=0; i<n;i++){
            arr[i] = temp[i];
        }
        return arr;

    }

}
