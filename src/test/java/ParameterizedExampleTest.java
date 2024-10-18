import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedExampleTest {

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "13, 7, 20",
            "5, 5, 10"
    })
    public void testAdd(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }


    @ParameterizedTest
    @CsvFileSource(resources="data.csv")
    public void testAddBis(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

}
