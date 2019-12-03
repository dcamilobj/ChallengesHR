package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void whenStringIsEmptyShouldReturnZero(){
        assertEquals(0, RepeatedString.repeatedString("",2));
    }

    @Test
    public void whenStringIsMoreThanOneHundredShouldReturnZero(){
        assertEquals(0, RepeatedString.repeatedString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",2));
    }

    @Test
    public void whenCharactersToConsiderAreLessZeroShouldReturnZero(){
        assertEquals(0, RepeatedString.repeatedString("a",0));
    }

    @Test
    public void whenCharactersToConsiderIsMoreThanTenPowerTwelveShouldReturnZero(){
        assertEquals(0, RepeatedString.repeatedString("aa",1000000000001L));
    }

    @Test
    public void shouldReturnOne(){
        assertEquals(1, RepeatedString.repeatedString("a",1));
    }

    @Test
    public void shouldReturnOneBillion(){
        assertEquals(1_000_000_000, RepeatedString.repeatedString("a",1_000_000_000));
    }

    @Test
    public void shouldBeReturnSeven(){
        assertEquals(7, RepeatedString.repeatedString("aba",10));
    }

    @Test
    public void shouldReturn1000000000000(){
        assertEquals(1000000000000L, RepeatedString.repeatedString("a",1000000000000L));
    }

    @Test
    public void shouldReturnZeroWhereADoesNotExist(){
        assertEquals(0, RepeatedString.repeatedString("dcbvn",1000000000000L));
    }

    @Test
    public void shouldReturnFour(){
        assertEquals(4, RepeatedString.repeatedString("aabb",8));
    }
}