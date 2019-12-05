package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDArrayTest {

    @Test
    public void matrixDimensionShouldBeBetweenZeroAndSixOtherwiseReturnZero(){
        int[][] twoDArray = new int[7][7];
        assertEquals(0, TwoDArray.hourglassSum(twoDArray));
    }

    @Test
    public void onlyNumbersGreaterToMinusNineOtherwiseShouldReturnZero(){
        int[][] twoDArray = {{0,0,0,0,0,0},
                             {0,0,-10,0,0,0},
                             {0,0,0,0,0,0},
                             {0,0,0,0,0,0},
                             {0,0,0,0,0,0},
                             {0,0,0,0,0,0}};
        assertEquals(0, TwoDArray.hourglassSum(twoDArray));
    }

    @Test
    public void shouldReturnFourInMatrix3x4(){
        int[][] twoDArray = {{1,1,0},
                             {2,1,0},
                             {1,0,0},
                             {0,0,0}};
        assertEquals(4, TwoDArray.hourglassSum(twoDArray));
    }

    @Test
    public void shouldReturnNineteen(){
        int[][] twoDArray = {{1,1,1,0,0,0},
                             {0,1,0,0,0,0},
                             {1,1,1,0,0,0},
                             {0,0,2,4,4,0},
                             {0,0,0,2,0,0},
                             {0,0,1,2,4,0}};
        assertEquals(19, TwoDArray.hourglassSum(twoDArray));
    }

    @Test
    public void shouldReturnSeven(){
        int[][] twoDArray = {{1,1,1,0,0,0},
                             {0,1,0,0,0,0},
                             {1,1,1,0,0,0},
                             {0,0,0,0,0,0},
                             {0,0,0,0,0,0},
                             {0,0,0,0,0,0}};
        assertEquals(7, TwoDArray.hourglassSum(twoDArray));
    }

    @Test
    public void shouldReturnTwentyEight(){
        int[][] twoDArray = {{-9,-9,-9,1,1,1},
                             {0,-9,0,4,3,2},
                             {-9,-9,-9,1,2,3},
                             {0,0,8,6,6,0},
                             {0,0,0,-2,0,0},
                             {0,0,1,2,4,0}};
        assertEquals(28, TwoDArray.hourglassSum(twoDArray));
    }


    @Test
    public void shouldReturnZeroWhenMatrixIs2x2(){
        int[][] twoDArray = {{-9,-9},
                             {0,-9}};
        assertEquals(0, TwoDArray.hourglassSum(twoDArray));
    }


}