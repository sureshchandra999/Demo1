package com.suresh3;
import java.util.Stack;

public class CheckCorrectSequenceOfBracketsInString {
    public static void main(String[] args) {
        //String str = "{[()]}";//Yes
        String str = "{)(}"; //No
        //String str = "{(}("; //No
        //System.out.println("Is the sequence of brackets correct:: " + isCorrectSequenceOfBrackets(str));
        System.out.println("Is the sequence of brackets correct:: " + isCorrectSequenceOfBrackets1(str));

    }

    //Time complexity is O(n), space complexity is O(1)
    //not working for all test cases
    private static String isCorrectSequenceOfBrackets(String str) {
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {
                count++;
            } else if (charArray[i] == '}' || charArray[i] == ']' || charArray[i] == ')') {
                count--;
            }
        }
        if (count == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

  //Time complexity is O(n), space complexity is O(n)

    private static String isCorrectSequenceOfBrackets1(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return "No";
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')) {
                    return "No";
                }
            }
        }
        return stack.isEmpty() ? "Yes" : "No";
    }
}
