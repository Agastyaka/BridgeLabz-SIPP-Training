import java.util.*;
public class StudentFeeAndUniversityDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("enter fee: ");
        int fee = scanner.nextInt();
        System.out.println("enter discount: ");
        int discount = scanner.nextInt();

    double discountedPrice = (fee*discount)/100;
    double finalFee = fee - discountedPrice;
    System.out.println("The discount amount is INR "+discountedPrice+" and final discounted fee is INR "+finalFee);
    }
}