package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {
    public interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        // Lambda Expressions
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 * 5 = " + operate(10, 5, multiplication));

        // Stream API
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice", "Charlie");
        
        // Using streams to filter and transform data
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("J"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Filtered and transformed names: " + filteredNames);

        // Method reference example
        names.forEach(System.out::println);
    }

    private static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}