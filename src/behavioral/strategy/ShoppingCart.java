package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the shopping cart context class.
 * It can dynamically use different payment strategies at runtime.
 */
public class ShoppingCart {
    private List<Item> items;

    /**
     * Initializes an empty shopping cart.
     */
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the cart.
     *
     * @param item The item to add.
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * Removes an item from the cart.
     *
     * @param item The item to remove.
     */
    public void removeItem(Item item) {
        this.items.remove(item);
    }

    /**
     * Calculates the total price of all items in the cart.
     *
     * @return The total price.
     */
    public int calculateTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    /**
     * Pays the total amount using the provided payment strategy.
     *
     * @param paymentStrategy The payment strategy to use.
     */
    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}

