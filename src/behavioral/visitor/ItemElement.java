package behavioral.visitor;

/**
 * ItemElement represents the {@b Element} interface
 * in the Visitor Design Pattern.
 *
 * <p>
 * All elements that can be visited must implement this interface
 * and provide an implementation of the {@link #accept(ShoppingCartVisitor)}
 * method.
 * </p>
 */
public interface ItemElement {

    /**
     * Accepts a visitor and allows it to perform
     * operations on the concrete element.
     *
     * @param visitor the visitor instance
     * @return result of the visitor operation
     */
    int accept(ShoppingCartVisitor visitor);
}
