public class Interfaceint implements Interface {
    public static void main( String[] args ) {
        Interfaceint obj1 = new Interfaceint();
            obj1.liked();
            obj1.share();
        }

        public void liked(){
            System.out.println("I liked it" + Video.cricket);
        }
        public void dislike(){
            System.out.println("I disliked it");
        }
        public void share(){
            System.out.println("I shared it" + Video.sports);
        }
        public void delete(){
            System.out.println("I deleted it");
        }
        public void saved(){
            System.out.println("I saved it");
        }
        public void report(){
            System.out.println("I reported it");
        }
    
}
