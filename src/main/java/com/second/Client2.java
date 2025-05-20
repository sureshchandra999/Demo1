package com.second;

import java.util.ArrayList;

public class Client2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        //row2.add(7);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(8);
        row3.add(9);
        row3.add(10);
        //row3.add(11);
        A.add(row1);
        A.add(row2);
        A.add(row3);

        System.out.println("size of 2D array is:" + A.size());
        System.out.println("Size of 0th row is:" + A.get(0).size());
        System.out.println("size of 1st row is:" + A.get(1).size());
        System.out.println("Size of 2nd row is:" + A.get(2).size());
        System.out.println("2D Array is:" + A);
        System.out.println("Transpose of 2D array A is:" + transposeOf2DMatrix(A));
        System.out.println("Main diagonal sum of 2D array A is:" + mainDiagonalSum(A));


    }

    //transpose of 2D array
    public static ArrayList<ArrayList<Integer>> transposeOf2DMatrix(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int rows = A.size();
        int cols = A.get(0).size();
        for (int i = 0; i < cols; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                temp.add(A.get(j).get(i));
            }
            res.add(temp);
        }
        return res;
    }

    //Main diagonal sum of 2D array
    public static int mainDiagonalSum(ArrayList<ArrayList<Integer>> A) {
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i).get(i);
        }
        return sum;
    }

    //Secondary diagonal sum of 2D array
    public static int secondaryDiagonalSum(ArrayList<ArrayList<Integer>> A) {
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i).get(A.size() - 1 - i);
        }
        return sum;
    }

    //Sum of all elements in 2D array
    public static int sumOfAllElements(ArrayList<ArrayList<Integer>> A) {
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                sum += A.get(i).get(j);
            }
        }
        return sum;
    }

    //multiple of each element in give two 2D array
    public static ArrayList<ArrayList<Integer>> multipleOfEachElement(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < A.get(i).size(); j++) {
                temp.add(A.get(i).get(j) * B.get(i).get(j));
            }
            res.add(temp);
        }
        return res;
    }
    //Given 2 arrays of integers A and B
    //Return a 2D array of integers such that i-th row of the array contains list of values in A such that A[j]%B[i]==0 in A in sequential order

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) % B.get(i) == 0) {
                    temp.add(A.get(j));
                }
            }
            res.add(temp);
        }
        return res;
    }

    /*
    You are provided with an integer array A. Return
    another array B of size same as that of A such that B[i] = A[i]3 for 1 <= i <= |A| (1 based indexing).
     */
    public static ArrayList<Long> solve(ArrayList<Integer> A) {
        ArrayList<Long> res = new ArrayList<>();
        for (int a : A) {
            long value = (long) a * a * a;
            res.add(value);
        }
        return res;

    }

    /*
    You are given an integer array A. You have to find the frequency of each element in the array.
     */
    public static ArrayList<Integer> countFrequencyOfElementInArray(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(i).equals(A.get(j))) {
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }

    /* Write a program to input an integer T and then each of T lines will have a string (S).
You have to print T lines each containing length of input string.

Problem Constraints
1 <= T <= 100
1 <= S.size() <= 1000

Input Format
First line is T which means number of test cases.
Each next T lines contain a string S.

Output Format
T lines each containing an integer representing length of the input string.

Example Input
Input 1:
2
scaler
interviewbit

Example Output
Output 1:
6
12
     */
    public static ArrayList<Integer> lengthOfString(ArrayList<String> A) {
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : A) {
            res.add(s.length());
        }
        return res;

    }



}
