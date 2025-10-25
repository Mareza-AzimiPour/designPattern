package behavioral.templateMothod;

public abstract class HouseTemplate {

    //templete method,final so subclass cannot override it
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House Build Successful");
    }

    //default implementation,hook method
    private void buildWindows() {
        System.out.println("Build Glass Windows");
    }

    private void buildFoundation() {
        System.out.println("Build foundations with cement,iron rods and sands");
    }

    //method to be implemented by subClass
    public abstract void buildPillars();

    public abstract void buildWalls();

}
