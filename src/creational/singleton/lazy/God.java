package creational.singleton.lazy;

/**
 * The {@code God} class demonstrates a simple Singleton pattern implementation.
 * <p>
 * This version uses lazy initialization, meaning the instance is created only
 * when first requested. However, it is <b>not thread-safe</b> and will create
 * multiple instances in multithreaded environments.
 * </p>
 *
 * <h2>Design Notes:</h2>
 * <ul>
 *     <li>The constructor is private to prevent direct instantiation.</li>
 *     <li>The instance is stored in a static field and initialized when needed.</li>
 *     <li>Thread safety is not guaranteed — intended for single-threaded use only.</li>
 * </ul>
 *
 * <p><b>Recommended:</b> For thread safety, consider using the synchronized
 * version or the Bill Pugh Singleton implementation.</p>
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
     * The single instance of {@code God}, initially null.
     */
    private static God instance = null;

    /**
     * A sample property representing a prophet number.
     */
    private int payambarNumber = 0;

    /**
     * Private constructor to prevent instantiation outside this class.
     */
    private God() {
    }

    /**
     * Returns the single instance of {@code God}.
     * <p>
     * Creates the instance on first call and reuses the same one afterwards.
     * Note: This version is <b>not thread-safe</b>.
     * </p>
     *
     * @return the unique {@code God} instance
     */
    public static God getInstance() {
        if (instance == null) {           // check if instance does not exist
            instance = new God();         // create and store the instance
        }
        return instance;                  // return the same unique object
    }

    /**
     * Returns the current prophet number.
     */
    public int getPayambarNumber() {
        return payambarNumber;
    }

    /**
     * Sets the prophet number.
     */
    public void setPayambarNumber(int payambarNumber) {
        this.payambarNumber = payambarNumber;
    }
}
