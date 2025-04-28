package com.suresh1.primeNumber;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
       if(isPrime(N)){
           System.out.println("The number is prime");
         }else {
           System.out.println("The number is not prime");
       }

        scanner.close();

    }
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num < 2 || num % 2 == 0){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
