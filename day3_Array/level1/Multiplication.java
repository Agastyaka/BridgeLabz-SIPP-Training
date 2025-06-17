import java.util.*;
public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        int []arr=new int[11];
        for(int i=1;i<=arr.length-1;i++){
            arr[i]=i*num;

        }
        System.out.println("multiplication table of"+num+"is");
        for(int i=1;i<=arr.length-1;i++){
            System.out.println(num+"*"+i+"="+arr[i]);
        }
    }
}