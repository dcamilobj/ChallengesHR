package challenges;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd(){
        return (a) -> {return a % 2 != 0;};
    }

    public static PerformOperation isPrime(){
        return (a) -> {return a > 1 && IntStream.range(2,a/2).noneMatch(i-> a % i == 0);};
    }

    public static PerformOperation isPalindrome(){
        return (a) -> {
            String string = Integer.toString(a);
            if(string.equals(new StringBuilder(string).reverse().toString())) return true;
            else return false;
        };
    }
}
