package creational.singleton.eager;

/**
 * The {@code God} class implements the Singleton pattern
 * using eager initialization. The instance is created when
 * the class is loaded by the JVM, ensuring thread safety
 * without explicit synchronization.
 *
 * <h2>Characteristics:</h2>
 * <ul>
 *     <li>Instance is created eagerly at class load time.</li>
 *     <li>Thread-safe by JVM classloader mechanics.</li>
 *     <li>Not lazily initialized (may create instance even if unused).</li>
 * </ul>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * God god = God.getInstance();
 * }</pre>
 *
 * @author Mohammad Reza Azimipour
 * @version 1.0
 */
public class God {

    private int payambarNumber;

    /**
     * Static instance created eagerly during class loading.
     */
    private static final God instance = new God();

    /**
     * Private constructor prevents direct instantiation.
     */
    private God() {
    }

    /**
     * Provides global access to the single instance of {@code God}.
     *
     * @return the singleton instance
     */
    public static God getInstance() {
        return instance;
    }

    /**
     * Gets the value of {@code payambarNumber}.
     *
     * @return the current prophet number
     */
    public int getPayambarNumber() {
        return payambarNumber;
    }

    /**
     * Sets the value of {@code payambarNumber}.
     *
     * @param payambarNumber the new prophet number
     */
    public void setPayambarNumber(int payambarNumber) {
        this.payambarNumber = payambarNumber;
    }
}
