public class Conversion {
    public static void main(String[] args) {
        //String conversions
        int loginid = 8801;
        String loginpasswd = "Loki@4401";
        String loggedinpasswd = "Loki@8801";
        int loggedinid = 4801;
        System.out.println(loginid != loggedinid);
        System.out.println(loginpasswd == loggedinpasswd);

        int billamount = 300;
        int minamount = 200;
        billamount = 200;

        System.out.println(billamount <= minamount);

    }
}
