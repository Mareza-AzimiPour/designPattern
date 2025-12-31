package behavioral.mediator;

/**
 * User represents an abstract participant in the chat system.
 *
 * <p>
 * This class plays the <b>Colleague</b> role in the Mediator
 * Design Pattern. Each user communicates only through
 * the {@link ChatMediator} and does not interact directly
 * with other users.
 * </p>
 */
public abstract class User {

    /**
     * Reference to the mediator responsible for communication.
     */
    protected ChatMediator mediator;

    /**
     * Name of the user.
     */
    protected String name;

    /**
     * Constructs a user associated with a mediator.
     *
     * @param mediator the mediator handling communication
     * @param name     the user's name
     */
    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * Sends a message through the mediator.
     *
     * @param msg the message to send
     */
    public abstract void send(String msg);

    /**
     * Receives a message from the mediator.
     *
     * @param msg the received message
     */
    public abstract void receive(String msg);
}
