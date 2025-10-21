package behavioral.chainOfResponsibility;

import java.util.Scanner;

public class ChaineResponsibleTest {

    private DispenseChain chain;

    public ChaineResponsibleTest() {
        this.chain = new Dollar50Dispensor();
        DispenseChain chain2 = new Dollar20Dispensor();
        DispenseChain chain3 = new Dollar10Dispensor();

        chain.setNextChain(chain2);
        chain.setNextChain(chain3);
    }

    public static void main(String[] args) {
        ChaineResponsibleTest responsibleTest = new ChaineResponsibleTest();
        while (true) {
            int amount = 0;
            System.out.println("Enter the amount to dispense:");

            Scanner scanner = new Scanner(System.in);
            amount = scanner.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount must be multiple of 10s");
                return;
            }

            responsibleTest.chain.dispaence(new Currency(amount));
        }
    }
}
