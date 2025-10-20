package structural.decorator.decoratorBasic;

/**
 * The AbstractDecorator class serves as the base class for all concrete decorators
 * in the Decorator Design Pattern. It extends the {@link Component} class and holds
 * a reference to another {@code Component} instance, allowing behavior to be added
 * dynamically at runtime without modifying the original component's code.
 *
 * <p>Usage:
 * <ul>
 *   <li>Subclasses implement additional behavior by overriding {@link #doJob()}.</li>
 *   <li>The {@link #setComponent(Component)} method injects the target component to decorate.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * AbstractDecorator decorator = new ConcreteDecoratorA();
 * decorator.setComponent(new ConcreteComponent());
 * decorator.doJob();
 * </pre>
 *
 * @author Mohammad Reza
 * @since 1.0
 */
public class AbstractDecorator extends Component {

    /**
     * The wrapped {@link Component} instance that this decorator enhances.
     */
    protected Component component;

    /**
     * Assigns the component instance to be decorated.
     *
     * @param component the {@link Component} object whose functionality
     *                  will be extended by this decorator.
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Delegates the request to the wrapped component if it exists.
     * <p>Concrete decorators typically call {@code super.doJob()} and then
     * add their own extended behavior before or after the delegation.</p>
     */
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}

