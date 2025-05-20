package com.First;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        /*System.out.println("Hello, World!");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the array (enter -1 to stop):");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("The size of the list is: " + list.size());
        System.out.println("The elements in the list are: " + list);
        System.out.println("The elements in the list are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }*/
        //how assign ArrayList of ArrayList in java
        //ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                innerList.add(i + j);
            }
            A.add(innerList);
        }
        System.out.println("The elements in the list are: " + A);

        // Print the elements of the ArrayList of ArrayLists
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
