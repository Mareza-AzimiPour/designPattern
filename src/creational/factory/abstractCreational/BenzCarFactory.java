package creational.factory.abstractCreational;

public class BenzCarFactory extends AbstractGeneralCarFactory{
    @Override
    protected Car factoryCar() {
        return new Benz();
    }
}
