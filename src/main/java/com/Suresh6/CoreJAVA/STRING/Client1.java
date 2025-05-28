package com.Suresh6.CoreJAVA.STRING;

public class Client1 {
    public static void main(String[] args) {
        //
        String str = "Hello, World!";

    }
    static int checkMaxCharacterOrNumberPresentAndReturnCount(String str) {
        int[] count = new int[256]; // ASCII size
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) i;
            }
        }
        System.out.println("Character with maximum occurrences: " + maxChar + " with count: " + maxCount);
        return maxCount;
    }

    static int countMaxCharOrNumber(String str){
        int length = str.length();
        int charCounter = 0;
        int numberCounter = 0;
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                charCounter++;
            } else if (Character.isDigit(c)) {
                numberCounter++;
            }
        }
        if(charCounter > numberCounter) {
            System.out.println("Maximum characters: " + charCounter);
            return charCounter;
        } else if (numberCounter > charCounter) {
            System.out.println("Maximum numbers: " + numberCounter);
            return numberCounter;
        } else {
            System.out.println("Both characters and numbers are equal: " + charCounter);
            return charCounter; // or numberCounter, they are equal
        }
    }
}
