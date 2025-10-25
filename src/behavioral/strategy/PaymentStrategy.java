package behavioral.strategy;

/**
 * Strategy interface defining the payment operation.
 */
public interface PaymentStrategy {
    /**
     * Processes a payment of a given amount.
     *
     * @param amount the amount to pay
     */
    void pay(int amount);
}

