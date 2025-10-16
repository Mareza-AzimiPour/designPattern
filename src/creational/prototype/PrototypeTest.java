package creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        System.out.println("****************************");
        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape:" + cloneShape.getType());
        System.out.println("****************************");
        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape:" + cloneShape2.getType());
        System.out.println("****************************");
        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape:" + cloneShape3.getType());
    }
}
