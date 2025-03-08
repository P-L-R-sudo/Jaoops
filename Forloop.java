public class Forloop {
    public static void main(String[] args) {
        String[] Titles = { "iphone 13gb-black", "iphone 13gb-red", 
                            "iphone 15gb-green", "iphone 16gb-blue"};

        System.out.println(Titles.length);   
        
        for ( int i=0; i < Titles.length; i++){ // i starts from index 0 then goes up to 0,1,2,3<4,4<4 false so it stays there
            System.out.println(Titles[i]);
        }

        } 
    }
    
