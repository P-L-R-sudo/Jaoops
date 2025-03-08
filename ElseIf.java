public class ElseIf {
    public static void main (String[] args) {
        int ordervalue = 10;
        int minorder = 200;

        if ( ordervalue > minorder) {
            System.out.println(" you have got 10% discount");
        }else{
            int difamount = minorder - ordervalue;
            System.out.println( " Add " + difamount + " more to get extra 10 % discount");
        }
        }
    }

