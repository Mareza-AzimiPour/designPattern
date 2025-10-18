package structural.bridge;

/**
 * Concrete implementation of the {@link Workshop} that performs
 * the assembly phase in the Bridge design pattern.
 * <p>
 * This class defines the specific behavior of the {@code work()} method
 * by printing messages related to assembling and production activities.
 * It illustrates how multiple {@code Workshop} implementations can be
 * composed to represent distinct operational steps in a manufacturing
 * or processing flow.
 * </p>
 *
 * <p><b>Pattern Role:</b> ConcreteImplementor in the Bridge pattern.</p>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public class Assemble extends Workshop {

    /**
     * Executes the assembly operation.
     * <p>
     * Prints messages to indicate that the assembly process has been
     * completed, followed by a reference to production output.
     * </p>
     */
    @Override
    public void work() {
        System.out.println("And Assemble");
        System.out.println("Produced");
    }
}

