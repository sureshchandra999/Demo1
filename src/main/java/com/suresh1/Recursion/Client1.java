package com.suresh1.Recursion;

import javax.swing.tree.TreeNode;

public class Client1 {
    public static void main(String[] args) {

    }
    // factorial of a number using recursion
    public static int factorial(int n) { //TC: O(n), SC: O(n)
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // fibonacci series using recursion
    public static int fibonacci(int n) { //TC: O(2^n), SC: O(n)
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // power of a number using recursion
    public static int power(int base, int exp) { //TC: O(exp), SC: O(exp)
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }
    // sum of digits of a number using recursion
    public static int sumOfDigits(int n) { //TC: O(log n), SC: O(log n)
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
    // reverse a number using recursion
    public static int reverseNumber(int n) { //TC: O(log n), SC: O(log n)
        return reverseHelper(n, 0);
    }
    private static int reverseHelper(int n, int rev) { // Helper function for reverseNumber
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + n % 10;
        return reverseHelper(n / 10, rev);
    }
    // check if a number is palindrome using recursion
    public static boolean isPalindrome(int n) { //TC: O(log n), SC: O(log n)
        return isPalindromeHelper(n, n);
    }
    private static boolean isPalindromeHelper(int n, int rev) { // Helper function for isPalindrome
        if (n == 0) {
            return rev == 0;
        }
        if (n % 10 != rev % 10) {
            return false;
        }
        return isPalindromeHelper(n / 10, rev / 10);
    }
    // Tower of Hanoi problem using recursion
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) { //TC: O(2^n), SC: O(n)
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }
    // print all permutations of a string using recursion
    public static void printPermutations(String str, String ans) { //TC: O(n!), SC: O(n)
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ros, ans + ch);
        }
    }
    // print all subsets of a string using recursion
    public static void printSubsets(String str, String ans) { //TC: O(2^n), SC: O(n)
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Exclude the first character
        printSubsets(str.substring(1), ans);
        // Include the first character
        printSubsets(str.substring(1), ans + str.charAt(0));
    }
    // print all combinations of a string using recursion
    public static void printCombinations(String str, String ans, int index) { //TC: O(2^n), SC: O(n)
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        // Exclude the current character
        printCombinations(str, ans, index + 1);
        // Include the current character
        printCombinations(str, ans + str.charAt(index), index + 1);
    }
    // print all subsequences of a string using recursion
    public static void printSubsequences(String str, String ans, int index) { //TC: O(2^n), SC: O(n)
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        // Exclude the current character
        printSubsequences(str, ans, index + 1);
        // Include the current character
        printSubsequences(str, ans + str.charAt(index), index + 1);
    }
    // print all paths in a maze using recursion
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path) { //TC: O(2^(n+m)), SC: O(n + m)
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        if (sr > dr || sc > dc) {
            return; // Out of bounds
        }
        // Move down
        printMazePaths(sr + 1, sc, dr, dc, path + "D");
        // Move right
        printMazePaths(sr, sc + 1, dr, dc, path + "R");
    }
    // print all subsets of an array using recursion
    public static void printSubsets(int[] arr, String ans, int index) { //TC: O(2^n), SC: O(n)
        if (index == arr.length) {
            System.out.println(ans);
            return;
        }
        // Exclude the current element
        printSubsets(arr, ans, index + 1);
        // Include the current element
        printSubsets(arr, ans + arr[index] + " ", index + 1);
    }
    // print all combinations of an array using recursion
    public static void printCombinations(int[] arr, String ans, int index) { //TC: O(2^n), SC: O(n)
        if (index == arr.length) {
            System.out.println(ans);
            return;
        }
        // Exclude the current element
        printCombinations(arr, ans, index + 1);
        // Include the current element
        printCombinations(arr, ans + arr[index] + " ", index + 1);
    }
    // print all subsequences of an array using recursion
    public static void printSubsequences(int[] arr, String ans, int index) { //TC: O(2^n), SC: O(n)
        if (index == arr.length) {
            System.out.println(ans);
            return;
        }
        // Exclude the current element
        printSubsequences(arr, ans, index + 1);
        // Include the current element
        printSubsequences(arr, ans + arr[index] + " ", index + 1);
    }
    // print all paths in a grid using recursion
    public static void printGridPaths(int sr, int sc, int dr, int dc, String path) { //TC: O(2^(n+m)), SC: O(n + m)
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        if (sr > dr || sc > dc) {
            return; // Out of bounds
        }
        // Move down
        printGridPaths(sr + 1, sc, dr, dc, path + "D");
        // Move right
        printGridPaths(sr, sc + 1, dr, dc, path + "R");
    }
    // print all paths in a binary tree using recursion
//    public static void printBinaryTreePaths(TreeNode node, String path) { //TC: O(n), SC: O(n)
//        if (node == null) {
//            return;
//        }
//        path += node.val + " ";
//        if (node.left == null && node.right == null) {
//            System.out.println(path); // Leaf node, print the path
//        } else {
//            printBinaryTreePaths(node.left, path); // Traverse left subtree
//            printBinaryTreePaths(node.right, path); // Traverse right subtree
//        }
//    }
    // TreeNode class for binary tree nodes



}
