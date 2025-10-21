package structural.proxy.dynamicProxy;

/**
 * Real implementation of the {@link Service} interface, representing the actual object
 * whose behavior is being intercepted by a dynamic proxy.
 * <p>
 * This class performs the genuine business operation without any additional proxy logic.
 * It acts as the <b>RealSubject</b> in the Dynamic Proxy pattern.
 * </p>
 *
 * <p><b>Pattern Role:</b> RealSubject</p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     Service service = new RealService();
 *     service.perform();
 *     // Output:
 *     // Performing real service logic...
 * </pre>
 *
 * @see Service
 */
public class RealService implements Service {

    /**
     * Executes the main business logic of the service.
     * This method represents the operation that the client intends to invoke.
     */
    @Override
    public void perform() {
        System.out.println("Performing real service logic...");
    }
}


