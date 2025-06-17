import java.util.*;
public class rocketCounter {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the counter value ");
        int counter = scanner.nextInt();
        while (counter>1) {
            System.out.println(counter);
            counter = counter-1;
            
        }
        System.out.println("rocket takes off");
    }
}