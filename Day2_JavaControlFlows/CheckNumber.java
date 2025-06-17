import java.util.*;
public class CheckNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num");
        int num = scanner.nextInt();
        if(num==0)
        System.out.println("zero");
        else if(num>0)
        System.out.println("posivtive");
        else
        System.out.println("negative");
    }
}