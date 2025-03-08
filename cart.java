public class cart{

    public static void main(String[] args)
    {
        System.out.println("this is your cart");
        cart cartobj = new cart();
        cartobj.addtocart();
    }

    public void addtocart(){
        System.out.println("item added to cart");
    }
}