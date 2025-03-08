public class VideoFunction{ 
    public static void main(String[] args){
        VideoFunction videoobj = new VideoFunction(); // calling object or object calling method
        videoobj.like();
        cart cartobj = new cart();
        cartobj.addtocart();
        videoobj.dislike();
        

    }
        public void like(){ // method
            System.out.println("Video liked"); 
    }
        public void dislike(){ // method
            System.out.println("Video unliked");
       }
    }       
