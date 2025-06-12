package com.Suresh6.CoreJAVA.Hasing_Basics_HashMap_HashSet;

import java.util.HashSet;

public class Client3 {
    public static void main(String[] args) {
        int[] A = {10, 5, 3, 4, 3, 5, 6};
        System.out.println("Unique elements in the array: " + findUniqueElementInArray(A)); // Should print 5
        int[] B = {6, 10, 5, 4, 9, 120};
        System.out.println("Unique elements in the array: " + findUniqueElementInArray(B)); // Should print 6
        int[] C = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println("Unique elements in the array: " + findUniqueElementInArray(C)); // Should print 4





    }
     static int findUniqueElementInArray(int[] A){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<A.length; i++){
            hs.add(A[i]);
        }
        return hs.size();
     }
}
