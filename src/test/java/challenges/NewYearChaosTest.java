package challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewYearChaosTest {

    @Test
    public void lineLengthShouldBeBetweenOneAndOneHundredThousand(){
        int [] testArray = {1,2,100001};
        NewYearChaos newYearChaos = new NewYearChaos();
        assertEquals("All line elements must be between one and one hundred thousand", newYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnThree(){
        int [] testArray = {2,1,5,3,4};
        NewYearChaos newYearChaos = new NewYearChaos();
        assertEquals("3", newYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnTooChaotic(){
        int [] testArray = {2,5,1,3,4};
        NewYearChaos newYearChaos = new NewYearChaos();
        assertEquals("Too chaotic", newYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnTwo(){
        int [] testArray = {1,4,2,3,5};
        NewYearChaos newYearChaos = new NewYearChaos();
        assertEquals("2", newYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnOne(){
        int [] testArray = {1,3,2,4,5};
        NewYearChaos newYearChaos = new NewYearChaos();
        assertEquals("1", newYearChaos.minimumBribes(testArray));
    }

    @Test
    public void shouldReturnSeven(){
        int [] testArray = {1,2,5,3,7,8,6,4};
        NewYearChaos newYearChaos = new NewYearChaos();
        assertEquals("7", newYearChaos.minimumBribes(testArray));
    }
}