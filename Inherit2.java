public class Inherit2 extends Inherit1{
    public static void main(String[] args){
        Inherit2 obj1 = new Inherit2();
        obj1.signup();
        Inherit1 obj2 = new Inherit1();
        obj2.ressetpasswd();
        System.out.println(obj1.email);
    }
    public void signup(){
        System.out.println("account created");
    }
    
    
}
