package structural.flyweight.differentWithSingleton;

import structural.flyweight.sampleBasic.LargeRobot;
import structural.flyweight.sampleBasic.SmallRobot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    Map<String, RobotInterface> shapes= new HashMap<String, RobotInterface>();

    public int totalObjectsCreate(){
        return shapes.size();
    }

    public RobotInterface getRobot(String robotType) throws Exception {
        RobotInterface myRobot = null;
        if(shapes.containsKey(robotType)){
            myRobot = shapes.get(robotType);
        }else{
            switch(robotType){
                case "King"->{
                    System.out.println("we do not have King Robot.So we are creating a King robot for you");
                    myRobot =new Robot("King");
                    shapes.put("King",myRobot);
                    break;
                }
                case "Queen"->{
                    System.out.println("we do not have Queen Robot.So we are creating a Queen robot for you");
                    myRobot =new Robot("Queen");
                    shapes.put("Queen",myRobot);
                    break;
                }
                default ->{
                    throw new Exception("Robot Factory only hava King and Queen");
                }
            }
        }
        return myRobot;
    }
}
