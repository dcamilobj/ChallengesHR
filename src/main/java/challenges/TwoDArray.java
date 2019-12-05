package challenges;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

// Fourth challenge
class TwoDArray {

    private static final Logger LOGGER = Logger.getLogger(TwoDArray.class.getName());

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        if (arr.length < 3 || arr.length > 6 || arr[0].length < 3 || arr[0].length > 6) {
            LOGGER.warn("Matrix dimension is invalid");
            return 0;
        }

        List<Integer> sumArray = new ArrayList<>();
        for (int i = 0; i + 2 < arr.length; i++) {
            for (int j = 0; j + 2 < arr[0].length; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                sumArray.add(sum);
            }
        }

        return sumArray.stream().max(Integer::compare).orElse(0);

    }
}
