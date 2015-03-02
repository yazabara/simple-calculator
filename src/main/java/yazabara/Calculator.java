package yazabara;

/**
 * Simple calculator
 *
 * Created by Yaroslav on 02.03.2015.
 */
public interface Calculator<Type> {

    /**
     * @return a + b
     */
    Type add(Type a, Type b);

    /**
     * @return a - b
     */
    Type sub(Type a, Type b);

    /**
     * @return a * b
     */
    Type mult(Type a, Type b);

    /**
     * @return a / b
     */
    Type div(Type a, Type b);
}
