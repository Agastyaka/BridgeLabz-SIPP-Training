import java.util.*;
public class calculateSimpleInterest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter principle");
        float principle = scanner.nextFloat();
        System.out.println("enter rate");
        float rate = scanner.nextFloat();
        System.out.println("enter time");
        float time = scanner.nextFloat();
        double SimpleInterest = (principle*rate*time)/100;
        System.out.println("simple interest is:"+SimpleInterest);

    }
}