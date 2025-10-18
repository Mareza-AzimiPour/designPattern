package structural.adapter.DuckAndTurkey;

/**
 * An adapter that allows a {@link Turkey} to behave like a {@link Duck}.
 * <p>
 * This class implements the {@link Duck} interface and internally holds
 * a reference to a {@link Turkey} instance. It translates duck-like
 * operations (e.g., {@code quack()}, {@code fly()}) into the corresponding
 * turkey behaviors:
 * <ul>
 *     <li>{@code quack()} → {@code gobble()}</li>
 *     <li>{@code fly()} → multiple short turkey flights to simulate
 *         a longer duck-like flight</li>
 * </ul>
 * </p>
 *
 * <p><b>Design Role:</b></p>
 * Acts as the <b>Adapter</b> in the
 * <a href="https://en.wikipedia.org/wiki/Adapter_pattern">Adapter Design Pattern</a>,
 * bridging the interface incompatibility between {@link Duck} (Target)
 * and {@link Turkey} (Adaptee).
 * </p>
 *
 * <p><b>Example Usage:</b></p>
 * <pre>
 *     Turkey wildTurkey = new WildTurkey();
 *     Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
 *
 *     System.out.println("The Turkey says...");
 *     wildTurkey.gobble();
 *     wildTurkey.fly();
 *
 *     System.out.println("\nThe TurkeyAdapter says...");
 *     turkeyAdapter.quack(); // delegates to gobble()
 *     turkeyAdapter.fly();   // performs 5 short flights
 * </pre>
 *
 * <p><b>Output:</b></p>
 * <pre>
 * The Turkey says...
 * I am gobble
 * I am flying a short distance
 *
 * The TurkeyAdapter says...
 * I am gobble
 * I am flying a short distance
 * I am flying a short distance
 * I am flying a short distance
 * I am flying a short distance
 * I am flying a short distance
 * </pre>
 *
 * @author Mohammadreza Azimipour
 * @version 1.0
 * @since 2025-10-18
 */
public class TurkeyAdapter implements Duck {

    /**
     * The turkey instance being adapted to behave like a duck.
     */
    private final Turkey turkey;

    /**
     * Constructs a new {@code TurkeyAdapter} that wraps a given turkey.
     *
     * @param turkey the turkey object to adapt into a duck behavior
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * Delegates the {@code quack()} call to the turkey's {@code gobble()} method.
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * Simulates a longer flight by calling the turkey's {@code fly()} method
     * multiple times.
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

