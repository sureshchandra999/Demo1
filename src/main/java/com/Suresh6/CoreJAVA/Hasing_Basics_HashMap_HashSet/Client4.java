package com.Suresh6.CoreJAVA.Hasing_Basics_HashMap_HashSet;

import java.util.ArrayList;

public class Client4 {
    public static void main(String[] args) {

    }
    static int[] commonElements(int[] A, int[] B){
        ArrayList<Integer> commonList = new ArrayList<>();
        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                if(A[i] == B[j]){
                    if(!commonList.contains(A[i])){ // To avoid duplicates
                        commonList.add(A[i]);
                    }
                }
            }
        }
        return commonList.stream().mapToInt(i -> i).toArray(); // Convert ArrayList to int[]
    }

    static int[] commonElementsWithDuplicate(int[] A, int[] B) {
        ArrayList<Integer> commonList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    commonList.add(A[i]); // Add even if it's a duplicate
                }
            }
        }
        return commonList.stream().mapToInt(i -> i).toArray(); // Convert ArrayList to int[]


    }

}
