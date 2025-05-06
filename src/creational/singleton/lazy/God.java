package creational.singleton.lazy;

public class God {


    //the private reference to only and one instance

    private static God instance=null;//assign the null for create the space in memory

    private int payambarNumber=0;

    private God(){}//create the constructor for field static and when you use dont allow other new

    public static God getInstance(){
        if(instance==null){//if don't reference has not exist
            return new God();
        }else{
            return instance;
        }
    }

    public int getPayambarNumber() {
        return payambarNumber;
    }

    public void setPayambarNumber(int payambarNumber) {
        this.payambarNumber = payambarNumber;
    }
}
