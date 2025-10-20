package structural.flyweight.differentWithSingleton;

import structural.flyweight.differentWithSingleton.RobotFactory;

import java.awt.*;
import java.util.Random;

public class FlyweightTest {

    public static void main(String[] args) throws Exception {

        RobotFactory robotFactory = new RobotFactory();
        System.out.println("this is flyweight design pattern");

        Robot robotShape = null;

        for (int i = 0; i < 3; i++) {
            robotShape = (Robot) robotFactory.getRobot("King");
            robotShape.setColor(getRandomeColor());
            robotShape.print();
        }

        for (int i = 0; i < 3; i++) {
            robotShape = (Robot) robotFactory.getRobot("Queen");
            robotShape.setColor(getRandomeColor());
            robotShape.print();
        }

        int numOfDistinctRobots = robotFactory.totalObjectsCreate();
        System.out.println("\nfinally Robots created until now" + numOfDistinctRobots);
    }

    public static String getRandomeColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
