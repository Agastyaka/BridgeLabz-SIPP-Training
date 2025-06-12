import java.util.*;
public class quotientAndReminder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();
        int quotient = num1/num2;
        double reminder = num1%num2;
        System.out.println("The Quotient is"+quotient+" and Reminder is " +reminder+"  of two number "+num1+" and"+num2);
    }
}