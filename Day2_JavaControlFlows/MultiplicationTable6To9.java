import java.util.*;
public class MultiplicationTable6To9 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        for(int i=6;i<=9;i++){
             System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}