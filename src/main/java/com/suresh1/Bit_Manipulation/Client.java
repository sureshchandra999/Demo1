package com.suresh1.Bit_Manipulation;

public class Client {
    public static void main(String[] args) {

    }
    // 5 ^ 5 = 0
    // 5 ^ 0 = 5
    // 5 ^ 6 = 3
    // Function to find the unique number in an array where every other number appears twice
    public static int findUnique(int[] arr) { //TC: O(n), SC: O(1)
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation
        }
        return unique;
    }

    //Function to find the unique number in an array where every other number appears twice
    /*
    This approach is called the "Bit Manipulation" approach.
     */
    public static int findUniqueNumber(int[] arr) { //Total TC: O(n * 32), SC: O(1) =>TC: O(n), SC: O(1)
        int answer = 0; // Initialize answer to 0
        for (int i=0; i <=31; i++) { // Iterate through each bit position from 0 to 31 //TC: O(32), SC: O(1)
            int count = 0; // Initialize count of set bits at the current position
            for (int num : arr) { // Iterate through each number in the array //TC: O(n), SC: O(1)
                if ((num & (1 << i)) != 0) { // Check if the ith bit is set
                    count++; // Increment count if the ith bit is set
                }
            }
            if (count % 3 != 0) { // If count of set bits is not a multiple of 3
                answer |= (1 << i); // Set the ith bit in the answer
            }
        }
        return answer; // Return the unique number


    }

    //Function to find the unique number in an array where every other number appears three times
    /*
    This approach is called the "Bit Manipulation" approach.
    It uses bitwise operations to count the occurrences of each bit across all numbers.
    The idea is to count the number of times each bit is set across all numbers.

    If a bit is set in the unique number, it will not be a multiple of 3.
    The final answer is constructed by setting the bits that are not multiples of 3.
    Time Complexity: O(n * 32) where n is the number of elements in the array.
    Space Complexity: O(1) as we are using a constant amount of space.
    This method is efficient for finding a unique number in an array where every other number appears three times.
    Example:
    Input: arr = [2, 2, 3, 2]
    Output: 3
    Explanation: The number 3 appears only once, while all other numbers appear three times.
    Time Complexity: O(n * 32), where n is the number of elements in the array.
    Space Complexity: O(1), as we are using a constant amount of space.
    Example:
    Input: arr = [2, 2, 3, 2]
    Output: 3
    Explanation: The number 3 appears only once, while all other numbers appear three times.

     */
    public static int findUniqueNumberInTriplets(int[] arr) { //TC: O(n * 32), SC: O(1)
        int answer = 0; // Initialize answer to 0
        for (int i = 0; i < 32; i++) { // Iterate through each bit position from 0 to 31
            int count = 0; // Initialize count of set bits at the current position
            for (int num : arr) { // Iterate through each number in the array
                if ((num & (1 << i)) != 0) { // Check if the ith bit is set
                    count++; // Increment count if the ith bit is set
                }
            }
            if (count % 3 != 0) { // If count of set bits is not a multiple of 3
                answer |= (1 << i); // Set the ith bit in the answer
            }
        }
        return answer; // Return the unique number
    }
    


















    // Function to check if a number is a power of two
    public static boolean isPowerOfTwo(int n) { //TC: O(1), SC: O(1)
        if (n <= 0) return false; // Negative numbers and zero are not powers of two
        return (n & (n - 1)) == 0; // A power of two has only one bit set in its binary representation
    }
    // Function to count the number of set bits (1s) in a number
    public static int countSetBits(int n) { //TC: O(log n), SC: O(1)
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Check the least significant bit
            n >>= 1; // Right shift to check the next bit
        }
        return count;
    }
    // Function to swap two numbers using bitwise XOR
    public static void swapUsingXOR(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b; // Step 1: XOR both numbers
        b = a ^ b; // Step 2: XOR the new value of 'a' with 'b' to get the original value of 'a'
        a = a ^ b; // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    //

}
