package challenges;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        // Find a random number
        Stream<String>  randomStringNumbers = Stream.generate(() -> { return new Random().nextInt(10000);}).limit(2).map(i -> String.format("%04d",i));
        // Generate a string based on a sequence
        Stream<String>  repeatedString = Stream.generate(() -> {return "abc";}).limit(5);
        // Generate a Stream based on a function
        Stream.iterate(2, (Integer n) -> ++n)
                .limit(5)
                 .forEach(System.out::println);

        // Generate another Stream based on another function
        Stream.iterate(0, (Integer n) -> n = n+2).limit(100).forEach(System.out::println);

        // Divide a String in CHARS
        String test = "String";
        Stream<Character> streamWithChars = test.chars().mapToObj(i -> (char)i);
        streamWithChars.forEach(System.out::println);

        // Create a map with Java Streams
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7);
        Map<Integer,Integer> map = listNumbers.stream().collect(Collectors.toMap(i-> i, i -> i));

        // Sort a list in reverse way
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        // List of lists with flatMap
        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Ami"));

        namesOriginalList.flatMap(x -> x.stream()).forEachOrdered(System.out::println);

        // Using reduce operation to sum
        Optional<Integer> number = listNumbers.stream().reduce((i,j) -> i+j);
        System.out.println(number.get());

        // Find duplicates
        List<Integer> numbers = Arrays.asList(1,2,3,2,4,3,4,5);
        numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);


        // creating a list of Strings
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);
        // Displaying the longest String
        longestString.ifPresent(System.out::println);


        // Using match operations
        int[] simpleArray = {1,2,3,4,5,6,7};

        System.out.println(Arrays.stream(simpleArray).sum());

        System.out.println(Arrays.stream(simpleArray).anyMatch(x ->  x == 4));

        System.out.println(Arrays.stream(simpleArray).allMatch(x -> x < 1));

        System.out.println(Arrays.stream(simpleArray).noneMatch(x ->  x > 10));
    }
}
