public class Paytm extends Payments{
    public static void main(String[] args) {
        Paytm obj1 = new Paytm();
        obj1.createorderid();
    }
    public void Processorder(){
        System.out.println("paytm Order processed");
    
    }
    public void verifyorder(){
        System.out.println("paytm Order verified");
    }
}


