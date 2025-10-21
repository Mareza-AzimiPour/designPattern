package structural.flyweight.sampleBasic;

/**
 * Concrete implementation of the {@link RobotInterface} representing a small robot.
 * <p>
 * This class functions as a <b>Concrete Flyweight</b> in the Flyweight design pattern.
 * Instances of {@code SmallRobot} encapsulate intrinsic (shared) state, which can be
 * reused by multiple clients to minimize memory usage.
 * </p>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     RobotInterface smallRobot = new SmallRobot();
 *     smallRobot.print(); // Output: "this is a small robot"
 * </pre>
 *
 * <p>
 * Typically, instances of this class are managed by a {@code RobotFactory} that ensures
 * shared reuse rather than repeated object creation.
 * </p>
 *
 * @author Mohammad Reza
 * @see RobotInterface
 * @see RobotFactory
 */
public class SmallRobot implements RobotInterface {

    /**
     * Prints the details of this robot type.
     * <p>
     * Displays a descriptive text indicating that this robot is a small-sized flyweight instance.
     * </p>
     */
    @Override
    public void print() {
        System.out.println("this is a small robot");
    }
}
