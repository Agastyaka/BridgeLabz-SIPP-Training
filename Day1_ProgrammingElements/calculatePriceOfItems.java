import java.util.*;
public class calculatePriceOfItems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("price of item");
        double price = scanner.nextDouble();
        System.out.println("no of items");
        int items = scanner.nextInt();
        double totalPrice = price*items;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+items+"  unit price is INR "+price);

    }
}