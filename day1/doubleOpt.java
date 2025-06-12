import java.util.*;
public class doubleOpt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        double a = scanner.nextDouble();
        System.out.println("enter b");
        double b = scanner.nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();
        System.out.println("a + b *c :"+(a + b *c));
        System.out.println("a * b + c :"+(a * b + c));
        System.out.println("c + a / b :"+(c + a / b));
        System.out.println("a % b + c :"+(a % b + c));

    }
}