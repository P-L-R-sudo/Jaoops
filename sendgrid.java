public class sendgrid {
    public static void main (String[] args) {
        System.out.println("Email received:");
        System.out.println("Check db");
        threadone tbobj = new threadone();
        Thread t1 = new Thread(tbobj);
        t1.start();
    


        System.out.println("Please check your email");
    }



    
}
