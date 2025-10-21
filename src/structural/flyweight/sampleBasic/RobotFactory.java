package structural.flyweight.sampleBasic;

import structural.flyweight.sampleBasic.RobotInterface;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory class responsible for creating and managing flyweight robot objects.
 * <p>
 * This class serves as the <b>Flyweight Factory</b> in the Flyweight design pattern.
 * It ensures that shared (intrinsic) robot instances are reused rather than created
 * repeatedly, thereby optimizing memory usage and object creation cost.
 * </p>
 *
 * <p><b>Behavior:</b></p>
 * <ul>
 *   <li>Maintains a cache (a {@link Map}) of robot instances categorized by type.</li>
 *   <li>Creates new {@link SmallRobot} or {@link LargeRobot} instances only if they
 *       do not already exist in the cache.</li>
 *   <li>Throws an {@link Exception} if an unsupported robot category is requested.</li>
 * </ul>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     RobotFactory factory = new RobotFactory();
 *     RobotInterface small1 = factory.getRobot("small");
 *     RobotInterface small2 = factory.getRobot("small");
 *     System.out.println(factory.totalObjectsCreate()); // Output: 1
 * </pre>
 *
 * <p>
 * As shown, multiple requests for the same robot type return the same shared instance.
 * </p>
 *
 * @author Mohammad Reza
 * @see RobotInterface
 * @see SmallRobot
 * @see LargeRobot
 */
public class RobotFactory {

    /**
     * Internal cache holding the shared robot instances.
     * <p>
     * The key is the robot category (e.g., "small", "large"),
     * and the value is the corresponding flyweight {@link RobotInterface} instance.
     * </p>
     */
    private final Map<String, RobotInterface> shapes = new HashMap<>();

    /**
     * Returns the total number of unique robot objects created by the factory.
     *
     * @return total count of distinct robot instances stored in the cache
     */
    public int totalObjectsCreate() {
        return shapes.size();
    }

    /**
     * Returns a shared robot instance based on the specified category.
     * <p>
     * If an instance for the given category already exists in the cache, it is returned directly.
     * Otherwise, a new robot (either {@link SmallRobot} or {@link LargeRobot}) is created,
     * stored in the cache, and then returned.
     * </p>
     *
     * @param robotCategory category of robot requested; must be either {@code "small"} or {@code "large"}
     * @return a shared instance of {@link RobotInterface} corresponding to the specified category
     * @throws Exception if the requested category is unsupported
     */
    public RobotInterface getRobot(String robotCategory) throws Exception {
        RobotInterface myRobot;

        if (shapes.containsKey(robotCategory)) {
            myRobot = shapes.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "small" -> {
                    System.out.println("We do not have Small Robot. Creating a small robot for you...");
                    myRobot = new SmallRobot();
                    shapes.put(robotCategory, myRobot);
                }
                case "large" -> {
                    System.out.println("We do not have Large Robot. Creating a large robot for you...");
                    myRobot = new LargeRobot();
                    shapes.put(robotCategory, myRobot);
                }
                default -> throw new Exception("Robot Factory only supports 'small' and 'large' categories.");
            }
        }
        return myRobot;
    }
}

