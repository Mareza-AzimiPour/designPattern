package behavioral.visitor;

/**
 * ShoppingCartVisitor represents the {@b Visitor} interface
 * in the Visitor Design Pattern.
 *
 * <p>
 * It declares visit methods for each concrete element
 * type that can be part of the shopping cart.
 * </p>
 *
 * <p>
 * By adding new visitor implementations, new operations
 * can be introduced without modifying the element classes.
 * </p>
 */
public interface ShoppingCartVisitor {

    /**
     * Visits a {@link Book} element.
     *
     * @param book the book being visited
     * @return calculated cost for the book
     */
    int visit(Book book);

    /**
     * Visits a {@link Fruit} element.
     *
     * @param fruit the fruit being visited
     * @return calculated cost for the fruit
     */
    int visit(Fruit fruit);
}
