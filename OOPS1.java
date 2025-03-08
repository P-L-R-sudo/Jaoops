public class OOPS1 {
    String title = "";
    int price = 0;
    public OOPS1(String inputtitle, int inputprice) {
        title = inputtitle;
        price = inputprice;
    }
        public static void main(String[] args){
            OOPS1 obj1 = new OOPS1("iphone", 50000);
            OOPS1 obj2 = new OOPS1("google pixel", 30000);
            System.out.println(obj1.title + " : " + obj1.price);
            System.out.println(obj2.title + " : " + obj2.price);
        }
    
    }
