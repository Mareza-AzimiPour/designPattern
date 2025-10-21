package structural.flyweight.sampleBasic;

/**
 * Represents the shared interface for all robot flyweight objects.
 * <p>
 * In the Flyweight design pattern, this interface defines the common operation that
 * can be performed by both intrinsic (shared) and extrinsic (unique) robot objects.
 * Implementations of this interface encapsulate the intrinsic state that
 * can be shared among multiple robot instances.
 * </p>
 *
 * <p><b>Usage:</b> Concrete implementations (e.g., {@code SmallRobot}, {@code LargeRobot})
 * are typically created and managed by a {@code RobotFactory}, which ensures
 * that shared instances are reused instead of being recreated repeatedly.
 * </p>
 *
 * @author Mohammad Reza
 * @see RobotFactory
 */
public interface RobotInterface {

    /**
     * Prints the details or behavior of the robot to the standard output.
     * <p>
     * This method represents the operation that can differ based on the extrinsic state
     * provided by the client (e.g., color, position).
     * </p>
     */
    void print();
}
