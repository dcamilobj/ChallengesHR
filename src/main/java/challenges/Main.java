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

        Stream.iterate(2, (Integer n) -> ++n)
                .limit(5)
                 .forEach(System.out::println);

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

        int[] simpleArray = {1,2,3,4,5,6,7};

        System.out.println(Arrays.stream(simpleArray).sum());

        System.out.println(Arrays.stream(simpleArray).anyMatch(x ->  x == 4));

        System.out.println(Arrays.stream(simpleArray).allMatch(x -> x < 1));

        System.out.println(Arrays.stream(simpleArray).noneMatch(x ->  x > 10));

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

    }
}
