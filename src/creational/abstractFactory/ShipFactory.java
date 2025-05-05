package creational.abstractFactory;

import creational.factory.concreteCreational.Benz;
import creational.factory.concreteCreational.Bmw;
import creational.factory.concreteCreational.Ferary;

public class ShipFactory extends AbstractGeneralFactory{
    @Override
    protected  Car getCar(String type) {
        return null;
    }

    @Override
    protected Ship getShip(String type) {
        if(type!=null) {
            if (type.equalsIgnoreCase("warship")) {
                return new WarShip();
            } else if (type.equalsIgnoreCase("cargoship")) {
                return new CargoShip();
            } else if (type.equalsIgnoreCase("cruisership")) {
                return  new CruiseShip();
            } else {
                System.out.println("you choose wrong factory  or wrong type");
            }
        }else{
            return null;
        }
        return null;
    }
}
