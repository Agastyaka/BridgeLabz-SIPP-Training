import java.util.*;
public class ConvertKilometersToMiles {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the km:");
        float km = scanner.nextFloat();
        double miles = km * 0.621371;
        System.out.println("the miles is:"+miles);


    }
}