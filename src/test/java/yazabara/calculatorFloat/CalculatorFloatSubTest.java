package yazabara.calculatorFloat;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorFloat;
import yazabara.CalculatorInteger;

import static org.junit.Assert.assertTrue;

public class CalculatorFloatSubTest {

    Calculator<Float> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorFloat();
    }

    @Test
    public void oneSubOne() throws Exception {
        assertTrue("1 - 1 = 0", calculator.sub(1f, 1f) == 0f);
    }

    @Test(timeout = 10)
    public void multySub() throws Exception {
        float result = Float.MAX_VALUE;
        float trueResult = Float.MAX_VALUE;
        for (int i = 0; i < 100000; i++) {
            result = calculator.sub(result, (float) i);
            trueResult -= (float)i;
        }
        assertTrue("Max_Integer -1 - 2 - 3  ...  =  ...", result == trueResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.sub(null, 1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.sub(1f, null);
    }

}