package challenges;

import java.util.Arrays;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
       long positiveNumbers =  Arrays.stream(arr).filter(i-> i > 0).count();
       long negativeNumbers =  Arrays.stream(arr).filter(i-> i < 0).count();
       long zeros =  Arrays.stream(arr).filter(i-> i == 0).count();

       System.out.println(String.format("%.6g%n", (float)positiveNumbers/arr.length));
        System.out.println(String.format("%.6g%n", (float)negativeNumbers/arr.length));
        System.out.println(String.format("%.6g%n", (float)zeros/arr.length));
    }

}
