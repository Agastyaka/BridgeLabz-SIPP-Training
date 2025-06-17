import java.util.*;
public class FizzBizz {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("eneter num");
        int num =scanner.nextInt();
        String[]arr=new String[num+1];
        if(num>0){
            for(int i=0;i<=num;i++){
                if(i%3==0 && i%5==0)
                arr[i]="fizzbuzz";
                else if(i%3==0)
                arr[i]="fizz";
                else if(i%5==0)
                arr[i]="buzz" ;  
                
                else
                arr[i] = String.valueOf(i);

            }
            System.out.println("array");
           for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
           }
        }
    }
}