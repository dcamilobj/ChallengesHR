package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndAnagrams {
    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

        List<String> data = new ArrayList<>();
        int count = 0;
        int substringsLength = 1;
        while (substringsLength < s.length()) {
            data.add(s.substring(count, count + substringsLength));
            count++;
            if (count + substringsLength > s.length()) {
                count = 0;
                substringsLength++;
            }
        }

        data.forEach(System.out::println);
        Map<String, Long> substrings = data.stream().map(i -> sortString(i)).collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        int numberOfAnagrammaticPairs = 0;
        for (Map.Entry<String, Long> entry : substrings.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            long n = entry.getValue();
            numberOfAnagrammaticPairs += (n*(n-1))/2;
        }

        return numberOfAnagrammaticPairs;
    }

    private static String sortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return  new String(chars);
    }
}
