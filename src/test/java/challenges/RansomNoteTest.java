package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNoteTest {

    @Test
    public void arraysShouldBeBetweenOneAndThirtyThousand(){
         String[] magazine = new String[30001];
         String[] note = new String[2];
        assertEquals("Arrays should be between one and thirty thousand", RansomNote.checkMagazine(magazine,note));
    }

    @Test
    public void shouldReturnFalseByCaseSensitive(){
        String[] magazine = {"give","me","One","grand","today","night"};
        String[] note = {"give","one","grand","today"};
        assertEquals("No", RansomNote.checkMagazine(magazine,note));
    }

    @Test
    public void shouldReturnTrueWithoutDuplicates(){
        String[] magazine = {"give","me","one","grand","today","night"};
        String[] note = {"give","one","grand","today"};
        assertEquals("Yes", RansomNote.checkMagazine(magazine,note));
    }

    @Test
    public void shouldReturnFalseByNoteDuplicates(){
        String[] magazine = {"two","times","three","is","not","four"};
        String[] note = {"two","times","two","is","four"};
        assertEquals("No", RansomNote.checkMagazine(magazine,note));
    }

    @Test
    public void shouldReturnTrueWithDuplicates(){
        String[] magazine = {"two","times","three","is","not","four","two"};
        String[] note = {"two","times","two","is","four"};
        assertEquals("Yes", RansomNote.checkMagazine(magazine,note));
    }
}