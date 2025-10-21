package behavioral.chainOfResponsibility;

/**
 * Concrete handler that dispenses 10-dollar bills as part of
 * the Chain of Responsibility pattern.
 * <p>
 * The {@code Dollar10Dispensor} class processes requests that
 * can be handled using 10-dollar denominations. If the requested
 * amount is greater than 10, it determines how many 10-dollar notes
 * can be dispensed and passes any remaining amount to
 * the next handler in the chain.
 * </p>
 *
 * <p><b>Pattern Role:</b> ConcreteHandler</p>
 *
 * <p><b>Example:</b></p>
 * <pre>{@code
 * Currency currency = new Currency(45);
 * DispenseChain chain10 = new Dollar10Dispensor();
 * chain10.setNextChain(new Dollar5Dispensor());
 * chain10.dispaence(currency);
 * }</pre>
 *
 * @author Mohammad Reza
 * @version 1.0
 * @see Currency
 * @see DispenseChain
 */
public class Dollar10Dispensor implements DispenseChain {

    /**
     * Reference to the next handler in the chain.
     */
    private DispenseChain chain;

    /**
     * Sets the next handler that will process any remaining amount
     * after this handler has dispensed its portion.
     *
     * @param nextChain the next element in the chain
     */
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    /**
     * Handles the dispensing of 10-dollar notes.
     * If there is a remaining amount after dispensing,
     * it delegates the remainder to the next handler in the chain.
     *
     * @param currency the amount of money to be processed
     */
    @Override
    public void dispaence(Currency currency) {
        if (currency.getAmount() > 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (remainder != 0) {
                this.chain.dispaence(new Currency(remainder));
            }
        } else {
            this.chain.dispaence(currency);
        }
    }
}

