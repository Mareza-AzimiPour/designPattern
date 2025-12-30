package behavioral.interceptor.aop;

/**
 * Interceptor defines a contract for executing logic
 * before and after a target invocation.
 * <p>
 * This interface represents the core element
 * of the Interceptor Design Pattern.
 */
public interface Interceptor {

    /**
     * Executed before the target operation.
     *
     * @param context the join point representing
     *                the current invocation
     */
    void beforeExecute(JoinPoint context);

    /**
     * Executed after the target operation.
     *
     * @param context the join point representing
     *                the current invocation
     */
    void afterExecute(JoinPoint context);
}
