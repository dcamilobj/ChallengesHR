package challenges;

import java.util.Arrays;
import java.util.OptionalInt;

// Sixth challenge
public class NewYearChaos {

    private static final int MAXIMUM_VALUE = 100000;

    // Complete the minimumBribes function below.
    static String minimumBribes(int[] q) {

        OptionalInt result = Arrays.stream(q).filter(x -> x > MAXIMUM_VALUE).findAny();
        if (result.isPresent()) {
            return "All line elements must be between one and one hundred thousand";
        } else {

            int bribesNecessary = 0;
            for (int i = 0; i < q.length - 1; i++) {
                if (q[i] > q[i + 1]) {
                    if ((q[i] - q[i + 1]) > 2) {
                        return "Too chaotic";
                    }
                    bribesNecessary += q[i] - q[i + 1];
                }
            }

            return Integer.toString(bribesNecessary);
        }

    }
}
