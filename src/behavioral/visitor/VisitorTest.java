package behavioral.visitor;

/**
 * VisitorTest acts as the {@b Client} in the Visitor Design Pattern.
 *
 * <p>
 * This class demonstrates how different item elements
 * can be processed uniformly using a visitor without
 * embedding pricing logic inside the element classes.
 * </p>
 */
public class VisitorTest {

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        ItemElement[] items = new ItemElement[]{
                new Book(20, "135"),
                new Book(30, "135"),
                new Book(40, "135"),
                new Fruit(10, 2, "banana"),
                new Fruit(6, 5, "Apple")
        };

        int total = calculatorPrice(items);
        System.out.println("total price: " + total);
    }

    /**
     * Calculates the total price of all shopping cart items
     * using a {@link ShoppingCartVisitor}.
     *
     * @param items array of items in the cart
     * @return total calculated price
     */
    private static int calculatorPrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImp();
        int total = 0;

        for (ItemElement item : items) {
            total += item.accept(visitor);
        }

        return total;
    }
}
