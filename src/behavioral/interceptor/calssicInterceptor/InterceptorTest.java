package behavioral.interceptor.calssicInterceptor;

/**
 * InterceptorTest acts as the client in the
 * Interpreter Design Pattern.
 * <p>
 * It parses text input, selects the appropriate
 * expression, and evaluates it using a context.
 */
public class InterceptorTest {

    /**
     * Context used during interpretation.
     */
    public InterceptorContext ic;

    /**
     * Creates the client with a given context.
     *
     * @param context the interpretation context
     */
    public InterceptorTest(InterceptorContext context) {
        ic = context;
    }

    /**
     * Parses the input text and interprets it.
     *
     * @param text input expression text
     * @return interpreted result
     */
    public String interpreter(String text) {
        Expression exp = null;

        if (text.contains("HeXadecimal")) {
            exp = new IntToHexExpression(
                    Integer.parseInt(text.substring(0, 2))
            );
        } else if (text.contains("Binary")) {
            exp = new IntToBinaryExpression(
                    Integer.parseInt(text.substring(0, 2))
            );
        }
        return exp.interpreter(ic);
    }

    /**
     * Demonstrates the Interpreter Design Pattern.
     *
     * @param args program arguments
     */
    public static void main(String[] args) {
        String text1 = "28 in HeXadecimal";
        String text2 = "25 in Binary";

        InterceptorTest clientTest =
                new InterceptorTest(new InterceptorContext());

        System.out.println("text1 -> " + clientTest.interpreter(text1));
        System.out.println("text2 -> " + clientTest.interpreter(text2));
    }
}
