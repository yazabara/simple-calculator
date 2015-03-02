package yazabara.calculatorInteger;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorInteger;

import static org.junit.Assert.assertTrue;

public class CalculatorIntegerAddTest {

    Calculator<Integer> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorInteger();
    }

    @Test
    public void onePlusOne() throws Exception {
        assertTrue("1 + 1 = 2", calculator.add(1, 1) == 2);
    }

    @Test(timeout = 7)
    public void multyPlus() throws Exception {
        int result = 0;
        int trueResult = 0;
        for (int i =0; i < 100000; i ++) {
            result = calculator.add(result, i);
            trueResult += i;
        }
        assertTrue("1 + 2 + 3 + ...  =  ...", result == trueResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.add(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.add(1, null);
    }
}