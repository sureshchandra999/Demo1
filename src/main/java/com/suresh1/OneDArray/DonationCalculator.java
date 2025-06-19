package com.suresh1.OneDArray;

import java.util.*;

public class DonationCalculator {

    public static int[] solve(int n, int[][] donations) { //Total TC: O(n + m), SC: O(n)
        int[] coins = new int[n];

        // Apply the difference array technique
        for (int[] donation : donations) { //TC: O(m), SC: O(1)
            int start = donation[0];
            int end = donation[1];
            int amount = donation[2];

            coins[start] += amount;
            if (end + 1 < n) {
                coins[end + 1] -= amount;
            }
        }

        // Compute prefix sum to get the final donations
        for (int i = 1; i < n; i++) { //TC: O(n), SC: O(1)
            coins[i] += coins[i - 1]; // coins[i] = coins[i] + coins[i - 1];

        }

        return coins;
    }

    // Sample usage
    public static void main(String[] args) {
        int n = 5;
        int[][] donations = {
            {0, 2, 10},
            {1, 3, 5},
            {2, 4, 20}
        };

        int[] result = solve(n, donations);
        System.out.println("Final donation received by each person: " + Arrays.toString(result));
    }
}
