package creational.builder.buillderWithInterface;

public class BuilderTest {
    public static void main(String[] args) {
        System.out.println("****Builder demo with many product*******");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorCycleBuilder = new MotorCycle();
        System.out.println("***********");
        director.construct(carBuilder);
        Product productCar = carBuilder.getVehicle();
        productCar.showAllParts();
        System.out.println("***********");
        director.construct(motorCycleBuilder);
        Product motorCycleProduct = motorCycleBuilder.getVehicle();
        motorCycleProduct.showAllParts();
    }
}
