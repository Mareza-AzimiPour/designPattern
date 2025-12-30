package behavioral.interceptor.calssicInterceptor;

/**
 * IntToBinaryExpression is a concrete expression
 * that converts an integer to binary format.
 */
public class IntToBinaryExpression implements Expression {

    /**
     * Integer value to be interpreted.
     */
    private int i;

    /**
     * Constructs an IntToBinaryExpression.
     *
     * @param i the integer to convert to binary
     */
    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    /**
     * Interprets the integer using binary format.
     *
     * @param context the interpretation context
     * @return binary string representation
     */
    @Override
    public String interpreter(InterceptorContext context) {
        return context.getBinaryFormat(i);
    }
}
