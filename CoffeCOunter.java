import java.util.*;
public class CoffeCOunter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double gst = 1.80;
        while (true) {
            System.out.println("enter type of coffe you want");
            System.out.println("Coldcoffe, Capichino, latte");
            String coffe=scanner.nextLine();
            if(coffe=="exit"){
                System.out.println("you have exit");
            }
            double priceofcoffe=0;
            switch (coffe) {
                case "coldcoffe":
                priceofcoffe=250;
                    
                    break;
                case "Capichino":
                priceofcoffe=150;
                    break;
                case "latte":
                priceofcoffe=175;
                break;
            
                default:
                System.out.println("Select correct coffe");
                    continue;
            }
            System.out.println("enter quantity:");
            int quantity=scanner.nextInt();
            double subtotal=priceofcoffe*quantity;
            
            double gstamount = subtotal * gst;
            double totalbill = subtotal + gstamount;
            System.out.println("subtotal"+subtotal);
            System.out.println("gst"+gst);
            System.out.println("total bill"+totalbill);
            

            
        }
        
    }

    
}