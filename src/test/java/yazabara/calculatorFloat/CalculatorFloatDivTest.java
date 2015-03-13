package yazabara.calculatorFloat;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorFloat;
import yazabara.CalculatorInteger;

import static org.junit.Assert.assertTrue;

/**
 * Created by Yaroslav on 02.03.2015.
 */
public class CalculatorFloatDivTest {

    Calculator<Float> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorFloat();
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.div(null, 1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.div(1f, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void badSecondParams() throws Exception {
        calculator.div(1f, 0f);
    }

    @Test
    public void fourDivTwo() throws Exception {
        assertTrue("4 / 2 = 2", calculator.div(4f, 2f) == 2f);
    }

    @Test
    public void twoDivFour() throws Exception {
        assertTrue("2 / 4 = 1", calculator.div(2f, 4f) == 0.5f);
    }

    @Test(timeout = 1)
    public void multyDev() throws Exception {
        float result = Float.MAX_VALUE;
        float trueResult = Float.MAX_VALUE;
        for (int i =0; i < 10; i ++) {
            result = calculator.div(result, 2f);
            trueResult /= 2;
        }
        assertTrue("MAX_INT / 2 / 2 ...  =  ...", result == trueResult);
    }
}
