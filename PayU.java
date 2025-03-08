public class PayU extends Payments {
    public static void main(String [] args){
        PayU obj1 = new PayU();
        obj1.Processorder();
    }
    public void Processorder(){
        orderid = 33;
        System.out.println(" payu Order is being processed " + orderid + productcateory.laptops );
    }
    public void verifyorder(){
        System.out.println("payu  Order is being verified " + orderid );
    }

    

}
