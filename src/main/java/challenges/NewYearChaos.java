package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

// Sixth challenge
public class NewYearChaos {

    private static final int MAXIMUM_VALUE = 100000;

    // Complete the minimumBribes function below.
    static String minimumBribes(int[] q) {
        OptionalInt result = Arrays.stream(q).filter(x -> x > MAXIMUM_VALUE).findAny();
        if (result.isPresent()) {
            return "All line elements must be between one and one hundred thousand";
        } else {
            boolean isTooChaotic = IntStream.range(0, q.length).anyMatch(i -> q[i] > i +3);
            if(isTooChaotic){
                return "Too chaotic";
            }
            return Integer.toString(calculateBribes(q));
        }
    }

    private static int calculateBribes(int[] arr) {
        return IntStream.range(0, arr.length).map(i -> (int) IntStream.range(Math.max(0,arr[i]-2),i).filter(j -> arr[j] > arr[i]).count()).sum();
    }
}

