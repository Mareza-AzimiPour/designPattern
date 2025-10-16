package creational.builder.buillderWithInterface;

/**
 * The {@code BuilderInterface} defines the blueprint for building
 * complex {@link Product} objects step by step.
 * <p>
 * It represents the <b>Builder</b> role in the classic
 * Builder Design Pattern, providing abstract methods for
 * creating and assembling the individual components of
 * a product such as its body, wheels, and headlights.
 * </p>
 *
 * <p>The specific building process is delegated to concrete
 * implementations (e.g., {@code CarBuilder}, {@code MotorcycleBuilder}),
 * while a {@code Director} class orchestrates the construction sequence.</p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>{@code
 * BuilderInterface builder = new CarBuilder();
 * Director director = new Director(builder);
 * director.construct();
 * Product car = builder.getVeicle();
 * }</pre>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
interface BuilderInterface {
    /**
     * Builds the main body structure of the product.
     */
    void buildBody();

    /**
     * Inserts the required wheels into the product.
     */
    void insertWheels();

    /**
     * Adds headlights or other required front-facing components.
     */
    void addHeadLights();

    /**
     * Retrieves the fully constructed {@link Product} instance.
     *
     * @return the built product
     */
    Product getVehicle();
}
