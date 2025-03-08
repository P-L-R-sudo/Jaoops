public class Exceptiondemo {
    public static void main(String[] args) {
        try{ // try and catch syntax
            String[] email = {"jj","nc"};
            System.out.println(email[3]);
        }catch(Exception ex) { //Exception is must
            System.out.println("Error: " + ex.getMessage()); // get message
            ex.printStackTrace(); // it can help with showing the right error message
        }
    }
    
}
