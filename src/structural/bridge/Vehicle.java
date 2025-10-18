package structural.bridge;

/**
 * Represents the abstract concept of a vehicle that delegates
 * its manufacturing process to one or more {@link Workshop} instances.
 * <p>
 * This class forms the <b>Abstraction</b> role in the Bridge design pattern.
 * It maintains references to one or more {@code Workshop} objects, which
 * perform the actual assembly steps. By separating the abstraction
 * ({@code Vehicle}) from its implementation ({@code Workshop}),
 * the pattern allows both hierarchies to evolve independently.
 * </p>
 *
 * <p><b>Pattern Role:</b> Abstraction in the Bridge pattern.</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Vehicle car = new Car(new Produce(), new Assemble());
 * car.manufacture();
 * }</pre>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public abstract class Vehicle {

    /**
     * The first workshop that performs part of the vehicle manufacturing process.
     */
    protected Workshop workshopOne;

    /**
     * The second workshop that performs another part of the vehicle manufacturing process.
     */
    protected Workshop workshopTow;

    /**
     * Constructs a new {@code Vehicle} instance with the given workshops.
     *
     * @param workshopOne the first workshop responsible for part of the manufacturing
     * @param workshopTow the second workshop responsible for another part of the manufacturing
     */
    protected Vehicle(Workshop workshopOne, Workshop workshopTow) {
        this.workshopOne = workshopOne;
        this.workshopTow = workshopTow;
    }

    /**
     * Initiates the manufacturing process specific to the concrete vehicle.
     * <p>
     * Concrete subclasses (e.g., {@code Car}, {@code Bike}) define the
     * specific manufacturing sequence and delegate work to the assigned workshops.
     * </p>
     */
    public abstract void manufacture();
}

