package behavioral.templateMothod;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildPillars() {
        System.out.println("Building wooden Pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building wooden Walls");
    }

}
