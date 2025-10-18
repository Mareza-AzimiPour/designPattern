package structural.adapter.DuckAndTurkey;

/**
 * Represents the behavior of a Duck object in the classical
 * Adapter Design Pattern example.
 * <p>
 * This interface defines the standard behaviors expected from
 * all duck types — quacking and flying — and serves as the
 * <b>Target</b> interface when adapting other classes, such as
 * {@link Turkey}, to behave like a duck.
 * </p>
 *
 * <p><b>Design Role:</b></p>
 * Acts as the <b>Target</b> interface in the Adapter pattern.
 * For instance, a {@code TurkeyAdapter} can implement this interface
 * to allow a {@link Turkey} instance to be treated as a {@code Duck}
 * within client code.
 * </p>
 *
 * <p><b>Example Implementation:</b></p>
 * <pre>
 *     public class MallardDuck implements Duck {
 *
 *         {@literal @}Override
 *         public void quack() {
 *             System.out.println("Quack");
 *         }
 *
 *         {@literal @}Override
 *         public void fly() {
 *             System.out.println("I'm flying long distance");
 *         }
 *     }
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
interface Duck {

    /**
     * Produces the characteristic duck sound — typically "Quack!".
     */
    void quack();

    /**
     * Represents the duck’s ability to fly (usually longer than turkeys).
     */
    void fly();
}

