package creational.factory.abstractCreational;

public class BmwCarFactory extends AbstractGeneralCarFactory{
    @Override
    protected Car factoryCar() {
        return new Bmw();
    }
}
