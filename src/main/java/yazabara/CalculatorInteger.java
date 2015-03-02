package yazabara;

/**
 * Created by Yaroslav on 02.03.2015.
 */
public class CalculatorInteger implements Calculator<Integer> {

    @Override
    public Integer add(Integer a, Integer b) {
        checksInputArguments(a, b);
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        checksInputArguments(a, b);
        return a - b;
    }

    @Override
    public Integer mult(Integer a, Integer b) {
        checksInputArguments(a, b);
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        checksInputArguments(a, b);
        if (b == 0) {
            throw new IllegalArgumentException("b be not 0");
        }
        return a / b;
    }

    private void checksInputArguments(Integer a, Integer b) {
        if ( a != null && b != null) {
            return;
        }
        throw new IllegalArgumentException("integers must be not null");
    }
}
