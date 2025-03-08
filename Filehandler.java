import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class Filehandler {
    public static void main(String[] args) {
        File fileobj = new File("uploads");
        fileobj.mkdir();
        fileobj = new File("uploads/txt");
        fileobj.mkdir();
        fileobj = new File("uploads/txt/emails.txt");
        try {
            FileWriter obj = new FileWriter(fileobj);
            String [] emails = {"Email1@gmail.com", "Email2@gmail.com","lp@gmail.com","lp@gmail.com",
            "lp@gmail.com","lp@gmail.com","lp@gmail.com","lp@gmail.com",};
            System.out.println(emails.length);
            for(int i = 0; i < emails.length; i++ ){
                obj.write(emails[i] + "\n"); 
             }
             obj.close();
            // obj.write("plr@gmail.com\n");
            // obj.write("lp@gmail.co");
            // obj.close();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }      
    }
}
