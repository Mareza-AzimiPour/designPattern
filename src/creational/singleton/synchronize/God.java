package creational.singleton.synchronize;

/**
 * The {@code God} class implements the Singleton design pattern
 * using basic synchronization to ensure thread safety.
 *
 * <p>
 * Only one instance of this class can exist during the application's lifetime.
 * The {@code synchronized} keyword on {@code getInstance()} prevents
 * multiple threads from creating separate instances simultaneously.
 * </p>
 *
 * <h2>Characteristics:</h2>
 * <ul>
 *     <li><b>Thread-safe:</b> Yes (via method-level synchronization).</li>
 *     <li><b>Lazy initialization:</b> Yes, instance created when first needed.</li>
 *     <li><b>Performance:</b> Slightly slower due to synchronized lock on every call.</li>
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
     * Holds the single static instance of {@code God}.
     * Initially {@code null} until first requested.
     */
    private static God instance = null;

    /**
     * Represents the prophet number.
     */
    private int payambarNumber = 0;

    /**
     * Private constructor prevents external instantiation.
     */
    private God() {
    }

    /**
     * Returns the unique Singleton instance of {@code God}.
     * <p>
     * The method is synchronized to ensure that only one thread
     * can create the instance at a time.
     * </p>
     *
     * @return the single instance of {@code God}
     */
    public static synchronized God getInstance() {
        if (instance == null) {          // if instance doesn't exist
            instance = new God();        // create it and assign to the static variable
        }
        return instance;                 // return the single instance
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
