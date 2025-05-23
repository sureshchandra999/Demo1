package com.Suresh6.CoreJAVA.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        // Create a frequency map
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Add elements to the frequency map
        frequencyMap.put("Apple", 3);
        frequencyMap.put("Banana", 2);
        frequencyMap.put("Orange", 5);
        frequencyMap.put("Mango", 1);

        // Print the frequency map
        System.out.println("Frequency Map: " + frequencyMap);

        // Get the frequency of a specific element
        String fruit = "Apple";
        int frequency = frequencyMap.getOrDefault(fruit, 0);
        System.out.println("Frequency of " + fruit + ": " + frequency);
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        System.out.println("original array is: " + arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Frequency of each element in Array: " + freqOfElementsInArray( arr ));
    }

    static int[] frequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[frequencyMap.size()];
        int index = 0;
        for (int freq : frequencyMap.values()) {
            result[index++] = freq;
        }
        return result;
    }
    //
    int[] checkFrequencyOfElementsInArray(int[] arr){
        Map<Integer, Integer> fmap = new HashMap<>();
        for(int i : arr){
            fmap.put(i, fmap.getOrDefault(i, 0) + 1);
        }
        int[] result = new int[fmap.size()];
        int index = 0;
        for(int freq : fmap.values()){
            result[index++] = freq;
        }
        return result;
    }
    //
    HashMap<Integer, Integer> checkFrequencyOfElementsInArray1(int[] arr){
        HashMap<Integer, Integer> fmap = new HashMap<>();

        for(int i : arr){
            fmap.put(i, fmap.getOrDefault(i, 0) + 1);
        }
        return fmap;
    }

    //
    static HashMap<Integer, Integer> freqOfElementsInArray(int[] arr){
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(fmap.containsKey(arr[i])){
                fmap.put(arr[i], fmap.get(arr[i]) + 1);
            }else{
                fmap.put(arr[i], 1);
            }
        }
        return fmap;
    }

}
