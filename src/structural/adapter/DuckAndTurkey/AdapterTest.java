package structural.adapter.DuckAndTurkey;

public class AdapterTest {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("\nthe turkey says");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nthe Duck says");
        testDuck(mallardDuck);

        System.out.println("\nthe turkey  adapter says");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
