package com.suresh.Jan;

import java.util.Arrays;
import java.util.OptionalInt;

public class ThirdHighestElementFromArray {

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 1, 2, 3, -3, 4, -4};

        OptionalInt thirdHighest = Arrays.stream(myArr)
                .distinct() // Remove duplicates
                .boxed() // Convert int stream to Integer stream to use comparator
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(2) // Skip the first two elements
                .mapToInt(Integer::intValue) // Convert back to int stream
                .findFirst(); // Get the next element

        if (thirdHighest.isPresent()) {
            System.out.println("The 3rd highest element is: " + thirdHighest.getAsInt());
        } else {
            System.out.println("The array doesn't have a 3rd highest element.");
        }
    }
}
