import java.util.ArrayList;
import java.util.HashSet;
public class Hashone {
    public static void main(String[] args) {
        String[] emaillist = {"plr@gmail","plr@gmail"};
        System.out.println(emaillist[0]);
        System.out.println(emaillist[1]);
        System.out.println(emaillist.length);

        ArrayList<String> emailist = new ArrayList<String>();
        emailist.add("plr@gmail.com");
        emailist.add("plr@gmail.com");
        System.out.println(emailist.size());
        System.out.println(emailist.get(0));
        System.out.println(emailist.get(1));

        HashSet<String> emailist1 = new HashSet<String>();
        System.out.println(emailist1.size());
        emailist1.add("plr@gmail.com");
        emailist1.add("plr@gmail.com");
        emailist1.add("lokesh@gmail.com");
        System.out.println(emailist1.size());






    }
}
