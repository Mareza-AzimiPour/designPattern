package behavioral.strategy;

/**
 * Concrete strategy class implementing {@link PaymentStrategy},
 * used for processing payments via Credit Card.
 */
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    /**
     * Constructs a new CreditCardStrategy with given card information.
     *
     * @param name           Card holder’s name
     * @param cardNumber     Credit card number
     * @param cvv            Card CVV code
     * @param expirationDate Expiration date of the card
     */
    public CreditCardStrategy(String name, String cardNumber, String cvv, String expirationDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    /**
     * Performs the payment operation through the Credit Card.
     *
     * @param amount The amount to be paid.
     */
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " from CreditCard Strategy");
    }
}

