package structural.adapter.DuckAndTurkey;

/**
 * A concrete implementation of the {@link Turkey} interface
 * representing a wild turkey.
 * <p>
 * This class provides the default behavior of a turkey —
 * gobbling instead of quacking, and flying only short distances.
 * In the context of the <b>Adapter Design Pattern</b>, it serves
 * as the <b>Adaptee</b> that needs to be adapted to behave like
 * a duck through a {@code TurkeyAdapter}.
 * </p>
 *
 * <p><b>Design Role:</b></p>
 * Acts as the <b>Adaptee</b> in the Adapter pattern —
 * its interface is incompatible with {@link Duck},
 * but its behavior can be wrapped by an adapter to make it
 * compatible.
 * </p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     Turkey wildTurkey = new WildTurkey();
 *     wildTurkey.gobble(); // Output: I am gobble
 *     wildTurkey.fly();    // Output: I am flying a short distance
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class WildTurkey implements Turkey {

    /**
     * Makes the typical turkey sound.
     * <p>Output: {@code I am gobble}</p>
     */
    @Override
    public void gobble() {
        System.out.println("I am gobble");
    }

    /**
     * Simulates a short-distance flight typical of a wild turkey.
     * <p>Output: {@code I am flying a short distance}</p>
     */
    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}

