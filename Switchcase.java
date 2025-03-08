public class Switchcase {
    public static void main(String[] args) {
        // int x = 10; //user
        // final int y = 12;// admin
        // int z = 13;//editor
        // int e = 1;// viewer

        // switch (e) {
        //     case y:
        //     System.out.println("Welcome admin");
        //     break;
        //     case 13:
        //     System.out.println("Welcome editor");
        //     break;
        //     case 1:
        //     System.out.println("you cant edit");
        //     break;
        //     default:
        //     System.out.println("Welcome user");
        // }

        // }
        String videocategory = "sports";
        switch (videocategory){
            case "sports":
            System.out.println("Display sports related videos");
            break;
            case "cricket":
            System.out.println("Display cricket related videos");
            break;
            case "music":
            System.out.println("Display Music related videos");
            break;
        }
    }
}
