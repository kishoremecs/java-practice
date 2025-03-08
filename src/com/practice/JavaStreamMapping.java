package com.practice;

import java.sql.Date;
import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaStreamMapping {

    public static void main(String... args) {

        // Example 1
        Long[] stamps = { 205286400L, 791726400L, 978307200L, 1582165220L };
        Arrays.sort(stamps);
        Arrays.stream(stamps)
                .map(ts -> new Date(ts * 1000L))
                .toList()
                .forEach(System.out::println);

        Arrays.stream(stamps).collect(Collectors.averagingInt(s -> (new Date(s * 1000).getYear())));

        Double collected = Arrays.stream(stamps)
                .collect(Collectors.averagingInt(ts -> new Date(ts * 1000L).getYear()));
        System.out.println(collected);


        System.out.println();

        // Example 2
        String[] cities = { "Boston", "Denver", "Atlanta", "Chicago" };
        Arrays.stream(cities)
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        String collectStringList = Arrays.stream(cities)
                .collect(Collectors.joining("\",\"", "[ \"", "\" ]"));
        System.out.println(collectStringList);

        ;   //Example 3
        System.out.println();
        Arrays.stream(stamps)
                .map(ts -> new Date(ts * 1000L))
                .map(d -> d.getYear() + 1900)
                .forEach(System.out::println);

        //Example 4
        System.out.println();
        String[] sizes = { "741", "1197", "6057",
            "7507", "8045", "3848", "4166"
        };



        int total = Arrays.stream(sizes)
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(total);

        // Example 5
        System.out.println();
        double[] readings =  { 10.393, 83.162, 104.227, 70.932, 44.885  };
        Arrays.stream(readings)
                .mapToLong(r -> (long)r)
                .forEach(System.out::println);

        System.out.println();
        Arrays.stream(readings)
                .mapToLong(r -> (long)Math.round(r))
                .forEach(System.out::println);

        // Example 6
        System.out.println();
        long[] stamps2 = {2053008000001L, 978325200000L, 1607893404000L};
        Arrays.stream(stamps2)
                .mapToObj(ts -> new Date(ts))
                .forEach(System.out::println);

        // Example 7
        System.out.println();
        int[] summable =  { 299, 792, 160, 510, 209 };

        int tot = Arrays.stream(summable)
                .reduce(0, Integer::sum);
        System.out.println(tot);

        // Example 8
        System.out.println();





    }
}
