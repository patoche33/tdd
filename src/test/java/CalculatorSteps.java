import io.cucumber.java.en.*;
import org.example.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSteps {
    private Calculator calculator;
    private int result;
    private Exception resultE ;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(int a, int b) {
        result = calculator.add(a, b);
    }

    @When("I subtract {int} and {int}")
    public void i_Subtract_And(int a, int b) {
        result = calculator.subtract(a, b);
    }

    @When("I multiply {int} and {int}")
    public void i_Multiply_And(int a, int b) {
        result = calculator.multiply(a, b);
    }

    @When("I divide {int} and {int}")
    public void i_Divide_And(int a, int b) {
        result = calculator.divide(a, b);
    }


    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        assertEquals(expected, result);
    }

    @When("I divide {int} by {int}")
    public void i_Divide_By(int a, int b) {
       try {
           result = calculator.divide(a, b);
       }
       catch(Exception e) {
           resultE = e;
        }
    }

    @Then("the result should be IllegalArgumentException")
    public void theResultShouldBeIllegalArgumentException() {
        assertInstanceOf(IllegalArgumentException.class, resultE);
    }
}


