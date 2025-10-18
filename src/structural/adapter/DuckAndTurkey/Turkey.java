package structural.adapter.DuckAndTurkey;

/**
 * Represents the behavior of a Turkey object in the classic
 * Adapter Design Pattern example.
 * <p>
 * This interface defines the methods that all turkey implementations
 * must provide, such as gobbling (making the turkey sound) and flying
 * in short bursts. It is typically used as the <b>Adaptee</b> in an
 * Adapter scenario, where it needs to be adapted to a different
 * interface like {@code Duck}.
 * </p>
 *
 * <p><b>Design Role:</b></p>
 * Acts as the <b>Adaptee</b> when integrating with systems that
 * expect duck-like behavior. For example, an adapter can delegate
 * {@code gobble()} to {@code quack()} and simulate shorter flight distance.
 * </p>
 *
 * <p><b>Example Implementation:</b></p>
 * <pre>
 *     public class WildTurkey implements Turkey {
 *         public void gobble() {
 *             System.out.println("Gobble gobble");
 *         }
 *
 *         public void fly() {
 *             System.out.println("I'm flying a short distance");
 *         }
 *     }
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public interface Turkey {

    /**
     * Makes the turkey sound, typically "Gobble gobble!".
     */
    void gobble();

    /**
     * Represents a short-distance flight typical of turkeys.
     */
    void fly();
}
