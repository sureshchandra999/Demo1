package com.suresh.Jan.ArrayProblems;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsCounter {


    public static int countUniqueElements(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int element : array) {
            uniqueElements.add(element);
        }

        return uniqueElements.size();
    }

    public static void main(String[] args) {
        int[] array = {2,5,4,5,4, 6, 1, 1, 2, 3, 3, 3, 4, 5, 5, 6};
        System.out.println("Number of unique elements: " + countUniqueElements(array)); // Output: 6
    }
}
