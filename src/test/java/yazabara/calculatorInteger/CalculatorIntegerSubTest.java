package yazabara.calculatorInteger;

import org.junit.Before;
import org.junit.Test;
import yazabara.Calculator;
import yazabara.CalculatorInteger;

import static org.junit.Assert.assertTrue;

public class CalculatorIntegerSubTest {

    Calculator<Integer> calculator = null;

    @Before
    public void startUp() {
        calculator = new CalculatorInteger();
    }

    @Test
    public void oneSubOne() throws Exception {
        assertTrue("1 - 1 = 0", calculator.sub(1, 1) == 0);
    }

    @Test(timeout = 7)
    public void multySub() throws Exception {
        int result = Integer.MAX_VALUE;
        int trueResult = Integer.MAX_VALUE;
        for (int i =0; i < 100000; i ++) {
            result = calculator.sub(result, i);
            trueResult -= i;
        }
        assertTrue("Max_Integer -1 - 2 - 3  ...  =  ...", result == trueResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullFirstParams() throws Exception {
        calculator.sub(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSecondParams() throws Exception {
        calculator.sub(1, null);
    }

}