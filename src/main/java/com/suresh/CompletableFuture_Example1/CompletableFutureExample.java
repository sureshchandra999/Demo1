package com.suresh.CompletableFuture_Example1;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {
        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> {
            // Simulating a long-running task like fetching user data from a remote service
            System.out.println("Fetching user data...");
            sleep(2000); // Simulate delay
            return "User123";
        });

        userFuture.thenAccept(user -> {
            System.out.println("User data received: " + user);
        });

        // Continue with other tasks while the user data is being fetched
        System.out.println("Doing other work...");

        // Block and wait for the future to complete
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

//output:
//Fetching user data...
//Doing other work...
//User data received: User123
