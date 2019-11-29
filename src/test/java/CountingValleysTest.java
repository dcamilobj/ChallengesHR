import org.junit.*;
import static org.junit.Assert.assertEquals;


public class CountingValleysTest {

    CountingValleys countingValleys;

    public CountingValleysTest(){}

    @Before
    public void setup(){
        countingValleys = new CountingValleys();
    }


    @Test
    public void shouldReturnZero(){
        assertEquals(0, countingValleys.countingValleys(5,"UDDDU"));
    }

    @Test
    public void shouldReturnOne(){
        assertEquals(1, countingValleys.countingValleys(8,"UDDDUDUU"));
    }

    @Test
    public void shouldReturnTwo(){
        assertEquals(2, countingValleys.countingValleys(10,"UDDDUDUUDU"));
    }

}