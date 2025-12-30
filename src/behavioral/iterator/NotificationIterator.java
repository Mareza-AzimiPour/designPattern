package behavioral.iterator;

/**
 * NotificationIterator provides sequential access to
 * Notification objects stored in an array.
 * <p>
 * This class acts as a ConcreteIterator in the Iterator Pattern.
 */
public class NotificationIterator implements Iterator {

    /**
     * Array of notifications to iterate over.
     */
    private final Notification[] notifications;

    /**
     * Current position in the iteration.
     */
    private int position = 0;

    /**
     * Creates a new iterator for the given notifications array.
     *
     * @param notifications array of notifications
     */
    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    /**
     * Returns the next notification in the collection.
     *
     * @return the next {@link Notification}
     */
    @Override
    public Object next() {
        Notification notification = notifications[position];
        position++;
        return notification;
    }

    /**
     * Checks whether there are more notifications to iterate over.
     *
     * @return {@code true} if next notification exists, otherwise {@code false}
     */
    @Override
    public boolean hasNext() {
        return position < notifications.length && notifications[position] != null;
    }
}