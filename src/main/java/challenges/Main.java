package challenges;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        Random random = new Random();
       // System.out.println("Today's number is:");
        //String number = String.format("%04d", random.nextInt(10000));
        Stream<String>  randomStringNumbers = Stream.generate(() -> { return new Random().nextInt(10000);}).limit(2).map(i -> String.format("%04d",i));
        Stream<String>  repeatedString = Stream.generate(() -> {return "abc";}).limit(5);

        System.out.println("Print iterate:" );
        Stream.iterate(2, (Integer n) -> ++n)
                .limit(5)
                 .forEach(System.out::println);

        System.out.println("Print iterate 2:" );
        Stream.iterate(0, (Integer n) -> n = n+2).limit(100).forEach(System.out::println);

        //randomStringNumbers.forEach(System.out::println);

        String test = "String";

        Stream<Character> streamWithChars = test.chars().mapToObj(i -> (char)i);
        System.out.println("String");
        streamWithChars.forEach(System.out::println);

        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7);

        Map<Integer,Integer> map = listNumbers.stream().collect(Collectors.toMap(i-> i, i -> i));


        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Ami"));

        namesOriginalList.flatMap(x -> x.stream()).forEachOrdered(System.out::println);

        Optional<Integer> number = listNumbers.stream().reduce((i,j) -> i+j);

        System.out.println(number.get());

        System.out.println("Duplicates are:");
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

        int[] simpleArray = {1,2,3,4,5,6,7};

        System.out.println(Arrays.stream(simpleArray).sum());

        System.out.println(Arrays.stream(simpleArray).anyMatch(x ->  x == 4));

        System.out.println(Arrays.stream(simpleArray).allMatch(x -> x < 1));

        System.out.println(Arrays.stream(simpleArray).noneMatch(x ->  x > 10));

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

    }
}
