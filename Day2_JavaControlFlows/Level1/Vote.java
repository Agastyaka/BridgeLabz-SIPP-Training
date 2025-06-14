import java.util.*;
public class Vote {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age of person");
        int age = scanner.nextInt();
        if(age>=18)
        System.out.println("person age is"+age+"can vote");
        else
        System.out.println("person age is"+age+"cannot vote");
        
    }
}