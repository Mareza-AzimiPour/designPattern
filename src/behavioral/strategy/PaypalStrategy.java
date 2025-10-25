package behavioral.strategy;

/**
 * Concrete strategy class implementing {@link PaymentStrategy},
 * used for processing payments via PayPal account.
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    /**
     * Constructs a new PaypalStrategy with email and password.
     *
     * @param emailId  User’s PayPal email ID
     * @param password Account password
     */
    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    /**
     * Performs the payment operation through the PayPal service.
     *
     * @param amount The amount to pay.
     */
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid from paypal");
    }
}

