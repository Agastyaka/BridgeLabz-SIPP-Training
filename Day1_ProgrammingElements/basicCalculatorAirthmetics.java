import java.util.*;
public class basicCalculatorAirthmetics {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the 1st num:");
        double num1 = scanner.nextDouble();
        System.out.println("enter the 2nd num:");
        double num2 = scanner.nextDouble();
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+(num1+num2)+" "+(num1-num2)+" "+(num1*num2)+" "+(num1/num2));

    }
}