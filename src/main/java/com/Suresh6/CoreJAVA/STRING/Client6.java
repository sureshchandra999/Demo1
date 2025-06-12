package com.Suresh6.CoreJAVA.STRING;

public class Client6 {
    public static void main(String[] args) {
        String[] testCases = {"madam", "hello", "racecar", "world", "level"};
        for (String testCase : testCases) {
            System.out.println("Is \"" + testCase + "\" a palindrome? " + isPalindrom(testCase));
        }

    }
    static boolean isPalindrom(String s) {// //TC: O(n), SC: O(1) where n is the length of the string
        
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
