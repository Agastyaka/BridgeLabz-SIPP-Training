import java.util.*;
public class WhileMultiple {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        System.out.println("mulilpe of that num");
        int i=1;
        while(i<=100){
            if(num%i==0)
            System.out.println(i);
            i++;
        }
    }
}