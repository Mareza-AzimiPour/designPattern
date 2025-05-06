package creational.singleton.synchronize;

public class God {

    //the private reference to only and one instance
    private static God instance=null;//assign the null for create the space in memory

    private int payambarNumber=0;

    private God(){}//create the constructor for field static and when you use dont allow other new

    //by adding the synchronized keyword to getInstance(),
    //we fore every thread to wait its turn before it van enter the method
    public static synchronized God getInstance(){
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
