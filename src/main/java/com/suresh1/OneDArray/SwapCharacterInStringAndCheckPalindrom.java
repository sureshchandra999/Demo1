package com.suresh1.OneDArray;

public class SwapCharacterInStringAndCheckPalindrom {
    public static void main(String[] args) {


        String input = "aabbcc";
        int result = CheckPalindromOrNot(input);
        System.out.println("Can the string \"" + input + "\" form a palindrome? " + (result == 1 ? "Yes" : "No"));

        String input1 = "abc";
        int result1 = CheckPalindromOrNot(input);
        System.out.println("Can the string \"" + input1 + "\" form a palindrome? " + (result1 == 1 ? "Yes" : "No"));

        String input2 = "abc111";
        int result2 = CheckPalindromOrNot1(input);
        System.out.println("Can the string \"" + input2 + "\" form a palindrome? " + (result2 == 1 ? "Yes" : "No"));


    }
    // Function to swap characters in a string and check if it can form a palindrome
    // The function returns 1 if it can form a palindrome, otherwise returns 0
    // The function assumes the input string contains only lowercase letters (a-z).
    //TC: O(n), SC: O(1)


    static int CheckPalindromOrNot(String A){
        int c[]= new int[26]; // Array to count occurrences of each character
        for(int i=0;i<A.length();i++){
            c[A.charAt(i)-'a']++;
        }
        int oddCount = 0;
        for(int i=0;i<26;i++){
            if(c[i]%2!=0){
                oddCount++;
            }
        }
        if(oddCount>1){
            return 0; // Not a palindrome
        } else {
            return 1; // Is a palindrome
        }


    }

    static int CheckPalindromOrNot1(String A){
        char arr[] = A.toCharArray();
        int c[]= new int[26]; // Array to count occurrences of each character
        for(int i=0;i<arr.length;i++){
            c[arr[i] - 'a']++;
        }
        int oddCount = 0;
        for(int i=0;i<26;i++){
            if(c[i]%2!=0){
                oddCount++;
            }
        }
        if(oddCount>1){
            return 0; // Not a palindrome
        } else {
            return 1; // Is a palindrome
        }


    }

}
