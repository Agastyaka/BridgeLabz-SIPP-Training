import java.util.*;
public class DistanceInYard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter distance in feet ");
        double feet = scanner.nextDouble();
        double yard = feet/3;
        double miles= feet/5280;
        System.out.println(" The distance in yards is"+yard+" while the distance in miles is "+miles);
    }
}