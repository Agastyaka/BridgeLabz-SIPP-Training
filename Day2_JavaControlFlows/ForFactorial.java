import java.util.*;
public class forFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        long factorial=1;
        if (n<0)
        System.out.println("factorial not possible");
        else if(n ==0)
        System.out.println("factorial is 1");
        else{
       
        for(int i=1;i<=n;i++){
            factorial = i*factorial;
            


        }
        System.out.println("factorical is"+factorial);
    }

    }
}
