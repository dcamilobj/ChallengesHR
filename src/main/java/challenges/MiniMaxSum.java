package challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        List<Long> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        long maxValue = numbers.stream().sorted().skip(1).reduce((i,j) -> i+j).get();
        long minValue = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).reduce((i,j) -> i +j).get();
        System.out.print(minValue + " " + maxValue);
    }
}
