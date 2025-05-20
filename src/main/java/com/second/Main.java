package com.second;

public class Main {
    public static void main(String[] args) {
        //
        // System.out.println(countFactorial(100));
        System.out.println(countFactorial(5));
        System.out.println(countFactors(100));

    }
    //count the factorial of a number
    public static int countFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * countFactorial(n - 1);
    }

    //count the factors of a number
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
    //count the factors of a number // this is the optimized version
    public static int countFactors1(int n){
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }

    //count the factors of a number // this is the optimized version
    public static int countFactors2(int n){
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }
}
