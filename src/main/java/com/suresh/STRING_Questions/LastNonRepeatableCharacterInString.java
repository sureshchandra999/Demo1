package com.suresh.STRING_Questions;

import java.util.LinkedHashMap;
import java.util.Map;

//Find the Last Non-repeatable Character in string without Using Stream API
public class LastNonRepeatableCharacterInString {
    public static void main(String[] args) {
        String s="Hi There"; // O/P: r


        // Step 1: Use LinkedHashMap to store the frequency of each character
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();

        // Step 2: Iterate over the string and populate the map
        for (char c : s.toCharArray()) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Iterate over the map to find the last non-repeatable character
        char lastNonRepeatableChar = '\0'; // Default value for not found
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                lastNonRepeatableChar = entry.getKey(); // Update the last found non-repeating character
            }
        }

        // Step 4: Print the result
        if (lastNonRepeatableChar != '\0') {
            System.out.println(lastNonRepeatableChar);
        } else {
            System.out.println("No non-repeatable character found");
        }


    }
}
