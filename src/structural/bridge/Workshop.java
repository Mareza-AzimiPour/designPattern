package structural.bridge;

/**
 * Represents an abstract workshop that performs a specific unit of work
 * in the Bridge design pattern.
 * <p>
 * This class defines the high-level {@code work()} operation that must be
 * implemented by concrete subclasses to execute a particular task or process.
 * Typical concrete implementations might represent distinct manufacturing or
 * processing steps that can be combined independently with different abstractions.
 * </p>
 *
 * <p><b>Pattern Role:</b> Implementor in the Bridge pattern.</p>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public abstract class Workshop {

    /**
     * Performs the specific work defined by the concrete workshop.
     * <p>
     * Each subclass provides its own implementation of this method to
     * execute a particular piece of functionality.
     * </p>
     */
    public abstract void work();
}

