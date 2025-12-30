package behavioral.interceptor.aop;

/**
 * Demonstrates the Interceptor Design Pattern.
 */
public class InterceptorTest {

    public static void main(String[] args) {
        InterceptorDispatcher dispatcher = new InterceptorDispatcher();
        dispatcher.dispatch(new JoinPoint(), new OrderContext());
    }
}
