package creational.builder.buillderWithInterface;

import creational.builder.builderWithInnerClass.Inforamtion;

/**
 * The {@code Car} class is a concrete implementation of the
 * {@link BuilderInterface} responsible for constructing a
 * {@link Product} that represents a car.
 * <p>
 * Following the <b>Builder Design Pattern</b>, this class encapsulates
 * the steps required to assemble a car's body, wheels, and headlights.
 * Each building step is performed through the methods defined in the
 * {@code BuilderInterface}.
 * </p>
 *
 * <p><b>Pattern Role:</b> Concrete Builder</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * BuilderInterface builder = new Car();
 * Director director = new Director(builder);
 * director.construct();
 * Product car = builder.getVehicle();
 * car.showParts();
 * }</pre>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class Car implements BuilderInterface {

    /**
     * The {@link Product} instance being constructed.
     */
    private final Product product = new Product();

    /**
     * Builds the main body of the car.
     */
    @Override
    public void buildBody() {
        product.addPart("This is the body of the car");
    }

    /**
     * Adds four wheels to the car.
     */
    @Override
    public void insertWheels() {
        product.addPart("4 wheels are added");
    }

    /**
     * Adds two headlights to the car.
     */
    @Override
    public void addHeadLights() {
        product.addPart("2 headlights added");
    }

    /**
     * Returns the fully constructed car.
     *
     * @return the completed {@link Product} instance representing the car
     */
    @Override
    public Product getVehicle() {
        return product;
    }
}
