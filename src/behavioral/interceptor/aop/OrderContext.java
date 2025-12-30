package behavioral.interceptor.aop;

/**
 * OrderContext represents the business logic
 * that is being intercepted.
 */
public class OrderContext {

    /**
     * Executes the core business process.
     *
     * @param context the invocation context
     */
    public void proccess(JoinPoint context) {
        System.out.println("Order Context.....");
    }
}
