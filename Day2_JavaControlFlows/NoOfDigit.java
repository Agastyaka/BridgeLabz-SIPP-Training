import java.util.*;
public class noOfDigit {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the interger");
        int num = scanner.nextInt();
        int count =0;

        while (num!=0) {
             num=num/10;
            count++;
        
        }
        System.out.println("not of digit"+count);
    }
}