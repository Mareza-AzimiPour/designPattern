package behavioral.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of {@link Subject} representing a Topic that can be
 * subscribed to by multiple observers.
 * <p>
 * When a message (state change) is posted, all registered observers are notified.
 * </p>
 *
 * <p><b>Responsibilities:</b></p>
 * <ul>
 *     <li>Maintain and manage a list of {@link Observer} instances.</li>
 *     <li>Broadcast messages to all observers when {@code postMessage(String message)} is invoked.</li>
 * </ul>
 *
 * @author Mohammad Reza
 */
public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean change;

    /**
     * Initializes a new Topic with an empty list of Observers.
     */
    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        if (observers == null) throw new NullPointerException("observers is null");
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        if (!change) return;
        List<Observer> observersLocal = new ArrayList<>(observers);
        this.change = false;
        for (Observer o : observersLocal) {
            o.update();
        }
    }

    @Override
    public Object update(Observer o) {
        return this.message;
    }

    /**
     * Posts a new message into the Topic and notifies all registered observers.
     *
     * @param message the new message to broadcast
     */
    //other name subscribe
    public void postMessage(String message) {
        System.out.println("post message:" + message);
        this.message = message;
        this.change = true;
        notifyObservers();
    }
}

