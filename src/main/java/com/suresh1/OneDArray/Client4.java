package com.suresh1.OneDArray;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client4 {
    public static void main(String[] args) {
        String A = "Hello World";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : A.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("Character count in the string: " + charCountMap);

        // Use TreeMap to sort the HashMap by keys
        TreeMap<Character, Integer> sortedMap = new TreeMap<>(charCountMap);
        System.out.println("Sorted character count in the string: " + sortedMap);
        //sort keys in alphabetical order
        System.out.println("Sorted character count in the string (keys in alphabetical order):");
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
