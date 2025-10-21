package behavioral.chainOfResponsibility;

/**
 * Concrete handler responsible for dispensing 20-dollar bills
 * as part of the Chain of Responsibility pattern.
 * <p>
 * The {@code Dollar20Dispensor} class handles withdrawal requests
 * that can be fulfilled using 20-dollar denominations. It calculates
 * how many 20-dollar notes need to be dispensed and delegates any
 * remaining amount to the next handler in the chain.
 * </p>
 *
 * <p><b>Pattern Role:</b> ConcreteHandler</p>
 *
 * <p><b>Example:</b></p>
 * <pre>{@code
 * Currency amount = new Currency(130);
 * DispenseChain chain20 = new Dollar20Dispensor();
 * chain20.setNextChain(new Dollar10Dispensor());
 * chain20.dispaence(amount);
 * }</pre>
 *
 * @author Mohammad Reza
 * @version 1.0
 * @see Currency
 * @see DispenseChain
 */
public class Dollar20Dispensor implements DispenseChain {
    private DispenseChain chain;

    /**
     * Sets the next handler in the dispensing chain to process
     * any remaining amount after dispensing 20-dollar bills.
     *
     * @param nextChain the next handler in the chain
     */
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    /**
     * Dispenses as many 20-dollar notes as possible from the
     * requested amount. Any remainder is delegated to the
     * next handler in the chain.
     *
     * @param currency the request object representing the amount to be dispensed
     */
    @Override
    public void dispaence(Currency currency) {
        if (currency.getAmount() > 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing" + " " + num + "" + "" + "20$ note");
            if (remainder != 0) {
                this.chain.dispaence(new Currency(remainder));
            }
        } else {
            this.chain.dispaence(currency);
        }
    }
}

