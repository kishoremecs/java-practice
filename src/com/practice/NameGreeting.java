package com.practice;

public class NameGreeting {
    public static void main(String[] args) {
        // Using Scanner for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Welcome to the Name Greeting Program!");
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine().trim();
        
        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine().trim();
        
        // String manipulation and formatting
        String formattedFirstName = capitalizeFirstLetter(firstName);
        String formattedLastName = capitalizeFirstLetter(lastName);
        
        // Using String.format() for output
        String greeting = String.format("Hello, %s %s!", formattedFirstName, formattedLastName);
        System.out.println(greeting);
        
        // Calculate and display name statistics
        int totalLength = firstName.length() + lastName.length();
        System.out.println("\nName Statistics:");
        System.out.println("- Total length of your name: " + totalLength);
        System.out.println("- Your initials are: " + 
            formattedFirstName.charAt(0) + "." + formattedLastName.charAt(0) + ".");
        
        scanner.close();
    }
    
    // Helper method to capitalize first letter
    private static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.toLowerCase().substring(1);
    }
}