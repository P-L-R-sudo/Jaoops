public abstract class Payments {
    int orderid = 0;
    public void createorderid(){
        orderid = 22;
        System.out.println("Payments orderid was created " + orderid + productcateory.laptops);
    }
    public void cancelorder(){
        orderid = 234;
        System.out.println("payments order was cancelled" + orderid);
    }
    public void refundorder(){
        System.out.println("payments order was refunded" + orderid);
    }
    public abstract void verifyorder();
}
