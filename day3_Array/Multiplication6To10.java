import java.util.*;
public class Multiplication6To10 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num = scanner.nextInt();
        int [] arr=new int[4];
        for(int i=6;i<=9;i++){
            arr[i-6]=i*num;
        }
        for(int i=6;i<=9;i++){
            System.out.println(num+"*"+i+"="+arr[i-6]);
        }
    }
}