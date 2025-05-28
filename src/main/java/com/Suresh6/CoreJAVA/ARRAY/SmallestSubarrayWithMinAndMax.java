package com.Suresh6.CoreJAVA.ARRAY;

public class SmallestSubarrayWithMinAndMax {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 3, 5, 1, 2, 3, 5, 1};
        int[] arr1 = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1};

        int[] result = smallestSubarrayWithMinAndMax(arr1);

        if (result != null) {
            System.out.println("Smallest subarray with both min and max is from index "
                    + result[0] + " to " + result[1]);
        } else {
            System.out.println("Min or Max value not found.");
        }

    }
    //

    public static int[] smallestSubarrayWithMinAndMax(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        int min = arr[0], max = arr[0];

        // Step 1: Find overall min and max
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // If min and max are the same, return single element subarray
        if (min == max) return new int[]{0, 0};

        // Step 2: Find smallest subarray that contains both min and max
        int minIndex = -1, maxIndex = -1;
        int start = 0, end = arr.length - 1, minLength = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                minIndex = i;
                if (maxIndex != -1) {
                    if (Math.abs(minIndex - maxIndex) + 1 < minLength) {
                        minLength = Math.abs(minIndex - maxIndex) + 1;
                        start = Math.min(minIndex, maxIndex);
                        end = Math.max(minIndex, maxIndex);
                    }
                }
            }
            if (arr[i] == max) {
                maxIndex = i;
                if (minIndex != -1) {
                    if (Math.abs(minIndex - maxIndex) + 1 < minLength) {
                        minLength = Math.abs(minIndex - maxIndex) + 1;
                        start = Math.min(minIndex, maxIndex);
                        end = Math.max(minIndex, maxIndex);
                    }
                }
            }
        }

        return new int[]{start, end};
    }

    //
}
