package com.Suresh6.CoreJAVA.ARRAY;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int count=0;
        int N=19;
        for(int i=1; i<= N; i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
