package structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();
        System.out.println("********************");
        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();
    }

}


/**
 * Definition
 * The Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation, so that the two can evolve independently.
 * <p>
 * In other words:
 * <p>
 * Bridge builds a “bridge” between high‑level logic (abstraction) and low‑level details (implementation), preventing them from being tightly coupled.
 **/
