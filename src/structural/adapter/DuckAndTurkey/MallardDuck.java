package structural.adapter.DuckAndTurkey;

/**
 * A concrete implementation of the {@link Duck} interface
 * that represents a typical mallard duck (a real duck type).
 * <p>
 * This class defines the natural behavior of a duck —
 * quacking and flying — and is often used in demonstration
 * of the <b>Adapter Design Pattern</b> as the original
 * or expected behavior (i.e., the <b>Target</b> implementation).
 * </p>
 *
 * <p><b>Design Role:</b></p>
 * Serves as a concrete {@code Duck} implementation to which
 * adapted classes (e.g., {@code TurkeyAdapter}) conform.
 * </p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     Duck mallard = new MallardDuck();
 *     mallard.quack();  // Output: Quack
 *     mallard.fly();    // Output: I am flying
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class MallardDuck implements Duck {

    /**
     * Prints the typical quacking sound of a duck.
     * <p>Output: {@code Quack}</p>
     */
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    /**
     * Simulates the duck flying action.
     * <p>Output: {@code I am flying}</p>
     */
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
