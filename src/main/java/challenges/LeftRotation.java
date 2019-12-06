package challenges;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.logging.Logger;

// Fifth challenge
class LeftRotation {

    private static final Logger LOGGER = Logger.getLogger(LeftRotation.class.getName());

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int  n = a.length;
        int[] result = new int[n];
        if (n < 1 || n > 100000) {
            LOGGER.warning("The array length must be between one and ten thousand");
            return result;
        }
        if (d < 1 || d > n) {
            LOGGER.warning("The left rotations number must be between one and array length");
            return result;
        }

        OptionalInt valueFound = Arrays.stream(a).filter(x -> x < 1 || x > 1000000).findAny();
        if (valueFound.isPresent()) {
            LOGGER.warning("All elements in the array must be between one and one million");
            return result;
        }

        for (int i = 0; i < n; i++) {
            if((i - d) >= 0 ){
                result[i - d] = a[i];
            } else {
                result[i + (n-d)] = a[i];
            }
        }
        return result;
    }
}
