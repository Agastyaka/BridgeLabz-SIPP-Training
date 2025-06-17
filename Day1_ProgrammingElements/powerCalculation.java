import java.util.*;
public class PowerCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the power");
        double power = scanner.nextDouble();
        System.out.println("enter the base");
        double base = scanner.nextDouble();
        double ans = Math.pow(base, power);
        System.out.println("the number is"+ans);

    }
}