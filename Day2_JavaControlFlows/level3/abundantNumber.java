import java.util.*;
public class abundantNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num = scanner.nextInt();
        int sum =0;
        for(int i=1;i<=num-1;i++){
            if(num%i==0)
            sum=sum+i;
        }
        if(sum>num)
        System.out.println(num+"is abundant numebr");
        else
        System.out.println(num+"is not abundant numebr");
    }
}