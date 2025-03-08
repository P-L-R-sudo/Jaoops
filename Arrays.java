public class Arrays {
    public static void main (String [] args ) {
        String Title1 = "iphone 128 gb-black";
        String Title2 = "iphone 128 gb-white";
        String Title3 = "iphone 256 gb-black";
        Title1 = "new title";
        Title3 = "iphone 256 gb-red";

        // System.out.println( Title1);

        String[] Titles = {"iphone 128 gb-black", "iphone 128 gb-white", "iphone 256 gb-black" };{ // array list we use []
            Titles[1] = "iphone 256 gb-red";
            System.out.println(Titles.length);
        }

        int[] prices = {100,800,3300,25000};// array list we must use this []
        System.out.println(prices.length); // just tried to print all strings using for loop
        for (int i = 3; i < prices.length; i--) {
        System.out.println(prices[i]);

        }

}
    
}
