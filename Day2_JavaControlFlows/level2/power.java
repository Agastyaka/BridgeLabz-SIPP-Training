import java.util.*;
public class power {

   public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
    System.out.println("enter number");
    int num=scanner.nextInt();
    System.out.println("enter power");
    int power =scanner.nextInt();
    long result =1;
    for(int i=1;i<=power;i++){
        result=result*num;
    }
    System.out.println(result);
   }
    
}