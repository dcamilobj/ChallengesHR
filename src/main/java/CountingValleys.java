public class CountingValleys {

    private static final int MINIMUM_STEPS = 2;
    private  static final int MAXIMUM_STEPS = 1000000;

    // Complete the countingValleys function below.
    static int countValleys(int n, String s) {
        int numberOfValleys = 0;
        int seaLevel = 0;
        int path = 0;
        boolean isAValley = false;
        if (n < MINIMUM_STEPS || n > MAXIMUM_STEPS) {
            System.out.println("Steps must be between 0 and 1,000,000");
            return numberOfValleys;
        }
        if (n != s.length()) {
            System.out.println("'n' does not match with s length");
            return numberOfValleys;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                if (path == 0) {
                    isAValley = false;
                }
                path++;
            } else if (s.charAt(i) == 'D') {
                if (path == 0) {
                    isAValley = true;
                }
                path--;
            } else {
                System.out.println("Path must only contain 'U' or 'D' character");
                numberOfValleys = 0;
                break;
            }
            if (path == seaLevel && isAValley) {
                    numberOfValleys++;
            }
        }
        return numberOfValleys;
    }

    static int countingValleys(int n, String s){
        int numberOfValleys = 0;
        int seaLevel = 0;
        int path = 0;
        boolean isAValley = false;
        if (n < MINIMUM_STEPS || n > MAXIMUM_STEPS) {
            System.out.println("Steps must be between 0 and 1,000,000");
            return numberOfValleys;
        }
        if (n != s.length()) {
            System.out.println("'n' does not match with s length");
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
