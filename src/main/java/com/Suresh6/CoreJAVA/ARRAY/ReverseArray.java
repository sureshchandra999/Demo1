package com.Suresh6.CoreJAVA.ARRAY;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Reversed array: ");
        int[] reversedArray = reverseArray(arr);
        int[] reversedArray1 = reverseArrayUsingSwap(arr);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    // Reverse an array using swap
    // Time complexity is O(n)
    // Space complexity is O(1)
    // This method modifies the original array in place, so no additional space is used.
    static int[] reverseArrayUsingSwap(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr = swap(arr, i, arr.length - 1 - i);
        }
        return arr;
    }
    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    // Reverse an array using recursion
    static int[] reverseArrayUsingRecursion(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArrayUsingRecursion(arr, start + 1, end - 1);
    }
    // This method reverses the array in place using recursion.
    // Time complexity is O(n)
    // Space complexity is O(n) due to the recursive call stack.
    static int[] reverseArrayUsingRecursion(int[] arr) {
        return reverseArrayUsingRecursion(arr, 0, arr.length - 1);
    }
    // This method reverses the array in place using recursion.
    // Time complexity is O(n)
    // Space complexity is O(n) due to the recursive call stack.
    static int[] reverseArrayUsingRecursionWithStack(int[] arr) {
        int[] stack = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            stack[i] = arr[arr.length - 1 - i];
        }
        return stack;
    }
    // This method reverses the array using a stack.
    // Time complexity is O(n)
    // Space complexity is O(n) due to the stack used to store the reversed elements.
    static int[] reverseArrayUsingStack(int[] arr) {
        int[] stack = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            stack[i] = arr[arr.length - 1 - i];
        }
        return stack;
    }
    // This method reverses the array using a stack.
    // Time complexity is O(n)
    // Space complexity is O(n) due to the stack used to store the reversed elements.
    static int[] reverseArrayUsingStackWithRecursion(int[] arr, int index) {
        if (index == arr.length) {
            return arr;
        }
        int temp = arr[index];
        arr[index] = arr[arr.length - 1 - index];
        arr[arr.length - 1 - index] = temp;
        return reverseArrayUsingStackWithRecursion(arr, index + 1);
    }
    // This method reverses the array using a stack with recursion.
    // Time complexity is O(n)
    // Space complexity is O(n) due to the recursive call stack.
    static int[] reverseArrayUsingStackWithRecursion(int[] arr) {
        return reverseArrayUsingStackWithRecursion(arr, 0);
    }
    // This method reverses the array using a stack with recursion.
    /*static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int index, int[] stack) {
        if (index == arr.length) {
            return stack;
        }
        stack[index] = arr[arr.length - 1 - index];
        return reverseArrayUsingStackWithRecursionAndStack(arr, index + 1, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr) {
        int[] stack = new int[arr.length];
        return reverseArrayUsingStackWithRecursionAndStack(arr, 0, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int[] stack) {
        return reverseArrayUsingStackWithRecursionAndStack(arr, 0, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int index) {
        int[] stack = new int[arr.length];
        return reverseArrayUsingStackWithRecursionAndStack(arr, index, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int index, int[] stack) {
        if (index == arr.length) {
            return stack;
        }
        stack[index] = arr[arr.length - 1 - index];
        return reverseArrayUsingStackWithRecursionAndStack(arr, index + 1, stack);
    }

    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int index, int[] stack) {
        if (index == arr.length) {
            return stack;
        }
        stack[index] = arr[arr.length - 1 - index];
        return reverseArrayUsingStackWithRecursionAndStack(arr, index + 1, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int index) {
        int[] stack = new int[arr.length];
        return reverseArrayUsingStackWithRecursionAndStack(arr, index, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr) {
        int[] stack = new int[arr.length];
        return reverseArrayUsingStackWithRecursionAndStack(arr, 0, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int[] stack) {
        return reverseArrayUsingStackWithRecursionAndStack(arr, 0, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int index, int[] stack) {
        if (index == arr.length) {
            return stack;
        }
        stack[index] = arr[arr.length - 1 - index];
        return reverseArrayUsingStackWithRecursionAndStack(arr, index + 1, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr, int index) {
        int[] stack = new int[arr.length];
        return reverseArrayUsingStackWithRecursionAndStack(arr, index, stack);
    }
    // This method reverses the array using a stack with recursion and a stack parameter.
    static int[] reverseArrayUsingStackWithRecursionAndStack(int[] arr) {
        int[] stack = new int[arr.length];
        return reverseArrayUsingStackWithRecursionAndStack(arr, 0, stack);
    }*/


}
