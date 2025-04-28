package com.suresh1.Patterns;

import java.util.Scanner;

public class CountPrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println("The number of prime numbers between 1 and "+N+" is: "+count);
        scanner.close();

}
    private static boolean isPrime(int num) {
        if (num <= 1 ) {
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num < 2 || num % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(num); i += 2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
