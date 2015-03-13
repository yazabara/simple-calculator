package yazabara;

/**
 * Created by Yaroslav_Zabara on 3/13/2015.
 */
public class CalculatorFloat implements Calculator<Float> {

    @Override
    public Float add(Float a, Float b) {
        checksInputArguments(a, b);
        return a + b;
    }

    @Override
    public Float sub(Float a, Float b) {
        checksInputArguments(a, b);
        return a - b;
    }

    @Override
    public Float mult(Float a, Float b) {
        checksInputArguments(a, b);
        return a * b;
    }

    @Override
    public Float div(Float a, Float b) {
        checksInputArguments(a, b);
        if (b == 0) {
            throw new IllegalArgumentException("second argument can't be 0");
        }
        return a / b;
    }

    private void checksInputArguments(Float a, Float b) {
        if (a != null && b != null) {
            return;
        }
        throw new IllegalArgumentException("numbers mustn't be null");
    }
}
