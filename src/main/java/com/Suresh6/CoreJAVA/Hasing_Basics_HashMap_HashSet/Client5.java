package com.Suresh6.CoreJAVA.Hasing_Basics_HashMap_HashSet;

public class Client5 {
    public static void main(String[] args) {

    }
    static int countElementWithFrequencyOne(int[] A){
        // Using a HashMap to count the frequency of each element
        java.util.HashMap<Integer, Integer> frequencyMap = new java.util.HashMap<>();

        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Count how many elements have a frequency of 1
        int count = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == 1) {
                count++;
            }
        }

        return count; // Return the count of elements with frequency 1
    }
}
