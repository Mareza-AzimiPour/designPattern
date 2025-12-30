package behavioral.iterator;

/**
 * Represents a notification entity.
 * This class acts as a simple data holder for notification messages.
 */
public class Notification {

    /**
     * The notification message.
     */
    private String notification;

    /**
     * Creates a new Notification with the given message.
     *
     * @param notification the notification message
     */
    public Notification(String notification) {
        this.notification = notification;
    }

    /**
     * Returns the notification message.
     *
     * @return notification message
     */
    public String getNotification() {
        return notification;
    }

    /**
     * Sets the notification message.
     *
     * @param notification the new notification message
     */
    public void setNotification(String notification) {
        this.notification = notification;
    }

    /**
     * Returns a string representation of the notification.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "Notification{" +
                "notification='" + notification + '\'' +
                '}';
    }
}
