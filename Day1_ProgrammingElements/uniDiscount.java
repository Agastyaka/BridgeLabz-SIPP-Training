import java.util.*;
public class UniDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;

    double discountedPrice = (fee*discount)/100;
    double finalFee = fee - discountedPrice;
    System.out.println("The discount amount is INR "+discountedPrice+" and final discounted fee is INR "+finalFee);
        
    }
    
    

}