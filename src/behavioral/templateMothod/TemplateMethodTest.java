package behavioral.templateMothod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();

        System.out.println("*********************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
