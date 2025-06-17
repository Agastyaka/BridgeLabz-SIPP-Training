import java.util.*;
public class ForRocketLaunch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter counter value");
        int counter = scanner.nextInt();
        for (;counter>0;counter--){
            System.out.println(counter);
        }

    }
}