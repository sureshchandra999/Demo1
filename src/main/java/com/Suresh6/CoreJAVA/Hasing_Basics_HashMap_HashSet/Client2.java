package com.Suresh6.CoreJAVA.Hasing_Basics_HashMap_HashSet;

import java.util.HashSet;

public class Client2 {
    public static void main(String[] args) {
        // Test case 1: [10, 5, 3, 4, 3, 5, 6] - Expected: 5
        int[] test1 = {10, 5, 3, 4, 3, 5, 6};
        System.out.println("Test 1: " + solve(test1)); // Should print 5

        // Test case 2: [6, 10, 5, 4, 9, 120] - Expected: -1
        int[] test2 = {6, 10, 5, 4, 9, 120};
        System.out.println("Test 2: " +solve(test2)); // Should print -1

        // Additional test case: [1, 2, 3, 1] - Expected: 1
        int[] test3 = {1, 2, 3, 1};
        System.out.println("Test 3: " + solve(test3)); // Should print 1

        // Additional test case: [1, 1] - Expected: 1
        int[] test4 = {1, 1};
        System.out.println("Test 4: " + solve(test4)); // Should print 1

        // Additional test case: [1] - Expected: -1
        int[] test5 = {1};
        System.out.println("Test 5: " + solve(test5)); // Should print -1

    }
    static int solve(int[] A) {
        // HashSet to keep track of seen elements
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int i = 0; i < A.length; i++) {
            // If current element is already seen, it's the first repeating element
            if (seen.contains(A[i])) {
                return A[i];
            }
            // Otherwise, add it to seen set
            seen.add(A[i]);
        }

        // No repeating element found
        return -1;
    }
}
