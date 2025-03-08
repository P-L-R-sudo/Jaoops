import java.util.HashMap;
public class Hashmap {
    public static void main(String [] args){
        String[] title = {"iphone13","iphone15"};
        String[] price = {"$1000","$1500"};
        String[] color = {"red","blue"};
        String[] reviews = {"33000","3322"};
        String[] rating = {"4.5","4.8"};
        System.out.println(color[1]);

        HashMap<String,String> productone = new HashMap<String, String>();

        productone.put("title","iphone13");
        productone.put("price","$1000");
        productone.put("color","red");
        productone.put("reviews","33000");
        productone.put("rating","4.5");
        System.out.println(productone.get("rating"));
       }
     
}
