import java.util.*;
public class SideOfSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter perimeter of sq");
        double perimeterOfSq = scanner.nextDouble();
        double length = perimeterOfSq/4;
        System.out.println(" The length of the side is "+length+" whose perimeter is "+perimeterOfSq);
    }
}