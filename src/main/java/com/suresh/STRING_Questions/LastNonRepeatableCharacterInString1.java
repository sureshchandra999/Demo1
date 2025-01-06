package com.suresh.STRING_Questions;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Find the Last Non-repeatable Character in string Using Stream API
public class LastNonRepeatableCharacterInString1 {

    public static void main(String[] args) {
        String s = "Hi There";

        // Step 1: Convert the string to a stream of characters and collect them in a LinkedHashMap
        Map<Character, Long> characterCountMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        // Step 2: Find the last non-repeatable character
        Optional<Character> lastNonRepeatableChar = characterCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // Filter characters with count == 1
                .map(Map.Entry::getKey)                 // Get the character
                .reduce((first, second) -> second);     // Get the last one

        // Step 3: Print the result
       /* lastNonRepeatableChar.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("No non-repeatable character found")
        );*/
    }
}
