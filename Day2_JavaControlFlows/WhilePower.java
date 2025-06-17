import java.util.*;
public class WhilePower {

   public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
    System.out.println("enter number");
    int num=scanner.nextInt();
    System.out.println("enter power");
    int power =scanner.nextInt();
    long result =1;
    int i=1;
    while(i<=power){
        result=result*num;
        i++;
    }
    
    System.out.println(result);
   }
    
}