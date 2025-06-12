import java.util.Scanner;
public class sumOfTwoNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("enter 2nd number:");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is:"+sum);
    }
}