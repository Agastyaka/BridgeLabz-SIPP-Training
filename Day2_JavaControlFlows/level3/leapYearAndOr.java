import java.util.*;
public class leapYearAndOr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("enter year");
        int year=scanner.nextInt();
        if(year>1582){
            if((year%4==0 && year%100 !=0)||year %400==0 )
            System.out.println("it is leap year");
            else
            System.out.println("not a leap year");
        }
    }
}