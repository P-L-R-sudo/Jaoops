public class Filedownload {
    public static void main(String[] args){
        String[] file = {"file 1","file 2 "," file 3  "};            
        for(int i = 0; i < file.length; i++) {
            Downloder dn = new Downloder(file[i]);
            Thread td = new Thread(dn);
            td.start();
         }
    }

}    

