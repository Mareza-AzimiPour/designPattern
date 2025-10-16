package creational.builder.buillderWithInterface;

/**
 * The {@code MotorCycle} class is a concrete implementation of the
 * {@link BuilderInterface}, responsible for constructing a
 * {@link Product} that represents a motorcycle.
 * <p>
 * This class encapsulates the steps needed to assemble a motorcycle’s
 * structure, including its body, wheels, and headlight configuration.
 * It forms part of the <b>Builder Design Pattern</b> implementation,
 * working alongside the {@code Director} to produce vehicle objects.
 * </p>
 *
 * <p><b>Pattern Role:</b> Concrete Builder</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * BuilderInterface builder = new MotorCycle();
 * Director director = new Director(builder);
 * director.construct();
 * Product motorCycle = builder.getVehicle();
 * motorCycle.showParts();
 * }</pre>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class MotorCycle implements BuilderInterface {

    /**
     * The {@link Product} instance being constructed.
     */
    private final Product product = new Product();

    /**
     * Builds the main body of the motorcycl.
     */
    @Override
    public void buildBody() {
        product.addPart("This is the body of motorcycle");
    }

    /**
     * Adds two wheels to the motorcycle.
     */
    @Override
    public void insertWheels() {
        product.addPart("2 wheels are added");
    }

    /**
     * Adds a single headlight to the motorcycle.
     */
    @Override
    public void addHeadLights() {
        product.addPart("1 headlight added");
    }

    /**
     * Returns the fully constructed motorcycle product.
     *
     * @return the completed {@link Product} instance representing the motorcycle
     */
    @Override
    public Product getVehicle() {
        return product;
    }
}
