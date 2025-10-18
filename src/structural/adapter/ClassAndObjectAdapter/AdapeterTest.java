package structural.adapter.ClassAndObjectAdapter;

public class AdapeterTest {
    public static void main(String[] args) {
        System.out.println("**Class and object adapter demo***");
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("Class adapter is returning :" + classAdapter.getInegerValue());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println("Object adapter is returning;" + objectAdapter.getMyinteger());
    }
}
