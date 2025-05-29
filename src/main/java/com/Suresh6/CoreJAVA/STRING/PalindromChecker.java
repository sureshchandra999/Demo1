package com.Suresh6.CoreJAVA.STRING;

import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of Testcases you want :");
        int noOfTestCases = Integer.parseInt(sc.nextLine());//Read no. of test cases
        for(int i=0; i< noOfTestCases; i++){
            String input=sc.nextLine();
            System.out.println(isPalindrom(input));
        }

        sc.close();
    }
    public static boolean isPalindrom(String s){
        int left=0;
        int right=s.length()-1;
        while (left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
