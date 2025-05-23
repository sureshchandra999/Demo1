package com.Suresh6.CoreJAVA.Collection;



public class Client2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Reversed array: ");
        int[] reversedArray = reverseArray(arr);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Reversed array using swap: ");
        int[] reversedArrayUsingSwap = reverseArrayUsingSwap(arr2);
        for (int i : reversedArrayUsingSwap) {
            System.out.print(i + " ");
        }


    }
    static int[] reverseArray(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    //reverse an array using swap
    //time complexity is O(n)
    //space complexity is O(n)
    //how we can make this method space complexity O(1) ?
    //by using swap method

    static int[] reverseArrayUsingSwap(int[] arr){
        int[] temp = new int[arr.length];
        for(int i=0; i < arr.length /2; i++){
            temp = swap(arr, i, arr.length - 1 - i);
        }

        return temp;
    }
    static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
    //swap two variables value without using third variable
    //time complexity is O(1)
    //space complexity is O(1)
    static void swapWithoutThirdVariable(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }


}
