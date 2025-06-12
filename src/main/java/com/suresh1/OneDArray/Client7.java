package com.suresh1.OneDArray;

public class Client7 {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = findSingleNumber(nums);
        System.out.println("The number that occurs only once is: " + singleNumber); // Output: 4

        int[] nums2 = {2, 2, 1};
        int singleNumber2 = findSingleNumber(nums2);
        System.out.println("The number that occurs only once is: " + singleNumber2); // Output: 1





    }
    /*
    Given an integer array where every number occurs twice except one number.
    Find the number that occurs only once.
    Example:
    Input: nums = [4, 1, 2, 1, 2]
    Output: 4
    Explanation: The number 4 occurs only once, while all other numbers occur twice.
    Approach: Use XOR operation to find the single number.
    The XOR of a number with itself is 0, and the XOR of a number with 0 is the number itself.
    Therefore, when we XOR all the numbers together, the pairs will cancel out, leaving only the single number.

    Time Complexity: O(n), where n is the number of elements in the array.
    Space Complexity: O(1), as we are using a constant amount of space.

     */
    public static int findSingleNumber(int[] nums) { //TC: O(n), SC: O(1)

        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }

}
