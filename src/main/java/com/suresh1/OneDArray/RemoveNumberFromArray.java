package com.suresh1.OneDArray;

import java.util.Scanner;

public class RemoveNumberFromArray {
    public static void main(String[] args) {
        /*
        Write a program to input N numbers array, A from the user and an integer X and print the array by
        deleting element at specified position X.
        Note: The first element is located at position 1,
        the second element is located at position 2, and so on.
         */
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        System.out.print("Enter the position of the element to be removed: ");
        int X = scanner.nextInt();
        if(X < 1 || X > N){
            System.out.println("Invalid position.");
        } else {
            for(int i = X - 1; i < N - 1; i++){
                A[i] = A[i + 1];
            }
            N--;
            System.out.println("The array after removing the element at position " + X + " is: ");
            for(int i = 0; i < N; i++){
                System.out.print(A[i] + " ");
            }
        }

    }
}
