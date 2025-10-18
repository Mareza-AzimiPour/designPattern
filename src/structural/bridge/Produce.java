package structural.bridge;

/**
 * Concrete implementation of the {@link Workshop} that performs
 * the production phase in the Bridge design pattern.
 * <p>
 * This class defines the specific behavior of the {@code work()} method
 * by outputting a message indicating that a production task has been completed.
 * It typically represents a concrete step that can be executed as part of
 * a larger process or combined with other workshops (e.g., {@code Assemble}).
 * </p>
 *
 * <p><b>Pattern Role:</b> ConcreteImplementor in the Bridge pattern.</p>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public class Produce extends Workshop {

    /**
     * Executes the production operation.
     * <p>
     * Prints a message indicating that the "Produce" phase has been executed.
     * </p>
     */
    @Override
    public void work() {
        System.out.println("Produced");
    }
}

