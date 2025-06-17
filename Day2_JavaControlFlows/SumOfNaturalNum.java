import java.util.*;
public class sumOfNaturalNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n = scanner.nextInt();
        int sum=0;
        int i=1;
       while (i<=n) {
        sum=sum+i;
        i++;
       }
       System.out.println("while loop sum"+sum);
       int sum2= n*(n+1)/2;
       System.out.println("formula sum"+sum2);
    }
}