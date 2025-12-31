package behavioral.visitor;

/**
 * ShoppingCartVisitorImp is a concrete implementation
 * of {@link ShoppingCartVisitor}.
 *
 * <p>
 * This visitor encapsulates the pricing and discount logic
 * for different types of shopping cart items.
 * </p>
 */
public class ShoppingCartVisitorImp implements ShoppingCartVisitor {

    /**
     * Calculates the cost of a book.
     *
     * <p>
     * Applies a discount if the book price exceeds a certain threshold.
     * </p>
     *
     * @param book the book being visited
     * @return final cost of the book
     */
    @Override
    public int visit(Book book) {
        int cost;
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        System.out.println("BOOK ISBN::" + book.getIbnNumber() + " cost:" + cost);
        return cost;
    }

    /**
     * Calculates the cost of a fruit item based on
     * price per kilogram and weight.
     *
     * @param fruit the fruit being visited
     * @return final cost of the fruit
     */
    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost:" + cost);
        return cost;
    }
}
