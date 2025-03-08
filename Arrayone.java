import java.util.ArrayList;
import java.util.LinkedList;
public class Arrayone {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        users.add("cs");
        users.add("java");
        users.add("python");
        System.out.println(users.get(1));
        for(int i = 0; i < users.size(); i++ ) {
            System.out.println(users.get(i));
        }
        LinkedList<String> users1 = new LinkedList<String>();
        users1.add("MYSQL");
        users1.add("SQL");
        users1.remove(0);
        users1.set(1,"java");
        System.out.println(users1.get(1));



        // String [] users = {"John", "Mary", "David", "Emma"};
        // System.out.println( users[4]);
    }
}
