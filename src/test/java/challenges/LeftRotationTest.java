package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void shouldReturnAnEmptyArrayWhenArrayLengthIsMoreThan100000(){
        int[] array = new int[100001];
        assertEquals(0, LeftRotation.rotLeft(array,2)[0]);
    }

    @Test
    public void shouldReturnAnEmptyArrayWhenLeftRotationsNumberIsLessThanOne(){
        int[] array = new int[3];
        assertEquals(0, LeftRotation.rotLeft(array,-1)[0]);
    }

    @Test
    public void shouldReturnAnEmptyArrayWhenLeftRotationsNumberIsMoreThanArrayLength(){
        int[] array = new int[3];
        assertEquals(0, LeftRotation.rotLeft(array,4)[0]);
    }

    @Test
    public void shouldReturnAnEmptyArrayWhenAnyArrayElementIsLessThanOne(){
        int[] array = {1,0,1};
        assertEquals(0, LeftRotation.rotLeft(array,4)[0]);
    }

    @Test
    public void shouldReturnAnEmptyArrayWhenAnyArrayElementIsMoreThanOneMillion(){
        int[] array = {1,1_000_001,1};
        assertEquals(0, LeftRotation.rotLeft(array,4)[0]);
    }

    @Test
    public void shouldMoveArrayElementsOnce(){
        int[] array = {1,2,3,4};
        assertEquals(2, LeftRotation.rotLeft(array,1)[0]);
    }

    @Test
    public void shouldMoveArrayElementsTwice(){
        int[] array = {1,2,3,4};
        assertEquals(3, LeftRotation.rotLeft(array,2)[0]);
    }

    @Test
    public void shouldMoveArrayElementsThreeTimes(){
        int[] array = {1,2,3,4};
        assertEquals(4, LeftRotation.rotLeft(array,3)[0]);
    }

    @Test
    public void shouldMoveArrayElementsFourTimesFirstPosition(){
        int[] array = {1,2,3,4,5};
        assertEquals(5, LeftRotation.rotLeft(array,4)[0]);
    }

    @Test
    public void shouldMoveArrayElementsFourTimesSecondPosition(){
        int[] array = {1,2,3,4,5};
        assertEquals(1, LeftRotation.rotLeft(array,4)[1]);
    }
}