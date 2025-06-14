import java.util.*;
public class divisibilityOf5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        if(num%5==0)
        System.out.println(num+"is divisible by 5");
        else
        System.out.println(num+"not divisible by 5");

    }
}