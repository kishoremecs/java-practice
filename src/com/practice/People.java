package com.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class People {

    public static void main(String[] args) {
        Person[] people = getPeople();
        long pcount = Arrays.stream(people).count();
        System.out.println("There are " + pcount + " people.");

        // Birthday people by month
        System.out.println("\nBirthday people by month:");
        Map bdayPeople =
                Arrays.stream(people).collect(Collectors.groupingBy(Person::getMonthOfDOB));
        printMap(bdayPeople);
    }

    private static void printMap(Map people) {

        System.out.println("\nBirthday counts by month:");


    }


    public static Person[] getPeople() {
        return new Person[] {
                new Person("Kristen", 7, 18, 1980),
                new Person("William", 2, 8, 1980),
                new Person("Jameela", 2, 25, 1986),
                new Person("D'Arcy", 1, 4, 1980),
                new Person("Manny", 8, 19, 1987),
                new Person("Ted", 12, 29, 1947)
        };
    }

}
