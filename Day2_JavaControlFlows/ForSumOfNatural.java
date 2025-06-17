import java.util.*;
public class forSumOfNatural {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum + i;

        }
        System.out.println("sum with for loop"+sum);
        int sum2= n*(n+1)/2;
        System.out.println("sum with formula"+sum2);

    }
}