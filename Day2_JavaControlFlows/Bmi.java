import java.util.*;
public class bmi {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter weight");
        double weight =scanner.nextDouble();
        System.out.println("enter height of person");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
        if(bmi<=18.4)
        System.out.println("underweight");
        else if(bmi>=18.5 && bmi<=24.9)
        System.out.println("normal");
        else if(bmi >=25 && bmi<=39.9)
        System.out.println("overweight");
        else if(bmi>=40)
        System.out.println("overweight");

    }
}