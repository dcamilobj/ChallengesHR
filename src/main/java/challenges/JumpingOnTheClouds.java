package challenges;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.logging.Logger;

public class JumpingOnTheClouds {

    private static final Logger LOGGER = Logger.getLogger(JumpingOnTheClouds.class.getName());
    private static final int THUNDERCLOUD = 1;
    private static final int CUMULUS_CLOUD = 0;

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        if (c.length < 2 || c.length > 100) {
            LOGGER.warning("Number of clouds must be between 2 and 100");
            return 0;
        }
        if (c[0] == THUNDERCLOUD || c[c.length - 1] == THUNDERCLOUD) {
            LOGGER.warning("First and last clouds must be cumulus clouds");
            return 0;
        }

        OptionalInt result = Arrays.stream(c).filter(x -> x != CUMULUS_CLOUD && x != THUNDERCLOUD).findAny();
        if (result.isPresent()) {
            LOGGER.warning("Only must have thunderclouds or cumulus clouds");
            return 0;
        }
        int numberOfJumps = 0;
        int i = 1;
        int j;
        while (i < c.length) {
            j = i + 1;
            if (j < c.length && c[j] == CUMULUS_CLOUD) {
                i = j;
            }
            i++;
            numberOfJumps++;
        }
        return numberOfJumps;
    }

}
