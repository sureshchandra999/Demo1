package com.suresh1.AsynCall;
import java.net.http.*;
import java.net.URI;
import java.util.concurrent.CompletableFuture;

    public class AsyncHttpExample {
        public static void main(String[] args) {
            System.out.println("Start of script");
            HttpClient client = HttpClient.newHttpClient();
            /*HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                    .build();*/

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.tomorrow.io/v4/weather/forecast?location=42.3478,-71.0466&apikey=80yEUGbINEE4Taq92xWYgPvPB7vtdiCS"))
                    .build();

            //curl --request GET --url 'https://api.tomorrow.io/v4/weather/forecast?location=42.3478,-71.0466&apikey=80yEUGbINEE4Taq92xWYgPvPB7vtdiCS'
            CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
            responseFuture.thenAccept(response -> {
                System.out.println("Response received: " + response.body());
            }).exceptionally(ex -> {
                System.err.println("Error: " + ex.getMessage());
                return null;
            });

            System.out.println("End of script");
        }
    }

