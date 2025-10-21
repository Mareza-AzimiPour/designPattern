package structural.flyweight.differentWithSingleton;

/**
 * Represents the shared interface for all robot flyweight objects.
 * <p>
 * In the Flyweight design pattern, this interface defines the common behavior
 * for all shared (flyweight) robot instances.
 * The intrinsic state (such as robot type) is stored inside the implementing class,
 * while extrinsic state (such as color) is supplied externally by the client at runtime.
 * </p>
 *
 * <p><b>Usage:</b></p>
 * <pre>
 *     RobotInterface robot = new Robot("small");
 *     robot.setColor("red");
 *     robot.print();
 *     // Output: this is a small type robot with red color
 * </pre>
 *
 * @author Mohammad Reza
 * @see Robot
 */
public interface RobotInterface {

    /**
     * Prints the details of this robot, combining both intrinsic (type)
     * and extrinsic (color) attributes.
     */
    void print();

    /**
     * Sets the extrinsic color of the robot.
     * <p>
     * The color is a context-specific attribute that is not shared among flyweight instances.
     * It must be set each time before invoking {@link #print()}.
     * </p>
     *
     * @param colorOfRobot the color to be applied to this robot instance
     */
    void setColor(String colorOfRobot);
}
