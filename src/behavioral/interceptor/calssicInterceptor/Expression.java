package behavioral.interceptor.calssicInterceptor;

/**
 * Expression interface represents an abstract expression
 * in the Interpreter Design Pattern.
 * <p>
 * It declares a method to interpret a given context.
 */
public interface Expression {

    /**
     * Interprets the expression based on the provided context.
     *
     * @param context the interpreter context containing shared information
     * @return the interpreted result as a String
     */
    String interpreter(InterceptorContext context);
}