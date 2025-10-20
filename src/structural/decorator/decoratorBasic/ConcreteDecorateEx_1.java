package structural.decorator.decoratorBasic;

/**
 * The {@code ConcreteDecorateEx_1} class is a specific implementation of the
 * {@link AbstractDecorator} in the Decorator Design Pattern. It adds new behavior
 * to the wrapped {@link Component} dynamically, without modifying the original component code.
 *
 * <p>This decorator extends the base operation by performing its own task after
 * invoking the wrapped component’s {@link #doJob()} method through {@code super.doJob()}.</p>
 *
 * <p>Example:</p>
 * <pre>
 * Component component = new ConcreateComponent();
 * AbstractDecorator decorator = new ConcreteDecorateEx_1();
 * decorator.setComponent(component);
 * decorator.doJob();
 * // Output:
 * // I am from a ConcreateComponent - I am closed for modification
 * // I am explicitly from a ConcreteDecorateEx_1
 * </pre>
 *
 * @author Mohammad Reza
 * @since 1.0
 */
public class ConcreteDecorateEx_1 extends AbstractDecorator {

    /**
     * Extends the original {@link Component}'s behavior by first delegating to
     * the wrapped component and then appending its own message.
     */
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("I am explicitly from a ConcreteDecorateEx_1");
    }
}

