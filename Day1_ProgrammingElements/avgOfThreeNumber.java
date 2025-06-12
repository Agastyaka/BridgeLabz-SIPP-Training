import java.util.*;
public class avgOfThreeNumber {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter num1:");
    float num1=scanner.nextFloat();
    System.out.println("enter num2:");
    float num2=scanner.nextFloat();
    System.out.println("enter num3:");
    float num3=scanner.nextFloat();
    float average = (num1+num2+num3)/3;
    System.out.println("the average of 3 number"+average);
}
}