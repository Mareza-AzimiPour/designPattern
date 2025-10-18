package structural.adapter.ClassAndObjectAdapter;

public class ClassAdapter extends IntegerValue {

    @Override
    public int getInegerValue() {
        return 2 + super.getInegerValue();
    }
}
