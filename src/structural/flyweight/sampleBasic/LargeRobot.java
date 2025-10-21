package structural.flyweight.sampleBasic;

/**
 * Concrete implementation of the {@link RobotInterface} representing a large robot.
 * <p>
 * This class functions as a <b>Concrete Flyweight</b> within the Flyweight design pattern.
 * Instances of {@code LargeRobot} encapsulate intrinsic (shared) state representing
 * a large-sized robot. These instances are typically shared across multiple clients
 * to reduce memory overhead and improve performance.
 * </p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     RobotInterface largeRobot = new LargeRobot();
 *     largeRobot.print(); // Output: "this is a Large robot"
 * </pre>
 *
 * <p>
 * Usually, the creation and management of these shared objects are handled by a
 * {@code RobotFactory} using a caching mechanism to reuse flyweights efficiently.
 * </p>
 *
 * @author Mohammad Reza
 * @see RobotInterface
 * @see RobotFactory
 */
public class LargeRobot implements RobotInterface {

    /**
     * Prints the details of this large robot instance.
     * <p>
     * Displays a message describing the robot type as a large, shared (flyweight) robot.
     * </p>
     */
    @Override
    public void print() {
        System.out.println("this is a Large robot");
    }
}

