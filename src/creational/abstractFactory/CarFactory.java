package creational.abstractFactory;

public class CarFactory extends AbstractGeneralFactory{
    @Override
    protected Car getCar(String type) {
        if(type!=null) {
            if (type.equalsIgnoreCase("BMW")) {
                return new Bmw();
            } else if (type.equalsIgnoreCase("Ferary")) {
                return new Ferary();
            } else if (type.equalsIgnoreCase("BENZ")) {
                return  new Benz();
            } else {
                System.out.println("you choose wrong factory  or wrong type");
            }
        }else{
            return null;
        }
        return null;
    }

    @Override
    protected Ship getShip(String type) {
        return null;
    }
}
