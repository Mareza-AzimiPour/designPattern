package structural.flyweight.sampleBasic;

import structural.flyweight.sampleBasic.RobotInterface;

public class FlyweightTest {
    public static void main(String[] args) throws Exception {

        RobotFactory robotFactory = new RobotFactory();
        System.out.println("this is flyweight design pattern");

        RobotInterface robotShape = robotFactory.getRobot("small");
        robotShape.print();

        for (int i = 0; i <2 ; i++) {
            robotShape=robotFactory.getRobot("small");
            robotShape.print();
        }

        int numOfDistinctRobots= robotFactory.totalObjectsCreate();
        System.out.println("\nDistinct Robots created until now"+numOfDistinctRobots);

        for (int i = 0; i < 5 ; i++) {
            robotShape=robotFactory.getRobot("large");
            robotShape.print();
        }

        numOfDistinctRobots= robotFactory.totalObjectsCreate();
        System.out.println("\nfinally Robots created until now"+numOfDistinctRobots);
    }
}
