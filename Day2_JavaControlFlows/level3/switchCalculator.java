import java.util.*;
public class switchCalculator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scanner.nextInt();
        System.out.println("enter num2");
        int num2=scanner.nextInt();
        System.out.println("enter operator");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println("result"+(num1+num2));
                break;
            case "-":
                System.out.println("result"+(num1-num2));
                break;
            case "*":
            System.out.println("result"+(num1*num2));
                break;
            
            case "/":
            System.out.println("result"+(num1/num2));
                break;

            default:
                break;
        }


    }
}