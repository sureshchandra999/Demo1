package com.suresh1.OneDArray;

public class Client6 {
    public static void main(String[] args) {

    }
    /*what is prefix sum technique in one-dimensional array?

    Ans:
    The prefix sum technique is a method used to efficiently calculate the sum of elements in a subarray of a one-dimensional array. It involves creating an auxiliary array, called the prefix sum array, where each element at index i contains the sum of all elements from the start of the original array up to index i. This allows for quick calculation of the sum of any subarray by subtracting two prefix sums.
    For example, if we have an array A and a prefix sum array P, the sum of elements from index l to r in A can be calculated as:
    sum(A[l:r]) = P[r] - P[l-1]
    where P[i] is the prefix sum up to index i.
    The time complexity for creating the prefix sum array is O(n), and the time complexity for calculating the sum of any subarray using the prefix sum array is O(1). This technique is particularly useful when multiple queries for subarray sums need to be answered efficiently.
    Note: The prefix sum technique can also be extended to two-dimensional arrays, where a 2D prefix sum array is created to efficiently calculate the sum of elements in any submatrix.



     */
    public static int[] prefixSum(int[] A) { //TC: O(n), SC: O(n)
        int n = A.length;
        int[] prefixSumArray = new int[n];
        prefixSumArray[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + A[i];
        }
        return prefixSumArray;
    }
public static int rangeSum(int[] prefixSumArray, int l, int r) { //TC: O(1), SC: O(1)
        if (l == 0) {
            return prefixSumArray[r];
        } else {
            return prefixSumArray[r] - prefixSumArray[l - 1];
        }
    }

  /*Contribution technique in one-dimensional array:
    Ans:
    The contribution technique is a method used to calculate the contribution of each element in a one-dimensional array to the overall sum of subarrays. It involves calculating how many subarrays an element contributes to based on its position in the array.
    For an element at index i in an array of size n, the number of subarrays that include this element can be calculated as:
    (i + 1) * (n - i)
    where (i + 1) is the number of ways to choose the starting point of the subarray (from index 0 to i) and (n - i) is the number of ways to choose the ending point of the subarray (from index i to n - 1).
    The total contribution of the element at index i to the overall sum of all subarrays can be calculated as:
    contribution[i] = A[i] * (i + 1) * (n - i);
    This technique is useful for efficiently calculating the sum of all subarrays in a one-dimensional array without explicitly generating each subarray.
    public static long[] contribution(int[] A) { //TC: O(n), SC: O(n)
        int n = A.length;
        long[] contributionArray = new long[n];
        for (int i = 0; i < n; i++) {
            contributionArray[i] = (long) A[i] * (i + 1) * (n - i);
        }
        return contributionArray;
    }


   */
    public static long[] contribution(int[] A) { //TC: O(n), SC: O(n)
        int n = A.length;
        long[] contributionArray = new long[n];
        for (int i = 0; i < n; i++) {
            contributionArray[i] = (long) A[i] * (i + 1) * (n - i);
        }
        return contributionArray;
    }

    /*
    What is the formula for claculating number of subarrays in a one-dimensional array?
    Ans:
    The formula for calculating the number of subarrays in a one-dimensional array of size n is given by:
    n * (n + 1) / 2
    This formula accounts for all possible contiguous subarrays that can be formed from the array. Each element can be the start of a subarray, and the number of ways to choose the end of the subarray increases as we move through the array.
    For example, if we have an array of size n, the number of subarrays can be calculated as follows:
    public static int countSubarrays(int n) { //TC: O(1), SC: O(1)
        return n * (n + 1) / 2;
    }

     */

}
