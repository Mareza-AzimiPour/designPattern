package behavioral.observable;


/**
 * Interface representing a Subject (Observable) in the Observer design pattern.
 * <p>
 * Any class whose state changes need to be observed by multiple Observers
 * should implement this interface.
 * </p>
 *
 * <p><b>Responsibilities:</b></p>
 * <ul>
 *     <li>Maintain a list of registered Observers.</li>
 *     <li>Notify all Observers when a change occurs.</li>
 * </ul>
 *
 * @author Mohammad Reza
 */
public interface Subject {

    /**
     * Registers an Observer so it starts receiving state updates.
     *
     * @param o the observer to register
     */
    void register(Observer o);

    /**
     * Unregisters an Observer so it no longer receives updates.
     *
     * @param o the observer to remove
     */
    void unregister(Observer o);

    /**
     * Notifies all registered observers that the Subject's state has changed.
     */
    void notifyObservers();

    /**
     * Returns the latest data or state to a specific Observer.
     * <p>Typically called internally by the Observer when updated.</p>
     *
     * @param o the observer requesting update
     * @return the updated data object or state
     */
    Object update(Observer o);
}

