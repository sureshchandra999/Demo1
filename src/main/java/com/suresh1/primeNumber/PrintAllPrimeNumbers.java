package com.suresh1.primeNumber;

import java.util.Scanner;

public class PrintAllPrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number N from the user
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        System.out.println("Prime numbers up to " + N + ":");

        int count = 0;
        // Print all prime numbers up to N
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers up to " + N + " are: " + count);

        scanner.close();
    }
}
