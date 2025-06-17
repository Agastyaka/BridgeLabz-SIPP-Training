import java.util.*;
public class IntOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();
        System.out.println("a + b *c :"+(a + b *c));
        System.out.println("a * b + c :"+(a * b + c));
        System.out.println("c + a / b :"+(c + a / b));
        System.out.println("a % b + c :"+(a % b + c));

    }
}