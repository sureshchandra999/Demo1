package com.suresh1.Patterns;

import java.util.Scanner;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        System.out.println("The prime numbers are: ");
        if(N < 1){
            System.out.println("No prime numbers");
        }

        for(int i = 2; i <= N; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
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
        for(int i = 3; i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
