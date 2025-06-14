import java.util.*;
public class largestNoOfThree {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1=scanner.nextInt();
        System.out.println("enter num 2");
        int num2=scanner.nextInt();
        System.out.println("enter num 3");
        int num3=scanner.nextInt();
          if(num1>num2 && num1 > num3)
          System.out.println("first number is largest");
          else if (num2>num1 && num2>num3) 
          System.out.println("second no is largest");
          else
          System.out.println("third is largest");
            
          
           

    }
}