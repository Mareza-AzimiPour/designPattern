package structural.decorator.decoratorBasic;

public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("***DecoratorTest Design Pattern***");
        ConcreateComponent cc = new ConcreateComponent();
        ConcreteDecorateEx_1 concreteDecorateEx_1 = new ConcreteDecorateEx_1();

        concreteDecorateEx_1.setComponent(cc);
        concreteDecorateEx_1.doJob();

        ConcreteDecorateEx_2 concreteDecorateEx_2 = new ConcreteDecorateEx_2();

        concreteDecorateEx_2.setComponent(cc);
        concreteDecorateEx_2.doJob();
    }

    /**
     * The Decorator Pattern is a structural design pattern used to extend or alter the behavior of objects dynamically
     * , without modifying their original code. Instead of creating subclass variations,
     * it wraps the original object with one or more “decorator” objects that implement the same interface and add new functionality before
     * or after delegating calls to the wrapped object.
     * This approach promotes composition over inheritance, adheres to the Open/Closed Principle,
     * and allows flexible feature combinations (e.g., adding logging, security, or compression behaviors at runtime).**/
}
