package creational.abstractFactory;

public  abstract class AbstractGeneralFactory {
    protected abstract Car getCar(String type);
    protected  abstract Ship getShip(String type);
}
