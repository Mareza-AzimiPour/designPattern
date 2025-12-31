package behavioral.visitor;

/**
 * Book represents a concrete element in the Visitor Design Pattern.
 *
 * <p>
 * This class models a book item that can be added to a shopping cart.
 * It delegates price-related operations to a {@link ShoppingCartVisitor}
 * by accepting a visitor instance.
 * </p>
 *
 * <p>
 * The book itself does not contain pricing or discount logic.
 * Such logic is encapsulated inside the visitor implementation,
 * promoting separation of concerns.
 * </p>
 */
public class Book implements ItemElement {

    /**
     * Base price of the book.
     */
    private final int price;

    /**
     * ISBN number of the book.
     */
    private final String ibnNumber;

    /**
     * Creates a new {@code Book} instance.
     *
     * @param price     the base price of the book
     * @param ibnNumber the ISBN number of the book
     */
    public Book(int price, String ibnNumber) {
        this.price = price;
        this.ibnNumber = ibnNumber;
    }

    /**
     * Returns the base price of the book.
     *
     * @return book price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Returns the ISBN number of the book.
     *
     * @return ISBN number
     */
    public String getIbnNumber() {
        return ibnNumber;
    }

    /**
     * Accepts a shopping cart visitor and delegates the pricing
     * logic to it.
     *
     * @param visitor the visitor performing the operation
     * @return calculated cost for this book
     */
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
