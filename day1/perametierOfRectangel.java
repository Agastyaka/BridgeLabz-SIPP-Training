import java.util.*;
public class perametierOfRectangel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write length of rec");
        float length = scanner.nextFloat();
        System.out.println("write width of rec");
        float width = scanner.nextFloat();
        float perametier = 2*(length+width);
        System.out.println("peremeter of rectangle:"+perametier);

    }
}