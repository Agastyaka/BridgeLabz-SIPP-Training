import java.util.*;
public class sumOfNUm {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of num");
        int num = scanner.nextInt();
        double sum=0;
        while(num!=0){
            sum = sum + num;
            num = scanner.nextInt();
        }
        System.out.println("sum is:"+sum);

    }
}