import java.util.*;
public class kiloToPounds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write weight in kg");
        double weightInKg = scanner.nextDouble();
        double weightInPound = weightInKg * 2.2;
        System.out.println("The weight of the person in pounds is "+weightInPound+" and in kg is"+weightInKg);
        
    }
}