package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapsTwoTest {

    @Test
    public void arrayLengthShouldBeMoreThanZero() {
        int[] arr = new int[0];
        assertEquals(0, MinimumSwapsTwo.minimumSwaps(arr));
    }


    @Test
    public void arrayLengthShouldBeLessOrEqualThanOneHundredThousand() {
        int[] arr = new int[100001];
        assertEquals(0, MinimumSwapsTwo.minimumSwaps(arr));
    }

    @Test
    public void shouldReturnFive() {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        assertEquals(5, MinimumSwapsTwo.minimumSwaps(arr));
    }

    @Test
    public void shouldReturnThree(){
        int[] arr = {4,3,1,2};
        assertEquals(3, MinimumSwapsTwo.minimumSwaps(arr));
    }

    @Test
    public void shouldReturnThreeSecondCase(){
        int[] arr = {2,3,4,1,5};
        assertEquals(3, MinimumSwapsTwo.minimumSwaps(arr));
    }

    @Test
    public void shouldReturnThreeThirdCase(){
        int[] arr = {1,3,5,2,4,6,7};
        assertEquals(3, MinimumSwapsTwo.minimumSwaps(arr));
    }

}