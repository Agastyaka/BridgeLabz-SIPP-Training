import java.util.*;
public class bonusOfEmpolye {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter salary");
        double salary =scanner.nextDouble();
        System.out.println("enter year of work");
        int year=scanner.nextInt();
        if(year<=5)
        System.out.println("bonus given is 0");
        else{
            double bonus=(salary*5/100);
            System.out.println("bonus given"+bonus);
        }

    }
}