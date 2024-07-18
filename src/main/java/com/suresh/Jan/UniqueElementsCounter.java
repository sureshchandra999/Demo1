package com.suresh.Jan;

public class UniqueElementsCounter {

    public static int countUniqueElements(int[] sortedArray) {
        if (sortedArray.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with 1 since the first element is always unique in a non-empty sorted array

        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] != sortedArray[i - 1]) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 3, 3, 3, 4, 5, 5, 6};
        System.out.println("Number of unique elements: " + countUniqueElements(sortedArray)); // Output: 6
    }
}
