import java.util.*;
public class GreatestFactor {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        int greatestFactor =1;
        for(int i=(num-1);i>=1;i--){
            if(num%i==0){
            greatestFactor=i;
            break;
            }

        }
        System.out.println("greatest factor"+greatestFactor);
    }
}