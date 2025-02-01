package com.practice;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Java11Features {
    public static void main(String[] args) {
        // New String methods
        String multilineString = "  Hello\nWorld  ";
        System.out.println("isBlank(): " + "".isBlank());
        System.out.println("lines(): ");
        multilineString.lines().forEach(System.out::println);
        System.out.println("strip(): '" + multilineString.strip() + "'");
        System.out.println("repeat(3): " + "Hello".repeat(3));

        // HTTP Client example
        try {
            HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/github"))
                .header("Accept", "application/json")
                .GET()
                .build();

            HttpResponse<String> response = client.send(request, 
                HttpResponse.BodyHandlers.ofString());

            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}