package creational.singleton.synchronize;

public class SingletonTest {


    public static void main(String[] args) {
        God god=God.getInstance();
        god.setPayambarNumber(124000);
        System.out.println("the only reference in memory space for one god->"+god);
        System.out.println("the number of prophet->"+god.getPayambarNumber());
        System.out.println("-------------------------------------------------------");
        //
        god=null;
        god= God.getInstance();
        god.setPayambarNumber(0);
        System.out.println("the only reference in memory space for one god->"+god);
        System.out.println("the number of prophet->"+god.getPayambarNumber());
    }

    // tread safe
    //support tow if you assign again null


}
