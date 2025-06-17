import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=1;
        long factorial=1;
        if (n<0)
        System.out.println("factorial not possible");
        else if(n ==0)
        System.out.println("factorial is 1");
        else{
       
        while(i<=n){
            factorial = i*factorial;
            i++;


        }
        System.out.println("factorical is"+factorial);
    }

    }
}