package com.suresh.CompletableFuture_Example1;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample1_HandlingException {

    public static void main(String[] args) {
        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching user data...");
            sleep(2000); // Simulate delay
            if (true) {
                throw new RuntimeException("User data fetch failed!");
            }
            return "User123";
        });

        userFuture
                .thenApplyAsync(user -> {
                    System.out.println("Fetching order history for " + user);
                    sleep(3000); // Simulate delay
                    return "Order History for " + user;
                })
                .exceptionally(ex -> {
                    System.out.println("Error: " + ex.getMessage());
                    return "No order data available";
                })
                .thenAccept(order -> {
                    System.out.println("Order data received: " + order);
                });

        // Block and wait for the final future to complete
        userFuture.join();
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
