import java.util.*;
public class HarshadNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num = scanner.nextInt();
        int sum =0;
        int originalNumber = num;
        while(originalNumber!=0){
            int digit = originalNumber%10;
            sum= sum+digit;
            originalNumber=originalNumber/10;

        }
        if(num%sum==0)
        System.out.println(num+"it is harshad number");
        else
        System.out.println(num+"not a harshad num");

    }
}