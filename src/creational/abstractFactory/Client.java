package creational.abstractFactory;



import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your type for car: ");
        CarFactory carFactory = new CarFactory();
        String type = scanner.nextLine();
        Car car = carFactory.getCar(type);
        car.run();
        System.out.println("---------------------------------");
        ShipFactory shipFactory = new ShipFactory();
        System.out.println("Please enter your type for ship: ");
        String shipType = scanner.nextLine();
        Ship ship = shipFactory.getShip(shipType);
        ship.move();
    }
}
