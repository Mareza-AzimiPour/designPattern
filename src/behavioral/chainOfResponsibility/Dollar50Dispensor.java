package behavioral.chainOfResponsibility;

/**
 * Concrete handler responsible for dispensing 50-dollar bills
 * as part of the Chain of Responsibility pattern.
 * <p>
 * The {@code Dollar50Dispensor} class processes the part of a withdrawal
 * request that can be satisfied using 50-dollar denominations.
 * It calculates how many 50-dollar notes should be dispensed and
 * passes any remaining amount to the next handler in the chain.
 * </p>
 *
 * <p><b>Pattern Role:</b> ConcreteHandler</p>
 *
 * <p><b>Example:</b></p>
 * <pre>{@code
 * Currency amount = new Currency(270);
 * DispenseChain chain50 = new Dollar50Dispensor();
 * chain50.setNextChain(new Dollar20Dispensor());
 * chain50.dispaence(amount);
 * }</pre>
 *
 * @author Mohammad Reza
 * @version 1.0
 * @see Currency
 * @see DispenseChain
 */
public class Dollar50Dispensor implements DispenseChain {
    private DispenseChain chain;

    /**
     * Sets the next handler in the dispensing chain that will
     * process any remaining amount after this handler completes.
     *
     * @param nextChain the next handler in the chain
     */
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    /**
     * Dispenses 50-dollar notes if the amount is sufficient.
     * If the remaining amount cannot be processed by this handler,
     * it delegates the remainder to the next chain link.
     *
     * @param currency the request object representing the withdrawal amount
     */
    @Override
    public void dispaence(Currency currency) {
        if (currency.getAmount() > 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing" + " " + num + "" + "" + "50$ note");
            if (remainder != 0) {
                this.chain.dispaence(new Currency(remainder));
            }
        } else {
            this.chain.dispaence(currency);
        }
    }
}

