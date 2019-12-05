package challenges;

import org.apache.log4j.Logger;

// First challenge
class CountingValleys {

    private static final Logger LOGGER = Logger.getLogger(CountingValleys.class.getName());
    private static final int MINIMUM_STEPS = 2;
    private  static final int MAXIMUM_STEPS = 1000000;

    // Complete the countingValleys function below.
    static int countValleys(int n, String s){
        int numberOfValleys = 0;
        int seaLevel = 0;
        int path = 0;
        if (n < MINIMUM_STEPS || n > MAXIMUM_STEPS) {
            LOGGER.warn("Steps must be between 0 and 1,000,000");
            return numberOfValleys;
        }
        if (n != s.length()) {
            LOGGER.warn("'n' does not match with s length");
            return numberOfValleys;
        }
        for (int i = 0; i < n ; i++) {
            if(s.charAt(i) == 'U'){
                path++;
                if(path == seaLevel ){
                    numberOfValleys++;
                }
            } else if(s.charAt(i) == 'D') {
                path--;
            } else {
                return 0;
            }
        }
        return numberOfValleys;
    }
}
