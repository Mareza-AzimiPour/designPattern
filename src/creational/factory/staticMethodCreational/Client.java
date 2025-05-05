package creational.factory.staticMethodCreational;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        //the organization and general factory choose from the Client and desidw witch child factory  create
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your type: ");
        String type = scanner.nextLine();
        Car car = GeneralFactory.getCar(type);
        car.ready();
    }
}
