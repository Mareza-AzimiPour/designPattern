package behavioral.interceptor.aop;

/**
 * LoggingInterceptor is a concrete interceptor
 * that performs logging before and after execution.
 */
public class LoggingInterceptor implements Interceptor {

    @Override
    public void beforeExecute(JoinPoint context) {
        System.out.println("before Execute");
    }

    @Override
    public void afterExecute(JoinPoint context) {
        System.out.println("after Execute");
    }
}
