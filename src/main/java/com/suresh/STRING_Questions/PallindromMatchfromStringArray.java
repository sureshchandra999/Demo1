package com.suresh.STRING_Questions;

import java.util.*;

public class PallindromMatchfromStringArray {

    public static void main(String[] args) {
        //Create group of same character string present in String array
        //o/p:  ["abcd", "dcba", "dabc"], ["pqrs", "srqp"] , ["xyzk", "kxyz","kzxy", "yzxk"], ["mnou"]
       // String[] str ={"abcd", "dcba", "dabc", "pqrs", "xyzk", "srqp", "kxyz", "kzxy", "yzxk", "mnou"};


        String[] sArray = {"abcd", "bacd", "acbd", "pqrs", "wxyz", "mnop", "pqsr", "opmn", "nmop"};

        // Step 1: Create a map to hold grouped anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Step 2: Iterate over the array
        for (String s : sArray) {
            // Sort the characters in the string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            // Add the string to the corresponding anagram group
            anagramGroups.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(s);
        }

        // Step 3: Print the grouped anagrams
        for (Map.Entry<String, List<String>> entry : anagramGroups.entrySet()) {
            System.out.println("Anagram group: " + entry.getValue());
        }
    }



}
