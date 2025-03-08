public class Oops {
    String useremail = "";
    String userpasswd = "";
    String userphone = "";
    public Oops (String email, String passwd, String phone) {
        useremail = email;
        userpasswd = passwd;
        userphone = phone;
    }    
    public static void main(String [] args) {
        Oops obj1 = new Oops("email", "passwd", "phone");
        Oops obj2 = new Oops("plr@gmail.com", "password", "1234567890");
        System.out.println(obj1.useremail);
        System.out.println(obj1.userpasswd);
        System.out.println(obj1.userphone);

        System.out.println(obj2.useremail);
        System.out.println(obj2.userpasswd);
        System.out.println(obj2.userphone);

    }
}