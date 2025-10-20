package structural.decorator.decoratorBasic;

/**
 * The {@code ConcreteDecorateEx_2} class is another concrete implementation of
 * the {@link AbstractDecorator} used in the Decorator Design Pattern. It provides
 * an additional layer of behavior on top of the decorated {@link Component},
 * allowing flexible and dynamic extension of functionality at runtime.
 *
 * <p>This decorator executes its own custom logic after delegating the core operation
 * to the wrapped component via {@code super.doJob()}.</p>
 *
 * <p>Example:</p>
 * <pre>
 * Component component = new ConcreateComponent();
 * AbstractDecorator decorator1 = new ConcreteDecorateEx_1();
 * AbstractDecorator decorator2 = new ConcreteDecorateEx_2();
 * decorator1.setComponent(component);
 * decorator2.setComponent(decorator1);
 * decorator2.doJob();
 * // Output:
 * // I am from a ConcreateComponent - I am closed for modification
 * // I am explicitly from a ConcreteDecorateEx_1
 * // I am explicitly from a ConcreteDecorateEx_2
 * </pre>
 *
 * @author Mohammad Reza
 * @since 1.0
 */
public class ConcreteDecorateEx_2 extends AbstractDecorator {

    /**
     * Performs the base component’s operation and then adds this decorator’s
     * custom behavior by displaying an identifying message to the console.
     */
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("I am explicitly from a ConcreteDecorateEx_2");
    }
}

