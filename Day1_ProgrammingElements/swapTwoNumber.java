import java.util.*;
public class SwapTwoNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();
        int h;
        System.out.println("before swap num1 :"+num1+" num 2 :"+num2);
        h=num1;
        num1=num2;
        num2=h;
       System.out.println("after swap num1 :"+num1+" num 2 :"+num2);

    }
}