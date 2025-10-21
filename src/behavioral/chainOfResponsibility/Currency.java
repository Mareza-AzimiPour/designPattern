package behavioral.chainOfResponsibility;

/**
 * Represents a monetary request within the Chain of Responsibility pattern.
 * <p>
 * In this context, {@code Currency} acts as the request object passed through
 * a series of handlers (for example, different ATM dispensers or payment processors),
 * where each handler decides whether it can process the amount or delegate it further.
 * </p>
 *
 * <p><b>Pattern Role:</b> Request Object</p>
 *
 * <p><b>Usage Example:</b></p>
 * <pre>{@code
 * Currency currency = new Currency(500);
 * dispenserChain.dispense(currency);
 * }</pre>
 *
 * @author Mohammad Reza
 * @version 1.0
 * @see DispenseChain
 */
public class Currency {

    /**
     * The amount of money to be processed or dispensed.
     */
    private int amount;

    /**
     * Constructs a new {@code Currency} object representing the specified amount.
     *
     * @param amount the monetary value associated with this request
     */
    public Currency(int amount) {
        this.amount = amount;
    }

    /**
     * Returns the amount of this currency request.
     *
     * @return the amount of money
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets or updates the amount of this currency request.
     *
     * @param amount the new monetary value
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}

