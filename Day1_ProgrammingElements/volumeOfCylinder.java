import java.util.*;
public class volumeOfCylinder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius of cylinder");
        float r = scanner.nextFloat();
        System.out.println("enter height of cylinder");
        float h = scanner.nextFloat();
        double area = 3.14*r*r*h;
        System.out.println("area of cylinder:"+area);


    }

}