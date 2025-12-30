package behavioral.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        NotificationCollection collection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(collection);
        notificationBar.displayNotifications();
    }
}
