package com.suresh.July.hcl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsFinder {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 5, 6);
        List<Integer> duplicates = findDuplicates(list);
        System.out.println("Duplicate elements: " + duplicates); // Output: [1, 3, 5]

        List<Integer> duplicates1 = findDuplicates1(list);
        System.out.println("Duplicate elements: " + duplicates1); // Output: [1, 2, 3, 4, 5, 6]
    }

    public static List<Integer> findDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        return list.stream()
                .filter(element -> !seen.add(element))
                .distinct()
                .collect(Collectors.toList());
    }


    public static List<Integer> findDuplicates1(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> findDuplicates2(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
