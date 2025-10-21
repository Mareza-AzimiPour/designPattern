package structural.flyweight.differentWithSingleton;

/**
 * Concrete implementation of the {@link RobotInterface} representing a flyweight robot.
 * <p>
 * This class encapsulates the <b>intrinsic state</b> (the robot type) which is shared
 * across multiple clients, while allowing <b>extrinsic state</b> (the color)
 * to be assigned dynamically at runtime.
 * </p>
 *
 * <p><b>Design Pattern Role:</b></p>
 * <ul>
 *     <li><b>Flyweight:</b> Stores the intrinsic state (e.g., "small", "large").</li>
 *     <li>Receives and uses extrinsic state (color) from the client when performing operations.</li>
 * </ul>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     RobotInterface largeBlue = new Robot("large");
 *     largeBlue.setColor("blue");
 *     largeBlue.print();
 *     // Output: this is a large type robot with blue color
 * </pre>
 *
 * @author Mohammad Reza
 * @see RobotInterface
 * @see RobotFactory
 */
public class Robot implements RobotInterface {

    /**
     * Intrinsic state shared among clients — defines the robot category.
     */
    private final String robotType;

    /**
     * Extrinsic state — color assigned externally by the client.
     */
    private String colorOfRobot;

    /**
     * Constructs a robot flyweight instance with a defined intrinsic type.
     *
     * @param robotType the category or type of robot (e.g., "small", "large")
     */
    public Robot(String robotType) {
        this.robotType = robotType;
    }

    /**
     * Assigns the extrinsic color for this robot instance.
     *
     * @param colorOfRobot color to be applied prior to printing
     */
    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    /**
     * Prints the combined intrinsic and extrinsic characteristics of this robot.
     * Produces a descriptive line in the format:
     * <pre>
     * this is a &lt;type&gt; type robot with &lt;color&gt; color
     * </pre>
     */
    @Override
    public void print() {
        System.out.println("this is a " + robotType + " type robot with " + colorOfRobot + " color");
    }
}

