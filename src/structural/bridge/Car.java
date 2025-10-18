package structural.bridge;

/**
 * Concrete implementation of the {@link Vehicle} abstraction representing a car.
 * <p>
 * This class defines the specific manufacturing process for a car by delegating
 * tasks to two {@link Workshop} instances. It demonstrates how an abstraction
 * ({@code Vehicle}) can utilize different implementations ({@code Workshop})
 * without depending on their concrete types.
 * </p>
 *
 * <p><b>Pattern Role:</b> RefinedAbstraction in the Bridge pattern.</p>
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
public class Car extends Vehicle {

    /**
     * Constructs a new {@code Car} object with the given workshops.
     *
     * @param w1 the first workshop responsible for part of the manufacturing
     * @param w2 the second workshop responsible for another part of the manufacturing
     */
    public Car(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    /**
     * Executes the complete manufacturing process for the car.
     * <p>
     * This method prints the vehicle type and delegates the work
     * to both assigned {@link Workshop} instances.
     * </p>
     * <p><b>Output Example:</b><br>
     * Car<br>
     * Produced<br>
     * And Assemble
     * </p>
     */
    @Override
    public void manufacture() {
        System.out.println("Car");
        workshopOne.work();
        workshopTow.work();
    }
}

