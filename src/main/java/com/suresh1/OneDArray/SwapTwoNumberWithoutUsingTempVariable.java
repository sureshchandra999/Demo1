package com.suresh1.OneDArray;

public class SwapTwoNumberWithoutUsingTempVariable {
    public static void main(String[] args) {

    }
    // Function to swap two numbers without using a temporary variable
    public static void swap(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract the new value of 'a' with 'b' to get the original value of 'a'
        a = a - b; // Step 3: Subtract the new value of 'b' from 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using XOR)
    public static void swapXOR(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b; // Step 1: XOR both numbers
        b = a ^ b; // Step 2: XOR the new value of 'a' with 'b' to get the original value of 'a'
        a = a ^ b; // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using multiplication and division)
    public static void swapMultiplyDivide(int a, int b) { //TC: O(1), SC: O(1)
        if (b == 0) {
            System.out.println("Cannot swap, division by zero error.");
            return;
        }
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a * b; // Step 1: Multiply both numbers
        b = a / b; // Step 2: Divide the new value of 'a' by 'b' to get the original value of 'a'
        a = a / b; // Step 3: Divide the new value of 'b' from 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using subtraction)
    public static void swapSubtract(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a - b; // Step 1: Subtract 'b' from 'a'
        b = a + b; // Step 2: Add the new value of 'a' to 'b' to get the original value of 'a'
        a = b - a; // Step 3: Subtract the new value of 'b' from 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using bitwise AND and OR)
    public static void swapBitwise(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a & b; // Step 1: AND both numbers
        b = a | b; // Step 2: OR the new value of 'a' with 'b' to get the original value of 'a'
        a = a ^ b; // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using addition and subtraction)
    public static void swapAddSubtract(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract the new value of 'a' with 'b' to get the original value of 'a'
        a = a - b; // Step 3: Subtract the new value of 'b' from 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using bitwise XOR)
    public static void swapBitwiseXOR(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b; // Step 1: XOR both numbers
        b = a ^ b; // Step 2: XOR the new value of 'a' with 'b' to get the original value of 'a'
        a = a ^ b; // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using bitwise AND)
    public static void swapBitwiseAND(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a & b; // Step 1: AND both numbers
        b = a | b; // Step 2: OR the new value of 'a' with 'b' to get the original value of 'a'
        a = a ^ b; // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using bitwise OR)
    public static void swapBitwiseOR(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a | b; // Step 1: OR both numbers
        b = a & b; // Step 2: AND the new value of 'a' with 'b' to get the original value of 'a'
        a = a ^ b; // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using bitwise NOT)
    public static void swapBitwiseNOT(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = ~a; // Step 1: NOT the first number
        b = ~b; // Step 2: NOT the second number
        a = ~a; // Step 3: NOT the new value of 'a' to get the original value of 'b'
        b = ~b; // Step 4: NOT the new value of 'b' to get the original value of 'a'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using bitwise NAND)
    public static void swapBitwiseNAND(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = ~(a & b); // Step 1: NAND both numbers
        b = ~(a | b); // Step 2: NOR the new value of 'a' with 'b' to get the original value of 'a'
        a = ~(a ^ b); // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    // Function to swap two numbers without using a temporary variable (using bitwise NOR)
    public static void swapBitwiseNOR(int a, int b) { //TC: O(1), SC: O(1)
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = ~(a | b); // Step 1: NOR both numbers
        b = ~(a & b); // Step 2: AND the new value of 'a' with 'b' to get the original value of 'a'
        a = ~(a ^ b); // Step 3: XOR the new value of 'b' with 'a' to get the original value of 'b'
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    //Explain ^ operator in java
    /*
    The ^ operator in Java is the bitwise XOR (exclusive OR) operator. It performs a bitwise comparison between two integers, returning a new integer where each bit is set to 1 if the corresponding bits of the operands are different, and 0 if they are the same.
    For example:
    int a = 5; // Binary: 0101
    int b = 3; // Binary: 0011
    int result = a ^ b; // Binary: 0110, which is 6 in decimal
    The XOR operation is often used in algorithms for tasks like swapping values without a temporary variable, finding unique elements in arrays, and cryptography.
    The XOR operation has the following properties:
    1. a ^ a = 0 (any number XORed with itself is 0)
    2. a ^ 0 = a (any number XORed with 0 is the number itself)
    3. a ^ b = b ^ a (XOR is commutative)
    4. a ^ (b ^ c) = (a ^ b) ^ c (XOR is associative)
    5. a ^ b ^ b = a (XORing a number with itself cancels it out)
    6. a ^ a ^ b = b (XORing a number with itself twice cancels it out)
    7. a ^ b ^ c = a ^ (b ^ c) (XOR is associative)
    8. a ^ b ^ c ^ d = (a ^ b) ^ (c ^ d) (XOR is associative)
    9. a ^ b ^ c ^ d ^ e = a ^ (b ^ (c ^ (d ^ e))) (XOR is associative)
    10. a ^ b ^ c ^ d ^ e ^ f = (a ^ b) ^ (c ^ d) ^ e ^ f (XOR is associative)
    11. a ^ b ^ c ^ d ^ e ^ f ^ g = a ^ (b ^ (c ^ (d ^ (e ^ (f ^ g))))) (XOR is associative)

     */

}
