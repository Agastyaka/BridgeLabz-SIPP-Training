import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius");
        int r = scanner.nextInt();
        double area = 3.13 * r * r;
        System.out.println("area of circle:"+area);
        
    }
}