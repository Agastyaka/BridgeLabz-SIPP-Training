import java.util.*;
public class HeightConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height in cm: ");
        double heightInCm= scanner.nextInt();
        double heightInInches = heightInCm/2.54;
        int heightInfoot = (int)heightInInches/12;
        double leftInches = heightInfoot % 12;
        System.out.println("Your Height in cm is "+heightInCm+" while in feet is"+heightInfoot+" and inches is"+leftInches);

    }
}