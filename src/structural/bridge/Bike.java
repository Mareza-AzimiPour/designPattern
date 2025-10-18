package structural.bridge;

/**
 * Concrete implementation of the {@link Vehicle} abstraction representing a bike.
 * <p>
 * This class defines the specific manufacturing process for a bike by delegating
 * production and assembly operations to two {@link Workshop} instances.
 * It demonstrates how an abstraction ({@code Vehicle}) can collaborate with
 * different implementation layers ({@code Workshop}) independently of their
 * concrete details.
 * </p>
 *
 * <p><b>Pattern Role:</b> RefinedAbstraction in the Bridge pattern.</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Vehicle bike = new Bike(new Produce(), new Assemble());
 * bike.manufacture();
 * }</pre>
 *
 * @author Mohammadreza Azimipour
 * @since 1.0
 */
public class Bike extends Vehicle {

    /**
     * Constructs a new {@code Bike} with the given workshops.
     *
     * @param w1 the first workshop responsible for part of the manufacturing
     * @param w2 the second workshop responsible for another part of the manufacturing
     */
    public Bike(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    /**
     * Executes the complete manufacturing process for the bike.
     * <p>
     * This method prints the vehicle type and delegates
     * the work steps to both associated {@link Workshop} instances.
     * </p>
     * <p><b>Output Example:</b><br>
     * Bike<br>
     * Produced<br>
     * And Assemble
     * </p>
     */
    @Override
    public void manufacture() {
        System.out.println("Bike");
        workshopOne.work();
        workshopTow.work();
    }
}

