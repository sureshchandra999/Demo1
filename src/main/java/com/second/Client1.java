package com.second;

import java.util.ArrayList;

public class Client1 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        System.out.println(solve(A));

    }
    public static ArrayList<Long> solve(ArrayList<Integer> A){
        ArrayList<Long> res = new ArrayList<>();
        for(int a: A){
            int value= 0;
            value= a * a * a;
            long resultValue = 0;
            resultValue = (long) value;
            res.add(resultValue);
        }
        return res;
    }

    public static ArrayList<Integer> countFrequenceyOfElementInArray(ArrayList<Integer> A){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            int count = 0;
            for(int j=0; j<A.size(); j++){
                if(A.get(i) == A.get(j)){
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> transposeOf2DMatrix(ArrayList<ArrayList<Integer>> A){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<A.get(i).size(); j++){
                temp.add(A.get(j).get(i));
            }
            res.add(temp);
        }
        return res;
    }
}
