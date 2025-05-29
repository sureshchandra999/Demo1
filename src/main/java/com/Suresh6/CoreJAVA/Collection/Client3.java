package com.Suresh6.CoreJAVA.Collection;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Client3 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(9);
        //arrayList.add(5);
        System.out.println(arrayList);
        System.out.println(frequencyCheck(arrayList));

    }
    static int frequencyCheck(ArrayList<Integer> list){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int freqCounter=0;
        //int preFreqValue=0;

        for(int num: list){
            //int preFreqValue= freqMap.get(num);
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        for(int value: freqMap.values()){
            if(value == 1){
                freqCounter++;
            }
        }
        return freqCounter;
    }

    static int population(Map<String, Integer> H, int K){
        return 1;

    }
}
