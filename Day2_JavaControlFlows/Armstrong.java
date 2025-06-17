import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numebr");
        int num=scanner.nextInt();
        int sum=0;
        int  originalNumber=num;
        while (originalNumber!=0) {
            int cube = originalNumber%10;
            sum= sum+ (cube*cube*cube);
            originalNumber=originalNumber/10;
        }
        if(sum==num)
        System.out.println(num+"is a armstrong num");
        else
        System.out.println(num+"not");

    }
}