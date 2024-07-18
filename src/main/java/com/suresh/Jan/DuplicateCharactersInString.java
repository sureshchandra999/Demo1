package com.suresh.Jan;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//Check the dupicate characters are there in a string using stream api
public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String input1 = "exampleStringWithDuplicates";
        String input = "abcdac";

        Map<Character, Long> characterCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long duplicateCount = characterCount.values().stream()
                .filter(count -> count > 1)
                .count();

        System.out.println("Number of duplicate characters: " + duplicateCount);
    }
}
