package behavioral.iterator;

/**
 * NotificationCollection stores notifications internally
 * and provides an iterator to traverse them.
 * <p>
 * This class acts as a ConcreteAggregate in the Iterator Pattern.
 */
public class NotificationCollection {

    /**
     * Maximum number of notifications allowed.
     */
    static final int max_items = 6;

    /**
     * Current number of notifications.
     */
    int numberOfItems = 0;

    /**
     * Internal storage for notifications.
     */
    Notification[] notifications;

    /**
     * Initializes the collection with default notifications.
     */
    public NotificationCollection() {
        notifications = new Notification[max_items];
        additem("Mareza_Notif");
        additem("Vahid_Notif");
        additem("Omid_Notif");
    }

    /**
     * Adds a new notification to the collection.
     *
     * @param notif the notification message
     */
    public void additem(String notif) {
        Notification notification = new Notification(notif);
        if (numberOfItems >= max_items) {
            System.out.println("IS full");
        } else {
            notifications[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    /**
     * Creates and returns an iterator for this collection.
     *
     * @return an {@link Iterator} to traverse notifications
     */
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}
