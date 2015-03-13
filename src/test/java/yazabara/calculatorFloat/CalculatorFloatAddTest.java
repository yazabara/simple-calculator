package yazabara.calculatorFloat;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorFloat;

import static org.junit.Assert.assertTrue;

public class CalculatorFloatAddTest {

    Calculator<Float> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorFloat();
    }

    @Test
    public void onePlusOne() throws Exception {
        assertTrue("1 + 1 = 2", calculator.add(1f, 1f) == 2f);
    }

    @Test(timeout = 7)
    public void multyPlus() throws Exception {
        float result = 0;
        float trueResult = 0;
        for (int i =0; i < 100000; i ++) {
            result = calculator.add(result, (float)i);
            trueResult += i;
        }
        assertTrue("1 + 2 + 3 + ...  =  ...", result == trueResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.add(null, 1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.add(1f, null);
    }
}