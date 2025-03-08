public class IfElse {
    public static void main(String[] args) {
        int adminid = 12;
        int editorid = 12;

        int userid = 12;
        if (adminid == userid) {
            System.out.println("Welcome admin");
        }
        else if (editorid == userid) {
            System.out.println("Welcome Editor");
        }
        else if (userid == adminid || userid == editorid){
            System.out.println("File has been accessed");
        }       
        else{
            System.out.println("Welcome user");
        }
        }
    }
    



