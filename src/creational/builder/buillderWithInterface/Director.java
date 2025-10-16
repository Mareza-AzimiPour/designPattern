package creational.builder.buillderWithInterface;

/**
 * The {@code Director} class defines the construction process for
 * creating complex {@link Product} objects by coordinating the
 * sequence of building steps provided by a {@link BuilderInterface}
 * implementation.
 * <p>
 * In the <b>Builder Design Pattern</b>, the Director encapsulates the
 * logic that decides <em>how</em> to build an object, leaving the
 * details of <em>what</em> to build to the concrete builders such as
 * {@link Car} and {@link MotorCycle}.
 * </p>
 *
 * <p><b>Pattern Role:</b> Director</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * BuilderInterface carBuilder = new Car();
 * Director director = new Director();
 * director.construct(carBuilder);
 * Product car = carBuilder.getVehicle();
 * car.showAllParts();
 * }</pre>
 *
 * <p>The Director ensures that all necessary builder operations are
 * executed in the correct order, achieving a consistent product
 * assembly process.</p>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class Director {

    /**
     * The current builder responsible for constructing the product.
     */
    private BuilderInterface builder;

    /**
     * Constructs a product by executing the defined build steps in order.
     * <p>
     * This method can use any {@link BuilderInterface} implementation to
     * construct a specific type of product (for example, a {@code Car}
     * or {@code MotorCycle}).
     * </p>
     *
     * @param builder the builder instance that performs the construction steps
     */
    public void construct(BuilderInterface builder) {
        this.builder = builder;
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadLights();
    }
}
