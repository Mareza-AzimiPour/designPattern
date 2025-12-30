package behavioral.interceptor.aop;

/**
 * InterceptorDispatcher is responsible for
 * coordinating interceptor execution and
 * delegating control to the target context.
 */
public class InterceptorDispatcher {

    /**
     * Dispatches the invocation through interceptors
     * and then executes the target logic.
     *
     * @param request the invocation context
     * @param context the target business context
     */
    public void dispatch(JoinPoint request, OrderContext context) {
        LoggingInterceptor interceptor = new LoggingInterceptor();

        interceptor.beforeExecute(request);
        context.proccess(request);
        interceptor.afterExecute(request);
    }
}
