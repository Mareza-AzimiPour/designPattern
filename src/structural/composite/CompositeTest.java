package structural.composite;

public class CompositeTest {

    public static void main(String[] args) {
        Employee devOne = new Developer("Mareza", "100", "Pro Developer");
        Employee devTow = new Developer("Mareza", "100", "Entry Level developer");

        Directory directory = new Directory();
        directory.addEmployee(devOne);
        directory.addEmployee(devTow);
        directory.showEmployeeDetails();
        System.out.println("***********************************");
        Employee managerOne = new Manager("Majid", "100", "CTO Mnager");
        Employee managertoww = new Manager("Paymen", "101", "CTO Manager");

        Directory directoryManager = new Directory();
        directoryManager.addEmployee(managerOne);
        directoryManager.addEmployee(managertoww);
        directoryManager.showEmployeeDetails();
    }
}
