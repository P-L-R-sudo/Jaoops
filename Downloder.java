public class Downloder implements Runnable{
    String file = " ";
    public Downloder(String path){
        file = path;
    }
    public void run(){
        System.out.println("Downloading..." + file);
    }
    
}
