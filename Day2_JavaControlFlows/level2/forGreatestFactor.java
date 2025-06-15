import java.util.*;
public class forGreatestFactor {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        int greatestFactor =1;
        int i=num-1;

        while(i>=1){
            if(num%i==0){
            greatestFactor=i;
            break;
            }
            i--;
        }
        

        
        System.out.println("greatest factor"+greatestFactor);
    }
}