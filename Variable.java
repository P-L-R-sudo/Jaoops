public class Variable {
    public static void main(String[]args){
        int noofLikes = 1000;
        float priceperKg = 50.0f;
       // char gender = 'M';
        boolean isLiked = true;
        boolean isDisliked = false;
       //  System.out.println(isDisliked);
       //  System.out.println(gender);

       String videoTitle = "creating a thumbnail for earning money ";
      // System.out.println(videoTitle);

      // String userName = "Lokesh pashya";
      // String userMail = "lokeshpashya@gmail.com";
       // String userPassword = "lokeshpashya@123";

       //System.out.println(userPassword);

      // userEMail = "lokeshreddy1410@gmail.com";
      // System.out.println(userMail);
       
      String userName = "Loki";
      userName.length();
      System.out.println(userName.length());

      String userPassword = "loki@8801";
      System.out.println(userPassword.contains("@"));

      String userMail = "   loki@9901   ";
      System.out.println(userMail.trim());
      System.out.println(userMail.length());

      String firstName = "Lokesh";
      String lastName = "Pashya";
      String fullName = firstName +" "+ lastName + " " + "reddy";
      System.out.println(fullName);

      String oriCouponcode = "FEB20";
      String newCouponcode = "fEb20";

      

      System.out.println(oriCouponcode.toLowerCase());
      System.out.println(newCouponcode.toLowerCase());

      String oriCouponcodeLower = oriCouponcode.toLowerCase();
      String newCouponcodeLower = newCouponcode.toLowerCase();

      System.out.println(oriCouponcodeLower.equals(newCouponcodeLower));
      











    }

}
