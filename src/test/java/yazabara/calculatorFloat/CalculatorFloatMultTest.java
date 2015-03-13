package yazabara.calculatorFloat;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorFloat;
import yazabara.CalculatorInteger;

import static org.junit.Assert.assertTrue;

public class CalculatorFloatMultTest {

    Calculator<Float> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorFloat();
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.mult(null, 1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.mult(1f, null);
    }

    @Test
    public void twoMultTwo() throws Exception {
        assertTrue("2 * 2 = 4", calculator.mult(2f, 2f) == 4f);
    }

    @Test
    public void sixMultEight() throws Exception {
        assertTrue("6 * 8 = 48", calculator.mult(6f, 8f) == 48f);
    }

    @Test(timeout = 1)
    public void multyMult() throws Exception {
        float result = 1;
        float trueResult = 1;
        for (int i =0; i < 1000; i ++) {
            result = calculator.mult(result, (float)i);
            trueResult *= i;
        }
        assertTrue("1 * 2 * 3 * ...  =  ...", result == trueResult);
    }
}