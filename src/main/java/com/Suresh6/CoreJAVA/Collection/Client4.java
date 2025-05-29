package com.Suresh6.CoreJAVA.Collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Client4 {
    public static void main(String[] args) {
        //HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(1);
        A.add(1);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(1);
        B.add(2);

        ArrayList<Integer> resultOfContest= solve(A, B);
        System.out.println(resultOfContest);


    }
    static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int contest: A){
            freqMap.put(contest, freqMap.getOrDefault(contest, 0)+1);
        }
        for(int learner : B){
            if(freqMap.containsKey(learner)){
                result.add(freqMap.get(learner));

            }else {
                result.add(0);
            }
        }
        return result;
    }
}
