public class ProductHandler {
    public static void main(String[] args) {
        ProductHandler productHandler = new ProductHandler();
        productHandler.getproductid(0);
        productHandler.checkinventory(10);
        productHandler.processpayment(123,0,0);
        }

        public void getproductid(int productid){
            try{
                if (productid > 100){
                    throw new Productexceptions("Error 404 ");
                }
                else{
                    System.out.println("Product ID is " + productid);
                }
            }
            catch(Productexceptions ex){
                 System.out.println(ex.getMessage());
                 ex.printStackTrace();    
                }
            }       
        public void checkinventory(int quatity){
            try{
                if (quatity <= 0){
                    throw new Productexceptions ("Sorry We'R Out of Stock");
                }
                else{
                    System.out.println("Product quantity is " + quatity);
                    }
                }
                    catch(Productexceptions ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
        } 
        public void processpayment(int price,int productid, int quatity){
            try{
             if (price < 100){
                throw new PaymentException("null");
             }
             else{
                System.out.println("Payment is successful");
             }
            }
            catch(PaymentException ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
            }
        }     
