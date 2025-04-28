package com.suresh1.OneDArray;

import java.util.Scanner;

public class EvenOddElementDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Read no. of test cases
        int T = sc.nextInt();
        //process each test case
        for(int t =0; t<T; t++){
            //Length of array
            int n = sc.nextInt();
            int evenCount = 0;
            int oddCount = 0;
            //Read array elements
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                //Check if the element is even or odd
                if(x % 2 == 0){
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            int result = Math.abs(evenCount - oddCount);
            //Print the result
            System.out.println(result);
        }

    }
}
