package creational.factory.abstractCreational;

public class FeraryCarFactory extends AbstractGeneralCarFactory{
    @Override
    protected Car factoryCar() {
        return new Ferary();
    }
}
