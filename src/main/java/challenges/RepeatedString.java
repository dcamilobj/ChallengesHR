package challenges;

import java.util.logging.Logger;

// Third challenge
class RepeatedString {

    private static final Logger LOGGER = Logger.getLogger(RepeatedString.class.getName());
    private static final Long MAXIMUM_NUMBER_OF_CHARACTERS = 1000000000000L;

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if(s.length() < 1 || s.length() > 100){
            LOGGER.warning("The string length must be between 1 and 100");
            return 0;
        }

        if(n <  1 || n > MAXIMUM_NUMBER_OF_CHARACTERS){
            LOGGER.warning("The number of characters must be between 1 and 1000000000000");
            return 0;
        }

        // number of A's in the original string
        long numberOfA = s.chars().filter(x -> x == 'a').count();

        long timesStringIsRepeatedCompletely = n / s.length();
        long numberOfCharactersForSubstring = n % s.length();

        String substring = s.substring(0,(int) numberOfCharactersForSubstring);
        long numberOfAInSubstring = substring.chars().filter(x -> x == 'a').count();

        long total = numberOfA*timesStringIsRepeatedCompletely;
        total+=numberOfAInSubstring;
        return total;
    }
}
