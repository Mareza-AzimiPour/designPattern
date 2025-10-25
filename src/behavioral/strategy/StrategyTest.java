package behavioral.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item(1000, "1234");
        Item item2 = new Item(2000, "1534");

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by Paypal\
        cart.pay(new PaypalStrategy("mareza@gmial.com", "myPassword"));

        //pay by credit cart
        cart.pay(new CreditCardStrategy("mareza", "13432245425", "999", "07/05"));
    }
}
