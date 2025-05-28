package com.Suresh6.CoreJAVA.ARRAY;


/*
Given array arr[]={1,2,3,4}, find all possible sub-arrays? //
Total 10 sub-arrays are:
1
1,2
1,2,3
1,2,3,4
2
2,3
2,3,4
3
3,4
4

 */
public class PrintAllSubarrayOfArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        System.out.println("The original array is: ");
        for(int a : arr){
            System.out.print(a + " ");

        }
        System.out.println();
        System.out.println("Print all possible sub-arrays: ");


        printAllSubArray(arr);
        //
        System.out.println();
        System.out.println("Print all possible sub-arrays with their sum: ");
        printSumOfAllSubArrays(arr);


    }

    //Print All sub-arrays of a given Array
    static void printAllSubArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=i; j< arr.length; j++){

                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    //Print all sub-array sum of a given array
    static void printSumOfAllSubArrays(int[] arr){
        for(int i=0; i < arr.length; i++){//
            for(int j=i; j< arr.length; j++){//
                int sum_of_sub_array=0;
                for (int k=i; k<=j; k++){//
                    sum_of_sub_array += arr[k];
                    System.out.print(arr[k] + " ");
                    //System.out.print("sum of the sub-arrays is: " + sum_of_sub_array);
                }
                System.out.println("sum of the sub-arrays is: " + sum_of_sub_array);
                System.out.println();

            }
        }
    }
}
