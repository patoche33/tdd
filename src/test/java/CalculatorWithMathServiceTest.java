import org.example.Calculator;
import org.example.CalculatorWithMathService;
import org.example.service.MathService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorWithMathServiceTest {

        @Test
        public void testAdd() {
            MathService mockMathservice = mock(MathService.class);
            when(mockMathservice.add(15,3)).thenReturn(18);

            CalculatorWithMathService calculatorWithMathService = new CalculatorWithMathService(mockMathservice);
            assertEquals(18, calculatorWithMathService.add(15,3));
        }

        @Test
        public void testSubtract() {
            MathService mathservice = new MathService();

            CalculatorWithMathService calculatorWithMathService = new CalculatorWithMathService(mathservice);
            assertEquals(18, calculatorWithMathService.add(15,3));
        }

        @Test
        public void testMultiply() {

        }

        @Test
        public void testDivide() {

        }

        @Test
        public void testDivideByZero() {
            MathService mockMathservice = mock(MathService.class);
            when(mockMathservice.divide(15,0)).thenThrow(new ArithmeticException("Division par zéro"));

            CalculatorWithMathService calculatorWithMathService = new CalculatorWithMathService(mockMathservice);
            assertThrows(ArithmeticException.class, () -> calculatorWithMathService.divide(15,0));
        }

}
