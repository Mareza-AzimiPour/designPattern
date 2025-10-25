package behavioral.observable;

/**
 * Concrete implementation of {@link Observer} representing a subscriber
 * that listens to a specific {@link MyTopic}.
 * <p>
 * When the topic updates, this observer consumes the new message.
 * </p>
 *
 * <p><b>Responsibilities:</b></p>
 * <ul>
 *     <li>Hold a reference to its {@link Subject} (the topic).</li>
 *     <li>Implement the {@code update()} method to consume messages.</li>
 * </ul>
 *
 * @author Mohammad Reza
 */
public class MyTopicSubscription implements Observer {

    private String name;
    private Subject topic;

    /**
     * Constructs a topic subscriber with a given name identifier.
     *
     * @param name the subscription name
     */
    public MyTopicSubscription(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.update(this);
        if (msg == null) {
            System.out.println(msg + " " + "No message");
        } else {
            System.out.println(name + ":: Consuming message::" + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}

