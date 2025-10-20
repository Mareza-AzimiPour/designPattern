package structural.decorator.decoratorBasic;

/**
 * The {@code ConcreateComponent} class is the core implementation of the {@link Component}
 * interface in the Decorator Design Pattern. It represents the base object to which
 * additional behaviors can be attached dynamically via decorators.
 *
 * <p>This component performs the fundamental operation, serving as the object that
 * decorators wrap and enhance. According to the Open/Closed Principle, this class
 * is closed for modification but open for extension through composition.</p>
 *
 * <p>Example:</p>
 * <pre>
 * Component component = new ConcreateComponent();
 * component.doJob(); // executes the base behavior
 * </pre>
 *
 * @author Mohammad Reza
 * @since 1.0
 */
public class ConcreateComponent extends Component {

    /**
     * Performs the default action for this component.
     * <p>This method represents the primary behavior that can be extended
     * by decorators without altering this class’s code.</p>
     */
    @Override
    public void doJob() {
        System.out.println("I am from a ConcreateComponent - I am closed for modification");
    }
}

