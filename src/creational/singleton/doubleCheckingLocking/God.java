package creational.singleton.doubleCheckingLocking;

/**
 * The {@code God} class represents a Singleton implementation ensuring that
 * only one instance of this class exists during the lifetime of the application.
 * <p>
 * This implementation uses the <b>Double-Checked Locking (DCL)</b> pattern
 * with a {@code volatile} reference to guarantee thread safety and improve performance.
 * </p>
 *
 * <h2>Key Characteristics:</h2>
 * <ul>
 *     <li><b>Private constructor</b> prevents direct instantiation.</li>
 *     <li><b>Thread-safe</b> due to synchronized block and volatile instance.</li>
 *     <li><b>Lazy initialization</b>: instance is created only when it is first requested.</li>
 * </ul>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * God god = God.getInstance();
 * god.setPayambarNumber(12);
 * System.out.println(god.getPayambarNumber());
 * }</pre>
 *
 * @author Mohammad Reza Azimipour
 * @version 1.0
 */
public class God {

    /**
     * The unique instance of the class.
     * Declared volatile to ensure visibility across threads.
     */
    private static volatile God instance;

    /**
     * Represents a number associated with a prophet (payambar).
     */
    private int payambarNumber;

    /**
     * Private constructor to prevent instantiation from outside.
     */
    private God() {
    }

    /**
     * Provides a global point of access to the single {@code God} instance.
     * <p>
     * It uses Double-Checked Locking (DCL) to ensure that the instance is created only once
     * in a thread-safe manner with minimal synchronization overhead.
     * </p>
     *
     * @return the singleton instance of {@code God}
     */
    public static God getInstance() {
        if (instance == null) {                       // First check (no locking)
            synchronized (God.class) {                // Acquire lock only if necessary
                if (instance == null) {               // Second check (with lock)
                    instance = new God();
                }
            }
        }
        return instance;
    }

    /**
     * Gets the current prophet number.
     *
     * @return the value of {@code payambarNumber}
     */
    public int getPayambarNumber() {
        return payambarNumber;
    }

    /**
     * Sets the prophet number.
     *
     * @param payambarNumber the new value of {@code payambarNumber}
     */
    public void setPayambarNumber(int payambarNumber) {
        this.payambarNumber = payambarNumber;
    }
}