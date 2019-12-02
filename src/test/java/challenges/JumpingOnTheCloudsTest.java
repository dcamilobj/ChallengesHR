package challenges;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JumpingOnTheCloudsTest {

    @Test
    public void shouldBeOnlyZerosAndOnesOtherwiseReturnZero(){
        int[] testArray = {0,1,2};
        assertEquals(0, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

    @Test
    public void shouldReturnFour(){
        int[] testArray = {0,0,1,0,0,1,0};
        assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

    @Test
    public void shouldReturnThree(){
        int[] testArray = {0,0,0,0,1,0};
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

    @Test
    public void shouldReturnTwo(){
        int[] testArray = {0,0,0,0};
        assertEquals(2, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

    @Test
    public void shouldReturnZero(){
        int[] testArray = {1,1,1,1};
        assertEquals(0, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

    @Test
    public void shouldStartWithZeroOtherwiseReturnZero(){
        int[] testArray = {1,0,0,0,0};
        assertEquals(0, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

    @Test
    public void shouldEndWithZeroOtherwiseReturnZero(){
        int[] testArray = {0,0,0,0,1};
        assertEquals(0, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

    @Test
    public void arrayLengthShouldBeMoreThanOneOtherwiseReturnZero(){
        int[] testArray = {0};
        assertEquals(0, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }


    @Test
    public void arrayLengthShouldBeLessThanOneHundredOneOtherwiseReturnZero(){
        int[] testArray = new int[101];
        assertEquals(0, JumpingOnTheClouds.jumpingOnClouds(testArray));
    }

}