package challenges;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StairCase {
    // Complete the staircase function below.
    static void staircase(int n) {

        Stream<Integer> descendingOrderNumbers = Stream.iterate(n, (Integer i) -> --i).limit(n);

        descendingOrderNumbers.forEach(i->IntStream.rangeClosed(1,n).forEach((j) ->{
            if(j==n) System.out.println("#");
            else if(j>=i) System.out.print("#");
            else System.out.print(" ");
        }));
    }
}
