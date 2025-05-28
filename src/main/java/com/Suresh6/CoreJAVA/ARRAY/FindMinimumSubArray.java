package com.Suresh6.CoreJAVA.ARRAY;

public class FindMinimumSubArray {
    public static void main(String[] args) {
        int arr[] ={ 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1};
        System.out.print("Original Array is: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println("");
        int[] find= findMinimumSubArrayWhichContainsMinAndMaxValue(arr);

    }
    //Find the minimum length sub-array which contains minimum and maximum value in a given array
    static int[] findMinimumSubArrayWhichContainsMinAndMaxValue(int[] arr){
        int arrayLength = arr.length;
        //First check the min value and max value in an array.
        //we have the min and max value
        int minValue=arr[0];
        int maxValue=arr[0];
        for(int j=0; j< arrayLength; j++){
            if(minValue > arr[j]){
                minValue=arr[j];
            }
            if(maxValue < arr[j]){
                maxValue=arr[j];
            }
        }
        System.out.println("Minimum Value: "+ minValue);
        System.out.println("Maximum Value is: "+ maxValue);


        // Now check the minimum sub-array which contains min value and max value

        int len=arrayLength;
        int answer=len;

        int[] resultArray = new int[arrayLength];
        int min_index=-1;
        int max_index=-1;
        for(int i=arrayLength-1; i>=0; i--){
            if(arr[i]== minValue){
                min_index=i;
                if(max_index != -1){
                    len=max_index-min_index +1;
                    if (len < answer ){
                        answer = len;
                    }
                }
            }
            if(arr[i] == maxValue){
                max_index=i;
                if(min_index != -1){
                    len=min_index-max_index+1;
                    if(len < answer){
                        answer=len;
                    }
                }
            }
        }
        System.out.println("Sub-Array contains min and max value length is:"+ len);




        return resultArray;

    }
}
