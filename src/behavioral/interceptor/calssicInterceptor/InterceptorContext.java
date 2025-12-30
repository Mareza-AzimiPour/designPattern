package behavioral.interceptor.calssicInterceptor;

/**
 * InterceptorContext represents the context in which
 * expressions are evaluated.
 * <p>
 * It provides helper methods and shared state
 * required during interpretation.
 */
public class InterceptorContext {

    /**
     * Converts an integer to its binary string representation.
     *
     * @param i the integer to convert
     * @return binary representation of the integer
     */
    public String getBinaryFormat(int i) {
        return Integer.toString(i);
    }

    /**
     * Converts an integer to its hexadecimal string representation.
     *
     * @param i the integer to convert
     * @return hexadecimal representation of the integer
     */
    public String getHexFormat(int i) {
        return Integer.toHexString(i);
    }
}
