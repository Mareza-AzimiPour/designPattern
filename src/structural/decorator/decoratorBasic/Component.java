package structural.decorator.decoratorBasic;

/**
 * The {@code Component} class defines the abstract interface that all concrete components
 * and decorators must implement in the Decorator Design Pattern.
 * It declares the core operation ({@link #doJob()}) that can be either executed directly
 * by a concrete component or extended by decorators.
 *
 * <p>This abstraction enables dynamic composition of behaviors at runtime,
 * where decorators wrap concrete components without altering their original structure.</p>
 *
 * <p>Typical usage:</p>
 * <pre>
 * Component component = new ConcreteComponent();
 * component.doJob(); // performs the core operation
 * </pre>
 *
 * @author Mohammad Reza
 * @since 1.0
 */
public abstract class Component {

    /**
     * Executes the component’s primary operation.
     * <p>Concrete implementations (or decorators) override this method to
     * provide specific functionality or to add extended behavior.</p>
     */
    public abstract void doJob();
}

