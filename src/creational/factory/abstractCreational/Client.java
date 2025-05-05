package creational.factory.abstractCreational;

public class Client {

    public static void main(String[] args) {
        //create an object from each factory owner by one type product and one organization
        Car bmw = new BmwCarFactory().getCar();
        bmw.drive();
        System.out.println("-------------------------------------");
        Car benz = new BenzCarFactory().getCar();
        benz.drive();
        System.out.println("-------------------------------------");
        Car ferary = new FeraryCarFactory().getCar();
        ferary.drive();

    }
}
