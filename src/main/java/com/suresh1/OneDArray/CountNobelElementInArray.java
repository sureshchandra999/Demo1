package com.suresh1.OneDArray;

import java.util.HashMap;
import java.util.Map;

public class CountNobelElementInArray {
    public static void main(String[] args) {
        int[] A = {-1, -5, 3, 5, -10, 4};
        System.out.println("Count of Nobel elements: " + countNobleElements(A)); // Output: 2
        int[] B = {-1, -5, 3, 5, -10, 4, 6};
        System.out.println("Count of Nobel elements: " + countNobleElements(B)); // Output: 3
        int[] C = {-1, -5, 3, 5, -10, 4, 6, 7};
        System.out.println("Count of Nobel elements: " + countNobleElements(C)); // Output: 4

        System.out.println("==========================================================");
        System.out.println("Count of Nobel elements using HashMap: " + countNobleElementsUsingHashMap(A)); // Output: 2
        System.out.println("Count of Nobel elements using HashMap: " + countNobleElementsUsingHashMap(B)); // Output: 3
        System.out.println("Count of Nobel elements using HashMap: " + countNobleElementsUsingHashMap(C)); // Output: 4

        System.out.println("==========================================================");
        System.out.println("Count of Nobel elements using Sorting: " + findNobleElementUsingSorting(A)); // Output: 2
        System.out.println("Count of Nobel elements using Sorting: " + findNobleElementUsingSorting(B)); // Output: 3
        System.out.println("Count of Nobel elements using Sorting: " + findNobleElementUsingSorting(C)); // Output: 4



    }

    // Given an array of integers, find the count of Nobel elements in the array.
    /*
    An elemement in an array is called a Noble element if and only if
    there exists an element in the array which is equal to the number of elements.
    For example, in the array [1,
     */
    static int countNobleElements(int[] A) {//Toal Time Complexity: O(n^2), Space Complexity: O(1)
        int n = A.length;
        int answer = 0;
        for (int i = 0; i < n; i++) {//TC: O(n), SC: O(1)
            int count = 0;
            for (int j = 0; j < n; j++) {//TC: O(n), SC: O(1)
                if (A[j] < A[i]) {
                    count++;
                }
            }
            if (count == A[i]) {
                answer++;

            }
        }
        return answer;
    }

    // Note: The above solution is not optimal. It can be solved in O(n) time complexity using HashMap.
    // The optimal solution is to use a HashMap to store the count of each element in the array.
    // Then, for each element in the array, check if the count of that element is equal to the number of elements in the array.
    // If it is, then it is a Nobel element. Finally, return the count of Nobel elements.
    // The time complexity of this solution is O(n) and the space complexity is O(n).
    // Here is the optimal solution:

    static int countNobleElementsUsingHashMap(int[] A) { //Optimal Solution: TC: O(n), SC: O(n)
        int n = A.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(n - A[i])) {
                answer++;
            }
        }
        return answer;

    }
    //
    // Note: The above solution is not optimal. It can be solved in O(n) time complexity using HashMap.
    // The optimal solution is to use a HashMap to store the count of each element in the array.
    // Then, for each element in the array, check if the count of that element is equal to the number of elements in the array.
    // If it is, then it is a Nobel element. Finally, return the count of Nobel elements.
    // The time complexity of this solution is O(n) and the space complexity is O(n).


    /*

     */

    static int findNobleElementUsingSorting(int[] A) { //Optimal Solution: TC: O(n log n), SC: O(1)
        int n = A.length;
        // Sort the array in ascending order
        java.util.Arrays.sort(A);
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == i) {
                answer++;
            }
        }
        return answer;
    }


    //Count the number of Nobel elements in the array having duplicate elements
    /*
    solve the problem in nlog n time complexity and O(1) space complexity.

     */
   static int countNobelElementsWithDuplicates(int[] A) { //Optimal Solution: TC: O(n log n), SC: O(1)
        int n = A.length;
        // Sort the array in ascending order
        java.util.Arrays.sort(A);
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || A[i] != A[i - 1]) { // Check for duplicates
                if (A[i] == n - i - 1) {
                    answer++;
                }
            }
        }
        return answer;
    }



}

