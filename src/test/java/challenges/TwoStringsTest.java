package challenges;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class TwoStringsTest {

    @Test
    public void stringsLengthShouldBeBetweenOneAndOneHundredThousand(){
       String s1 = Stream.generate(()->{return "a";}).limit(100001).collect(Collectors.joining());
       String s2 = "a";
       assertEquals("Should be between 1 and 100000", TwoStrings.twoStrings(s1,s2));
    }

    @Test
    public void shouldReturnTrue(){
        String s1 = "hello";
        String s2 = "world";
        assertEquals("YES", TwoStrings.twoStrings(s1,s2));
    }

    @Test
    public void shouldReturnFalse(){
        String s1 = "hi";
        String s2 = "world";
        assertEquals("NO", TwoStrings.twoStrings(s1,s2));
    }

}