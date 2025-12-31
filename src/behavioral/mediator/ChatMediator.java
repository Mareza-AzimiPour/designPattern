package behavioral.mediator;

/**
 * ChatMediator defines the contract for communication between
 * {@link User} objects.
 *
 * <p>
 * This interface represents the <b>Mediator</b> role in the
 * Mediator Design Pattern. It centralizes message exchange
 * logic so that {@code User} objects do not communicate
 * directly with each other, reducing coupling.
 * </p>
 */
public interface ChatMediator {

    /**
     * Sends a message from a given user to all other registered users.
     *
     * @param message the message being sent
     * @param user    the sender of the message
     */
    void sendMessage(String message, User user);

    /**
     * Registers a user with the mediator.
     *
     * @param user the user to be added
     */
    void addUser(User user);
}
