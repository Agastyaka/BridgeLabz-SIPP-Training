import java.util.*;
public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the height of triangle");
        double height = scanner.nextDouble();
        System.out.println("enter the base");
        double base = scanner.nextDouble();
        double areaInch = base * height * 0.5;
        double areaInCm = areaInch*2.54;

        System.out.println(" The Area of the triangle in sq in is"+areaInch+" and sq cm is "+areaInCm);

    }
}