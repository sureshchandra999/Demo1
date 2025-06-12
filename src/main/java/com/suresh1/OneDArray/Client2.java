package com.suresh1.OneDArray;

public class Client2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println("Total Cost:" + calculateCost(A)); // Output: 20

        int[] B = {5, 6, 7};
        System.out.println("Total Cost:" + calculateCost(B)); // Output: 34

        int[] C = {10, 20, 30, 40};
        System.out.println("Total Cost:" + calculateCost(C)); // Output: 200

        int[] D = {2,1, 4};
        System.out.println( "Total Cost:" + calculateCost(D)); // Output: 11

        int[] E={4,6,1};
        System.out.println("Total Cost:" + calculateCost(E)); // Output: 27



    }

    /*Given 'N' array elements, at every step remove an array element.
    cost to remove an element: Sum of all elements present in the array.
    find minimum cost to remove all elements from the array.
    Example:
    Input: [1, 2, 3, 4]
    Output: 20
    Explanation 1:
    Step 1: Remove 1, cost = 10 (2 + 3 + 4)
    Step 2: Remove 2, cost = 9 (3 + 4)
    Step 3: Remove 3, cost = 7 (4)
    Step 4: Remove 4, cost = 4
    Total cost = 10 + 9 + 7 + 4 = 30

   Step 1: Remove 4, cost = 10 (1+ 2 + 3 + 4)
    Step 2: Remove 3, cost = 6 (1 + 2 + 3)
    Step 3: Remove 2, cost = 3 (1 + 2)
    Step 4: Remove 1, cost = 1 (1)
    Total cost = 10 + 6 + 3 + 1 = 20 (minimum cost)
    Note: if we remove elements with maximum value first, we get minimum cost.
    if we sort the array in descending order and remove elements one by one, we get minimum cost.



    Explanation 2:
    Input: [5, 6, 7]
    Output: 36
    step 1: Remove 5, cost = 18 (6 + 7 + 5)
    step 2: Remove 6, cost = 12 (7 + 5)
    step 3: Remove 7, cost = 7 (7)
    Total cost = 18 + 12 + 7 = 37

    Note: if we remove elements with maximum value first, we get minimum cost.
    if we sort the array in descending order and remove elements one by one, we get minimum cost.
    Example:
    Input: [5, 6, 7]

    step 1: Remove 7, cost = 18 (5 + 6 + 7)
    step 2: Remove 6, cost = 11 (5 + 6)
    step 3: Remove 5, cost = 5 (5)
    Total cost = 18 + 11 + 5 = 34 (minimum cost)








     */
    public static int solve(int[] A) {
        int n = A.length;
        // Sort the array in descending order
        sortArrayDescending(A);
        int totalCost = 0;
        int sum = 0;

        // Calculate the total cost
        for (int i = 0; i < n; i++) {
            sum += A[i];
            totalCost += sum;
        }
        return totalCost;
    }

    static int calculateCost(int[] A){ //Total TC: O(n^2) + O(n) = O(n^2), SC: O(1)
        int n = A.length;
        sortArrayDescending(A); // Sort the array in descending order // TC: O(n^2), SC: O(1)
        int totalCost = 0;
        for(int i=0; i<n; i++) { //TC: O(n), SC: O(1)
            totalCost += (i+1) * A[i]; // Cost is the sum of all elements present in the array at each step

        }
        return totalCost;

    }
    public static int[] sortArrayDescending(int[] A) { //TC: O(n^2), SC: O(1)
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] < A[j + 1]) {
                    // swap A[j] and A[j + 1]
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }
}
