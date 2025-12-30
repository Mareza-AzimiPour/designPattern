package behavioral.iterator;

/**
 * NotificationBar uses an iterator to display notifications
 * without knowing the internal structure of the collection.
 * <p>
 * This class represents the Client in the Iterator Pattern.
 */
public class NotificationBar {

    private final NotificationCollection notificationCollection;

    /**
     * Creates a NotificationBar with a given notification collection.
     *
     * @param notificationCollection the notification collection
     */
    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    /**
     * Displays all notifications using an iterator.
     */
    public void displayNotifications() {
        Iterator iterator = notificationCollection.createIterator();
        while (iterator.hasNext()) {
            Notification notification = (Notification) iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}