package structural.adapter.ClassAndObjectAdapter;

public class ObjectAdapter {

    private IntegerValueInterface myinteger;

    public ObjectAdapter(IntegerValueInterface myinteger) {
        this.myinteger = myinteger;
    }

    public int getMyinteger() {
        return 2 + this.myinteger.getInegerValue();
    }


    @Override
    public String toString() {
        return "ObjectAdapter{" +
                "myinteger=" + myinteger +
                '}';
    }
}
