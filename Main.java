public class Main
{

    public static void main(String[] args)
    {
        System.out.println("hello java");

        Main mainobj = new Main();
        mainobj.login();
        mainobj.createaccount();
        mainobj.resetPassword();
    }
    
    public void login ()
    {
        System.out.println("Login success");
    }
    public void createaccount()
    {
        System.out.println("accountcreated");
    }
    public void resetPassword ()
    {
        System.out.println("resetPassword");
    }

}
