package structural.flyweight.differentWithSingleton;

import structural.flyweight.sampleBasic.LargeRobot;
import structural.flyweight.sampleBasic.SmallRobot;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory responsible for creating and managing shared {@link Robot} flyweight objects.
 * <p>
 * This class functions as the <b>Flyweight Factory</b> in the Flyweight Design Pattern.
 * It ensures that identical robot objects (based on their intrinsic state: type)
 * are reused rather than created repeatedly, thereby reducing memory usage.
 * </p>
 *
 * <p><b>Behavior:</b></p>
 * <ul>
 *   <li>Maintains a cache (<code>Map&lt;String, RobotInterface&gt;</code>) of robot instances by type.</li>
 *   <li>Creates new {@link Robot} objects only when no existing one is found for the requested type.</li>
 *   <li>Currently supports two intrinsic types: <b>"King"</b> and <b>"Queen"</b>.</li>
 *   <li>Throws an {@link Exception} for unsupported robot types.</li>
 * </ul>
 *
 * <p><b>Example:</b></p>
 * <pre>
 *     RobotFactory factory = new RobotFactory();
 *     RobotInterface king1 = factory.getRobot("King");
 *     king1.setColor("gold");
 *     king1.print();
 *
 *     RobotInterface king2 = factory.getRobot("King");
 *     king2.setColor("silver");
 *     king2.print();
 *
 *     System.out.println("Total objects created: " + factory.totalObjectsCreate());
 *     // Output: Total objects created: 1
 * </pre>
 *
 * <p>
 * As shown above, the same <b>King</b> robot instance is reused with different extrinsic
 * attributes (color), demonstrating the memory efficiency achieved through Flyweight reuse.
 * </p>
 *
 * @author Mohammad Reza
 * @see RobotInterface
 * @see Robot
 */
public class RobotFactory {

    /**
     * Cache storing the shared flyweight robot instances.
     * <p>The key represents the robot type (intrinsic state).</p>
     */
    private final Map<String, RobotInterface> shapes = new HashMap<>();

    /**
     * Returns the total number of distinct robot objects created by the factory so far.
     *
     * @return count of unique robot instances maintained in the shared cache
     */
    public int totalObjectsCreate() {
        return shapes.size();
    }

    /**
     * Retrieves a shared {@link Robot} instance for the specified type.
     * <p>
     * If a robot of the given type already exists in the internal cache, it is returned directly.
     * Otherwise, a new robot object is created, stored in the cache, and then returned.
     * </p>
     *
     * @param robotType the intrinsic type of the robot (e.g., {@code "King"} or {@code "Queen"})
     * @return a shared {@link RobotInterface} instance for the requested type
     * @throws Exception if the specified robot type is not supported
     */
    public RobotInterface getRobot(String robotType) throws Exception {
        RobotInterface myRobot;

        if (shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King" -> {
                    System.out.println("We do not have King Robot. Creating a King robot for you...");
                    myRobot = new Robot("King");
                    shapes.put("King", myRobot);
                }
                case "Queen" -> {
                    System.out.println("We do not have Queen Robot. Creating a Queen robot for you...");
                    myRobot = new Robot("Queen");
                    shapes.put("Queen", myRobot);
                }
                default -> throw new Exception("Robot Factory only has 'King' and 'Queen' robots.");
            }
        }
        return myRobot;
    }
}

