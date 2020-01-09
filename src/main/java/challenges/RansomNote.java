package challenges;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class RansomNote {
    // Complete the checkMagazine function below.
    static String checkMagazine(String[] magazine, String[] note) {

        List<String> magazineList = Arrays.asList(magazine);
        List<String> noteList = Arrays.asList(note);

        if(magazine.length < 1 || magazine.length > 30000 || note.length <1 || note.length > 30000){
            return "Arrays should be between one and thirty thousand";
        }

        boolean canBeReplica = true;

        Map<String,Long> magazineMap = magazineList.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
     /*   for (String word: magazineList){
            magazineMap.computeIfPresent(word, (key,val) -> val+1);
        }*/


        Map<String, Long> noteMap = noteList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
/*        for (String word: noteList){
            noteMap.computeIfPresent(word, (key, value) -> value +1 );
        }¨*/

        for (Map.Entry<String,Long> entry : noteMap.entrySet()){
            if(!magazineMap.containsKey(entry.getKey()) || magazineMap.get(entry.getKey()) < entry.getValue()){
                    canBeReplica = false;
                }
            }

        if(canBeReplica)  return "Yes";
        else return  "No";

    }

}
