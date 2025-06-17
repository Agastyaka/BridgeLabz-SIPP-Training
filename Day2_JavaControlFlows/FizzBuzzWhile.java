import java.util.*;
public class FizzBuzzWhile {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num =scanner.nextInt();
        int i=0;
        while(i<num){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
                else if (i%3==0) 
                System.out.println("Fizz");
                else if( i%5==0)
                System.out.println("Buzz");
                else
                System.out.println(i);
                i++;

        }
    }
}