package creational.singleton.billPugh;

/**
 * The {@code God} class demonstrates a Singleton implementation
 * using the <b>Bill Pugh method</b>, which leverages a static inner
 * class to provide lazy initialization and thread safety without
 * synchronized blocks.
 *
 * <h2>How It Works:</h2>
 * <ul>
 *     <li>The instance is created inside an inner static class, {@code SingletonHolder},
 *         which is not loaded until the {@code getInstance()} method is called.</li>
 *     <li>This ensures that the Singleton is both <b>lazy-initialized</b> and <b>thread-safe</b>.</li>
 *     <li>No synchronization overhead is required.</li>
 * </ul>
 *
 * <h2>Advantages:</h2>
 * <ul>
 *     <li>Simple and efficient implementation.</li>
 *     <li>Thread-safe due to JVM class loading guarantees.</li>
 *     <li>Lazy initialization by design.</li>
 * </ul>
 *
 * <h2>Limitations:</h2>
 * <ul>
 *     <li>Singleton can be broken using reflection or deserialization
 *         unless additional protection is added.</li>
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
     * Represents a number associated with a prophet (Payambar).
     */
    private int payambarNumber;

    /**
     * Private constructor to prevent direct instantiation.
     */
    private God() {
    }

    /**
     * Inner static class responsible for holding the Singleton instance.
     * The instance is created only when the class is loaded.
     */
    private static class SingletonHolder {
        private static final God instance = new God();
    }

    /**
     * Returns the unique Singleton instance of {@code God}.
     *
     * @return the singleton instance
     */
    public static God getInstance() {
        return SingletonHolder.instance;
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
