package com.suresh1;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int primeCount=countPrime(A);
        System.out.println(primeCount);

    }
    public static int countPrime(int A) {

        int count =0;
        for(int i=2; i<=A; i++){
            if(isPrime(i)){
                count++;
            }

        }
        return count;

    }

    static boolean isPrime(int A){
        if( A <= 1){
            return false;
        }
        if( A == 2){
            return true;
        }
        if(A % 2 == 0){
            return false;
        }

        for(int i =3; i <= Math.sqrt(A); i+=2){
            if(A % i == 0){
                return false;
            }
        }
        return true;
    }
}



