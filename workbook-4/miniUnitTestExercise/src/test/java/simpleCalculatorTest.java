import static org.junit.jupiter.api.Assertions.*;

class simpleCalculatorTest {

    @org.junit.jupiter.api.Test
    void addTwoPositiveNumbers() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double answer = simpleCalculator.addTwoPositiveNumbers(5, 10);

        assertEquals(15, answer);
    }

    @org.junit.jupiter.api.Test
    void addTwoNegativeNumbers() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double answer = simpleCalculator.addTwoNegativeNumbers(-3, -2);
        assertEquals(-5, answer);
    }

    @org.junit.jupiter.api.Test
    void addPositive_NegativeNumbers() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double answer = simpleCalculator.addPositive_NegativeNumbers(10, -7);
        assertEquals(3, answer);
    }



    @org.junit.jupiter.api.Test
    void divideTwoNumbers() {
    SimpleCalculator simpleCalculator = new SimpleCalculator();
    double answer = simpleCalculator.divideTwoNumbers(40, 5);

    assertEquals(8, answer);
    }
}