import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        try{
            File fileobj = new File("upload");
            fileobj.mkdir();
            fileobj = new File("upload/txt");
            fileobj.mkdir();
            fileobj = new File("upload/txt/file.txt");
            FileWriter obj = new FileWriter(fileobj);
            String [] emails = {"Email1@gmail.com", "Email2@gmail.com","lp@gmail.com","lp@gmail.com",
            "lp@gmail.com","lp@gmail.com","lp@gmail.com","lfefcp@gmail.com",};
            System.out.println(emails.length);
            for(int i = 0; i < emails.length; i++ ){
                obj.write(emails[i] + "\n"); 
             }
             obj.close();
            Scanner scanobj = new Scanner(fileobj);
            while( scanobj.hasNextLine() == true){
                System.out.println(scanobj.nextLine());
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        

    }
    
}
