package challenges;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 100000;
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        if(s1.length() < MIN_LENGTH || s1.length() > MAX_LENGTH || s2.length() < MIN_LENGTH || s2.length() > MAX_LENGTH){
            return "Should be between 1 and 100000";
        }

        Set<Character> firstStringSet = s1.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());
        Set<Character> secondStringSet = s2.chars().mapToObj(i -> (char) i).collect(Collectors.toSet());

        boolean existSubstring =   firstStringSet.stream().anyMatch(i -> secondStringSet.contains(i));
        if (existSubstring) return "YES";
        else return "NO";
    }
}

