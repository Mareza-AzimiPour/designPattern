package creational.factory.concreteCreational;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        //the organization and general factory choose from the Client and desidw witch child factory  create
        GeneralFactory generalFactory = new GeneralFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your type: ");
        String type = scanner.nextLine();
        Car car = generalFactory.getCar(type);
        car.ready();
    }
}
