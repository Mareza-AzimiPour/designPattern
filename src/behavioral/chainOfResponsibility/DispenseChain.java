package behavioral.chainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispaence(Currency currency);
}
