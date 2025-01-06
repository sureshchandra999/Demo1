package com.suresh.CompletableFuture_Example1;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample2 {
    public static void main(String[] args) {
        CompletableFuture<String[]> userFuture = CompletableFuture.supplyAsync(() -> {
            // Simulating a long-running task like fetching user data from a remote service
            System.out.println("Fetching user data...");
            sleep(2000); // Simulate delay
            return new String[]{"User123", "User1234", "User12345"};
        });

        userFuture.thenAccept(user -> {
            System.out.println("User data received: " /*+ Arrays.stream(user).iterator()*/);
            System.out.println(user);
            Arrays.stream(user).forEach(System.out::println);
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
