package behavioral.templateMothod;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildPillars() {
        System.out.println("Building Glass Pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building Walls with glass coating");
    }
}
