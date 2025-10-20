package structural.flyweight.sampleBasic;

import structural.flyweight.sampleBasic.RobotInterface;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes= new HashMap<String, RobotInterface>();

    public int totalObjectsCreate(){
        return shapes.size();
    }

    public RobotInterface getRobot(String robotCategory) throws Exception {
        RobotInterface myRobot = null;
        if(shapes.containsKey(robotCategory)){
            myRobot = shapes.get(robotCategory);
        }else{
            switch(robotCategory){
                case "small"->{
                    System.out.println("we do not have Small Robot.So we are creating a small robot for you");
                    myRobot =new SmallRobot();
                    shapes.put(robotCategory,  myRobot);
                    break;
                }
                case "large"->{
                    System.out.println("we do not have Large Robot.So we are creating a large robot for you");
                    myRobot =new LargeRobot();
                    shapes.put(robotCategory, myRobot);
                    break;
                }
                default ->{
                    throw new Exception("Robot Factory only hava smal and large");
                }
            }
        }
        return  myRobot;
    }
}
