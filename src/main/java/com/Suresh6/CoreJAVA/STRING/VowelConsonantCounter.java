package com.Suresh6.CoreJAVA.STRING;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Loop for each test case
        for (int i = 0; i < T; i++) {
            String S = scanner.nextLine().toLowerCase(); // read string and convert to lowercase
            int vowels = 0, consonants = 0;

            for (char ch : S.toCharArray()) {
                if (isVowel(ch)) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            // Output format: "vowel_count consonant_count"
            System.out.println(vowels + " " + consonants);
        }

        scanner.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
