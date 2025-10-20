package structural.flyweight.differentWithSingleton;

public class Robot implements RobotInterface {

    String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    @Override
    public void print() {
        System.out.println("this is a " + robotType + "type robot with " + colorOfRobot+"color");
    }

}
