package creational.builder.buillderWithInterface;

import java.util.LinkedList;

/**
 * The {@code Product} class represents the final object that is
 * incrementally constructed by one or more {@link BuilderInterface}
 * implementations (e.g., {@code Car}, {@code MotorCycle}) within the
 * <b>Builder Design Pattern</b>.
 * <p>
 * It stores individual components (or {@code parts}) of the product as
 * they are added by the builder, and provides a method to display all
 * the assembled parts when construction is complete.
 * </p>
 *
 * <p><b>Pattern Role:</b> Product</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Product vehicle = new Product();
 * vehicle.addPart("Body installed");
 * vehicle.addPart("4 wheels added");
 * vehicle.addPart("2 headlights attached");
 * vehicle.showAllParts();
 * }</pre>
 *
 * <p>This class is intentionally simple and does not assume
 * thread-safety, as it is typically used in a single-threaded construction
 * context managed by the Builder.</p>
 *
 * @author Mohammadreza
 * @version 1.0
 * @since 2025-10-16
 */
public class Product {

    /**
     * A list holding the individual parts of the product.
     */
    private final LinkedList<String> parts;

    /**
     * Constructs an empty {@code Product} instance ready to accumulate parts.
     */
    public Product() {
        this.parts = new LinkedList<>();
    }

    /**
     * Adds a new component or feature to the product.
     *
     * @param part the textual description of a product part
     */
    public void addPart(String part) {
        parts.add(part);
    }

    /**
     * Displays all assembled parts of this product in the order they were added.
     * <p>
     * This method is primarily used for demonstration or debugging purposes to
     * confirm that the object has been built correctly by the builder.
     * </p>
     */
    public void showAllParts() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
