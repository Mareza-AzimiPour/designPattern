package behavioral.observable;

/**
 * Interface representing an Observer in the Observer design pattern.
 * <p>
 * Any class that needs to be notified when a Subject changes its state
 * should implement this interface.
 * </p>
 *
 * <p><b>Responsibilities:</b></p>
 * <ul>
 *     <li>Provide an {@code update()} method to receive updates from the Subject.</li>
 *     <li>Provide a {@code setSubject(Subject subject)} to attach itself to a Subject instance.</li>
 * </ul>
 *
 * @author Mohammad Reza
 */
public interface Observer {

    /**
     * Called by the Subject when its state changes,
     * to update the Observer with the new state or data.
     */
    void update();

    /**
     * Assigns a Subject to this Observer so it can listen for its state changes.
     *
     * @param subject the Subject to observe
     */
    void setSubject(Subject subject);
}

