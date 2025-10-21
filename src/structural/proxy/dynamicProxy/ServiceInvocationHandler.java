package structural.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Invocation handler responsible for intercepting method calls made on a dynamic proxy instance.
 * <p>
 * It defines cross-cutting behaviors such as logging, performance monitoring, security checking,
 * or transaction management that should occur before or after invoking the real target method.
 * </p>
 *
 * <p><b>Pattern Role:</b> InvocationHandler (Part of the Proxy Mechanism)</p>
 *
 * <p><b>Behavior:</b> When a client invokes a method on the proxy, the JVM automatically delegates
 * the call to the {@link #invoke(Object, Method, Object[])} method of this handler.</p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     Service real = new RealService();
 *     InvocationHandler handler = new ServiceInvocationHandler(real);
 *     Service proxy = (Service) Proxy.newProxyInstance(
 *         Service.class.getClassLoader(),
 *         new Class[]{Service.class},
 *         handler
 *     );
 *     proxy.perform();
 * </pre>
 *
 * @see java.lang.reflect.Proxy
 * @see Service
 * @see RealService
 */
public class ServiceInvocationHandler implements InvocationHandler {

    /** The real target object whose methods will be invoked through reflection. */
    private final Object realObject;

    /**
     * Constructs a handler for a specific real object.
     *
     * @param realObject the actual instance to be delegated to
     */
    public ServiceInvocationHandler(Object realObject) {
        this.realObject = realObject;
    }

    /**
     * Intercepts all method calls made on the proxy instance and can add pre/post logic around them.
     * <p>
     * Default behavior: logs before and after invoking the real method via reflection.
     * </p>
     *
     * @param proxy  the dynamically created proxy instance
     * @param method the {@link Method} being called
     * @param args   arguments passed by the client (nullable)
     * @return result of the method invocation, if any
     * @throws Throwable if reflection or the target method throws an exception
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[Proxy] Before method: " + method.getName());
        Object result = method.invoke(realObject, args);
        System.out.println("[Proxy] After method: " + method.getName());
        return result;
    }
}

