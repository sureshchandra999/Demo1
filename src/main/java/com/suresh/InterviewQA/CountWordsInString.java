package com.suresh.InterviewQA;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "Hello World! This is a test string.";
        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
