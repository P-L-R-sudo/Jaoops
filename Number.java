public class Number {
    public static void main(String[] args) {
        int noofLikes = 10000;
        System.out.println( noofLikes );
        noofLikes = 10000 + 1;
        System.out.println( noofLikes );
    
       // float price = 99.38f;
        //System.out.println( price);
        // System.out.println(price + 1.535f);

     //  int quatity = 10;
     //  System.out.println(quatity * price - 3);
     //  float total = quatity * price - 3;
//       System.out.println( total);//

       String price = "35.5";
       String quatity = "40";
       System.out.println( Float.parseFloat(price) * Integer.parseInt(quatity));

       Float Total = Float.parseFloat(price) * Integer.parseInt(quatity);
       System.out.println(Total);

       String outputmsg = " The Total is " + String.valueOf( Total );
       System.out.println(outputmsg);


    }    
}