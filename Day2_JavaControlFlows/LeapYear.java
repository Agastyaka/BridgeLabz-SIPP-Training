import java.util.*;
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year");
        int year=scanner.nextInt();
        if(year>=1582){
            if(year%4==0)
            System.out.println("it is leap year");
            else if(year%100==0)
            System.out.println("not leap year");
            else if(year%400==0)
            System.out.println("it is leap year");
            else 
            System.out.println("not a leap year");
        }
    }
}