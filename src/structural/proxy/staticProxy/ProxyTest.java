package structural.proxy.staticProxy;

public class ProxyTest {

    public static void main(String[] args) {
        Image image = new ProxyImage("someFile.jpg");

        image.display();
        System.out.println("****");
        image.display();
    }
}
