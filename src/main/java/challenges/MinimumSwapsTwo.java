package challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumSwapsTwo {


    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        List<Integer> arrayList =Arrays.stream(arr).boxed().collect(Collectors.toList());
        arrayList.stream().filter(i->Collections.frequency(arrayList,i)>1).forEach(System.out::println);


        if(arr.length < 1 || arr.length > 100000){
            return 0;
        }

        int aux = 0;
        int swaps = 0;
        int arrLimit = 0;
        while (!isSorted(arr)){
            int maximumValuePosition = IntStream.range(0, arr.length - arrLimit).reduce((i,j) -> arr[i] > arr[j] ? i : j).getAsInt();
            int minimumValuePosition = IntStream.range(maximumValuePosition, arr.length).reduce((i,j) -> arr[i] < arr[j] ? i : j).getAsInt();

            if(maximumValuePosition == minimumValuePosition){
                arrLimit++;
            } else {
                aux = arr[maximumValuePosition];
                arr[maximumValuePosition] = arr[minimumValuePosition];
                arr[minimumValuePosition] = aux;
                swaps++;
            }
        }
        return swaps;
    }

    static boolean isSorted(int[] arr){
        return IntStream.range(0, arr.length-1).allMatch(i -> arr[i]< arr[i+1]);
    }
}
