package com.suresh1.Patterns;

public class CountPrimeNumber {
    public static void main(String[] args) {
        int N = 19;
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("The number of prime numbers from 1 to " + N + " is: " + count);
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
