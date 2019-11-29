import org.junit.*;
import static org.junit.Assert.assertEquals;


public class CountingValleysTest {

    private CountingValleys countingValleys;

    public CountingValleysTest() {
    }

    @Before
    public void setup() {
        countingValleys = new CountingValleys();
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, CountingValleys.countingValleys(5, "UDDDU"));
    }

    @Test
    public void shouldReturnOne() {
        assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }

    @Test
    public void shouldReturnTwo() {
        assertEquals(2, CountingValleys.countingValleys(10, "UDDDUDUUDU"));
    }

    @Test
    public void shouldReturnOneHundred() {
        assertEquals(100, CountingValleys.countingValleys(200, "DUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDU"));
    }

    @Test
    public void whenThereIsAnIncorrectSymbolShouldReturnZero(){
        assertEquals(0, CountingValleys.countingValleys(2, "UA"));
    }

    @Test
    public void whenLengthDoesNotMatchWithStringShouldReturnZero(){
        assertEquals(0, CountingValleys.countingValleys(10, "UD"));
    }
}