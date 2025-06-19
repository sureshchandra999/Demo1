package com.suresh1.Recursion;

public class Client2 {
    public static void main(String[] args) {

        System.out.println("Printing valid parentheses combinations: " );
        printParentheses(3, "", 0, 0);



    }
    //print all valid parentheses combinations using recursion
    static void printParentheses(int n, String str, int open, int close) { //TC: O(2^n), SC: O(n)
        if (open == n && close == n) {
            System.out.println(str);
            return;
        }
        if (open < n) {
            printParentheses(n, str + "(", open + 1, close);
        }
        if (close < open) {
            printParentheses(n, str + ")", open, close + 1);
        }
    }
    //generate all subsets of a set using recursion
    static void generateSubsets(int[] arr, int index, String current) { //TC: O(2^n), SC: O(n)
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        // Include the current element
        generateSubsets(arr, index + 1, current + arr[index] + " ");
        // Exclude the current element
        generateSubsets(arr, index + 1, current);
    }
    //generate all permutations of a string using recursion
    static void generatePermutations(String str, String ans) { //TC: O(n!), SC: O(n)
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1); // Remaining string
            generatePermutations(ros, ans + ch);
        }
    }
    //generate all combinations of a string using recursion
    static void generateCombinations(String str, String ans, int index) { //TC: O(2^n), SC: O(n)
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        // Exclude the current character
        generateCombinations(str, ans, index + 1);
        // Include the current character
        generateCombinations(str, ans + str.charAt(index), index + 1);
    }
    //generate all subsequences of a string using recursion
    static void generateSubsequences(String str, String ans, int index) { //TC: O(2^n), SC: O(n)
        if (index == str.length()) {
            System.out.println(ans);
            return;
        }
        // Exclude the current character
        generateSubsequences(str, ans, index + 1);
        // Include the current character
        generateSubsequences(str, ans + str.charAt(index), index + 1);
    }
    //generate all valid parentheses combinations using recursion
    static void generateValidParentheses(int n, String str, int open, int close) { //TC: O(2^n), SC: O(n)
        if (open == n && close == n) {
            System.out.println(str);
            return;
        }
        if (open < n) {
            generateValidParentheses(n, str + "(", open + 1, close);
        }
        if (close < open) {
            generateValidParentheses(n, str + ")", open, close + 1);
        }
    }

    //Check the given string having balanced parentheses or not
    static boolean isBalancedParentheses(String str) { //TC: O(n), SC: O(n)
        int balance = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
            }
            if (balance < 0) {
                return false; // More closing parentheses than opening
            }
        }
        return balance == 0; // True if balanced, false otherwise
    }


}
