package com.Suresh6.CoreJAVA.Hasing_Basics_HashMap_HashSet;

public class Client1 {
    public static void main(String[] args) {

    }

    // Given N array element and Q queries, find the frequency of each element in the array.
    //Using HashMap , TC: O(N + Q), SC: O(N)
    public static void findFrequency(int[] arr, int q) {
        java.util.HashMap<Integer, Integer> frequencyMap = new java.util.HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < q; i++) {
            int query = arr[i]; // Assuming queries are the first Q elements of the array
            System.out.println("Frequency of " + query + ": " + frequencyMap.getOrDefault(query, 0));
        }
    }
    // Using HashSet, TC: O(N + Q), SC: O(N)
    public static void findFrequencyUsingSet(int[] arr, int q) {
        java.util.HashSet<Integer> uniqueElements = new java.util.HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        for (int i = 0; i < q; i++) {
            int query = arr[i]; // Assuming queries are the first Q elements of the array
            if (uniqueElements.contains(query)) {
                System.out.println("Frequency of " + query + ": " + java.util.Collections.frequency(java.util.Arrays.asList(arr), query));
            } else {
                System.out.println("Frequency of " + query + ": 0");
            }
        }
    }
    //Using Arrays, TC: O(N^2 + Q), SC: O(1)
    public static void findFrequencyUsingArray(int[] arr, int q) {
        for (int i = 0; i < q; i++) {
            int query = arr[i]; // Assuming queries are the first Q elements of the array
            int count = 0;
            for (int num : arr) {
                if (num == query) {
                    count++;
                }
            }
            System.out.println("Frequency of " + query + ": " + count);
        }
    }
    // Using Stream API, TC: O(N + Q), SC: O(N)
    public static void findFrequencyUsingStream(int[] arr, int q) {
        java.util.Map<Integer, Long> frequencyMap = java.util.Arrays.stream(arr)
                .boxed()
                .collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), java.util.stream.Collectors.counting()));

        for (int i = 0; i < q; i++) {
            int query = arr[i]; // Assuming queries are the first Q elements of the array
            System.out.println("Frequency of " + query + ": " + frequencyMap.getOrDefault(query, 0L));
        }
    }
    //



}
