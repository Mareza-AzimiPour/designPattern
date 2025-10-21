package structural.proxy.dynamicProxy;

/**
 * Common service interface representing the subject in the Dynamic Proxy pattern.
 * <p>
 * Both {@link RealService} (the real concrete object) and its runtime-generated proxy
 * implement this interface to ensure a consistent API.
 * </p>
 *
 * <p><b>Pattern Role:</b> Subject</p>
 * <p><b>Used for:</b> Logging, Security, AOP, or Transaction management proxies at runtime.</p>
 *
 * @author Mohammad Reza
 * @see RealService
 * @see ServiceInvocationHandler
 */
public interface Service {

    /**
     * Performs the core business logic of the service.
     * Implementations define the actual operation to be executed,
     * while proxies may add pre/post behaviors such as logging or security checks.
     */
    void perform();
}
