package behavioral.visitor;

/**
 * Fruit represents a concrete element in the Visitor Design Pattern.
 *
 * <p>
 * This class models a fruit item with weight-based pricing.
 * Pricing logic is externalized and handled by a
 * {@link ShoppingCartVisitor}.
 * </p>
 */
public class Fruit implements ItemElement {

    /**
     * Price per kilogram of the fruit.
     */
    private final int pricePerKg;

    /**
     * Weight of the fruit in kilograms.
     */
    private final int weight;

    /**
     * Name of the fruit.
     */
    private final String name;

    /**
     * Creates a new {@code Fruit} instance.
     *
     * @param pricePerKg price per kilogram
     * @param weight     weight in kilograms
     * @param name       fruit name
     */
    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    /**
     * Returns the price per kilogram.
     *
     * @return price per kg
     */
    public int getPricePerKg() {
        return pricePerKg;
    }

    /**
     * Returns the weight of the fruit.
     *
     * @return weight in kilograms
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Returns the name of the fruit.
     *
     * @return fruit name
     */
    public String getName() {
        return name;
    }

    /**
     * Accepts a shopping cart visitor and delegates
     * the cost calculation logic to it.
     *
     * @param visitor the visitor performing the operation
     * @return calculated cost for this fruit
     */
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
