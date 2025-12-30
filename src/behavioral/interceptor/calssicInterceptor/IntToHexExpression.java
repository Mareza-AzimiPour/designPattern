package behavioral.interceptor.calssicInterceptor;

/**
 * IntToHexExpression is a concrete expression
 * that converts an integer to hexadecimal format.
 */
public class IntToHexExpression implements Expression {

    /**
     * Integer value to be interpreted.
     */
    private int i;

    /**
     * Constructs an IntToHexExpression.
     *
     * @param i the integer to convert to hexadecimal
     */
    public IntToHexExpression(int i) {
        this.i = i;
    }

    /**
     * Interprets the integer using hexadecimal format.
     *
     * @param context the interpretation context
     * @return hexadecimal string representation
     */
    @Override
    public String interpreter(InterceptorContext context) {
        return context.getHexFormat(i);
    }
}
