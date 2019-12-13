package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewYearChaosTest {

    @Test
    public void lineLengthShouldBeBetweenOneAndOneHundredThousand(){
        int [] testArray = {1,2,100001};
        assertEquals("All line elements must be between one and one hundred thousand", NewYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnThree(){
        int [] testArray = {2,1,5,3,4};
        assertEquals("3", NewYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnTooChaotic(){
        int [] testArray = {2,5,1,3,4};
        assertEquals("Too chaotic", NewYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnOne(){
        int [] testArray = {1,4,2,3,5};
        assertEquals("2", NewYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnTwo(){
        int [] testArray = {1,3,2,4,5};
        assertEquals("1", NewYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnSeven(){
        int [] testArray = {1,2,5,3,7,8,6,4};
        assertEquals("7", NewYearChaos.minimumBribes(testArray));
    }
}