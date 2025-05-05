package creational.abstractFactory;

public class CargoShip implements Ship {
    @Override
    public void move() {
       System.out.println("Cargo ship move");
    }
}
