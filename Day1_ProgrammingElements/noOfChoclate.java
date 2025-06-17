import java.util.*;
public class NoOfChoclate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfChoclate = scanner.nextInt();
        int noOfPeople = scanner.nextInt();
        int noOfChoclateChild= noOfChoclate/noOfPeople;
        int remainingChoclate = noOfChoclate%noOfPeople;
        System.out.println("The number of chocolates each child gets is"+noOfChoclateChild+" and the number of remaining chocolates is "+remainingChoclate);
        
    }
}