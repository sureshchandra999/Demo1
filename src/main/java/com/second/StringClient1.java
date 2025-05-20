package com.second;

import java.util.ArrayList;
import java.util.Scanner;

public class StringClient1 {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            A.add(str);


        }
        System.out.println("Size of array is: " + A.size());
        for(int i=0; i<A.size(); i++){
            System.out.println("String at index " + i + " is: " + A.get(i) + " and its size is: " + A.get(i).length());
        }
        //print the size of each string in the array
        for(int i=0; i<A.size(); i++){
            System.out.println("Size of string at index " + i + " is: " + A.get(i).length());
        }
    }
}
