package creational.factory.abstractCreational;

public abstract class AbstractGeneralCarFactory {

    protected abstract Car factoryCar();

    public Car getCar() {
        return factoryCar();
    }

    //other method
}
