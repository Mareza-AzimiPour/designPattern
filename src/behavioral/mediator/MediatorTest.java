package behavioral.mediator;

/**
 * MediatorTest demonstrates the Mediator Design Pattern.
 *
 * <p>
 * This class acts as the <b>Client</b>, creating users,
 * registering them with a mediator, and sending messages
 * through the mediator rather than directly between users.
 * </p>
 */
public class MediatorTest {

    /**
     * Application entry point demonstrating mediator-based communication.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImp();

        User user1 = new UserImpl(mediator, "Peyman");
        User user2 = new UserImpl(mediator, "Mareza");
        User user3 = new UserImpl(mediator, "Omid");
        User user4 = new UserImpl(mediator, "Vahid");
        User user5 = new UserImpl(mediator, "Hani");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi Parvin");
    }
}
