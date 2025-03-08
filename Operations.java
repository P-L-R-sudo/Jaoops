public class Operations {
    public static void main(String[] args) {
        int adminid = 10;
        int editorid = 15;
        int loggedinid = 10;
        System.out.println(adminid == loggedinid);
        System.out.println(editorid == loggedinid);
        System.out.println(adminid == loggedinid && editorid == loggedinid); 
        //true && false = false
        // true && true = true and everyting false in AND operators
        System.out.println(adminid != loggedinid || editorid == loggedinid); 
        // true || false = true
        // false || false = false
        // 

        

    }
}