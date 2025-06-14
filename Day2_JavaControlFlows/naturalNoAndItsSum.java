import java.util.*;
public class naturalNoAndItsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        if(num>0){
            int sum = (num)*(num + 1)/2;
        System.out.println("the sum of natural no "+sum+"natural no is"+num);
    }
    else
    System.out.println(num+"not a natural number");
    }
}