package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatMediatorImp is a concrete implementation of {@link ChatMediator}.
 *
 * <p>
 * This class represents the <b>ConcreteMediator</b> role and
 * implements the communication logic between {@link User} objects.
 * It maintains a list of registered users and forwards messages
 * from the sender to all other participants.
 * </p>
 */
public class ChatMediatorImp implements ChatMediator {

    /**
     * List of users participating in the chat.
     */
    private List<User> users;

    /**
     * Constructs a ChatMediatorImp with an empty user list.
     */
    public ChatMediatorImp() {
        this.users = new ArrayList<>();
    }

    /**
     * Sends a message to all users except the sender.
     *
     * @param message the message to be sent
     * @param user    the sender of the message
     */
    @Override
    public void sendMessage(String message, User user) {
        for (User value : this.users) {
            if (value != user) {
                value.receive(message);
            }
        }
    }

    /**
     * Adds a user to the chat mediator.
     *
     * @param user the user to register
     */
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
