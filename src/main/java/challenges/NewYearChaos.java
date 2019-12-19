package challenges;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

// Sixth challenge
public class NewYearChaos {

    private static final int MAXIMUM_VALUE = 100000;

    // Complete the minimumBribes function below.
    static String minimumBribes(int[] q) {
        OptionalInt result = Arrays.stream(q).filter(x -> x > MAXIMUM_VALUE).findAny();
        if (result.isPresent()) {
            return "All line elements must be between one and one hundred thousand";

        } else {
            Arrays.stream(q).anyMatch(i -> i > (i +3));

            for (int i = 0; i < q.length; i++) {
                if (q[i] > i + 3) {
                    return "Too chaotic";
                }
            }
            return Integer.toString(calculateBribes(q));
        }
    }

    private static int calculateBribes(int[] arr) {
        int necessaryBribes = 0;
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i] < arr[i-1])
                necessaryBribes+= arr[i] - arr[i-1];
            }
        return Math.abs(necessaryBribes);
    }
}
