package yazabara.calculatorInteger;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorInteger;

import static org.junit.Assert.assertTrue;

/**
 * Created by Yaroslav on 02.03.2015.
 */
public class CalculatorIntegerDivTest {

    Calculator<Integer> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorInteger();
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.div(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.div(1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void badSecondParams() throws Exception {
        calculator.div(1, 0);
    }

    @Test
    public void fourDivTwo() throws Exception {
        assertTrue("4 / 2 = 2", calculator.div(4, 2) == 2);
    }

    @Test
    public void twoDivFour() throws Exception {
        assertTrue("2 / 4 = 1", calculator.div(2, 4) == 0);
    }

    @Test(timeout = 1)
    public void multyDev() throws Exception {
        int result = Integer.MAX_VALUE;
        int trueResult = Integer.MAX_VALUE;
        for (int i =0; i < 10; i ++) {
            result = calculator.div(result, 2);
            trueResult /= 2;
        }
        assertTrue("MAX_INT / 2 / 2 ...  =  ...", result == trueResult);
    }
}
