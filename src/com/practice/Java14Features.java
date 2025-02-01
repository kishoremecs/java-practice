package com.practice;

public class Java14Features {
    // Record declaration (preview in Java 14, standard in Java 16)
    public record Person(String name, int age) {
        // Compact constructor
        public Person {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }
    }

    public static void main(String[] args) {
        // Using records
        Person person = new Person("John Doe", 30);
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("ToString: " + person.toString());
        
        // Pattern matching for instanceof (preview in Java 14)
        Object obj = "Hello, World!";
        if (obj instanceof String str) {
            // str can be used directly here
            System.out.println("String length: " + str.length());
        }

        // Switch expressions (standardized in Java 14)
        String day = "MONDAY";
        String result = switch (day) {
            case "MONDAY", "TUESDAY" -> "Working day";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("Day type: " + result);
    }
}