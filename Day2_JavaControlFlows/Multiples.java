import java.util.*;
public class Multiples {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        System.out.println("mulilpe of that num");
        for(int i=1;i<=100;i++){
            if(num%i==0)
            System.out.println(i);
        }
    }
}