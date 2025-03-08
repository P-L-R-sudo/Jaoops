public class Oops3 extends Oops4{
    public static void main(String[] args) {
        Oops3 obj1 = new Oops3();
        obj1.add(23, 33);
        obj1.add(45,55,66);
        obj1.add("java", "oops");
         //method over loading
    }
    public void add(int a, int b) {
        System.out.println("sum of two numbers is "+ (a + b));
    }
    public void add(int a, int b, int c){ //we can have the same name for the method but it have to call with different parameters like
        // String + int or int + int or int+int+ string.
        System.out.println(a + b + c);
    }
    public void add(String a, String b){
        System.out.println(a + b);
    }
}
