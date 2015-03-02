package yazabara.calculatorInteger;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorInteger;

import static org.junit.Assert.assertTrue;

public class CalculatorIntegerMultTest {

    Calculator<Integer> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorInteger();
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.mult(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.mult(1, null);
    }

    @Test
    public void twoMultTwo() throws Exception {
        assertTrue("2 * 2 = 4", calculator.mult(2, 2) == 4);
    }

    @Test
    public void sixMultEight() throws Exception {
        assertTrue("6 * 8 = 48", calculator.mult(6, 8) == 48);
    }

    @Test(timeout = 1)
    public void multyMult() throws Exception {
        int result = 1;
        int trueResult = 1;
        for (int i =0; i < 1000; i ++) {
            result = calculator.mult(result, i);
            trueResult *= i;
        }
        assertTrue("1 * 2 * 3 * ...  =  ...", result == trueResult);
    }
}