package com.lesliefish.test06streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsTester {

    public static void test() {
        StreamsTester streamsTester = new StreamsTester();
        streamsTester.testGeneratingStreams();
        streamsTester.testForeach();
        streamsTester.testMap();
        streamsTester.testFilter();
        streamsTester.testSorted();
        streamsTester.testParallelProcessing();
        streamsTester.testCollectors();
        streamsTester.testStatistics();
    }

    public void testGeneratingStreams() {
        System.out.println("testGeneratingStreams");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println(strings);
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }

    public void testForeach() {
        System.out.println("testForeach");
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
    }

    public void testMap() {
        System.out.println("testMap");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
    }

    public void testFilter() {
        System.out.println("testFilter");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("count is " + count);
    }

    public void testSorted() {
        System.out.println("testSorted");
        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);
    }

    public void testParallelProcessing() {
        System.out.println("testParallelProcessing");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("count is " + count);
    }

    public void testCollectors() {
        System.out.println("testCollectors");

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }

    public void testStatistics() {
        System.out.println("testStatistics");

        List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> (int) x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
