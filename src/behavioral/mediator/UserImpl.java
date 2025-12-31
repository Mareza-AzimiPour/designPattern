package behavioral.mediator;

/**
 * UserImpl is a concrete implementation of {@link User}.
 *
 * <p>
 * This class represents a concrete colleague that sends
 * and receives messages via the {@link ChatMediator}.
 * </p>
 */
public class UserImpl extends User {

    /**
     * Constructs a concrete user with a mediator and a name.
     *
     * @param mediator the mediator responsible for communication
     * @param name     the user's name
     */
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    /**
     * Sends a message through the mediator.
     *
     * @param msg the message to send
     */
    @Override
    public void send(String msg) {
        System.out.println(this.name + " sending: " + msg);
        mediator.sendMessage(msg, this);
    }

    /**
     * Receives a message from the mediator.
     *
     * @param msg the message received
     */
    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received: " + msg);
    }
}
